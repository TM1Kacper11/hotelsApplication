package pl.kacper.hotels_application.remote.rest.common;

public class PersonOrderDto {



    private String name;
    private String address;
    private Integer floor;
    private String phone;
    private String mail;

    public PersonOrderDto(String jan_kowalski, String s, String s1, int i) {
    }

    public PersonOrderDto(String name, String address, Integer floor, String phone, String mail) {
        this.name = name;
        this.address = address;
        this.floor = floor;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
