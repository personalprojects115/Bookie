package Bot;

/**
 * @Author = Marina De Pazzi
 * @Date = August 13, 2019.
 *
 * Graphic made considering I weight 70.0Kg (As I remember so far PASODKAPSDO)
 * |---------------------------*****-----------------------------
 * |                Amount of water to ingest                    |
 * |---------------------------*****-----------------------------|
 * |   Standard    |     Me                                      |
 * | 2h	 -  300mL  | 2h - 204                                    |
 * | 4h	 -  600mL  | 4h - 408                                    |
 * | 6h	 -  900mL  | 6h - 612                                    |
 * | 8h	 -  1200mL | 8h - 816                                    |
 * | 10h  - 1500mL | 10h - 1020                                  |
 * | 12h  - 1800mL | 12h - 1224                                  |
 * | 14h  - 2100mL | 14h - 1428                                  |
 * | 16h  - 2400mL | 16h - 1632                                  |
 * | 18h  - 2700mL | 18h - 1836                                  |
 * | 20h  - 3000mL | 20h - 2040                                  |
 * | 22h  - 3300mL | 22h - 2244                                  |
 * | 24h  - 3600mL | 24h - 2448                                  |
 * |-------------------------------------                        |
 * | L =   mL      | mL =     L          | 1000mL = 1L           |
 * |     1000.0           0.0010000      | 2400mL = 2,450L       |
 * |-------------------------------------                        |
 * |   STANDARD    |   ME                |                       |
 * | 2  - 300      | 2  - x              | 2  - 204              |
 * | 24 - x        | 24 - 2450           | 24 - X                |
 * | 2x = 7200     | 4.9 = 24x           | 2X - 4896             |
 * | x  = 3600     | x = 0.20416667      | X = 2448              |
 * | ME - 2.450 - Liters                 |                       |
 * --------------------------------------------------------------
 */

public class Water {
    /**
     * STND_AMT_WATER = Acronym for STANDARD_AMOUNT_OF_WATER. Refers to the standard amount set to calculate how much water is needed in one day;
     * myWeight = Variable used to store Marina's weight. My program bitch, my rules;
     * weight = Variable used to store someone's weight who might try the application.
     */
    private static final double STND_AMT_WATER = 0.035;
    private static double myWeight;
    private static double myTotalAmount;
    private static double myMilliliterAmount;
    private double someonesWeight;

    /**
     * Generic version of the calculus, in order for others to use it
     * This method calculates the total amount of water that a human being needs per day.
     * The calculus is done by multiplying a fellow's weight by 0.035 (35mL).
     * @param someonesWeight = refers to the user's weight. Used in the calculation process
     * @return totalLiters = refers to the total amount of water necessary per day
     */

    public double generalConversion(double someonesWeight){
        this.someonesWeight = someonesWeight;
        return STND_AMT_WATER * someonesWeight;
    }

    /**
     * Custom version of the calculus, for the @Author
     * This method calculates the total amount of water that I need per day.
     * The calculus is done by multiplying a my weight by 0.035 (35mL).
     * @return = returns my amount of water necessary per day.
     */

    public double marinasConversion(){
        myTotalAmount = STND_AMT_WATER * myWeight;
        return myTotalAmount;
    }

    /**
     * Generic version of the calculus, in order for others to use it
     * This method calculates the amount of milliliters necessary per two hours of a day.
     * The calculus is done by multiplying the total amount of water per day by 2 (hours) and dividing the result by 24 (hours). Roughly saying, it is a basic rule of three.
     * @return = Returns the amount of milliliters necessary per two hours.
     */

    public double waterAmountPerTwoHours(){
        double milliliterAmount;
        double literAmount = generalConversion(someonesWeight);
        milliliterAmount = (2 * literAmount) / 24;

        return milliliterAmount;
    }

    /**
     * Custom version of the calculus, for the @Author
     * This method calculates the amount of milliliters necessary per two hours of a day.
     * The calculus is done by multiplying the total amount of water per day by 2 (hours) and dividing the result by 24 (hours). Roughly saying, it is a basic rule of three.
     * @return = Returns my amount of milliliters necessary per two hours.
     */

    public double myAmountPerTwoHours(){
        myMilliliterAmount = (2 * myTotalAmount) / 24;
        return myMilliliterAmount;
    }
}
