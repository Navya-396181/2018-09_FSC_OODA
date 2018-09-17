/*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-16-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */
package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Inventory keeps a searchable collection of Guitars. It is meant to be use
 * to find matching guitars for customers. 
 * 
 * @author orlando
 * @version 2.0
 */
public class Inventory {
  private List<Guitar> guitars = new LinkedList<Guitar>();
  
  /*
   * Constructor Inventory initialized here.
   * serialNumber is manufacturer serial number
   * price is store price
   * builder is Guitar's manufacturer
   * model is manufacturers model
   * type is the type of guitar whether it is electric or acoustic
   * backWood the type of wood used for guitar body
   * topWood the type of wood used for guitars face
   */

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
  /*
   * serialNumber is serial number of Guitar
   * This method returns guitar that has input serial number */
  
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  /*
   * searchGuitar is for customers searching for guitars with attributes like
   * manufacturer , model , type , backwood, topwood .
   * 
   * This method returns guitars which customers searched for or else returns Null.
   * */
  public Guitar search(Guitar searchGuitar) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getManufacturer();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getManufacturer())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
}
