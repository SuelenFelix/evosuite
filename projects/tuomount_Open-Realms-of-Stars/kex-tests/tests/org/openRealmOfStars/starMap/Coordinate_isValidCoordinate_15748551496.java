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

public class Coordinate_isValidCoordinate_15748551496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1157006;
     Object term1157009;

    public Coordinate_isValidCoordinate_15748551496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1157006 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1157006, term1157006.getClass(), "x", -1324311143);
        setIntField(term1157006, term1157006.getClass(), "y", 466139612);
        term1157009 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1157009, term1157009.getClass(), "x", -1255581102);
        setIntField(term1157009, term1157009.getClass(), "y", 764685495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term1157009;
        callMethod(klass, "isValidCoordinate", argTypes, term1157006, args);
    }

};


