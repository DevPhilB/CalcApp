package com.calcapp.philipp.calcapp;

import android.widget.TextView;

/**
 * Created by Philipp on 23.02.2016.
 */
public class Calculator {

    // Instance variables
    private String firstUserInput = "";
    private String lastUserInput = "";
    private double intermediateResult = 0.0d;
    private double result = 0.0d;
    private ButtonState actualButtonState = ButtonState.nothingPressed;
    private boolean acceptableUserInput = true;


    private enum ButtonState {
        nothingPressed,
        plusPressed, minusPressed,
        multiplyPressed, didivdedPressed,
        squaredPressed, cubedPressed,
        powerOfPressed
    }

    public void resetButtonState(){
        actualButtonState = ButtonState.nothingPressed;
    }

    public void handleUserNumbers(int n){
        if(n >= 0 && n <= 9) {
            if(actualButtonState == ButtonState.nothingPressed)
            {
                firstUserInput = firstUserInput.concat(String.valueOf(n));
            }
            else
            {
                lastUserInput = lastUserInput.concat(String.valueOf(n));
            }

        }
    }

    public void plus(){
        if(actualButtonState != ButtonState.nothingPressed) {
            intermediateResult = calculateResult();
            lastUserInput = "";
            actualButtonState = ButtonState.plusPressed;
        }
        else{
            actualButtonState = ButtonState.plusPressed;
        }
    }

    public void minus(){
        if(actualButtonState != ButtonState.nothingPressed) {
            intermediateResult = calculateResult();
            lastUserInput = "";
            actualButtonState = ButtonState.minusPressed;
        }
        else{
            actualButtonState = ButtonState.minusPressed;
        }
    }

    public void multiply(){
        if(actualButtonState != ButtonState.nothingPressed) {
            intermediateResult = calculateResult();
            lastUserInput = "";
            actualButtonState = ButtonState.multiplyPressed;
        }
        else{
            actualButtonState = ButtonState.multiplyPressed;
        }
    }

    public void divide(){
        if(actualButtonState != ButtonState.nothingPressed) {
            intermediateResult = calculateResult();
            lastUserInput = "";
            actualButtonState = ButtonState.didivdedPressed;
        }
        else{
            actualButtonState = ButtonState.didivdedPressed;
        }
    }

    public void squared(){
        if(actualButtonState != ButtonState.nothingPressed) {
            intermediateResult = calculateResult();
            lastUserInput = "";
            actualButtonState = ButtonState.squaredPressed;
        }
        else{
            actualButtonState = ButtonState.squaredPressed;
        }
    }

    public void cubed(){
        if(actualButtonState != ButtonState.nothingPressed) {
            intermediateResult = calculateResult();
            lastUserInput = "";
            actualButtonState = ButtonState.cubedPressed;
        }
        else{
            actualButtonState = ButtonState.cubedPressed;
        }
    }

    public void powerOf(){
        if(actualButtonState != ButtonState.nothingPressed) {
            intermediateResult = calculateResult();
            lastUserInput = "";
            actualButtonState = ButtonState.powerOfPressed;
        }
        else{
            actualButtonState = ButtonState.powerOfPressed;
        }
    }

    public double calculateResult(){
        if(actualButtonState == ButtonState.nothingPressed){
            return 0.0d;
        }
        else{
            Double firstValue = 0.0d;
            Double secondValue = 0.0d;
            if(intermediateResult != 0.0d)
            {
                firstValue = intermediateResult;
                secondValue = Double.parseDouble(lastUserInput);
            }
            else
            {
                firstValue = Double.parseDouble(firstUserInput);
                secondValue = Double.parseDouble(lastUserInput);
            }

            switch(actualButtonState){
                case plusPressed:
                    result = firstValue + secondValue;
                    break;
                case minusPressed:
                    result = firstValue - secondValue;
                    break;
                case multiplyPressed:
                    result = firstValue * secondValue;
                    break;
                case didivdedPressed:
                    result = firstValue / secondValue;
                    break;
                case squaredPressed:
                    result = firstValue * firstValue;
                    break;
                case cubedPressed:
                    result = firstValue * firstValue * firstValue;
                    break;
                case powerOfPressed:
                    Double tmpValue = firstValue;
                    for(int i = 0; i < Integer.parseInt(lastUserInput); i++){
                        tmpValue = tmpValue * firstValue;
                    }
                    result = tmpValue;
                    break;
            }
            return result;
        }

    }

}
