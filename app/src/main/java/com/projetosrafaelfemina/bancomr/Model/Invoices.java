package com.projetosrafaelfemina.bancomr.Model;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.projetosrafaelfemina.bancomr.MainActivity;
import com.projetosrafaelfemina.bancomr.R;
import com.projetosrafaelfemina.bancomr.databinding.ActivityInvoicesBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Invoices extends AppCompatActivity {

    private ActivityInvoicesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityInvoicesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getSupportActionBar().hide();

        binding.toolbarInvoices.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateHomeScreen = new Intent(Invoices.this, MainActivity.class);
                startActivity(navigateHomeScreen);
            }
        });

        CreditCardView creditCard = binding.CreditCard;
        creditCard.setCardNumber("1525 4564 2345 4856");
        creditCard.setExpiryDate("08/26");
        creditCard.setCardName("Rafael Luiz Femina");
        creditCard.setType(CardType.MASTERCARD);
    }
}