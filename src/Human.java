/**
 * Created by namercx on 2016/10/16.
 */
public class Human {
    private String name;                                   //私有属性姓名
    private int age;                                      //私有属性年龄
    private String sex;                                   //私有属性性别

    public Human(String sex){                             //因为性别不用更改，构造方法中给性别赋值
        this.sex=sex;
    }
    public void setName(String name) {                    //属性私有，从外部设置性名
        this.name = name;
    }
    public String getName(){                               //取得姓名
        return name;
    }

    public void setAge(int age) {                          //属性私有，从外部设置年龄
        this.age = age;
    }
    public int getAge() {                                   //取得年龄
        return age;
    }

    public void introduce(){                                //介绍的方法
        int rand = (int) (0+Math.random()*(3 - 0+1));       //全输出（笑）太失礼，就设置了4分之1的输出（顺便熟悉随机）
        String str = "  年龄：永远的"+getAge()+"      ";
        if (rand==0)                                         //用随机的数来分别情况
            str ="  年龄：永远的"+getAge()+"（笑）";
        System.out.println("姓名："+getName()+str+"   当然是"+sex+"的~");     //强迫症的输出
    }
}
