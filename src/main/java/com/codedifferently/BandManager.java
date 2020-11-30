package com.codedifferently;


public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {
        this.wuMemberArray = wuMemberArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while(counter < wuMemberArray.length)
            // begin loop
        {
            // use `counter` to identify the `current Person` in the array
            WuMember currentPerson = wuMemberArray[counter];
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result += currentPerson.toString();
            counter++;
        }
            // end loop
        return result;
    }

    public String forLoop() {
        String result = "";
        // identify initial value
        int initialValue = 0;
        // identify terminal condition
        int terminalCondition = wuMemberArray.length;
        // identify increment
        int increment = 1;
        // use the above clauses to declare for-loop signature
        for (int index = initialValue; index < terminalCondition; index += increment)
            // begin loop
        {
            // use `counter` to identify the `current Person` in the array
            WuMember currentPerson = wuMemberArray[index];
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result += currentPerson.toString();
        }
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for(WuMember currentPerson : wuMemberArray)
        // use the above discoveries to declare for-each-loop signature
        {
            // begin loop
           ;
            // get `string Representation` of `currentPerson`
            result += currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}
