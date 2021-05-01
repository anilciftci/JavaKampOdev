package com.company;

public class InstructorManager {

    public void dersEkle(Users users){

        System.out.println("Yeni Ders eklendi " + users.lessonsname);
    }

    public void odevEkle(Instructors instructors){
        System.out.println("Ödevler sisteme eklendi" +instructors.lessonsName);
    }

    public void dersGuncelle(Instructors instructors){

    }


}
