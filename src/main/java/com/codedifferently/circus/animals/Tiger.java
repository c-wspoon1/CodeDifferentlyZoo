package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Tiger extends AbstractAnimal{

    public Tiger(String name){
        super(name);
    }

    @Override
    public void doTrick() {
        AnimalTricks tricks = AnimalTricks.BACKFLIP;
        String msg = String.format("My name is %s and I am happy to %s", name, tricks.toString());
        logger.info(msg);

    }
}
