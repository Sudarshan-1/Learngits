class Student{
    public int rollno;
    public String name;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}
public class Hi {
    public static void main(String[] args){
        Student[] arr;
        arr=new Student[3];
        arr[0]=new Student(1,"amar");
        arr[1]=new Student(2,"tom");

        for(int i=0;i<arr.length;i++){
            System.out.println("element at"+i+":"+arr[i].rollno+" "+arr[i].name);
        }


    }
}
