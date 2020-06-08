package com.example.doctorpescribed.ui.dr_document;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class dr_documentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public dr_documentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}