/**
 * Created by namercx on 2016/10/16.
 */
public class Test {                                      //测试类
    public static void main(String[] args) {
        Human student1 = new Human(" 男");               //建立对象1，并调用构造方法为性别赋值
        Human student2 = new Human(" 男");               //建立对象2，并调用构造方法为性别赋值，以下同
        Human student3 = new Human(" 男");
        Human student4 = new Human(" 男");
        Human student5 = new Human(" 男");
        Human student6 = new Human(" 男");
        student1.setAge(18);                              //分别为每个对象年龄赋值
        student1.setName("曾名扬");                      //分别为每个对象姓名赋值
        student2.setAge(18);
        student2.setName("徐书展");
        student3.setAge(18);
        student3.setName("郑昱旋");
        student4.setAge(18);
        student4.setName("曹越  ");
        student5.setAge(18);
        student5.setName("饶东  ");
        student6.setAge(18);
        student6.setName("吴随  ");
        student1.introduce();                           //分别调用介绍方法
        student2.introduce();
        student3.introduce();
        student4.introduce();
        student5.introduce();
        student6.introduce();
    }
}
