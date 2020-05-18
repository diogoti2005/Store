package GenericsTask;

public class Zoo <T> {
    T age;
    T animalClass;
    T massa;

    public Zoo(T age, T animalClass, T massa) {
        this.age = age;
        this.animalClass = animalClass;
        this.massa = massa;
    }

    public T getAge(int i) {
        return age;
    }

    public T getAnimalClass() {
        return animalClass;
    }

    public T getMassa() {
        return massa;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public void setAnimalClass(T animalClass) {
        this.animalClass = animalClass;
    }

    public void setMassa(T massa) {
        this.massa = massa;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "age=" + age +
                ", animalClass=" + animalClass +
                ", massa=" + massa +
                '}';
    }
}
