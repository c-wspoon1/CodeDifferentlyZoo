package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Panther extends AbstractAnimal {

    public Panther(String name){
        super(name);
    }

    @Override
    public void doTrick() {
        AnimalTricks tricks = AnimalTricks.SAVEWAKANDA;
        String msg = String.format("My name is %s and it is my duty to %s", name, tricks.toString() );
        logger.info(msg);
    }
}
