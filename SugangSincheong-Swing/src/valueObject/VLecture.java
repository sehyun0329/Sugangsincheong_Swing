package valueObject;

import java.util.Scanner;

public class VLecture {
    private String id;
    private String name;
    private String professor;
    private String credit;
    private String time;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProfessor() {
        return professor;
    }

    public String getCredit() {
        return credit;
    }

    public String getTime() {
        return time;
    }

    public void read(Scanner scanner) {
        this.id = scanner.next();
        this.name = scanner.next();
        this.professor = scanner.next();
        this.credit = scanner.next();
        this.time = scanner.next();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
