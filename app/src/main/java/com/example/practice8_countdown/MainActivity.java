package com.example.practice8_countdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.practice8_countdown.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private int count = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(view -> countDown());
    }

    private void countDown() {
        count--;

        if (count == 0) {
            binding.textView.setVisibility(View.GONE);
            binding.imageBoom.setVisibility(View.VISIBLE);
            binding.button.setVisibility(View.GONE);
            return;
        }

        String message = String.format("%d번만 더 눌러보세요~", count);
        binding.textView.setText(message);

    }
}