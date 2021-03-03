import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    Student student1 = new Student();
    Student student2 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";

    student2.setName("Nigel Burris");
    student2.setGPA(4.3);
    student2.setMajor("Marketing"); 

    student1.print();
    student2.print();
    
   ArrayList<Double> gpas = new ArrayList<Double>();
   gpas.add(0, student1.gpa);
   gpas.add(1, student2.gpa);

   double sum = 0;
     for(int number = 0; number < gpas.size(); number++)
      sum += gpas.get(number);

   double average = sum / gpas.size();
   System.out.println("The average GPA is " + average);
    // or can do this with the dot operator    
    //System.out.println("student1's name is " + student1.name + " and their GPA is" + student1.gpa + " and their major is " + student1.major);
    }
  }