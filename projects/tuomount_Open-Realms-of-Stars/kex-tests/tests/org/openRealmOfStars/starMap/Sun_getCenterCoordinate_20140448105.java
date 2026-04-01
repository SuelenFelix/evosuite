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

public class Sun_getCenterCoordinate_20140448105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000472;

    public Sun_getCenterCoordinate_20140448105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2000472 = newInstance(Class.forName("org.openRealmOfStars.starMap.Sun"));
        Object term2000485 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term2000472, term2000472.getClass(), "name", "FDIunGpyxN");
        setIntField(term2000485, term2000485.getClass(), "x", -1365263840);
        setIntField(term2000485, term2000485.getClass(), "y", 96096019);
        setField(term2000472, term2000472.getClass(), "centerCoordinate", term2000485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Sun");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenterCoordinate", argTypes, term2000472, args);
    }

};


