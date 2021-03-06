
package HW1.test.edu.fitchburgstate.csc7400;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import HW1.edu.fitchburgstate.csc7400.Guitar;
import HW1.edu.fitchburgstate.csc7400.GuitarSpec;
import HW1.edu.fitchburgstate.csc7400.GuitarBuilder;
import HW1.edu.fitchburgstate.csc7400.TypeOfGuitar;
import HW1.edu.fitchburgstate.csc7400.TypeOfWood;

 /*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-18-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */
/*
 * Creating a Test testGuitar*/

class GuitarTest {
	
	Guitar testGuitar;

	@BeforeEach
	void setUp() throws Exception {
		this.testGuitar = new Guitar(
				"AB123", // serial number
				203.35, // store price
				"Gibson", // Manufacturer
				"EasyLearn", // Manufacturer model
				"electric", // Type of Guitar
				"Maple", // Back wood
				"Adirondack" // Face wood
				);
	}
	/*
	 * 
	 * Tests getSpec() method in Guitar class
	 */
	@Test
	void testGetSpec() {
		GuitarSpec returnedGuiterSpec = this.testGuitar.getGuitarSpec();
		assertEquals(returnedGuiterSpec.getGuitarBuilder(),"Gibson");
		assertEquals(returnedGuiterSpec.getGuitarBackWood(),"Maple");
		assertEquals(returnedGuiterSpec.getGuitarModel(),"EasyLearn");
		assertEquals(returnedGuiterSpec.getGuitarTopWood(),"Adirondack");
		assertEquals(returnedGuiterSpec.getGuitarType(),"electric");
	}
	
	/*
	 * This function is testing if the passed serial number exists or not. 
	 */
	@Test
	void testGetSerialNumber() {
		String expected = "AB123";
		String returned = this.testGuitar.getSerialNumber();
		assertEquals(expected, returned, String.format("Serial number %s != %s", expected, returned));
	}
   /*
    *This function is testing whether the passed price is equal to the price fetched.
    **/
	@Test
	void testGetPrice() {
		double expected = 203.35;
		double returned = this.testGuitar.getPrice();
		assertEquals(expected, returned, 0.01, String.format("Price %f != %f", expected, returned));
	}
    /*
     *Testing if we can set guitar's price.
     */
     @Test
	 void testSetPrice() {
		double expected = 225.10;
		this.testGuitar.setPrice(expected);
		double returned = this.testGuitar.getPrice();
		assertEquals(expected, returned, String.format("Price %f != %f", expected, returned));
	}
    /*
     * Testing if manufacturer field is fetched 
     */
	@Test
	void testGetManufacturer() {
		String expected = "Gibson";
		GuitarBuilder returned = this.testGuitar.getGuitarSpec().getGuitarBuilder();
		assertEquals(expected, returned, String.format("Manufacturer %s != %s", expected, returned));
	}
    /*
     *Testing if guitar's model is fetched. 
     */
	@Test
	void testGetModel() {
		String expected = "EasyLearn";
		String returned = this.testGuitar.getGuitarSpec().getGuitarModel();
		assertEquals(expected, returned, String.format("Model %s != %s", expected, returned));
	}
    /*
     *Testing if guitar's type is fetched. 
     */
	@Test
	void testGetType() {
		String expected = "electric";
		TypeOfGuitar returned = this.testGuitar.getGuitarSpec().getGuitarType();
		assertEquals(expected, returned, String.format("Type %s != %s", expected, returned));
	}
    /*
     * Testing if guitar's back wood field is fetched.*/
	@Test
	void testGetBackWood() {
		String expected = "Maple";
		TypeOfWood returned = this.testGuitar.getGuitarSpec().getGuitarBackWood();
		assertEquals(expected, returned, String.format("Back wood %s != %s", expected, returned));
	}
    /*
     * Testing if guitar's top wood field is fetched*/
	@Test
	void testGetTopWood() {
		String expected = "Adirondack";
		TypeOfWood returned = this.testGuitar.getGuitarSpec().getGuitarTopWood();
		assertEquals(expected, returned, String.format("Top wood %s != %s", expected, returned));
	}
}