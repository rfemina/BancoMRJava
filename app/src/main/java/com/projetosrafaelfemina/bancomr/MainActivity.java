package com.projetosrafaelfemina.bancomr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.projetosrafaelfemina.bancomr.Model.Balance;
import com.projetosrafaelfemina.bancomr.Model.Invoices;
import com.projetosrafaelfemina.bancomr.Model.Savings;
import com.projetosrafaelfemina.bancomr.Model.Transfer;
import com.projetosrafaelfemina.bancomr.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.imgInvoices.setOnClickListener(this);
        binding.imgBalance.setOnClickListener(this);
        binding.imgTransfer.setOnClickListener(this);
        binding.imgSavings.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Action(v);
    }

    private void Action(View v) {
        int id = v.getId();

        if (id == R.id.imgInvoices) {
            Intent navigateInvoicesScreen = new Intent(MainActivity.this, Invoices.class);
            startActivity(navigateInvoicesScreen);
        } else if (id == R.id.imgSavings) {
            Intent navigateSavingsScreen = new Intent(MainActivity.this, Savings.class);
            startActivity(navigateSavingsScreen);
        } else if (id == R.id.imgTransfer) {
            Intent navigateTransferScreen = new Intent(MainActivity.this, Transfer.class);
            startActivity(navigateTransferScreen);
        } else if (id == R.id.imgBalance) {
            Intent navigateBalanceScreen = new Intent(MainActivity.this, Balance.class);
            startActivity(navigateBalanceScreen);
        }
    }
}