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
import java.util.ArrayList;

public class Sun_init_3051134051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000386;
     Object term2000389;

    public Sun_init_3051134051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2000386 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term2000386, term2000386.getClass(), "x", -690760879);
        setIntField(term2000386, term2000386.getClass(), "y", -781235785);
        ArrayList term2000390 = new ArrayList();
        term2000389 = newInstance(Class.forName("org.openRealmOfStars.utilities.namegenerators.RandomSystemNameGenerator"));
        setField(term2000389, term2000389.getClass(), "usedNames", term2000390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Sun");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[1] = Class.forName("org.openRealmOfStars.utilities.namegenerators.RandomSystemNameGenerator");
        Object[] args = new Object[2];
        args[0] = term2000386;
        args[1] = term2000389;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


