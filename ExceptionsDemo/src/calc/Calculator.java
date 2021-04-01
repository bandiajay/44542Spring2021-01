/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author ajay
 */
public class Calculator {

    private int numA;
    private int numB;

    public Calculator(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int add() {
        return numA + numB;
    }

    public int sub() {
        return numA - numB;
    }

    public int mul() {
        return numA * numB;
    }

    /**
     * 
     * @return 
     */
    public int div()  {
        
        if(numB == 0){
            throw new BandiDivisbleByZeroException("Some message");
        }
        return numA / numB;

    }
}
