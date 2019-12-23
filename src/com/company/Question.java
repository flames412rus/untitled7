package com.company;

public class Question {
    private String  title;
    private int answer;
    private String pods;
    Question(String t ,int a,String p){
        this.answer = a;
        this.title = t;
        this.pods = p;
    }
    public int getAnswer(){
        return answer;
    }
    public String getTitle(){
        return title;
    }

    public String getPods() {
        return pods;

    }
}
