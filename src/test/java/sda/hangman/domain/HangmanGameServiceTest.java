package sda.hangman.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class HangmanGameServiceTest {

    private HangmanGameService hangmanGameService;

    @Before
    public void init() {
        this.hangmanGameService = new HangmanGameService();
    }

    @Test
    public void shouldReturnArrayWithCharacterIndexes() {
        //given

//when
        List<Integer> result = hangmanGameService.performCharacter('a', "Anna");
//then
        Assert.assertEquals(2, result.size());
        Assert.assertEquals((Integer) 0, result.get(0));
        Assert.assertEquals((Integer) 3, result.get(1));
    }

    @Test
    public void shouldReturnEmptyArrayWhenMissedCharacter() {
        //given

//when
        List<Integer> result = hangmanGameService.performCharacter('b', "Anna");
//then
        Assert.assertEquals(0, result.size());

    }

    @Test
    public void shouldReturnArrayWithCharacterIndexesFromPhrasesContainingWhiteSpaces() {
//given


        //when
        List<Integer> result = hangmanGameService.performCharacter('a', "Ala ma kota");

        //then
        Assert.assertEquals(4, result.size());//ze bedzie tablica 4 wynikow i ze bedzie miala odpowiednia dlugosc
        Assert.assertEquals((Integer) 0, result.get(0));// ze bedzie wynik 0 na zerowej pozycji
        Assert.assertEquals((Integer) 2, result.get(1));// ze bedzie wynik 2 na pierwszej pozycji
        Assert.assertEquals((Integer) 5, result.get(2));// ze bedzie wynik 5 na drugiej pozycji
        Assert.assertEquals((Integer) 10, result.get(3));// ze bedzie wynik 10 na trzeciej pozycji
    }
}
