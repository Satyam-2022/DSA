package com.JusticLeague;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myIP=InetAddress.getLocalHost();
        System.out.println("My IP Address is :");
        System.out.println(myIP.getHostAddress());
    }
}
