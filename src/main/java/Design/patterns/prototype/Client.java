package Design.patterns.prototype;

public class Client {
    public static void main(String[] args) {
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();
        fillRegistry(prototypeRegistry);

        Student Ayushee = prototypeRegistry.get("March Batch").clone();
        Ayushee.setName("Ayushee Shaw");
        Ayushee.setEmail("ayusheeshaw.gmail.com");
        Ayushee.setPhone("9932790074");

        Student dino = prototypeRegistry.get("March Batch").clone();
        dino.setName("Dino Chakraborty");
        dino.setEmail("dino.gmail.com");
        dino.setPhone("9932790074");

        Student ishita = prototypeRegistry.get("Intelligent Batch").clone();
        ishita.setName("Ishita Chakraborty");
        ishita.setEmail("ishita@gmail.com");
        ishita.setPhone("77887787887");
        ishita.setInstructorName("Umang Agrawal");
        //ishita.setIq(100); //how to set iq here , since prototype registry returns Student type Object
        //so we will not be able to call setIq method
        System.out.println("DEBUG");
    }

    private static void fillRegistry(PrototypeRegistry register) {

        Student marchBatch = new Student();
        marchBatch.setBatchName("Scaler March 2024");
        marchBatch.setBatchAvgPSP(80.0);
        marchBatch.setInstructorName("Deepak Kasera");
        register.addtoRegistry("March Batch",marchBatch);

        Student aprilBatch = new Student();
        marchBatch.setBatchName("Scaler April 2024");
        marchBatch.setBatchAvgPSP(90.0);
        marchBatch.setInstructorName("Abhishek Gupta");
        register.addtoRegistry("April Batch",aprilBatch);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatchName("Intelligent Batch");
        intelligentStudent.setBatchAvgPSP(100.0);
        intelligentStudent.setIq(100);
        register.addtoRegistry("Intelligent Batch",intelligentStudent);
    }
}
