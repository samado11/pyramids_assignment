/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import Pyramid.Pyramid;
import Pyramid.PyramidCSVDAO;
import java.util.ArrayList;
/**
 *
 * @author maroa
 */
public class Pyramids {

    
    public static void main(String[] args) {
        PyramidCSVDAO obj = new PyramidCSVDAO();
        ArrayList<Pyramid> pyramid_list = new ArrayList<Pyramid>();
        pyramid_list=obj.read_csv();
        for (int i = 0; i < pyramid_list.size(); i++)
            System.out.println(pyramid_list.get(i));
    
    }
    
}
