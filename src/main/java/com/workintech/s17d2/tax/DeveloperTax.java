package com.workintech.s17d2.tax;


import org.springframework.stereotype.Component;

@Component // Bu annotation ile başka bir class/componenet içinde çağırabilir hale getiriyoruz.
public class DeveloperTax implements Taxable{

    public static final double SIMPLE_TAX_RATE = 15d;
    public static final double MIDDLE_TAX_RATE = 25d;
    public static final double UPPER_TAX_RATE = 35d;


    @Override
    public Double getSimpleTaxRate() {
        return SIMPLE_TAX_RATE;
    }

    @Override
    public Double getMiddleTaxRate() {
        return MIDDLE_TAX_RATE;
    }

    @Override
    public Double getUpperTaxRate() {
        return UPPER_TAX_RATE;
    }
}
// Yukarıdaki değerleri enum olarak da oluşturabilirdik.
// Herhangi bir static değer varsa yukarıdaki gibi tanımlamak ya da
// enum olarak tanımlamak kodu daha efektif bir hale getirir.