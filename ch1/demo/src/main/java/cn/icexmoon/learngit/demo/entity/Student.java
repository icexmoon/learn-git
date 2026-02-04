package cn.icexmoon.learngit.demo.entity;

import lombok.Data;

/**
 * @ClassName Student
 * @Description
 * @Author icexmoon@qq.com
 * @Date 2026/2/4 14:34
 * @Version 1.0
 */
@Data
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private ClassRoom classRoom;
}
