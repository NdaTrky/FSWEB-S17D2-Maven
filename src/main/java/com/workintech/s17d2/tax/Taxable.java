package com.workintech.s17d2.tax;

public interface Taxable { //Eğer interface olarak oluşturmasaydık (class yazsaydı) body isterdi.
    Double getSimpleTaxRate();
    Double getMiddleTaxRate();
    Double getUpperTaxRate();
}
