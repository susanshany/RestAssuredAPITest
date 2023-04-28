package models;

public class Users implements Address,Company {

    private String id;
    private String name;
    private String username;
    private String email;

    private String phone;
    private String website;
    //private Company company;
    private String cmpName;
    private String catchPhrase;
    private String bs;

    //private Address address;
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    //Geo
    private String lat;
    private String lng;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }




    @Override
    public void setCmpName(String cmpName) {

    }

    @Override
    public String getCmpName() {
        return cmpName;
    }

    @Override
    public String getCatchPhrase() {
        return catchPhrase;
    }

    @Override
    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    @Override
    public String getBs() {
        return bs;
    }

    @Override
    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getSuite() {
        return suite;
    }

    @Override
    public void setSuite(String suite) {
        this.suite = suite;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getZipcode() {
        return zipcode;
    }

    @Override
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String getLat() {
        return lat;
    }

    @Override
    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String getLng() {
        return lng;
    }

    @Override
    public void setLng(String lng) {
        this.lng = lng;
    }

}
