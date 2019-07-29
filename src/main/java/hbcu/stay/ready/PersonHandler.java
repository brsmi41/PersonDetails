package hbcu.stay.ready;


import java.sql.SQLOutput;

public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        Person currentPerson;
        while(counter < personArray.length){
        currentPerson = personArray[counter];
        String stringRepresentation = currentPerson.toString();
        result += stringRepresentation;
        System.out.println(result);
        counter++;
        }
        return result;
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int counter = 0;
        // identify terminal condition
        Person currentPerson;
        // identify increment
        for(counter=0; counter < personArray.length; counter++){
            currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
           result += stringRepresentation;
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

       Person[] personArray= getPersonArray();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for(Person currentPerson: personArray ){
            String stringRepresentation= currentPerson.toString();
            result += stringRepresentation;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
