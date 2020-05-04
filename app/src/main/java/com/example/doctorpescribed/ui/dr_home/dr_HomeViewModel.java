package com.example.doctorpescribed.ui.dr_home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class dr_HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public dr_HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}