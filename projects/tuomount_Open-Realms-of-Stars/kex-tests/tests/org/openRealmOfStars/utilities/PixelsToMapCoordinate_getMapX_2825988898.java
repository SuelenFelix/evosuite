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

public class PixelsToMapCoordinate_getMapX_2825988898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590;

    public PixelsToMapCoordinate_getMapX_2825988898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term590, term590.getClass(), "relativeMapX", 0);
        setIntField(term590, term590.getClass(), "relativeMapY", 0);
        setIntField(term590, term590.getClass(), "centerMapX", 0);
        setIntField(term590, term590.getClass(), "centerMapY", 0);
        setIntField(term590, term590.getClass(), "pixelX", 0);
        setIntField(term590, term590.getClass(), "pixelY", 0);
        setIntField(term590, term590.getClass(), "startX", 0);
        setIntField(term590, term590.getClass(), "startY", 0);
        setIntField(term590, term590.getClass(), "numXTiles", 0);
        setIntField(term590, term590.getClass(), "numYTiles", 0);
        setIntField(term590, term590.getClass(), "endX", 0);
        setIntField(term590, term590.getClass(), "endY", 0);
        setBooleanField(term590, term590.getClass(), "outOfPanel", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapX", argTypes, term590, args);
    }

};


