package LabSE;

public class Info {
    private String name;
    private String lastName;
    private int age;

    public Info(String name, String lastName, int age) {
        this.setName(name);
        this.setLastName(lastName);
        this.setAge(age);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+" LastName: "+getLastName()+" Age: "+getAge();
    }
}
