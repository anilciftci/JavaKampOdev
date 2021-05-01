package com.company;

public class Main {

    public static void main(String[] args) {

//        Users[] users = new Users[]{new Students(),new Instructors()};
        Users instructors1 = new Instructors();
        instructors1.name="Engin Demiroğ";
        instructors1.username="engindemirog";
        instructors1.branch = "Java";

        Users instructors2 = new Instructors();
        instructors2.name="Mustafa Murat Coşkun";
        instructors2.username="mmcoskun";
        instructors2.branch = "C#";

        Users students1 = new Students();
        students1.name= "Anıl Çiftçi";
        students1.branch ="Java";
        students1.username = "anilciftc";

        Users students2 = new Students();
        students2.name= "Yağız Çiftçi";
        students2.branch ="C#";
        students2.username = "yagizciftc";

        Users[] users = new Users[]{instructors1,instructors2};
        for (Users inst:users) {
            System.out.println("Eğitmenler : " + inst.name );
        }

        Users[] users2 = new Users[]{students1,students2};
        for (Users stundt:users2) {
            System.out.println("Öğrenciler : " + stundt.name );
        }

        InstructorManager instructorManager = new InstructorManager();
        System.out.println(instructors1.branch);









    }
}
