package com.java8.assingment;

import com.java8.assingment.model.SalaryInput;
import com.java8.assingment.utils.ReportGenerator;
import com.java8.assingment.utils.SalaryInputBuilder;

/**
 * Salary Income Predictor.
 */
public class SalaryPredictor {

    public SalaryPredictor() {
        System.out.println();
        System.out.println("Salary Income Predictor");
        System.out.println("=================================================");
        System.out.println();
    }

    public SalaryInput getInputFromTerminal() {
        return new SalaryInputBuilder()
                .collectStartingSalary()
                .collectIncrementInPercent()
                .collectIncrementFrequency()
                .collectDeductionsOnIncome()
                .collectDeductionsFrequency()
                .collectPredictionYears()
                .build();
    }

    public void predict(SalaryInput input) {
        new ReportGenerator(input).buildReport();
    }

    public static void main(String[] args) {
        SalaryPredictor predictor = new SalaryPredictor();
        SalaryInput input = predictor.getInputFromTerminal();

        predictor.predict(input);
    }



}
