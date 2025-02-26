package DesignPattern.Builder;

import ConstructorChaining.B;

import java.util.HashMap;

public class Student {
    private  int id;
    private String name;
    private String universityName;
    private int gradYear;
    private  int psp;
    private int age;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    private Student(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.universityName = b.universityName;
        this.gradYear = b.gradYear;
        this.psp = b.psp;
        this.age = b.age;
        this.phoneNumber = b.phoneNumber;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{  // take inputs , validate inputs and create Student Object
        private  int id;
        private String name;
        private String universityName;
        private int gradYear;
        private  int psp;
        private int age;
        private String phoneNumber;

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", universityName='" + universityName + '\'' +
                    ", gradYear=" + gradYear +
                    ", psp=" + psp +
                    ", age=" + age +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }

        public Builder Id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private void validate(){
            if(this.gradYear > 2023){
                throw new GradYearInvalidException();
            }
            if(this.name == null)
            {
                throw new InvalidNameException();
            }
            if(this.age < 20){
                throw new InvalidAgeException();
            }
        }

        public Student build(){
            validate();
            return new Student(this);
        }
    }
}
