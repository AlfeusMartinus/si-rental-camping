/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class Star_server {
    static ServerSocket server;
    static Socket client;
    static boolean signal = false;

    public Star_server (){
          try {
            System.out.println("Loading n Waitting");
           JOptionPane.showMessageDialog(null,"Server Diaktifkan");
            server = new ServerSocket(Parameter.PORT);
            signal = true;
        } catch (Exception ex) {
            signal = false;
        }

        if (signal == true) {
            new terimaKoneksi("RunServer");

        }

    }
  

        public static class terimaKoneksi implements Runnable {

        Thread t;

        terimaKoneksi(String imeNiti) {
            t = new Thread(this, imeNiti);
            t.start();
        }

        public void run() {
            while (true) {
                try {

                    try {

                        client = server.accept();
                        System.out.println("Akses Client.....");
                    } catch (Exception ex) {
                        break;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        }

}
}
