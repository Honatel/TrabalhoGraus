
public class Temperatura {
	public String celsios;
	public String farenheit;
	
	
	public static String GetGraus(String graus){
		char tipoGraus = graus.charAt(graus.length() - 1);
		
		if (tipoGraus == 'F') {
			return CalculaCelsios(graus);
		}
		else
		if (tipoGraus == 'C') {
			return CalculaFarenheit(graus);
		};
		return "Valor invalido";
	}
	private static String CalculaCelsios(String graus) {
		
		double F =  Integer.parseInt(ClearString(graus));
		double C = 212 - F;
		double resultado = C/100;
		
		
		return "Resultado =" + resultado  + "C°";
	}
	private static String ClearString(String graus) {
		String resultado = "";
		int indice = graus.length() - 1;
		for (int i = 0; i < indice; i++) {
			
			resultado = resultado + graus.charAt(i);
		}
		return resultado;
	}
	private static String CalculaFarenheit(String graus) {
		double C = Integer.parseInt(ClearString(graus));
		double F = (C * 9)/5 +32;
		
		return "Resultado ="+ F +"F";
	}
	
	
	public String getCelsios() {
		return celsios;
	}
	public void setCelsios(String celsios) {
		this.celsios = celsios;
	}
	public String getFarenheit() {
		return farenheit;
	}                                                                                                                                                        
	public void setFarenheit(String farenheit) {
		this.farenheit = farenheit;
	}   
}
