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

public class BoatsToSavePeople_numRescueBoats_9912080311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4318;
     Object term4319;
     Object term4328;

    public BoatsToSavePeople_numRescueBoats_9912080311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4318 = newInstance(Class.forName("leetcode.medium.BoatsToSavePeople"));
        term4319 = (int[]) newIntArray(8);
        setIntElement(term4319, 0, 498473526);
        setIntElement(term4319, 1, 1186917020);
        setIntElement(term4319, 2, 1670041824);
        setIntElement(term4319, 3, 2140388634);
        setIntElement(term4319, 4, 21095258);
        setIntElement(term4319, 5, -1793997256);
        setIntElement(term4319, 6, -1271598018);
        setIntElement(term4319, 7, 157967613);
        term4328 = new Integer(811839399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.BoatsToSavePeople");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4319;
        args[1] = term4328;
        callMethod(klass, "numRescueBoats", argTypes, term4318, args);
    }

};


