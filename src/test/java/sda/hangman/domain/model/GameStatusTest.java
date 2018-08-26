package sda.hangman.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import sda.hangman.domain.model.GameStatus.GameStatusHelper;

import java.util.Arrays;

@RunWith(Enclosed.class
)
public class GameStatusTest {

    public static class GameStatusHelperTest {


        @Test
        public void shouldReturnArrayOfNullsForOneWordPhrase() {
            //given
            GameStatusHelper gameStatusHelper = new GameStatusHelper();
            //when
            Character[] phraseToGuess = gameStatusHelper.preparePhraseState("Wielkopolska");
            //then
            Assertions.assertThat(phraseToGuess).allMatch((e) -> e == null);
//        for (int i=0; i<phraseToGuess.length; i++){
//            Assert.assertEquals(null,phraseToGuess[i] );
//        }//tutaj analogiczne rozwiazanie bez lambdy
        }

        @Test
        public void shouldReturnArrayOfNullsAndSpecialCharsForMultiWordPhrase() {
            //given
            GameStatusHelper gameStatusHelper = new GameStatusHelper();
            //when
            Character[] phraseToGuess = gameStatusHelper.preparePhraseState("ala ma-kota");
            //then
            Assertions.assertThat(phraseToGuess).containsOnly(null, ' ', '-');
            Assert.assertEquals((Character) ' ', phraseToGuess[3]);
            Assert.assertEquals((Character) '-', phraseToGuess[6]);

        }
    }
}