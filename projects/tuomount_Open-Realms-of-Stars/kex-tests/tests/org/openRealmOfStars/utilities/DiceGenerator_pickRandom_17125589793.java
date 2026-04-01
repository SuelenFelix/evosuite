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
import java.lang.Object;

public class DiceGenerator_pickRandom_17125589793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5867;

    public DiceGenerator_pickRandom_17125589793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5867 = (Object[]) newArray("java.lang.Object", 6);
        Object term5868 = newInstance(Class.forName("java.lang.Object"));
        Object term5869 = newInstance(Class.forName("java.lang.Object"));
        Object term5870 = newInstance(Class.forName("java.lang.Object"));
        Object term5871 = newInstance(Class.forName("java.lang.Object"));
        Object term5872 = newInstance(Class.forName("java.lang.Object"));
        Object term5873 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5867, 0, term5868);
        setElement(term5867, 1, term5869);
        setElement(term5867, 2, term5870);
        setElement(term5867, 3, term5871);
        setElement(term5867, 4, term5872);
        setElement(term5867, 5, term5873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.DiceGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5867;
        callMethod(klass, "pickRandom", argTypes, null, args);
    }

};


