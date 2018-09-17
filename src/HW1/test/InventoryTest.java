package HW1.test.edu.fitchburgstate.csc7400;

 import static org.junit.jupiter.api.Assertions.*;
import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.Inventory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-16-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */

public class InventoryTest {
    Inventory inventoryClass;
    Guitar guitarClass;
     /**
     * Test data setup. Add guitar data to inventory
     */
    @BeforeEach
    public void setup() {
        // instantiate inventory class
    	inventoryClass = new Inventory();
        guitarClass = new Guitar("1111", 7999.50, "GuiterBuilders.Inc", "GuiterNew", "GuiterTypeNew",
                "GuiterBlackwood", "GuiterTopWood");
        inventoryClass.addGuitar(guitarClass.getSerialNumber(), guitarClass.getPrice(), guitarClass.getManufacturer(),
                guitarClass.getModel(), guitarClass.getType(), guitarClass.getBackWood(), guitarClass.getTopWood());
        
    }
     /**
     * This function is to test getGuitar() method. This method takes in serial number.
     */
    @Test
    void checkIfSerialNumberExists() {
        Guitar check = inventoryClass.getGuitar(guitarClass.getSerialNumber());
        Guitar available = guitarClass;
        assertEquals(check.getSerialNumber(), available.getSerialNumber());
        assertEquals(check.getManufacturer(), available.getManufacturer());
        assertEquals(check.getModel(), available.getModel());
        assertEquals(check.getPrice(), available.getPrice());
        assertEquals(check.getType(), available.getType());
        assertEquals(check.getTopWood(), available.getTopWood());
        assertEquals(check.getBackWood(), available.getBackWood());
    }
     
     /**
     * This function is to test search() method. This method takes in backwood parameter.
     */
    @Test
    void checkIfBackWoodExists() {
        Guitar available = new Guitar(null, 0, null, null, null, "GuiterBlackwood",null);
        Guitar check = inventoryClass.search(available);
        assertEquals(check.getBackWood(), available.getBackWood());
    }
    /**
     * This function is to test search() method. This method checks if blackwood exists
    */
    @Test
    void checkIfBackWoodDoesExist() {
        Guitar available = new Guitar(null, 0, null, null, null, "UnlistedGuiterBlackwood", null);
        Guitar check = inventoryClass.search(available);
        assertEquals(null, check);
    }
     /**
     * This function is to test search() method. This method takes in toopwood parameter.
     */
    @Test
    void checkIfTopWoodExists() {
        Guitar available = new Guitar(null, 0, null, null, null, null, "GuiterTopWood");
        Guitar check = inventoryClass.search(available);
        assertEquals(check.getTopWood(), available.getTopWood());
    }
    /**
     * This function is to test search() method. This method checks if toopwood exists.
    */
    @Test
    void checkIfTopWoodDoesExist() {
        Guitar available = new Guitar(null, 0, null, null, null,  null, "UnlistedGuiterGuiterTopWood");
        Guitar check = inventoryClass.search(available);
        assertEquals(null, check);
    }
     /**
     * This function tests if a particular guitar model exists in the inventory.
     */
    @Test
    void checkIfModelExists() {
        Guitar available = new Guitar(null, 0, null, "GuiterNew", null, null, null);
        Guitar check = inventoryClass.search(available);
        assertEquals(check.getModel(), available.getModel());
    }
    /**
     * This function tests if a particular guitar model does exists in the inventory.
    */
    @Test
    void checkIfModelDoesNotExist() {
    	Guitar available = new Guitar(null, 0, null, "UnlistedGuiterNew", null,  null, null);
    	Guitar check = inventoryClass.search(available);
    	assertEquals(null, check);
    }
     /**
     * This function tests if a particular guitar Type exists in the inventory.
     */
    @Test
    void checkIfTypeOfGuitorExists() {
        Guitar available = new Guitar(null, 0, null, null, "GuiterTypeNew", null, null);
         Guitar check = inventoryClass.search(available);
        assertEquals(check.getType(), available.getType());
    }
    /**
    * Tests search method by passing a type of a guitar that is not preset in the inventory
    */
    @Test
    void checkIfTypeOfGuitorDoesNotExist() {
        Guitar available = new Guitar(null, 0, null, null, "UnlistedGuiterTypeNew", null, null);
        Guitar check = inventoryClass.search(available);
        assertEquals(null, check);
    }
     /**
     * This function tests if a guitar manufacturer exists in the inventory.
     */
    @Test
    void checkIfManufacturerExists() {
        Guitar available = new Guitar(null, 0, "GuiterBuilders.Inc", null, null, null, null);
        Guitar check = inventoryClass.search(available);
        assertEquals(check.getManufacturer(), available.getManufacturer());
    }
     /**
     * This function tests if a guitar manufacturer dosent exists in the inventory.
     */
    @Test
    void checkIfManufacturerDoesNotExistS() {
        Guitar available = new Guitar(null, 0, "UnlisterGuiterBuilders.Inc", null, null, null, null);
        Guitar check = inventoryClass.search(available);
        assertEquals(null, check);
    }      
}