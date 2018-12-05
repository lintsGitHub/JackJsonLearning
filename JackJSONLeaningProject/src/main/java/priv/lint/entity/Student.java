package priv.lint.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Student {
    String name;
    int age;

    @JsonFormat(pattern = "yyyy-MM-dd") //返回数据到服务器时进行数据转换
    Date birthday;

    @JsonIgnore // ignore 忽略  我们设置这个注解就是在进行JSON字符串转换时可以把这个属性给忽略掉，也就是不显示
    String hobby;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
