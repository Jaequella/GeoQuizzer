package com.csd203.geoquizzer;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class QuizViewModel extends ViewModel {
    private static String TAG = "QuizViewModel";
    boolean mIsCheater = false;
    public boolean isCheater() {
        return mIsCheater;
    }

    public void setIsCheater(boolean isCheater) {
        mIsCheater = isCheater;
    }

    int mCurrentIndex = 0;
    private MainActivity.Question[] mQuestionBank = {
            new MainActivity.Question(R.string.question_australia, true),
            new MainActivity.Question(R.string.question_oceans, true),
            new MainActivity.Question(R.string.question_mideast, false),
            new MainActivity.Question(R.string.question_africa, false),
            new MainActivity.Question(R.string.question_americas, true),
            new MainActivity.Question(R.string.question_asia, true)
    };
    public boolean currentQuestionAnswer() {
        return mQuestionBank[mCurrentIndex].answer;
    }
    public int currentQuestionText() {
        return mQuestionBank[mCurrentIndex].textResId;
    }
    public void moveToNext() {
        mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
    }
}
