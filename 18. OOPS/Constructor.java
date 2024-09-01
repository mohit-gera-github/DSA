public class Constructor {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2 = new Student("Mohit");
        Student s3 = new Student(20);
        
    }
    
}

 class Student{
    String name;
    int age;
    
    Student(){
        System.out.println("Constructor is called..");
    }

    Student(String name){
        this.name=name;
    }

    Student(int age){
        this.age=age;
    }
}