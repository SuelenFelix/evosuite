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

public class PixelsToMapCoordinate_getMapX_2825988891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490;

    public PixelsToMapCoordinate_getMapX_2825988891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term490, term490.getClass(), "relativeMapX", -522618178);
        setIntField(term490, term490.getClass(), "relativeMapY", 1134449235);
        setIntField(term490, term490.getClass(), "centerMapX", -883034806);
        setIntField(term490, term490.getClass(), "centerMapY", 1585847225);
        setIntField(term490, term490.getClass(), "pixelX", 597278769);
        setIntField(term490, term490.getClass(), "pixelY", -1685132342);
        setIntField(term490, term490.getClass(), "startX", -1456670397);
        setIntField(term490, term490.getClass(), "startY", 1622346318);
        setIntField(term490, term490.getClass(), "numXTiles", 1048535127);
        setIntField(term490, term490.getClass(), "numYTiles", -655067527);
        setIntField(term490, term490.getClass(), "endX", -6029667);
        setIntField(term490, term490.getClass(), "endY", -2068769794);
        setBooleanField(term490, term490.getClass(), "outOfPanel", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapX", argTypes, term490, args);
    }

};


