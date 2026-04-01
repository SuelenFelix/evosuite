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

public class Sun_getCenterY_11401556534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000446;

    public Sun_getCenterY_11401556534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2000446 = newInstance(Class.forName("org.openRealmOfStars.starMap.Sun"));
        Object term2000459 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term2000446, term2000446.getClass(), "name", "RwGcLXnbjj");
        setIntField(term2000459, term2000459.getClass(), "x", -1373260518);
        setIntField(term2000459, term2000459.getClass(), "y", 1581305132);
        setField(term2000446, term2000446.getClass(), "centerCoordinate", term2000459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Sun");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenterY", argTypes, term2000446, args);
    }

};


