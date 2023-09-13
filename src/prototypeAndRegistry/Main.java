package prototypeAndRegistry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Student student = new Student(1,"Vishal",0,"sept22",
                "LLD","BE",2022,"Sandeep",2023,
                "RazorPay");

        List<Student> studentList = new ArrayList<>();
        for(int i=0;i<100;i++){
            studentList.add(student.clone());
        }

        Student sept22 = new Student(1,"Vishal",0,"sept22",
                "LLD","BE",2022,"Sandeep",2023,
                "RazorPay");

        Student oct22 = (new Student(4,"Bitan",0,"oct22",
                "DSA","FS",2022,"Rahul",2023,
                "RazorPay"));

        Student aug22 = (new Student(9,"Sagnik",0,"octt22",
                "LLD","BE",2022,"Naman",2023,
                "RazorPay"));

        StudentRegistry studentRegister = new StudentRegistry();
        
        studentRegister.addToRegistry(sept22);
        studentRegister.addToRegistry(oct22);
        studentRegister.addToRegistry(aug22);
        
        Student rohitaug22 = studentRegister.getFromRegistry("aug22").clone();
        rohitaug22.setId(33);
        rohitaug22.setName("Rohit");
        rohitaug22.setPsp(77);
        

    }
    
}

