package com.crio.qcalc;

public class StandardCalculator {
    
    private int result;

    public void add(int a,int b){
        result= a+b;
    }

    public void subtract(int a,int b){
        result= a-b;
    }

    public int getResult(){
        return this.result;
    }

    public void setResult(int value){
        if(value!=0){
            return ;
        }
        this.result=value;
    }
}