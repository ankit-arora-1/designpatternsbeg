package builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.builder();
//        builder.setName("Bhargav");
//        builder.setBatch("beg");
//        builder.setAge(101);
//
//        // Student student = new Student(builder);
//        Student student = builder.build();


        Student student = Student
                .builder()
                .setName("Rahul")
                .setAge(20)
                .setPsp(20.2)
                .build();

        System.out.println("DEBUG");
    }
}
