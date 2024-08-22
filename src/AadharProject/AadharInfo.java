package AadharProject;

public class AadharInfo {
    String aadharNumber;
    String name;
    String fatherName;
    String age;
    String address;

    public AadharInfo(String aadharNumber, String name, String fatherName, String address, String age) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "AadharInfo{" +
                "aadharNumber='" + aadharNumber + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

