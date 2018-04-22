package web.model;

/**
 * Created by chejinqiang on 2018/4/16.
 */
public class School {
    private String schoolName;
    private String address;
    private int studentNumber;

    public School(){}
    public School(String schoolName,String address,int studentNumber) {
        this.schoolName = schoolName;
        this.address = address;
        this.studentNumber = studentNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
