package HW1.edu.fitchburgstate.csc7400;

import java.util.Iterator;
import java.util.List;

/*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-18-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */

public class FindGuitarTester {
/*
 * Program Starts Here
 */
  public static void main(String[] args) {
    // Set up Rick's guitar inventory
    Inventory inventory = new Inventory();
    initializeInventory(inventory);

    GuitarSpec whatErinLikes = new GuitarSpec(GuitarBuilder.FENDER, "Stratocastor", 
            TypeOfGuitar.ELECTRIC, TypeOfWood.ALDER, TypeOfWood.ALDER);
     
        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        // This prints if there is a return from the search function in the inventory class
       	
       	if (matchingGuitars != null) {
       	    System.out.println("the below are the matched guitars:");
       	    for (Iterator<?> i = matchingGuitars.iterator(); i.hasNext(); ) {
       		 	        Guitar guitar = (Guitar)i.next();
       		 	    GuitarSpec spec = guitar.guitarSpec;
       		 	        System.out.println("  We have a  " + 
       		 	       	spec.getGuitarBuilder() + " " + spec.getGuitarModel() +  " " +
       		 	       	spec.getGuitarType() + " guitar:\n   " +
       		 	       	spec.getGuitarBackWood() + " back and sides,\n   " +
       		 	       	spec.getGuitarTopWood() + " top.\nYou can have it for only $" +
       		 	       	guitar.getPrice() + "!");
       	    }
       	}
       	    else {
        	System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

  private static void initializeInventory(Inventory inventory) {
	  /*
	   * Adding the inventory to Initialize Inventory Class
	   * */
    inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic",
                        "Indian Rosewood", "Sitka");
    inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric",
                        "Alder", "Alder");
    inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric",
                        "Alder", "Alder");
    inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic",
                        "Mahogany", "Adirondack");
    inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic",
                        "Brazilian Rosewood", "Adriondack");
    inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric",
                        "Mahogany", "Maple");
    inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue",
                        "electric", "Mahogany", "Mahogany");
    inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic",
                        "Brazilian Rosewood", "Adirondack");
    inventory.addGuitar("1092", 12995.95, "Olson", "SJ", "acoustic",
                        "Indian Rosewood", "Cedar");
    inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic",
                        "Cocobolo", "Cedar");
    inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature",
                        "electric", "Mahogany", "Maple");
  }
}
