package com.example.android.takehomeassignment8_yuy;

public class Statement {

    public int statementIndex;
    public int statementContent;
    public int photoId;
    public boolean isTrue;

    public int getStatementIndex() {
        return statementIndex;
    }

    public int getStatementContent() {
        return statementContent;
    }



    public int getPhotoId() {
        return photoId;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setStatementIndex(int statementIndex) {
        this.statementIndex = statementIndex;
    }

    public void setStatementContent(int statementContent) {
        this.statementContent = statementContent;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }


    public Statement(int statementIndex, int statementContent, int photoId, boolean isTrue) {
        this.statementIndex = statementIndex;
        this.statementContent = statementContent;
        this.photoId = photoId;
        this.isTrue = isTrue;
    }
}

