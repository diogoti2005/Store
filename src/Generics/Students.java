package Generics;


public class Students<T> {

    T name;
    T id;
    T role;

    public Students(T name, T id, T role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T getRole() {
        return role;
    }

    public void setRole(T role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", id=" + id +
                ", role=" + role +
                '}';
    }


}