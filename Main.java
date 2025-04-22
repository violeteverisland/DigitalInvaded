import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstStart();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择您要进行的操作：\n"+"1.创建新角色"+"2.创建新学校");
        Integer i1 = scanner.nextInt();
        if(i1 == 1){
            System.out.println("敬请期待");
        }else {
            System.out.println("未完待续");
        }

    }
    //初始化学校和四个主角
    public static void firstStart(){
        Student<String> s1 = new Student<>("姜尧");
        Student<String> s2 = new Student<>("苗雨萌");
        Student<String> s3 = new Student<>("王承烨");
        Student<Integer> s4 = new Student<>(1);
        Student<Student<?>> s5 = new Student<>(s1);
        List<Student<?>> l1 = new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);
        l1.add(s5);
        School school1 = new School("哈尔滨工地大学",l1);
        school1.act();
        school1.getStudentVitaLevel();
        System.out.println("目前"+school1.schoolname()+"的学生有"+school1.studentNums()+"个。");
    }
}
