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
public class BandiDivisbleByZeroException extends RuntimeException{

    public BandiDivisbleByZeroException() {
    }

    public BandiDivisbleByZeroException(String message) {
        super(message);
    }
    
}
