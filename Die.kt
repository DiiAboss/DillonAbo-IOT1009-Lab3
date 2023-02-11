package die
import java.util.Random

/**
* Dillon Abotossaway
* A00060636
* IOT1009
 */

class Die(val _sides: Int = 6) {

    // Our Enums to display the types
    // private enum class DieType {
    //     DEFAULT,
    //     PERCENTILE
    // }

    var name: String = "d6";
    var sides: Int = _sides;
    
    var currentSideUp: Int = 0;

    // For rolling multiple dice (this will be used to roll dice of different values)
    private var dieArray = IntArray(6);

    // Amount of times we have rolled th dice already;
    private var rollCount = 0;

    // If we are debugging
    private var debug:Boolean = false;

    // private var dieType: DieType = DieType.DEFAULT;

    var dieName: String = "d6"; 

    init {

        if (sides == 6)
        {
            println("Creating a default d6...")
        }
        else if (sides > 2)
        {
            println("Creating a d${sides}...")
            name = "d${sides}"     
        }
        else
        {
            println("Die cannot be smaller that 2 sides!... \n Creating a default d6...")
        }

        currentSideUp = (0..sides).random();
    }

    constructor(_sides: Int, _name: String) : this(_sides)
    {
        sides = _sides;
        name = _name;
 
        if (sides < 2)
        {
            println("Cannot create a die smaller than 2 sides!...")
            sides = 6;
        }

        println("Creating a ${_name} Die of ${_sides} sides");
        currentSideUp = (0..sides).random();
    }


    fun getSideUp(): Int {
        return currentSideUp;
    }

    fun roll() {
        currentSideUp = (0..sides).random();
    }

}
