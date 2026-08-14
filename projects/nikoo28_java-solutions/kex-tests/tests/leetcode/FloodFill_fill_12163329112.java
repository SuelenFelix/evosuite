package leetcode;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class FloodFill_fill_12163329112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4643;
     Object term4644;
     Object term4662;
     Object term4664;
     Object term4666;
     Object term4668;

    public FloodFill_fill_12163329112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4643 = newInstance(Class.forName("leetcode.FloodFill"));
        term4644 = (Object[]) newArray("[I", 3);
        int[] term4645 = (int[]) newIntArray(6);
        int[] term4652 = (int[]) newIntArray(1);
        int[] term4654 = (int[]) newIntArray(7);
        setIntElement(term4645, 0, 1632177303);
        setIntElement(term4645, 1, -802592348);
        setIntElement(term4645, 2, -1576584269);
        setIntElement(term4645, 3, 1474899591);
        setIntElement(term4645, 4, 297582552);
        setIntElement(term4645, 5, -1485916498);
        setElement(term4644, 0, term4645);
        setIntElement(term4652, 0, 722787672);
        setElement(term4644, 1, term4652);
        setIntElement(term4654, 0, 2077491675);
        setIntElement(term4654, 1, -1728316609);
        setIntElement(term4654, 2, 47118909);
        setIntElement(term4654, 3, -2093707412);
        setIntElement(term4654, 4, -680627153);
        setIntElement(term4654, 5, 722519669);
        setIntElement(term4654, 6, -40335961);
        setElement(term4644, 2, term4654);
        term4662 = new Integer(175343605);
        term4664 = new Integer(1050853183);
        term4666 = new Integer(848428785);
        term4668 = new Integer(-1984436481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.FloodFill");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term4644;
        args[1] = term4662;
        args[2] = term4664;
        args[3] = term4666;
        args[4] = term4668;
        callMethod(klass, "fill", argTypes, term4643, args);
    }

};


