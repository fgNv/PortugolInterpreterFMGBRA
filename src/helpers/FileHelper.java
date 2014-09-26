/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class FileHelper {
    
    public static String GetStringFromFile(String path) throws IOException{
        File file = new File(path);        
        List<String> input = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
        String result = "";
        
        for(String item : input){
            result = result + "\r\n" + item ;
        }
        
        return result;
    }
}
