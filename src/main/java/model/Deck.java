package model;

import java.util.ArrayList;

/**
 * Created by Cedric on 8/04/2017.
 */
public class Deck
{
    private ArrayList<Card> cards;


    public Deck()
    {

    }

    private void createDeck()
    {
        for(int i = 0; i < Card.Suit.values().length; i++)
        {
            for(int j = 0; j < Card.Value.values().length; j++)
            {
                cards.add(new Card())
            }
        }
    }
}
