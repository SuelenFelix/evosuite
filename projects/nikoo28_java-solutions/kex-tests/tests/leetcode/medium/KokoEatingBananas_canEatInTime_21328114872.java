package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class KokoEatingBananas_canEatInTime_21328114872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3652;
     Object term3653;
     Object term3659;
     Object term3661;

    public KokoEatingBananas_canEatInTime_21328114872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3652 = newInstance(Class.forName("leetcode.medium.KokoEatingBananas"));
        term3653 = (int[]) newIntArray(5);
        setIntElement(term3653, 0, 892205855);
        setIntElement(term3653, 1, 1955560079);
        setIntElement(term3653, 2, -1330529019);
        setIntElement(term3653, 3, 237134844);
        setIntElement(term3653, 4, 2076413861);
        term3659 = new Integer(66817373);
        term3661 = new Integer(1459628013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.KokoEatingBananas");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3653;
        args[1] = term3659;
        args[2] = term3661;
        callMethod(klass, "canEatInTime", argTypes, term3652, args);
    }

};


