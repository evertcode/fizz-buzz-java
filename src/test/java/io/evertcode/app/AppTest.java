package io.evertcode.app;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldBeFizzTest() {
        //given
        final App app = new App();

        //when
        final String expected = app.fizzBuzz(33);

        //then
        assertThat(expected).isEqualTo("Fizz");
    }

    @Test
    public void shouldBeBuzzTest() {
        //given
        final App app = new App();

        //when
        final String expected = app.fizzBuzz(35);

        //then
        assertThat(expected).isEqualTo("Buzz");
    }

    @Test
    public void shouldBeFizzBuzzTest() {
        //given
        final App app = new App();

        //when
        final String expected = app.fizzBuzz(15);

        //then
        assertThat(expected).isEqualTo("FizzBuzz");
    }

    @Test
    public void shouldBeNumberTest() {
        //given
        final App app = new App();

        //when
        final String expected = app.fizzBuzz(41);

        //then
        assertThat(expected).isEqualTo("41");
    }
}

