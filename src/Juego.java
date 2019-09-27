public class Juego {
	private Jugador jugador1;
	private Jugador jugador2;	
	private ILogica _iLogica;
	private IMostrar _iMostrar;
		
	private String[] jugadas;

	
	public String[] getJugadas() {
		return jugadas;
	}
	public void setJugadas(String[] jugadas) {
		this.jugadas = jugadas;
	}
	public Jugador getJugador1() {
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	public Juego(Jugador jugador1, Jugador jugador2, ILogica ilogica, IMostrar iMostrar) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		_iLogica=ilogica;
		jugadas=_iLogica.validas();
		_iMostrar = iMostrar;
	}
	
	public Juego(Jugador jugador1, Jugador jugador2, Consola consola) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		consola.mostrar(jugador1, jugador2, _iLogica);
	}
	
	public void jugar() {
		jugador1.pedirJugada(jugadas);
		jugador2.pedirJugada(jugadas);
		_iMostrar.mostrar(jugador1, jugador2, _iLogica);
	}
}
