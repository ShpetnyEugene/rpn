package org.rpn;

import java.util.List;

public class Run {

    private static final String fileInput1 = "input_1.txt";
    private static final String fileInput2 = "input_2.txt";
    private static final String fileOutput1 = "output_1.txt";
    private static final String fileOutput2 = "output_2.txt";




    public static void main(String[] args) {
        List<String> list = FileUtilities.inputEquations(fileInput1);

        FileUtilities.outputEquations(fileOutput1,list);
    }
}
