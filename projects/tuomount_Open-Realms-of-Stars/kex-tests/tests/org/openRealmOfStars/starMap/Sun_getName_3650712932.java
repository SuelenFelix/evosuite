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
import java.lang.Object;

public class Sun_getName_3650712932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000394;

    public Sun_getName_3650712932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2000394 = newInstance(Class.forName("org.openRealmOfStars.starMap.Sun"));
        Object term2000407 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term2000394, term2000394.getClass(), "name", "NPOFoHfXFp");
        setIntField(term2000407, term2000407.getClass(), "x", -369346099);
        setIntField(term2000407, term2000407.getClass(), "y", 443508914);
        setField(term2000394, term2000394.getClass(), "centerCoordinate", term2000407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Sun");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2000394, args);
    }

};


