import java.util.Date;
public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private int group;

    public Student(int id, String lastName, String firstName, String middleName,
                   Date birthDate, String address, String phoneNumber,
                   String faculty, int course, int group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    public Student(){

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public Integer getGroup() {
        return group;
    }
    public void setGroup(Integer group) {
        this.group = group;
    }

    public void displayStudentInfo() {
        System.out.println("ID: " + id);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Ім'я: " + firstName);
        System.out.println("По батькові: " + middleName);
        System.out.println("Дата народження: " + birthDate);
        System.out.println("Адреса: " + address);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Група: " + group);
        System.out.println("------------");
    }
}
