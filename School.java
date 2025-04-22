
import java.util.List;

public class School implements SchoolInterface{
    public String name;
    private List<Student<?>> studentList;
    public School(String name,List<Student<?>> studentList){
        this.name = name;
        this.studentList = studentList;
    }
    @Override
    public String schoolname(){
        return this.name;
    }
    public int studentNums(){
        return studentList.size();
    }
    public void addStudent(Student<?> student){
        this.studentList.add(student);
    }
    public void deleteStudentByIndex(int index){
        this.studentList.remove(index);
    }
    public void deleteStudent(Student<?> student){
        this.studentList.remove(student);
    }
    public void act(){
        for(Student<?> student : studentList){
            student.ready();
        }
        System.out.println(this.name+"新的一天开始了。");
    }
    protected void getStudentVitaLevel(){
        System.out.println("查询权限确认，已为您开启数据库。");
        for(Student<?> student : studentList){
            student.getVitaLevel();
        }
    }
}
