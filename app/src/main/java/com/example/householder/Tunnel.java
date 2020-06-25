package com.example.householder;

import android.widget.Toast;

import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

public class Tunnel {
    private static final String ip = "http://yeochan.iptime.org";
    private static final int port = 8080;
    private static final String user = "db";
    private static final String password = "db1127";

    private FTPClient connect() throws SocketException, IOException {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(this.ip, this.port);
            ftpClient.login(this.user, this.password);
        } finally {
            return ftpClient;
        }
    }

    public void upload(File file, String filename) throws SocketException, IOException, Exception {
        try {
            FTPClient ftpClient = connect();
        } finally {

        }
    }
}
