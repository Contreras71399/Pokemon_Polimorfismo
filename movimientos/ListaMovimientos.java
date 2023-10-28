package PokemonPoli.PokemonPoli;

import java.util.ArrayList;

public class ListaMovimientos {
private ArrayList<Movimiento> movimientos = new ArrayList<>();
    
    public ListaMovimientos(){
        
        
        movimientos.add(new Movimiento("Foco Resplandor", 80, Tipo.ACERO, 10, TipoAtaque.ESPECIAL));
        movimientos.add(new Movimiento("Pistola Agua", 40, Tipo.AGUA, 25, TipoAtaque.ESPECIAL ));
        movimientos.add(new Movimiento("Giro Rapido", 20, Tipo.NORMAL, 40, TipoAtaque.FISICO ));
        movimientos.add(new Movimiento("Agua Cola", 90, Tipo.AGUA, 10, TipoAtaque.FISICO ));
               
        
        movimientos.add(new Movimiento("Lenguetazo",30, Tipo.FANTASMA, 30,TipoAtaque.FISICO));
        movimientos.add(new Movimiento("Bola Sombra",80, Tipo.FANTASMA, 15,TipoAtaque.ESPECIAL));
        movimientos.add(new Movimiento("Come Sueños",100, Tipo.PSIQUICO, 15,TipoAtaque.ESPECIAL));
        movimientos.add(new Movimiento("Puño Sombra",60, Tipo.FANTASMA, 20,TipoAtaque.FISICO));
        }
    
  
    public Movimiento MovimientoPorNombre(String Nombre){
        for (Movimiento movimiento : movimientos){
            if (movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
        }
        return null;
    }
} 
