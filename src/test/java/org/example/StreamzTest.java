package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamzTest {
    @Test
    public void shouldReturn8ForGivenResultOfListWhenFirstEelements4(){
        //given
        Streamz streamz =new Streamz();
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
        //when
        int result = streamz.getResult(values);
        //then
        assertThat(result).isEqualTo(8);
    }


    @Test
    public void shouldReturn20ForGivenResultOfListWhenFirstEelements10(){
        //given
        Streamz streamz =new Streamz();
        List<Integer> values = Arrays.asList(2,7,10,15,12,17);
        //when
        int result = streamz.getResult(values);
        //then
        assertThat(result).isEqualTo(20);
    }
    @Test
    public void shouldReturn0ForGivenResultOfListAllElementIs2(){
        //given
        Streamz streamz =new Streamz();
        List<Integer> values = Arrays.asList(2,2,2,2,2);
        //when
        int result = streamz.getResult(values);
        //then
        assertThat(result).isEqualTo(0);
    }
    @Test
    public void shouldReturn20ForElementWith10(){
        //given
        Streamz streamz =new Streamz();
        List<Integer> values = Arrays.asList(10,10,10,10,10);
        //when
        int result = streamz.getResult(values);
        //then
        assertThat(result).isEqualTo(20);
    }
}
