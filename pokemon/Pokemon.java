package PokemonPoli.PokemmonPoli;

public abstract class Pokemon {

    private Tipo tipo;
    private int PS;
    private int Ataque;
    private int Defensa;
    private int AtaqueEspecial;
    private int DefensaEspecial;
    private int Velocidad;
    private int Nivel;
    private Movimiento movimientos[];

    public Pokemon(Tipo tipo, int PS, int Ataque, int Defensa, int AtaqueEspecial, int DefensaEspecial, int Velocidad, int Nivel) {
        this.tipo = tipo;
        this.PS = PS;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.AtaqueEspecial = AtaqueEspecial;
        this.DefensaEspecial = DefensaEspecial;
        this.Velocidad = Velocidad;
        this.Nivel = Nivel;
    }
 public Tipo getTipo() {
        return tipo;
    }

    public int getPS() {
        return PS;
    }

    public int getAtaque() {
        return Ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public int getAtaqueEspecial() {
        return AtaqueEspecial;
    }

    public int getDefensaEspecial() {
        return DefensaEspecial;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public int getNivel() {
        return Nivel;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    protected void CalcularDanio(int danio, double efectividad) {
        double PuntosMenos = danio * efectividad;
        this.PS -= PuntosMenos;
        System.out.printf("%s recibio %.2f este daño\n", this.getClass().getSimpleName(), PuntosMenos);
    }

    public void AtaqueRecibido(Movimiento movimiento, double efectividad) {
        System.out.printf("%s recibio este Ataque %s\n", this.getClass().getSimpleName(), movimiento.getNombre());
        CalcularDanio(movimiento.getPuntosDeAtaque(), efectividad);
    }

    protected boolean AtaqueRealizado(Movimiento movimiento, Pokemon pokemon) {
        System.out.printf("%s ataco %s con %s\n", this.getClass().getSimpleName(), pokemon.getClass().getSimpleName(), movimiento.getNombre());
        double efectividad = EfectividadObtenida(pokemon);

        if (movimiento.getPp() > 0) {
            pokemon.AtaqueRecibido(movimiento, efectividad);
            return true;
        } else {
            System.err.println("Este mmovimiento no tiene puntos de PP");
            return false;
        }
    }

    public void atacar(int A, Pokemon pokemon) {
        Movimiento movimiento = getMovimientos()[m];
        boolean AtaqueRealizado = AtaqueRealizado(movimiento, pokemon);
        if (AtaqueRealizado) {
            movimiento.setPp(movimiento.getPp() - 1);
        }
    }

    public abstract double EfectividadObtenida(Pokemon pokemon);
}
