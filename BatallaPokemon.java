package PokemmonPoli;

import pokemon.pokemon.*;

public class BatallaPokemon {
public static void main(String[] args) {
      Mew mewInstancia = new Mew(Tipo.ACERO, 100, 100, 100, 100, 100, 100, 10);
      Blastoise BlastoiseInstancia = new Articuno(Tipo.AGUA, 139, 148, 100, 85, 105, 78, 10);
   
  mewInstancia.atacar(2, BlastoiseInstancia);
  BlastoiseInstancia.atacar(1, mewInstancia);

  System.out.println(Mew.class.getSimpleName() + ": PS " + mewInstancia.getPS());
  System.out.println(Articuno.class.getSimpleName() + ": PS " + articunoInstancia.getPS());
    }
}
