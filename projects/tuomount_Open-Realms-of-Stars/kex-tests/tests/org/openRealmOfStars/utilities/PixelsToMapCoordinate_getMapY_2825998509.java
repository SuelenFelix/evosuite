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

public class PixelsToMapCoordinate_getMapY_2825998509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604;

    public PixelsToMapCoordinate_getMapY_2825998509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term604, term604.getClass(), "relativeMapX", 0);
        setIntField(term604, term604.getClass(), "relativeMapY", 0);
        setIntField(term604, term604.getClass(), "centerMapX", 0);
        setIntField(term604, term604.getClass(), "centerMapY", 0);
        setIntField(term604, term604.getClass(), "pixelX", 0);
        setIntField(term604, term604.getClass(), "pixelY", 0);
        setIntField(term604, term604.getClass(), "startX", 0);
        setIntField(term604, term604.getClass(), "startY", 0);
        setIntField(term604, term604.getClass(), "numXTiles", 0);
        setIntField(term604, term604.getClass(), "numYTiles", 0);
        setIntField(term604, term604.getClass(), "endX", 0);
        setIntField(term604, term604.getClass(), "endY", 0);
        setBooleanField(term604, term604.getClass(), "outOfPanel", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapY", argTypes, term604, args);
    }

};


