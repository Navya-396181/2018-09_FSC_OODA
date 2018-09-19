package HW1.edu.fitchburgstate.csc7400;
/*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-18-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */
public enum TypeOfWood {
	
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
	 	COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
	 	
	 	public String EnumWood() {
	 	    switch(this) {
	 	      case INDIAN_ROSEWOOD:    return "Indian Rosewood";
	 	      case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
	 	      case MAHOGANY:           return "Mahogany";
	 	      case MAPLE:              return "Maple";
	 	      case COCOBOLO:           return "Cocobolo";
	 	      case CEDAR:              return "Cedar";
	 	      case ADIRONDACK:         return "Adirondack";
	 	      case ALDER:              return "Alder";
	 	      case SITKA:              return "Sitka";
	 	      default:  return "unspecified";
	 	    }
	 	  }

}
