package priv.lint.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.lint.entity.Student;

import java.util.Date;

@RestController
class JackJSONTestController {

    @Autowired
    Student student;

    @RequestMapping("/test")
    public Student getStudent(){
        student.setName("王阳明");
        student.setHobby("心学");
        student.setAge(99);
        student.setBirthday(new Date());
        return student;
    }
}
