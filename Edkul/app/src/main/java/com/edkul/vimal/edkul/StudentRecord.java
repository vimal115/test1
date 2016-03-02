package com.edkul.vimal.edkul;

/**
 * Created by vimal on 28/2/16.
 */
public class StudentRecord {

    private StudentRecord(){}


    private  String _Name;
    private String _Email;
    private int _id;
    private String _Password;
    private String _institute;
    private String _Cpassword;
    private String _contactno;


    public StudentRecord(String _Name, String _Email, String _Password, String _Cpassword, String _institute,String _contactno) {
        this._Name = _Name;
        this._Email = _Email;
        this._Password = _Password;
        this._Cpassword = _Cpassword;
        this._institute = _institute;
        this._contactno=_contactno;

    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public String get_Email() {
        return _Email;
    }

    public void set_Email(String _Email) {
        this._Email = _Email;
    }

    public String get_Password() {
        return _Password;
    }

    public void set_Password(String _Password) {
        this._Password = _Password;
    }

    public String get_Cpassword() {
        return _Cpassword;
    }

    public void set_Cpassword(String _Cpassword) {
        this._Cpassword = _Cpassword;
    }

    public String get_institute() {
        return _institute;
    }

    public void set_institute(String _institute) {
        this._institute = _institute;
    }

    public String get_contactno() {
        return _contactno;
    }

    public void set_contactno(String _contactno) {
        this._contactno =_contactno;
    }
}

