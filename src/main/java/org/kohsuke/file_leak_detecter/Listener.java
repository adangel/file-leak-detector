package org.kohsuke.file_leak_detecter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author Kohsuke Kawaguchi
 */
public class Listener {
    public static void open(FileOutputStream fos, File f) {
        System.out.println(fos+" opened "+f);
    }

    public static void close(FileOutputStream fos) {
        System.out.println(fos+" closed");
    }
}