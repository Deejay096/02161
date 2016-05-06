package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Projekt{

	static String Navn;
	static String index;
	Aktivitet aktivitet;

	public static List<Aktivitet> list = Main.getaktivitetList();

	public Projekt(String navn, String index){
		this.index = index;
		this.Navn = navn;
	}
	public static String getNavnP(){
		return Navn;
	}
	public static String getIndexP(){
		return index;
	}
}