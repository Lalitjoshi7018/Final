/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirementbenifitsagevalidator;

/**
 * A utility class to verify that person  
 * meet certain criteria with respect
 * to their age for applying Retirement benifits
 * @author Sivagama Srinivasan
 */
 

public class RetirementBenifitsAgeValidator {

    /**
     * A method that validates that person is eligible for applying for retirement benifits or not
     * @param personAge, the person's age
     * @return true if the person is 65 or more years old, false otherwise. 
     */
    public boolean validateAge(int personAge)
    {
        if(personAge>=65)
        {
            return true;
        }
        return false;
    }
    
}
