package fcu.oop.h1;

import java.lang.Math;

public class Gym {
  public static Player fight(Player p1, Player p2) {
    int p1Points, p2Points;
    p1Points = p2Points = 0;
    for (int i = 0; i < 3; i++) {
      PokemonType temp1 = p1.getPokemons()[i].getType();
      PokemonType temp2 = p2.getPokemons()[i].getType();
      switch (temp1) {
        case FIRE:
          if (temp2 == PokemonType.GRASS)
            p1Points++;
          if (temp2 == PokemonType.WATER)
            p2Points++;
          if (temp2 == PokemonType.FIRE) {
            if (p1.getPokemons()[i].getCp() > p2.getPokemons()[i].getCp())
              p1Points++;
            else if (p1.getPokemons()[i].getCp() < p2.getPokemons()[i].getCp())
              p2Points++;
            else if (p1.getPokemons()[i].getCp() == p2.getPokemons()[i].getCp()) {
              int rand = (int)(Math.random()*100)%2;
              if (rand == 0)
                p1Points++;
              else
                p2Points++;
            }
          }
          break;

        case WATER:
          if (temp2 == PokemonType.FIRE)
            p1Points++;
          if (temp2 == PokemonType.GRASS)
            p2Points++;
          if (temp2 == PokemonType.WATER) {
            if (p1.getPokemons()[i].getCp() > p2.getPokemons()[i].getCp())
              p1Points++;
            else if (p1.getPokemons()[i].getCp() < p2.getPokemons()[i].getCp())
              p2Points++;
            else if (p1.getPokemons()[i].getCp() == p2.getPokemons()[i].getCp()) {
              int rand = (int)(Math.random()*100)%2;
              if (rand == 0)
                p1Points++;
              else
                p2Points++;
            }
            break;
          }
        case GRASS:
          if (temp2 == PokemonType.WATER)
            p1Points++;
          if (temp2 == PokemonType.FIRE)
            p2Points++;
          if (temp2 == PokemonType.GRASS) {
            if (p1.getPokemons()[i].getCp() > p2.getPokemons()[i].getCp())
              p1Points++;
            else if (p1.getPokemons()[i].getCp() < p2.getPokemons()[i].getCp())
              p2Points++;
            else if (p1.getPokemons()[i].getCp() == p2.getPokemons()[i].getCp()) {
              int rand = (int)(Math.random()*100)%2;
              
              if (rand == 0)
                p1Points++;
              else
                p2Points++;
            }
            break;
          }
      }
      if (p1Points == 2) {
        System.out.printf("Winner is %s, and his/her level becomes %d.", p1.getPlayerName(), p1.getLevel() + 1);
        p1.setLevel(p1.getLevel() + 1);

        return p1;
      }
      if (p2Points == 2) {
        System.out.printf("Winner is %s, and his/her level becomes %d.", p2.getPlayerName(), p2.getLevel() + 1);
        p2.setLevel(p2.getLevel() + 1);

        return p2;
      }
    } // End For Loop

    return p1;
  }

}
