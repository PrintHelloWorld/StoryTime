package com.bam.interactivestory.model;

public class Page {
    private int mImageId;
    private int mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinalPage;

    public Page(int imageId, int text, Choice choice1, Choice choice2) {
        mImageId = imageId;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Page(int imageId, int text) {
        mImageId = imageId;
        mText = text;
        mIsFinalPage = true;
    }

    public int getImageId() {

        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public int getText() {
        return mText;
    }

    public void setText(int mText) {
        this.mText = mText;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }

    public boolean isFinalPage() {
        return mIsFinalPage;
    }

    public void setFinalPage(boolean finalPage) {
        mIsFinalPage = finalPage;
    }
}
