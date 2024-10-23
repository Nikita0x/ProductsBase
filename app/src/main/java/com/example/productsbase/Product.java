package com.example.productsbase;

import android.view.View;

public class Product {
    private String position;
    private String positionName;
    private String widthValue;
    private String lengthValue;
    private String generalFoldValue;
    private String generalThicknessValue;
    private String generalWeightOfFilmValue;
    private String packageOfPackagesValue;
    private String amountOfPacksValue;
    private String packagesInPacksValue;
    private String weightOfPackValue;
    private String weightOfBagValue;
    private View.OnClickListener onClickListener;

    public Product(String position,
                   String positionName,
                   String widthValue,
                   String lengthValue,
                   String generalFoldValue,
                   String generalThicknessValue,
                   String generalWeightOfFilmValue,
                   String packageOfPackagesValue,
                   String amountOfPacksValue,
                   String packagesInPacksValue,
                   String weightOfPackValue,
                   String weightOfBagValue,
                   View.OnClickListener onClickListener) {
        this.position = position;
        this.positionName = positionName;
        this.widthValue = widthValue;
        this.lengthValue = lengthValue;
        this.generalFoldValue = generalFoldValue;
        this.generalThicknessValue = generalThicknessValue;
        this.generalWeightOfFilmValue = generalWeightOfFilmValue;
        this.packageOfPackagesValue = packageOfPackagesValue;
        this.amountOfPacksValue = amountOfPacksValue;
        this.packagesInPacksValue = packagesInPacksValue;
        this.weightOfPackValue = weightOfPackValue;
        this.weightOfBagValue = weightOfBagValue;
        this.onClickListener = onClickListener;
    }

    public Product(String position,
                   String positionName,
                   String widthValue,
                   String lengthValue,
                   String generalFoldValue,
                   String generalThicknessValue,
                   String generalWeightOfFilmValue,
                   String packageOfPackagesValue,
                   String amountOfPacksValue,
                   String packagesInPacksValue,
                   String weightOfPackValue,
                   String weightOfBagValue) {
        this.position = position;
        this.positionName = positionName;
        this.widthValue = widthValue;
        this.lengthValue = lengthValue;
        this.generalFoldValue = generalFoldValue;
        this.generalThicknessValue = generalThicknessValue;
        this.generalWeightOfFilmValue = generalWeightOfFilmValue;
        this.packageOfPackagesValue = packageOfPackagesValue;
        this.amountOfPacksValue = amountOfPacksValue;
        this.packagesInPacksValue = packagesInPacksValue;
        this.weightOfPackValue = weightOfPackValue;
        this.weightOfBagValue = weightOfBagValue;
    }



    public String getPosition() {
        return position;
    }
    public String getPositionName() {
        return positionName;
    }
    public String getWidthValue() {
        return widthValue;
    }
    public String getLengthValue() {
        return lengthValue;
    }
    public String getGeneralFoldValue() {
        return generalFoldValue;
    }
    public String getGeneralThicknessValue() {
        return generalThicknessValue;
    }
    public String getGeneralWeightOfFilmValue() {
        return generalWeightOfFilmValue;
    }
    public String getPackageOfPackagesValue() {
        return packageOfPackagesValue;
    }
    public String getAmountOfPacksValue() {
        return amountOfPacksValue;
    }
    public String getPackagesInPacksValue() {
        return packagesInPacksValue;
    }
    public String getWeightOfPackValue() {
        return weightOfPackValue;
    }
    public String getWeightOfBagValue() {
        return weightOfBagValue;
    }


    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }
}
