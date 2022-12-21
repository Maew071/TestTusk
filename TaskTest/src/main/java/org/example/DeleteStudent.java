/*
package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class DeleteStudent {
    ObjectMapper objectMapper = new ObjectMapper();
        Data example = objectMapper.readValue(new File("src/main/resources/Student проб..json"), Data.class);
        example.getStudents().removeIf(student -> student.getId() == 2); (через лямбду находим студента и удаляем его)

        byte[] bytes = objectMapper.writeValueAsBytes(example);
        File output = new File("src/main/resources/Student проб..json");
        Files.write(output.toPath(),bytes);
}
*/
