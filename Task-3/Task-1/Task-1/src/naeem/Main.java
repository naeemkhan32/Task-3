package naeem;

/*
    *Name : Naeem Khan
    * ID : 2012020105
    * Section : C
    * Email : cse_2012020105
    * Data : 15-07-2021

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        String section;
        System.out.println("Enter section : ");
        section = input.nextLine();
        System.out.println("Section: "+section);

        Info myInfo = new Info();
        System.out.println("Name: "+myInfo.name);
        System.out.println("Id: "+myInfo.id);

        Hobby myHobby = new Hobby();
        System.out.println("Hobby: "+myHobby.hobbyName);


    }
}

