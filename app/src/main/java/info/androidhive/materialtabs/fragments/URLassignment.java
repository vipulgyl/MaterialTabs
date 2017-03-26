package info.androidhive.materialtabs.fragments;

/**
 * Created by A.K on 3/23/2017.
 */

public class URLassignment {
    static int id;

    public static void setId(int id) {
        URLassignment.id = id;
    }

    public static int getId() {

        return id;
    }
    static int CheckURL,age;
    public static void setCheckURL(int i)
    {
        CheckURL=i;
    }

    public static int getCheckURL() {
        return CheckURL;
    }

    public static void setAge(int age) {
        URLassignment.age = age;
    }

    public static int getAge() {
        return age;
    }
    public static void main (String args[])
    {
        URLassignment urLassignment = new URLassignment();
    }
}
