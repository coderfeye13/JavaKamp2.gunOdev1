public class main {
    public static void main(String[] args) {
        Profile profile1 = new Profile(1,"Furkan","Kayseri", 12345,"Giriş Yapıldı."); //referans oluştu.

        Profile profile2 = new Profile(); //referans2 oluştu.
        profile2.id =2;
        profile2.name = "Eda";
        profile2.Address ="Konya";
        profile2.mobile =54321;
        profile2.logOut ="Giriş Yapıldı.";

        Profile profile3 = new Profile(); //referans3 oluştu.
        profile3.id =3;
        profile3.name = "Cihan";
        profile3.Address ="Eskişehir";
        profile3.mobile =12564;
        profile3.logOut ="Gİriş Yapıldı.";

        Profile profile4 = new Profile(); //referans4 oluştu.
        profile4.id =4;
        profile4.name = "Kaan";
        profile4.Address ="Gaziantep";
        profile4.mobile =16548;
        profile4.logOut ="Giriş Yapıldı.";


        Profile[] profiles = {profile1,profile2,profile3,profile4}; //Profiller bir arrayde saklandı.

        for (Profile profile : profiles){  //Profil bilgileri yazdırıldı
            System.out.println(profile.name);
            System.out.println(profile.Address);
            System.out.println(profile.mobile);
            System.out.println(profile.logOut);
        }
        //System.out.println(profiles.length);

        Courses course1 = new Courses();
        course1.id=30;
        course1.name ="Programlamaya Giriş";
        course1.check ="Seçilmedi.";

        Courses course2 = new Courses();
        course2.id=31;
        course2.name ="C# ve Angular";
        course2.check ="Seçilmedi.";

        Courses course3 = new Courses();
        course3.id=32;
        course3.name ="Java ve React";
        course3.check ="Seçilmedi.";

        Courses course4 = new Courses();
        course4.id=33;
        course4.name ="JavaScript";
        course4.check ="Seçilmedi.";

        Courses[] coursess = {course1,course2,course3,course4}; //Profiller bir arrayde saklandı.

        for (Courses courses : coursess){  //Profil bilgileri yazdırıldı
            System.out.println(courses.name);
        }

        Check check = new Check();
        check.checkControl(profile1);
        check.checkControl(profile2);
        check.checkControl(profile3);
        check.checkControl(profile4);

        LogOut logOut = new LogOut();
        logOut.logOutControl(profile1);
        logOut.logOutControl(profile2);
        logOut.logOutControl(profile3);
        logOut.logOutControl(profile4);
    }
}
