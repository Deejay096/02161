// Udarbejdet af Dejar Tarik og Jackie Vuong 

package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Projekt{

	String Navn;
	String index;
	Aktivitet aktivitet;

	public static List<Aktivitet> list = Main.getaktivitetList();

	public Projekt(String navn, String index)
	{
		this.index = index;
		this.Navn = navn;
	}
	
	public String getNavnP()
	{
		return Navn;
	}
	
	public String getIndexP()
	{
		return index;
	}
}