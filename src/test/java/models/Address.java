package models;

public interface Address {

    public String getStreet();

    public void setStreet(String street);

    public String getSuite();

    public void setSuite(String suite);

    public String getCity();

    public void setCity(String city);

    public String getZipcode();

    public void setZipcode(String zipcode);

    String getLat();

    void setLat(String lat);

    String getLng();

    void setLng(String lng);

    public interface Geo{
       public String getLat();
       public void setLat(String lat);
       public String getLng();
       public void setLng(String lng);
   }



}
