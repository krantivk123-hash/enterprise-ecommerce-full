
package com.ecommerce.security;

public class InputValidator {
  public static boolean isValid(String input){
    return input != null && input.length() < 100;
  }
}
