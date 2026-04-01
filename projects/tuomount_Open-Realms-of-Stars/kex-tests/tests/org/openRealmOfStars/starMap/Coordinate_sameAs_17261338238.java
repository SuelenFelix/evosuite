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

public class Coordinate_sameAs_17261338238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1157015;
     Object term1157018;

    public Coordinate_sameAs_17261338238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1157015 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1157015, term1157015.getClass(), "x", -1286664665);
        setIntField(term1157015, term1157015.getClass(), "y", -65737143);
        term1157018 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1157018, term1157018.getClass(), "x", 741220067);
        setIntField(term1157018, term1157018.getClass(), "y", 1029851327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term1157018;
        callMethod(klass, "sameAs", argTypes, term1157015, args);
    }

};


