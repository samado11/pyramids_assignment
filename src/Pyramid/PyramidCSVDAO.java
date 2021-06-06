/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramid;

//import Pyramid.Pyramid;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author maroa
 */
public class PyramidCSVDAO {
    public ArrayList<Pyramid> read_csv(){
        ArrayList<Pyramid> pyramid_list = new ArrayList<Pyramid>();
        try{
        File file = new File("C:\\Users\\maroa\\OneDrive\\Documents\\NetBeansProjects\\pyramids\\pyramids.csv");
        Scanner myReader = new Scanner(file);
        
        while(myReader.hasNextLine()){
            
            String data = myReader.nextLine();
            String[] attributes = data.split(",");
            if (attributes[7].matches("[0-9]+")) {
            Pyramid pyramid = new Pyramid(attributes[0],attributes[2],attributes[4],Double.parseDouble(attributes[7]));
            pyramid_list.add(pyramid);
            
            }
        }
        myReader.close();
        }
        catch (FileNotFoundException e){
            
        }
        return pyramid_list;
    }
}
