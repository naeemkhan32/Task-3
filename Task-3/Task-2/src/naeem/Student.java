package naeem;


/*
  Name : Naeem Khan
  ID : 2012020105
  Section : C
  Email : cse_2012020105@lus.ac.bd
  Date : 08-08-2021
 */


public class Student {
    String name;
    int id;
    static String universityName = "Leading University,Sylhet";

    Student()
    {

    }

    Student(String name)
    {
        this.name = name;
        System.out.println("Name : "+name);
    }

    Student(int id)
    {
        this.id = id;
        System.out.println("ID : "+id);
    }

    void display()
    {
        System.out.println("University : "+universityName);
    }
}
