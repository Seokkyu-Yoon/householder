package com.example.householder;

import android.widget.Toast;

import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

public class Tunnel implements Runnable{
    private static final String IP = "http://yeochan.iptime.org";
    private static final int PORT = 8080;
    private static final String DB_USER = "db";
    private static final String DB_PASSWORD = "db1127";
    private static final int BEFORE_LOGIN = 0;

    private int state = 0;
    private String id;
    public Tunnel(String id) {
        this.id = id;
    }

    private FTPClient connect() {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(IP, PORT);
            ftpClient.login(DB_USER, DB_PASSWORD);
        } finally {
            return ftpClient;
        }
    }

    public void upload(File file, String filename) {
        try {
            FTPClient ftpClient = connect();
        } finally {

        }
    }

    @Override
    public void run() {
        if (state == 0) {
            FTPClient ftpClient = connect();
            try {
                int i = ftpClient.pwd();
                System.out.println(i);
            } catch (IOException e) {
                System.out.println("**************************** error ****************************");
            }
        }
    }
}
