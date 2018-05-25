/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linuxshell;

/**
 *
 * @author 77873875
 */
public class LinuxShell {

    private Albero filesystem;
    private NodoAlbero c;
    private String path;

    public LinuxShell() {
        this.filesystem = new Albero();
        this.c = filesystem.getPtr();
        path="/";
    }
    
    
    
}
