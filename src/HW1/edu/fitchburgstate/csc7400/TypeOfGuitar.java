package HW1.edu.fitchburgstate.csc7400;
/*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-18-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */
public enum TypeOfGuitar {
	
		 	ACOUSTIC, ELECTRIC;
	
		 	public String EnumType() {
		 		  switch(this) {
		 	      case ACOUSTIC: return "Acoustic";
		 	      case ELECTRIC: return "Electric";
		 	      default:  return "unspecified";
		 	    }
		 	  }
		 
		 }
