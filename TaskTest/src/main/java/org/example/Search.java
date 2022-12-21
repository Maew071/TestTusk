package org.example;


import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Search {

    public class SearchStudent {
        ObjectMapper objectMapper = new ObjectMapper();
        org.example.Data example = objectMapper.readValue(new File("src/main/resources/Student проб..json"), org.example.Data.class);
        List<org.example.Student> students = example.getStudents();

        List<org.example.Student> studentByName = new ArrayList<>();

        for(
        org.example.Student student :students)

        {
            if (student.getName().equals("Student1")) {
                studentByName.add(student);
            }

        }

        org.example.Data search = new org.example.Data();
        search.setStudents(studentByName);
        byte[] bytes = objectMapper.writeValueAsBytes(search);
        File output = new File("src/main/resources/output/output.json");
        Files.write(output.toPath(),bytes);
    }
}
