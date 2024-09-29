import java.util.Calendar;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[3];

        student[0] = new Student(1647, "Петренко", "Іван", "Вікторович",
                new Date(2000, Calendar.MAY, 15), "Київ, вул. Кіото, 10",
                "+380951234567", "ФІТ", 2, 4);
        student[1] = new Student(2326, "Дмитренко", "Петро", "Олександрович",
                new Date(1999, Calendar.SEPTEMBER, 20), "Львів, вул. Будівельників, 5",
                "+380661234567", "ФРГТБ", 3, 5);
        student[2] = new Student(3379, "Марченко", "Олег", "Вадимович",
                new Date(2001, Calendar.FEBRUARY, 10), "Одеса, вул. Набережна, 15",
                "+380931234567", "ФМТП", 1, 5);

        for (Student st : student) {
            st.displayStudentInfo();
        }
    }
}