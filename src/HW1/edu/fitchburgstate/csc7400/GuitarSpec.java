package HW1.edu.fitchburgstate.csc7400;
/*
 *Course Name : Object Oriented Design and Analysis
 *Professor Name : Orlando Montalvo
 *Date : 09-18-2018
 *Assignment - HW1
 *Students : Navya Avvaru (0396181) VamsiPriya Boppana (0398168) 
 */
public class GuitarSpec {

    private GuitarBuilder guitarBuilder;
    private String guitarModel;
    private TypeOfGuitar guitarType;
    private TypeOfWood guitarBackWood;
    private TypeOfWood guitarTopWood;
    /**
     * @param guitarBuilder
     * @param guitarModel
     * @param guitarType
     * @param guitarBackWood
     * @param guitarTopWood
     */


    public GuitarSpec(GuitarBuilder guitarBuilder, String guitarModel, TypeOfGuitar guitarType, TypeOfWood guitarBackWood, TypeOfWood guitarTopWood) {
        this.guitarBuilder = guitarBuilder;
        this.guitarModel = guitarModel;
        this.guitarType = guitarType;
        this.guitarBackWood = guitarBackWood;
        this.guitarTopWood = guitarTopWood;
    }

    public GuitarSpec() {}

    /**
     * @return the guitarBuilder
     */
    public GuitarBuilder getGuitarBuilder() {
        return guitarBuilder;
    }

    /**
     * set guitarBuilder
     */
    public void setGuitarBuilder(GuitarBuilder guitarBuilder) {
        this.guitarBuilder = guitarBuilder;
    }

    /**
     * @return the guitarModel
     */
    public String getGuitarModel() {
        return guitarModel;
    }

    /**
     * set guitarModel
     */
    public void setGuitarModel(String guitarModel) {
        this.guitarModel = guitarModel;
    }

    /**
     * @return the guitarType
     */
    public TypeOfGuitar getGuitarType() {
        return guitarType;
    }

    /**
     * set guitarType
     */
    public void setGuitarType(TypeOfGuitar guitarType) {
        this.guitarType = guitarType;
    }

    /**
     * @return the guitarBackWood
     */
    public TypeOfWood getGuitarBackWood() {
        return guitarBackWood;
    }

    /**
     * set guitarBackWood
     */
    public void setGuitarBackWood(TypeOfWood guitarBackWood) {
        this.guitarBackWood = guitarBackWood;
    }

    /**
     * @return the guitarTopWood
     */
    public TypeOfWood getGuitarTopWood() {
        return guitarTopWood;
    }

    /**
     * set guitarTopWood
     */
    public void setGuitarTopWood(TypeOfWood guitarTopWood) {
        this.guitarTopWood = guitarTopWood;
    }

    public boolean matchedGuitar(GuitarSpec guitarSpec) {
        if (this.guitarBuilder != guitarSpec.guitarBuilder)
            return false;
        if ((this.guitarModel != null) && (!this.guitarModel.equals("")) &&
            (!this.guitarModel.toLowerCase().equals(guitarSpec.guitarModel.toLowerCase())))
            return false;
        if ((this.guitarType != null) && (this.guitarType != this.getGuitarType()))
                return false;
        if ((this.guitarTopWood != null) && (this.guitarTopWood != this.getGuitarTopWood()))
                return false;
        if ((this.guitarBackWood != null) && (this.guitarBackWood != this.getGuitarBackWood()))
                return false;
        return true;

    }

}