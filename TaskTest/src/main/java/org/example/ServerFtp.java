package org.example;


import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.FtpServerFactory;
import org.apache.ftpserver.ftplet.Authority;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.listener.ListenerFactory;
import org.apache.ftpserver.usermanager.impl.BaseUser;
import org.apache.ftpserver.usermanager.impl.WritePermission;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//Попытался развернуть свой сервер FTP


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, FtpException {

        FtpServerFactory serverFactory = new FtpServerFactory();

        ListenerFactory factory = new ListenerFactory();
// Установить порт прослушивания
        factory.setPort(2121);

// Заменим прослушиватель по умолчанию
        serverFactory.addListener("default", factory.createListener());

// имя пользователя
        BaseUser user = new BaseUser();
        user.setName("admin");
// пароль Если вы не установили пароль, вы являетесь анонимным пользователем
        user.setPassword("123456");
// домашний каталог пользователя
        user.setHomeDirectory("src/main/resources");

        List<Authority> authorities = new ArrayList<Authority>();
// увеличить разрешение на запись
        authorities.add(new WritePermission());
        user.setAuthorities(authorities);

// Добавить пользователя
        serverFactory.getUserManager().save(user);


        FtpServer server = serverFactory.createServer();
        server.start();
    }
}