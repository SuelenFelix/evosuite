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

public class PixelsToMapCoordinate_getMapY_2825998502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504;

    public PixelsToMapCoordinate_getMapY_2825998502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term504 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term504, term504.getClass(), "relativeMapX", -117576464);
        setIntField(term504, term504.getClass(), "relativeMapY", -1007160944);
        setIntField(term504, term504.getClass(), "centerMapX", 1135664017);
        setIntField(term504, term504.getClass(), "centerMapY", 590364439);
        setIntField(term504, term504.getClass(), "pixelX", 865208305);
        setIntField(term504, term504.getClass(), "pixelY", -1275173084);
        setIntField(term504, term504.getClass(), "startX", -244121226);
        setIntField(term504, term504.getClass(), "startY", -203030934);
        setIntField(term504, term504.getClass(), "numXTiles", -1179120542);
        setIntField(term504, term504.getClass(), "numYTiles", -73683645);
        setIntField(term504, term504.getClass(), "endX", -226514366);
        setIntField(term504, term504.getClass(), "endY", 1193880199);
        setBooleanField(term504, term504.getClass(), "outOfPanel", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapY", argTypes, term504, args);
    }

};


