package org.openRealmOfStars.utilities;

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
import static org.openRealmOfStars.utilities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DiceGenerator_loopPrf_19044881357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5897;
     Object term5905;

    public DiceGenerator_loopPrf_19044881357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5897 = (byte[]) newByteArray(7);
        setByteElement(term5897, 0, (byte) -103);
        setByteElement(term5897, 1, (byte) 98);
        setByteElement(term5897, 2, (byte) 79);
        setByteElement(term5897, 3, (byte) 61);
        setByteElement(term5897, 4, (byte) -92);
        setByteElement(term5897, 5, (byte) -42);
        setByteElement(term5897, 6, (byte) 116);
        term5905 = new Integer(98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.DiceGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5897;
        args[1] = term5905;
        callMethod(klass, "loopPrf", argTypes, null, args);
    }

};


