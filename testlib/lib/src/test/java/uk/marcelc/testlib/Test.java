package uk.marcelc.testlib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibTest {
   @Test void someLibraryMethodReturnsTrue() {
       assertTrue(Lib.add(1, 1) == 2, "someLibraryMethod should return 'true'");
   }
}
