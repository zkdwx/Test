package com.wx;

import java.util.Arrays;
import java.util.List;

public class Test{


    public static void main(String[] args) {
        Student s1=new Student();
        s1.setAge(1);
        s1.setName("li san1");

        Student s2=new Student();
        s2.setAge(2);
        s2.setName("li san2");

        List<Student> s=Arrays.asList(s1,s2);

        s.forEach(student -> {
            int n=2*student.getAge();
            System.out.println(n);
        });
    }
	
	println("Hello");

}
