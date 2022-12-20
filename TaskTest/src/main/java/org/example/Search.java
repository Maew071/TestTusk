package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/*
public class Search {

    public class SearchStudent {
        ObjectMapper objectMapper = new ObjectMapper();
        Data example = objectMapper.readValue(new File("src/main/resources/Student проб..json"), Data.class);
        List<Student> students = example.getStudents();

        List<Student> studentByName = new ArrayList<>();

        for(
        Student student :students)

        {
            if (student.getName().equals("Student1")) {
                studentByName.add(student);
            }

        }

        Data search = new Data();
        search.setStudents(studentByName);
        byte[] bytes = objectMapper.writeValueAsBytes(search);
        File output = new File("src/main/resources/output/output.json");
        Files.write(output.toPath(),bytes);
    }
}*/
