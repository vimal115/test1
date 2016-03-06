package com.edkul.vimal.edkul;

/**
 * Created by vimal on 6/3/16.
 */
public class ParentRecord {

    public ParentRecord() {
    }
    private int _id;
    private String _Name;
    private String _Email;
    private String _Password;
    private String _Cpassword;
    private String _Institute;
    private String _Contact;
    private String _StudentName;

    public ParentRecord(String _Name, String _Email, String _Password, String _Cpassword, String _Institute,String _Contact,String _StudentName) {
        this._Name = _Name;
        this._Email = _Email;
        this._Password = _Password;
        this._Cpassword = _Cpassword;
        this._Institute = _Institute;
        this._Contact = _Contact;
        this._StudentName = _StudentName;

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



    public String get_Contact() {
        return _Contact;
    }

    public void set_Contact(String _Contact) {
        this._Contact = _Contact;
    }

    public String get_StudentName() {
        return _StudentName;
    }

    public void set_StudentName(String _Contact) {
        this._StudentName = _StudentName;
    }

    public String get_Institute() {
        return _Institute;
    }

    public void set_Institute(String _institute) {
        this._Institute = _institute;
    }


}
