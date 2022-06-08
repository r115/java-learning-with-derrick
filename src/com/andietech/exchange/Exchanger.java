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
    protected int commissionAsPercentage;

    public Exchanger() {
        commissionAsPercentage = 2;
    }

    /**
     * Convert from one currency to another.
     *
     * @return
     */
    public void convert(String originCurrency, String currency, float exchangeRate, float amount) {
        float convertedAmount = amount * exchangeRate;

        System.out.println(amount + originCurrency +" has been converted to " + convertedAmount + currency);
    }
}
