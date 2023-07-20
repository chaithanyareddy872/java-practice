package com.java.practice;

class RefAnonymous{
    public void show(){
        System.out.printf("this is old implem");
    }

}
public class AnonymousClass {
    public static void main(String[] args) {
        //it should use only when only one time usage
        RefAnonymous obj=new RefAnonymous(){
            @Override
            public void show() {
                System.out.printf("this is new implem");;
            }
        };
        obj.show();
    }
}

