package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class ReadService {

    static String ftpUrl = "ftp://admin:123456@localhost:2121"; //в строке указываю адрес FTP сервера и порт

    public static void getStudentById(int id) throws IOException {
        //подключаемся к серверу FTP
        URLConnection urlConnection = new URL(ftpUrl).openConnection();
        URLConnection.connect();

        ObjectMapper objectMapper = new ObjectMapper();
        org.example.Data example = objectMapper.readValue(new File("src/main/resources/Student проб..json"), org.example.Data.class);
        List<org.example.Student> students = example.getStudents();

        List<org.example.Student> studentByName = new ArrayList<>();

        for(
                org.example.Student student :students) {
            if (student.getName().equals("Student1")) {
                studentByName.add(student);
            }
        }


/*      Тут я перезаписывал свой локальный файл, тест
        Data search = new Data();
        search.setStudents(studentByName);
        byte[] bytes = objectMapper.writeValueAsBytes(search);
        File output = new File("src/main/resources/output/output.json");
        Files.write(output.toPath(),bytes);*/
    }



    }

