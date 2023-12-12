package lysenkova;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DuplicatesRemoverTest {

    @InjectMocks
    private DuplicatesRemover remover;

    @Test
    @DisplayName("Should remove letter only in the same case")
    public void removeDuplicatesCaseSensitive() {
        //given
        String dirty = "AABBANac007";
        String expected = "ABNac07";

        //when
        String actual = remover.remove(dirty);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should remove duplicates in String with special symbols")
    public void removeDuplicatesSpecialSymbols() {
        //given
        String dirty = "AABBAN007&&";
        String expected = "ABN07&";

        //when
        String actual = remover.remove(dirty);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return the original String")
    public void removeWithoutDuplicates() {
        //given
        String dirty = "ABN07&";
        String expected = "ABN07&";

        //when
        String actual = remover.remove(dirty);

        //then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return the original String")
    public void remove() {
        //given
        String dirty = "AABBCCD112233";
        String expected = "ABCD123";

        //when
        String actual = remover.remove(dirty);

        //then
        assertEquals(expected, actual);
    }
}