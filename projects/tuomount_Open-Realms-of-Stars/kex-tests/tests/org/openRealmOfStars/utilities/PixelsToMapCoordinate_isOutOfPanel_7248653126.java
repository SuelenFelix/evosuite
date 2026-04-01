package org.openRealmOfStars.utilities;

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
import static org.openRealmOfStars.utilities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PixelsToMapCoordinate_isOutOfPanel_7248653126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;

    public PixelsToMapCoordinate_isOutOfPanel_7248653126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term560, term560.getClass(), "relativeMapX", 962840079);
        setIntField(term560, term560.getClass(), "relativeMapY", 1540719661);
        setIntField(term560, term560.getClass(), "centerMapX", 1265463001);
        setIntField(term560, term560.getClass(), "centerMapY", 335112684);
        setIntField(term560, term560.getClass(), "pixelX", 1551099402);
        setIntField(term560, term560.getClass(), "pixelY", -2027534003);
        setIntField(term560, term560.getClass(), "startX", 1063420942);
        setIntField(term560, term560.getClass(), "startY", 1375330971);
        setIntField(term560, term560.getClass(), "numXTiles", -478195677);
        setIntField(term560, term560.getClass(), "numYTiles", 972867650);
        setIntField(term560, term560.getClass(), "endX", 1655935355);
        setIntField(term560, term560.getClass(), "endY", -481533957);
        setBooleanField(term560, term560.getClass(), "outOfPanel", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOutOfPanel", argTypes, term560, args);
    }

};


