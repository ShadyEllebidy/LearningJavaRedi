package src;

public class Student {
    private String name, university, course, email;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return email.equals(student.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    public Student(String name, String university, String course, String email, int age){
        this.name =name;
        this.university=university;
        this.course=course;
        this.email=email;

        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
