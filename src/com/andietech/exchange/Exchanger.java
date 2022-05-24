package com.andietech.exchange;

/**
 * class: prototype/container/blueprint that describes how objects are created.
 *
 * Lets assume this is ABC Forex Bureau
 *
 * Exchanger: business/building
 *
 * Methods
 * ---
 * A method generally affects the attributes of a class.
 *
 * waterDispenser
 * - drinkWater()
 * - disposeMug()
 * - replaceDispenser()
 * - refillDispenser()
 *
 * exchangeRateScreen
 * - watchForChangesOnCurrencyRates()
 *
 * counter/desk
 * - exchangeMoney()
 * - haveConversationWithTeller()
 * - signStatutoryForms()
 *
 * Attributes
 * ---
 * - exchangeRate(s)
 * - waterDispenser
 * - airConditioning
 * - desks/counters (describe: ---> computer, color, glass)
 * - tellers (possible describe)
 * - doorType
 * - doorMen
 * - cctvCameras (describe: -> type)
 * - moneyTransferOptions
 * - ....
 */
public class Exchanger {
    private static int commissionAsPercentage = 2;

    public float dollarToKes() {
        int amount = 100;

        return 0.0F;
    }

    public float ugxToKes() {
        int amount = 100;

        return 0.0F;
    }
}
