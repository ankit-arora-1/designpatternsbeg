package prototype;

public class Client {
    public static void populateRegistryDummy(StudentRegistry studentRegistry) {
        // create student prototypes
        Student apr23BatchPrototype = new Student();
        apr23BatchPrototype.setBatchName("Apr 23 Beg Java Batch");
        apr23BatchPrototype.setAvgBatchPsp(90.0);

        studentRegistry.register("apr23Beg", apr23BatchPrototype);

        IntelligentStudent may24ISPrototype = new IntelligentStudent();
        may24ISPrototype.setAvgBatchPsp(99.0);
        may24ISPrototype.setBatchName("May 24 Beg Intelligent Student batch");

        studentRegistry.register("may24IS", may24ISPrototype);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        populateRegistryDummy(studentRegistry);


        // a new student joins named lokesh with age 20 and psp as 10
        Student lokesh = studentRegistry.get("apr23Beg").clone();
        lokesh.setName("Lokesh");
        lokesh.setAge(21);
        lokesh.setPsp(98.0);

        Student rahul = studentRegistry.get("may24IS").clone();
        lokesh.setName("Rahul");
        lokesh.setAge(22);
        lokesh.setPsp(99.0);

        System.out.println("DEBUG");
    }
}
