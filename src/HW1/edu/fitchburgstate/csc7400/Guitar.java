/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * 
 * Date: 2018-09-03
 */

package HW1.edu.fitchburgstate.csc7400;

/**
 * Guitar contains the information needed to keep track of a type of guitar from
 * Rick's music store
 * 

 *
 */

/*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-16-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */
public class Guitar {
    GuitarSpec guitarSpec;

    /**
     * Full constructor
     * 
     * @param serialNumber manufacturer serial number
     * @param price store price
     * @param collings the guitar's manufacturer
     * @param model the manufacturers model
     * @param acoustic guitar type (electric/accoustic)
     * @param adirondack the wood used for the guitar body
     * @param alder the wood used for the guitar's face
     */
    public Guitar(String serialNumber, double price,
        GuitarBuilder collings, String model,
        TypeOfGuitar acoustic, TypeOfWood adirondack,
        TypeOfWood alder) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }


    public Guitar(String serialNumber2, double price2, String builder, String model, String type, String backWood,
			String topWood) {
		// TODO Auto-generated constructor stub
	}


	public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Returns store price of guitar
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the store price of the guitar
     */
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    /** 
     * @returns the spec(Builder,Model,Type,Wood-Topwood & Backwod)
     */
    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    /**
     * The guitars manufacturer serial number
     */
    private String serialNumber;

    /**
     * Rick's price for the guitar
     */
    private double price;

}