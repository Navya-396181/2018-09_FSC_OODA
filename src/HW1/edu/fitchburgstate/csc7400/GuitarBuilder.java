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
