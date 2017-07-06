package test.models;

public class CD extends Media {

    private String itsData;
    
    @Override
    public String getData() {
        return itsData;
    }
    
    public void setItsData(String theData)
    {
        itsData = theData;
    }

}
