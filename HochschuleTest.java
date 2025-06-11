public class HochschuleTest {
    
    public static void main(String[] args){
        Uebung prog1 = new Uebung("Grundlagen der Programmierung", "Gaertner", 0);
        Student stud1 = new Student("stud1", "dd", "123");
        Student stud2 = new Student("stud2", "dd", "456");
        Student stud3 = new Student("stud3", "dd", "789");

        prog1.zertifikatErwerben(stud3);
        prog1.zertifikatErwerben(stud3);
        prog1.print();

        System.out.println( prog1.zertifikatErwerben(stud1));
        System.out.println( prog1.zertifikatErwerben(stud2));
    }
}
