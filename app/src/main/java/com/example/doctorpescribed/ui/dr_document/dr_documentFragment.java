package com.example.doctorpescribed.ui.dr_document;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.doctorpescribed.R;

public class dr_documentFragment extends Fragment {

    private dr_documentViewModel drdocumentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        drdocumentViewModel =
                ViewModelProviders.of(this).get(dr_documentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dr_document, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        drdocumentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
