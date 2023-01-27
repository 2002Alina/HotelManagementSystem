import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class SingleRoom implements Serializable{
	
	   String name;
	    String contact;
	    String gender;   
	    ArrayList<Food> food =new ArrayList<>();

	   
	    SingleRoom()
	    {
	        this.name="";
	    }
	    SingleRoom(String name,String contact,String gender)
	    {
	        this.name=name;
	        this.contact=contact;
	        this.gender=gender;
	    }
	}

