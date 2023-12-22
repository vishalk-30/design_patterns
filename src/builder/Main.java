package builder;

public class Main {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                .id(1)
                .age(23)
                .batchName("sept22")
                .email("vishal@email.com")
                .gradYear(2020)
                .name("Vishal Kumar")
                .phoneNumber("5557789")
                .psp(88)
                .universityName("XYZ")
                .build();

        Student student2= Student.builder()
                .id(2)
                .name("djdjk")
                .gradYear(2021)
                .age(34)
                .phoneNumber("7788")
                .build();
        //student2.setAge(18);

        DatabaseConnectionPool databaseConnectionPool = DatabaseConnectionPool.builder()

                .name("name")
                .mysql()
                .port(3306)
                .isCompressed()
                .withCredentials("groot","IamGroot")
                .build();




    }
}
