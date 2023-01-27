import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class holder implements Serializable{

	DoubleRoom luxury_doublerrom[]=new DoubleRoom[10]; //Luxury
    DoubleRoom deluxe_doublerrom[]=new DoubleRoom[20]; //Deluxe
    SingleRoom luxury_singleerrom[]=new SingleRoom[10]; //Luxury
    SingleRoom deluxe_singleerrom[]=new SingleRoom[20]; //Deluxe
}
