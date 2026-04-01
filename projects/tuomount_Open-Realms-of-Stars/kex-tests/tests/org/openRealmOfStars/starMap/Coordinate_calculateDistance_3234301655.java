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

public class Coordinate_calculateDistance_3234301655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1157000;
     Object term1157003;

    public Coordinate_calculateDistance_3234301655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1157000 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1157000, term1157000.getClass(), "x", -1604820992);
        setIntField(term1157000, term1157000.getClass(), "y", 1677207533);
        term1157003 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term1157003, term1157003.getClass(), "x", 1051999968);
        setIntField(term1157003, term1157003.getClass(), "y", -918269639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = term1157003;
        callMethod(klass, "calculateDistance", argTypes, term1157000, args);
    }

};


