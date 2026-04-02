package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class LinearSearch_sortedLinearSearch_1601882712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2169;
     Object term2176;

    public LinearSearch_sortedLinearSearch_1601882712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2169 = (int[]) newIntArray(6);
        setIntElement(term2169, 0, -763166094);
        setIntElement(term2169, 1, -222941705);
        setIntElement(term2169, 2, 291864719);
        setIntElement(term2169, 3, -1549607466);
        setIntElement(term2169, 4, 853609788);
        setIntElement(term2169, 5, -197820800);
        term2176 = new Integer(723812297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.LinearSearch");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2169;
        args[1] = term2176;
        callMethod(klass, "sortedLinearSearch", argTypes, null, args);
    }

};


