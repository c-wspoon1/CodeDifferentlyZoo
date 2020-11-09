package com.codedifferently.circus;

import com.codedifferently.circus.animals.AbstractAnimal;
import com.codedifferently.circus.animals.Bear;
import com.codedifferently.circus.animals.Tiger;
import com.codedifferently.circus.animals.Panther;
import org.apache.log4j.Logger;



import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class);

    private ArrayList<AbstractAnimal> animals;

    public MainCircus(){
        this.animals = new ArrayList<>();
    }

    public void startTheShow(){
        logger.info("Let's get this party started!!! Woooo");
        Bear bearReference = new Bear("Benji Thee Bear");
        animals.add(bearReference);

        Tiger tigerReference = new Tiger("Antonio The Tiger");
        animals.add(tigerReference);

        Panther referencePanther = new Panther("Darius the Panther");
        animals.add(referencePanther);
        Panther referencePanther1 = new Panther("Dematha the Panther");
        animals.add(referencePanther1);

        for(int i = 0; i < animals.size(); i++){
            AbstractAnimal tempReference = animals.get(i);
            tempReference.doTrick();
        }
    }

    public static void main(String[] args) {            //Tool main circus can use, does not belong to the object (static)
        MainCircus mainCircus = new MainCircus();       //initial house, everything comes from here
        mainCircus.startTheShow();
    }
}
