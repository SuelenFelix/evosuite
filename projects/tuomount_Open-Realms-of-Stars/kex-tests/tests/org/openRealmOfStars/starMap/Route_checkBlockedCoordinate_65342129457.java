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

public class Route_checkBlockedCoordinate_65342129457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156743;

    public Route_checkBlockedCoordinate_65342129457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156743 = newInstance(Class.forName("org.openRealmOfStars.starMap.Route"));
        setDoubleField(term1156743, term1156743.getClass(), "startX", 0.0);
        setDoubleField(term1156743, term1156743.getClass(), "startY", 0.0);
        setDoubleField(term1156743, term1156743.getClass(), "endX", 0.0);
        setDoubleField(term1156743, term1156743.getClass(), "endY", 0.0);
        setField(term1156743, term1156743.getClass(), "nextPoints", null);
        setIntField(term1156743, term1156743.getClass(), "ftlSpeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.Route");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkBlockedCoordinate", argTypes, term1156743, args);
    }

};


