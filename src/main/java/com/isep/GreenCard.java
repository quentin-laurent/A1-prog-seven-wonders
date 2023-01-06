package com.isep;

/**
 * A class representing a green card.
 */
public class GreenCard extends Card
{
    enum ScienceSymbol
    {
        COMPASS,
        GEAR,
        TABLET
    }
    // Attributes
    private ScienceSymbol scienceSymbol;

    // Constructor
    public GreenCard(ScienceSymbol scienceSymbol)
    {
        super(Color.GREEN);
        this.scienceSymbol = scienceSymbol;
    }
}
