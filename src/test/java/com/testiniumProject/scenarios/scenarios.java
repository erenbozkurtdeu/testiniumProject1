package com.testiniumProject.scenarios;

import com.testiniumProject.step.BaseSteps;
import org.junit.Test;

import static com.testiniumProject.constants.ConstantsCart.*;
import static com.testiniumProject.constants.ConstantsHomePage.*;
import static com.testiniumProject.constants.ConstantsProductList.*;
import static com.testiniumProject.constants.ConstantsProductPage.*;

public class scenarios extends BaseSteps {

    @Test
    public void addProductToBasket() throws Exception {
        checkUrl("https://www.beymen.com/");
        click(cookie);
        chooseRandomElement(genderButtons);
        sendKeys(searchBar, readExcelSheet(0,0));
        waitBySeconds(2);
        delete(searchBar);
        waitBySeconds(2);
        sendKeys(searchBar, readExcelSheet(0,1));
        waitBySeconds(2);
        enterKeyCheckbox(searchBar);
        chooseRandomElement(productList);
        getProductPagePrice(productPriceAtProductPage);
        writePriceToTxtFile(productNameAtProductPage, productPriceAtProductPage);
        clickIfExist(productSizeNotDisabled);
        click(addBasket);
        click(basketButton);
        getProductBasketPrice(productBasketPrice);
        priceEqualControl();
        click(productQuantity);
        clickIfExist(quantityOptionTwo);
        click(removeItem);
        waitBySeconds(5);
    }
}