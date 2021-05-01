package com.company;

public class StudentManager {

    public void dersKayit(Users students){

        System.out.println(students.branch + " dersine kaydınız yapılmıştır.");
    }

    public void odevYap(Users users){
        System.out.println(users.branch + " Ödevinizi yaptınız");
    }

}
