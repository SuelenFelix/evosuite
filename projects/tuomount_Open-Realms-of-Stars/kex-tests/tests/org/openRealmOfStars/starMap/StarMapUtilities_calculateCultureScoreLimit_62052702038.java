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

public class StarMapUtilities_calculateCultureScoreLimit_62052702038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3670606;
     Object term3670607;
     Object term3670609;
     Object term3670611;
     Object term3670613;

    public StarMapUtilities_calculateCultureScoreLimit_62052702038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3670606 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapUtilities"));
        term3670607 = new Integer(0);
        term3670609 = new Integer(0);
        term3670611 = new Integer(0);
        term3670613 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term3670607;
        args[1] = term3670609;
        args[2] = term3670611;
        args[3] = term3670613;
        callMethod(klass, "calculateCultureScoreLimit", argTypes, term3670606, args);
    }

};


