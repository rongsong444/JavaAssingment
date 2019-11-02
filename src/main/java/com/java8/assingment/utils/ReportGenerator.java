package com.java8.assingment.utils;

import java.util.List;

import com.java8.assingment.model.SalaryInput;
import com.java8.assingment.model.report.DeductionRow;
import com.java8.assingment.model.report.IncrementRow;
import com.java8.assingment.model.report.PredictionRow;
import com.java8.assingment.report.DeductionReport;
import com.java8.assingment.report.IncrementReport;
import com.java8.assingment.report.PredictionReport;

public class ReportGenerator {
    private SalaryInput input;

    public ReportGenerator(SalaryInput input) {
        this.input = input;
    }

    public void buildReport() {
        IncrementReport report = new IncrementReport();
        List<IncrementRow> incrementData = report.calculateData(input);
        report.print(incrementData);

        DeductionReport deductionReport = new DeductionReport();
        List<DeductionRow> deductionData = deductionReport.calculateData(input);
        deductionReport.print(deductionData);


        PredictionReport predictionReport = new PredictionReport();
        List<PredictionRow> predictionData = predictionReport.calculateData(incrementData, deductionData);
        predictionReport.print(predictionData);
    }


}
