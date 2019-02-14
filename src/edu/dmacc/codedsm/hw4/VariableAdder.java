package edu.dmacc.codedsm.hw4;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class VariableAdder {
    private final int FEET_YARD = 3;
    private int yardBlanket = 4;

    public static void main(String[] args) {
        int totalBlankets = 2;

        VariableAdder adder = new VariableAdder();
        VariableAdder adder2 = new VariableAdder();

        int result = (adder.FEET_YARD + adder2.yardBlanket + totalBlankets);
        System.out.println(adder.FEET_YARD);
        System.out.println(adder2.yardBlanket);
        System.out.println(result);

    }
}
