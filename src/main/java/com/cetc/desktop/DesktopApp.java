package com.cetc.desktop;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class DesktopApp {

    public static void main(String[] args) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(URI.create("http://www.baidu.com"));
    }
}
