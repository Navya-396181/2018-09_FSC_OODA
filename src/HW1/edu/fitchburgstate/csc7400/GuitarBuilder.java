package HW1.edu.fitchburgstate.csc7400;
/*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-18-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */
public enum GuitarBuilder {
	
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	
	
	// The main purpose of toString is to generate a String representation of an object, 
	// means the return value is always a String. 
	// In most cases this simply is the object's class and package name, 
	// but on some cases like StringBuilder you will got actually a String-text.
	
	
	 /**
	   * @param A valid Builder value.
	   * @return A String representing the value for the given Builder,
	   *         or null if the Builder is not valid.
	   *         public String EnumBuilder() {
	 */
	public String toString() {
	
		switch(this) {
		 	      case FENDER:   return "Fender";
		 	      case MARTIN:   return "Martin";
		 	      case GIBSON:   return "Gibson";
		 	      case COLLINGS: return "Collings";
		 	      case OLSON:    return "Olson";
		 	      case RYAN:     return "Ryan";
		 	      case PRS :     return "PRS";
		 	      default:       return "Unspecified";
		 	    }
		 	  }
	}
