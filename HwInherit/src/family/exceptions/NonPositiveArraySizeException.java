/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family.exceptions;

/**
 *
 * @author knban_000
 */
public class NonPositiveArraySizeException extends Exception{

    public NonPositiveArraySizeException() {
    }

    public NonPositiveArraySizeException(String message) {
        super(message);
    }
    
}
