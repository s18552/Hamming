import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingTest {

    @Test
    public void testEmptyStrands(){
        assertEquals(Hamming.distance("",""),0);
    }

    @Test
    public void testSingleLetterIdenticalStrands(){
        assertEquals(Hamming.distance("A","A"),0);
    }

    @Test
    public void testSingleLetterDifferentStrands(){
        assertEquals(Hamming.distance("G","T"),1);
    }

    @Test
    public void testLongIdenticalStrands(){
        assertEquals(Hamming.distance("GGACTGAAATCTG","GGACTGAAATCTG"),0);
    }

    @Test
    public void testLongDifferentStrands(){
        assertEquals(Hamming.distance("GGACGGATTCTG","AGGACGGATTCT"),9);
    }

    @Test
    public void testDisallowFirstStrandLonger(){
        assertThrows(RuntimeException.class,()->Hamming.distance("AATG","AAA"));
    }

    @Test
    public void testDisallowSecondStrandLonger(){
        assertThrows(RuntimeException.class,()->Hamming.distance("ATA","AGTG"));
    }

    @Test
    public void testDisallowLeftEmptyStrand(){
        assertThrows(RuntimeException.class,()->Hamming.distance("","G"));
    }

    @Test
    public void testDisallowRightEmptyStrand(){
        assertThrows(RuntimeException.class,()->Hamming.distance("G",""));
    }

}