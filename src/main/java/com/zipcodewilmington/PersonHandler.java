package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        // while `counter` is less than length of array
        int index = 0;
            while (index < personArray.length) {
                // begin loop
                Person currentPerson = personArray[index];
                result += currentPerson.toString();
                index++;

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            }
            // end loop
        return result;
    }

    public String forLoop() {
        String result = "";

        // identify initial value
        // identify terminal condition
        // identify increment
        for(int index = 0; index < personArray.length; index++){
            Person currentPerson = personArray[index];
            result += currentPerson.toString();
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        return result;
    }

    public String forEachLoop() {
        String result = "";

        // identify array's type = Person
        // identify array's variable-name = personArray
    for (Person currentPerson : personArray){
        currentPerson = personArray[0];
        result += currentPerson.toString();

        }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
