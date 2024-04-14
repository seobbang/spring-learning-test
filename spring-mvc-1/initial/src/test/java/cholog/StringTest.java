package cholog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() { // String 클래스의 replace 메서드를 익히기 위한 테스트
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void  split() {
        String[] splitArray = "1,2".split(",");
        assertThat(splitArray).contains("1","2");
    }

    @Test
    void splitExactly() {
        String[] splitArray = "1".split(",");
        assertThat(splitArray).containsExactly("1");
    }

    @Test
    void substring() {
        String string = "(1,2)".substring(1,4);
        assertThat(string).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 메서드 실행시 문자열 인덱스값을 벗어날 경우 예외 발생 테스트")
    void charAt() {
        assertThatThrownBy(() -> "abc".charAt(3))
            .isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range: 3");
    }
}

