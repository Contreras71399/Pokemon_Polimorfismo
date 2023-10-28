package PokemonPoli.PokemonPoli;

public class Gengar extends Pokemon {
    public Gengar(Tipo tipo, int PS, int Ataque, int Defensa, int AtaqueEspecial, int DefensaEspecial, int Velocidad, int Nivel) {
        super(Tipo.FANTASMA.VENENO, 130, 125, 145, 230, 150, 180,10);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        Movimiento[] movimientos = new Movimiento[4];
        movimientos[0] = ListaMovimientos. MovimientoPorNombre("Lenguetazo");
        movimientos[1] = ListaMovimientos. MovimientoPorNombre("Bola Sombra");
        movimientos[2] = ListaMovimientos. MovimientoPorNombre("Come Sueños");
        movimientos[3] = listaMovimientos. MovimientoPorNombre("Puño Sombra");

        setMovimientos(movimientos);
    }

    @Override
    public double  EfectividadObtenida(Pokemon pokemon) {
        double efectividad = 1.0;

        if (pokemon.getTipo() == Tipo.LUCHA) efectividad = 0.00;
        if (pokemon.getTipo() == Tipo.NORMAL) efectividad = 0.00;
        
        if (pokemon.getTipo() == Tipo.BICHO) efectividad = 0.25;
        if (pokemon.getTipo() == Tipo.VENENO) efectividad = 0.25;
       
        
        if (pokemon.getTipo() == Tipo.HADA) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.PLANTA) efectividad = 0.50;
        
        if (pokemon.getTipo() == Tipo.FANTASMA) efectividad = 2.0;
        if (pokemon.getTipo() == Tipo.PSIQUICO) efectividad = 2.0;
        if (pokemon.getTipo() == Tipo.SINIESTRO) efectividad = 2.0;
        if (pokemon.getTipo() == Tipo.TIERRA) efectividad = 2.0;
       
        return efectividad;     
    }
}
