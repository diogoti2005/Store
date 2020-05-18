package Generics;


public class Main {

    public static void main(String[] args) {
        Students<Integer> student = new Students<>(10, 10, 10);
        Students<String> studentStr = new Students<>("10", "Irina", "student");
        Students<SuperClass> studentClass = new Students<>(new SuperClass(), new SuperClass(), new SuperClass());
        student.setName(10);
        studentStr.setName("Irina");
        System.out.println(studentClass.getName());
    }

    static class SuperClass {
        public String toString() {
            return "super";
        }

    }

}