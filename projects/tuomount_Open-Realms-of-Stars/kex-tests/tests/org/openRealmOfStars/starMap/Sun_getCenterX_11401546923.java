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

public class Sun_getCenterX_11401546923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000420;

    public Sun_getCenterX_11401546923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2000420 = newInstance(Class.forName("org.openRealmOfStars.starMap.Sun"));
        Object term2000433 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term2000420, term2000420.getClass(), "name", "DZtUjyfqmU");
        setIntField(term2000433, term2000433.getClass(), "x", -1635495094);
        setIntField(term2000433, term2000433.getClass(), "y", -782816634);
        setField(term2000420, term2000420.getClass(), "centerCoordinate", term2000433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Sun");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenterX", argTypes, term2000420, args);
    }

};


