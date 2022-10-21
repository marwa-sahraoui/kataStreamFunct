package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamzTest {
    @Test
    public void shouldReturn8ForGivenResultOfTableWhenFirstEelementis4(){
        //given
        Streamz streamz =new Streamz();
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
        //when
        int result = streamz.getResult(values);
        //then
        assertThat(result).isEqualTo(8);
    }

    public void shouldReturn20ForGivenResultOfTableWhenFirstEelementis10(){
        //given
        Streamz streamz =new Streamz();
        List<Integer> values = Arrays.asList(2,7,10,15,12,17);
        //when
        int result = streamz.getResult(values);
        //then
        assertThat(result).isEqualTo(10);
    }
}
