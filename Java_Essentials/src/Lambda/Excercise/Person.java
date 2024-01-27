package Lambda.Excercise;

public class Person {
    private int Pno;
    private String name;
     private String address;

    @Override
    public String toString() {
        return "Person{" +
                "Pno=" + Pno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(int pno, String name, String address) {
        Pno = pno;
        this.name = name;
        this.address = address;
    }

    public int getPno() {
        return Pno;
    }

    public void setPno(int pno) {
        Pno = pno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
