package org.example;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.tool.schema.ast.GeneratedSqlScriptParserTokenTypes;

import javax.persistence.*;

@Entity
//@Entity(name = "student_details") - here every Entity means <student_details>
//@Table(name = "my_students") - only table name changes in DB
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Student(int id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Student() {
        super();
    }

    public void setId(int id) {this.id = id;}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
