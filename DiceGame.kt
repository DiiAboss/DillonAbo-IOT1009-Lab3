import die.Die // Import not working... game is a bust!

// Unfortunately my import would not work no matter what i tried... but I pushed forward,
// I hope this works in the way I expect it too, I deeply apologize if it doesnt.
// Anyways, this should mimic the sample output (In the assignment) for the most part. 


fun main() {
    
    var d6 = Die(); // Default
    var d20 = Die(20); // Sides
    var percentile = Die(10, "Percentile"); // Sides, Name

    // Check the current side up
    println(d6.getSideUp()) 
    println(d20.getSideUp())
    println(percentile.getSideUp())

    // This would all be better in a function...
    println("Testing the roll functions...")
    println("Rolling the ${d6.name}...")
    d6.roll();
    println(d6.getSideUp())

    println("Rolling the ${d20.name}...")
    d20.roll();
    println(d20.getSideUp())

    println("Rolling the ${percentile.name}...")
    percentile.roll();
    println(percentile.getSideUp())



    // Yahtzee
    yahtzee: Boolean = false;

    var counter: Int = 0;

    println("Creating 5 d6 for yahtzee...")
    var yahtzeeArray = IntArray(5);
    for (i in 0..5)
    {
        d6.roll(); // roll does NOT have a return value 
        yahtzeeArray[i] = d6.getSideUp(); // get Side up acts as a getter.
    }



    println("Rolling for Yahtzee... this may take a while...")
    while (yahtzeeArray = false) {
        
        // Our counter var
        counter += 1;

        // This will roll 5 times, and insert the values into the yahtzee array
        for (i in 0..5)
        {
            d6.roll(); // roll does NOT have a return value 
            yahtzeeArray[i] = d6.getSideUp(); // get Side up acts as a getter.
        }
        
        // I test if the array is a set (all of the same value) to print the yahtzee statement
        // and break from the while loop.
        if (yahtzeeArray.toSet() == 1)
        {
            println("YAHTZEE! It took ${counter} rolls.")
            yahtzee = true; // break
        }   
    }

    //END
}