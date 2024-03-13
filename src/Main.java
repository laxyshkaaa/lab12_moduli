interface User{
    void login();
    void password();

}
abstract class People implements User{
    public String FIO;
    public String pass;
    public String log;
    public int age;
    public String Job;

    abstract public void login();



    abstract public void password();


    People(String FIO,int age,String Job, String log, String pass){
        this.FIO = FIO;
        this.age = age;
        this.Job = Job;
        this.log = log;
        this.pass = pass;
    }

}
class Student extends People{
    Student(String FIO,int age,String Job, String log, String pass) {
        super(FIO, age, Job, log, pass);
    }
        public void login(){
            System.out.println("Логин cудента: " + log );

        }
        public void password(){
            System.out.println("Пароль студента: " + pass );

        }

    }


class Teacher extends People{
    Teacher(String FIO,int age,String Job, String log, String pass){
        super(FIO, age, Job, log, pass);

    }
    public void login(){
        System.out.println("Логин учителя: " + log );

    }
    public void password(){
        System.out.println("Пароль учителя: " + pass );

    }

}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов Иван Иванович", 20, "Студент 3 курса", "ivanov", "123456");
        student1.password();
        Student student2 = new Student("Петрова Ольга Сергеевна", 22, "Студентка 4 курса", "petrova", "qwerty");
        student2.login();
        Teacher teacher1 = new Teacher("Сидорова Елена Петровна", 35, "Преподаватель математики", "sidorova", "abc123");
        Teacher teacher2 = new Teacher("Козлов Игорь Владимирович", 40, "Преподаватель физики", "kozlov", "password");
        teacher1.login();
        teacher2.password();
    }
}