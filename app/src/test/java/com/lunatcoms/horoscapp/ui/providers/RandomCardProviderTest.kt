package com.lunatcoms.horoscapp.ui.providers

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class RandomCardProviderTest{

    @Test
    fun `getRandomCard should return a random card`(){
        val randomCard = RandomCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)
    }
}