public class Consola implements IMostrar {
	
	@Override
	public void mostrar(Jugador jugador1, Jugador jugador2, ILogica _iLogica) {
		System.out.println(jugador1.getNombre() + " elige " + jugador1.getJugada());
		System.out.println(jugador2.getNombre() + " elige " + jugador2.getJugada());
		int res=_iLogica.comprobar(jugador1.getJugada(), jugador2.getJugada());
			
		if (res == 1)  
			System.out.println("Gana " + jugador1.getNombre()); 
		if (res == 2) 
			System.out.println("Gana " + jugador2.getNombre()); 
		if (res == 0)
			System.out.println("Empate");		
	}
}
