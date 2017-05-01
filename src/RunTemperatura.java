import com.senac.SimpleJava.Console;

public class RunTemperatura {
	public void run(){
		Temperatura temperatura = new Temperatura();
		temperatura.farenheit = "20C";
		Console.println(Temperatura.GetGraus(temperatura.farenheit));
		
	}

}
