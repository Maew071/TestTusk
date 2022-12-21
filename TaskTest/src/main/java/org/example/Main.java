package org.example;


import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        FTPClient client = new FTPClient();

        //запрашиваем логин и пароль
        client.connect("localhost", 2121);
        boolean login = client.login("admin", "123456");
        System.out.println(login);

        //пользователь должен выбрать что он хочет сделать
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете действие" + "1.Получение списка студентов по имени " + "2.Получение информации о студенте по id "
                + "3.Добавление студента" + "4.Удаление студента по id " + "5.Завершение работы ");
        if (scanner.hasNextLine());

        //выбираем какой либо пункт

        //дальше я должен буду вызывать методы в зависимостри от того что необходимо сделать.
        String remoteFile = "Student проб..js";
        File downloadFile1 = new File("Скачанный файл c FTP");
        FileOutputStream fos = new FileOutputStream(downloadFile1);
        boolean b = client.retrieveFile("/" + remoteFile, fos );





    }
}