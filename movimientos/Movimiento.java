package PokemonPoli.PokemonPoli;

public class Movimiento {
    private String nombre;
    private int PuntosDeAtaque;
    private int pp;
    private Tipo tipo;
    private TipoAtaque TipoAtaque;

    Movimiento(String nombre, int PuntosDeAtaque, Tipo tipo, int pp, TipoAtaque TipoAtaque) {
        this.nombre = nombre;
        this.PuntosDeAtaque = PuntosDeAtaque;
        this.pp = pp;
        this.tipo = tipo;
        this.TipoAtaque = TipoAtaque;
        this.movimientos = movimientos;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public int getPp() {
        return pp;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public TipoAtaque getTipoAtaque() {
        return TipoAtaque;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

private Movimiento movimientos[];

public void setMovimiento(int Indice, Movimiento movimiento) {
    movimientos[Indice] = movimiento;
}

public Movimiento getMovimiento(int Indice) {
    return movimientos[Indice];
}

}
