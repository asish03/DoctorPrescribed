package com.example.doctorpescribed.ui.dr_emergency;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class dr_emergencyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public dr_emergencyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}