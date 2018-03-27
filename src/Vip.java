
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public interface Vip {
    public static void Login(String username , String password)
    {
        File file = new File("Vip.txt");
    int linenumber = Tools.Search(file, username);
    }
}
