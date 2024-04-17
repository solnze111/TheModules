package com.ee.entity.Person;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Person {
    private Long id;
    private String pname;
    private int age;
}
