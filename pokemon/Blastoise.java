package pokemon.pokemon;

public class Articuno extends Pokemon {
    public Articuno(Tipo tipo, int PS, int Ataque, int Defensa, int AtaqueEspecial, int DefensaEspecial, int Velocidad, int Nivel) {
        super(Tipo.AGUA, 139, 148, 100, 85, 105, 78, 54);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        Movimiento[] movimientos = new Movimiento[4];
        movimientos[0] = ListaMovimientos.MovimientoPorNombre("Foco Resplandor");
        movimientos[1] = ListaMovimientos.MovimientoPorNombre("Pistola Agua");
        movimientos[2] = ListaMovimientos.MovimientoPorNombre("Giro Rapido");
        movimientos[3] = ListaMovimientos.MovimientoPorNombre("Agua Cola");

        setMovimientos(movimientos);
    }

    @Override
    public double EfectividadObtenida(Pokemon pokemon) {
        double efectividad = 1.0;

        if (pokemon.getTipo() == Tipo.ACERO) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.AGUA) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.FUEGO) efectividad = 0.50;
        if (pokemon.getTipo() == Tipo.HIELO) efectividad = 0.50;
      
        if (pokemon.getTipo() == Tipo.ELECTRICO) efectividad = 2.0;
         if (pokemon.getTipo() == Tipo.PLANTA) efectividad = 2.0;
       
        return efectividad;     
    }
}
