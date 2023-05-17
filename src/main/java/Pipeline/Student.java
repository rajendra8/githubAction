package Pipeline;

public class Student {

    String name;
    int RollNumber;
    private void setDetails(String name,int RollNumber){
        this.name=name;
         this.RollNumber=RollNumber;
    }

    public void getDetails(){
        setDetails("raj",122);
        System.out.println("Name of Student :"+name);
        System.out.println("RollNumber of Student :"+RollNumber);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getDetails();
        Constructor c=new Constructor("Ronin", 90);
    }

}
