package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StarMapUtilities_isSolarSystem_62005999933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3670579;
     Object term3670580;
     Object term3670582;
     Object term3670584;
     Object term3670586;
     Object term3670588;

    public StarMapUtilities_isSolarSystem_62005999933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3670579 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapUtilities"));
        term3670580 = new Integer(0);
        term3670582 = new Integer(0);
        term3670584 = new Integer(0);
        term3670586 = new Integer(0);
        term3670588 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term3670580;
        args[2] = term3670582;
        args[3] = term3670584;
        args[4] = term3670586;
        args[5] = term3670588;
        callMethod(klass, "isSolarSystem", argTypes, term3670579, args);
    }

};


