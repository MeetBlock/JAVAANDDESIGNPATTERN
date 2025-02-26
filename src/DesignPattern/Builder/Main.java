package DesignPattern.Builder;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
      Student s = Student.builder()
                                  .Id(1)
                                  .age(23)
                                  .name("Rahul")
                                  .psp(57)
                                  .phoneNumber("345244322")
                                  .gradYear(2021)
                                  .universityName("AKTU")
                                  .build();

        System.out.println(s);
    }
}
