package com.Questions.Lintcode;
/*
    3437 · Performance of Multiple Instruments
    
    Description
    Write a program to enable a musician to play an instrument. 
    Musicians can play different instruments to produce different sounds. 
    Instruments that can be played include the erhu, piano and violin.

    1) Define the instrument class Instrument, including makeSound() method, 
    in this method, the sound of the instrument: "The instrument makes a beautiful sound!"

    2) Define the subclass of musical instruments: Erhu, Piano, and Violin, 
    the sound of Erhu: "Erhu is Good to hear", the sound of Piano: 
    "Piano is pleasing to the ear", violin (Violin) sound: "Violin is Shocking"

    3) Instantiate the subclass of the musical instrument, and switch 
    between different musical instruments in a polymorphic way to call the makeSound() method.
 
 */
class Instrument {
    public void makeSound() {
        System.out.println("The instrument makes a beautiful sound!");
    }
}

class Piano extends Instrument {
    @Override
    public void makeSound() {
        System.out.println("Piano is pleasing to the ear");
    }
}
class Violin extends Instrument {
    @Override
    public void makeSound() {
        System.out.println("Violin is Shocking");
    }
}
class Erhu extends Instrument {
    @Override
    public void makeSound() {
        System.out.println("Erhu is Good to hear");
    }
}
public class performanceOfMultipleInstruments {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.makeSound();
        instrument = new Piano();
        instrument.makeSound();
        instrument = new Violin();
        instrument.makeSound();
        instrument = new Erhu();
        instrument.makeSound();
    }
}
