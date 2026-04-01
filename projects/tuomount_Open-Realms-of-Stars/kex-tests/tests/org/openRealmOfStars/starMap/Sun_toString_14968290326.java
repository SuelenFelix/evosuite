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

public class Sun_toString_14968290326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2000498;

    public Sun_toString_14968290326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2000498 = newInstance(Class.forName("org.openRealmOfStars.starMap.Sun"));
        Object term2000511 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setField(term2000498, term2000498.getClass(), "name", "TVSpTanaLB");
        setIntField(term2000511, term2000511.getClass(), "x", 395569485);
        setIntField(term2000511, term2000511.getClass(), "y", 2099397950);
        setField(term2000498, term2000498.getClass(), "centerCoordinate", term2000511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Sun");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2000498, args);
    }

};


