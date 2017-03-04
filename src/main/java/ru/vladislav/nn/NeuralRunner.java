package ru.vladislav.nn;

import org.neuroph.core.NeuralNetwork;

/**
 * Created by Dmitry on 04.03.2017.
 */
public class NeuralRunner {

    public static double[] startNN(double[] input) {
        NeuralNetwork neuralNetwork=NeuralNetwork.load("testnn.nnet");
        neuralNetwork.setInput(input);
        neuralNetwork.calculate();

        double[] output = neuralNetwork.getOutput();
        return output;
    }
}
