//这里我构建一个场景：学校里有学生，学生在学习。然而这个世界被数字生命（？）入侵了，我们需要把这些数字生命同普通学生区别开来，并进行针对性授课。接下来，先把这个场景进行实现。
//代码如下：
//学生：（数字生命的数据类型是int,double等，普通学生是String，为了能兼容，这里使用泛型类）
public class Student <T> implements StudentInterface{
    private T name;//学生名字
    private int id;//学号
    private int ID;//学生类型
    //构造函数，输入变量为学生的名字
    public Student(T name){
        this.name = name;
        this.ID = determinID(name);

    }
    //姓名
    public void setName(T name){
        this.name = name;
    }
    public T getName(){
        return this.name;
    }
    //学号
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    //定义私有方法，判断学生类型.查询学生类型的方法为protected。
    private int determinID(T name){
        if(name instanceof String){
            return 0;
        }else if(name instanceof Number){
            return 1;
        }else{
            return 2;
        }
    }
    protected int getID(){
        return ID;
    }
    protected void getVitaLevel(){
        int id = this.ID;
        if(id == 0 ){
            System.out.println("学生"+name+"是人类,请善待");
        }
        if(id == 1 ){
            System.out.println("学生"+name+"是数字生命，请注意不要暴露");
        }
        if(id == 2 ){
            System.out.println("警告:"+"学生"+name+"生命类型未知，请谨慎对待");
        }
    }
    //定义学生行为接口act。
    @Override
    public void study(){
        System.out.println(this.name+" 开始学习.");
    }
    public void sleep(){
        System.out.println(this.name+" 开始睡觉.");
    }
    public void eat(){
        System.out.println(this.name+" 开始进食.");
    }
    public void ready(){
        System.out.println(this.name+" 准备就绪.");
    }

}
