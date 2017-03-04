package ru.vladislav.nn;

import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.Perceptron;
import org.neuroph.util.TransferFunctionType;

/**
 * Created by Dmitry on 04.03.2017.
 */
public class NeuralInitializator {

    public static void initNN() {
        NeuralNetwork neuralNetwork = new Perceptron(5, 5, TransferFunctionType.SIGMOID);
        DataSet trainingSet = new DataSet(5, 5);
        trainingSet.addRow(new DataSetRow(new double[] {1,0,0,0,0}, new double[] {0.5,0,0,1,0}));
        trainingSet.addRow(new DataSetRow(new double[] {0,1,0,0,0}, new double[] {0.5,0,0,0,0}));
        trainingSet.addRow(new DataSetRow(new double[] {0,0,1,0,0}, new double[] {0,0,1,0,0}));
        trainingSet.addRow(new DataSetRow(new double[] {0,0,0,1,0}, new double[] {0,0,0.5,0,1}));
        trainingSet.addRow(new DataSetRow(new double[] {0,0,0,0,1}, new double[] {0,1,0,0,0}));
        trainingSet.addRow(new DataSetRow(new double[] {1,0,1,0,0}, new double[] {0.5,0,0.5,0,0}));
        neuralNetwork.learn(trainingSet);
        neuralNetwork.save("testnn.nnet");
    }
}
