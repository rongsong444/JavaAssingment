package com.java8.assingment.model.report;

public class IncrementRow extends Row {
    @Override
    public Object[] getRepresentation() {
        return new Object[]{
                this.getYear(), formatMoney(this.getSalary()), this.getTimes(), this.getPercent(), formatMoney(this.getAmount())
        };
    }
}
