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

public class Coordinate_getPosition_16879850322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156988;
     Object term1156991;

    public Coordinate_getPosition_16879850322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156988 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156988, term1156988.getClass(), "x", -515470463);
        setIntField(term1156988, term1156988.getClass(), "y", 198181760);
        term1156991 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1156991, term1156991.getClass(), "x", -1425509668);
        setIntField(term1156991, term1156991.getClass(), "y", -466546609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term1156991;
        callMethod(klass, "getPosition", argTypes, term1156988, args);
    }

};


