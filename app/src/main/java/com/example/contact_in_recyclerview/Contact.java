package com.example.contact_in_recyclerview;

public class Contact {
    public int sno;
    public int pno;
    public String Name;
    public String image_path;

    Contact(int sno, int pno, String Name, String image_path) {
        this.sno = sno;
        this.pno = pno;
        this.Name = Name;
        this.image_path = image_path;
    }

}
