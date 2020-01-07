package Exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AngleTest {

        @BeforeEach
        public void setUp() throws Exception
        {
        }
        @Test
        public void testA()
        {
            Angle a = new Angle (10);
            assertEquals(10,a.getDegrees(), "They are not equals");
        }
        @Test
        public void testB()
        {
                Angle a = new Angle ( -370 ) ;
                assertEquals(350, a.getDegrees());
        }
        @Test
        public void testC()
        {
                Angle a = new Angle ( 390 ) ;
                assertEquals(30, a.getDegrees());
        }
        @Test
        public void testD()
        {
                Angle a = new Angle ( 750 ) ;
                assertEquals(30, a.getDegrees());
        }

}



