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

public class PixelsToMapCoordinate_getRelativeY_2723497105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;

    public PixelsToMapCoordinate_getRelativeY_2723497105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term546, term546.getClass(), "relativeMapX", 1328271830);
        setIntField(term546, term546.getClass(), "relativeMapY", 1596070772);
        setIntField(term546, term546.getClass(), "centerMapX", 97029295);
        setIntField(term546, term546.getClass(), "centerMapY", -1371869594);
        setIntField(term546, term546.getClass(), "pixelX", -2095575670);
        setIntField(term546, term546.getClass(), "pixelY", 1225272962);
        setIntField(term546, term546.getClass(), "startX", 1324040357);
        setIntField(term546, term546.getClass(), "startY", -1588772968);
        setIntField(term546, term546.getClass(), "numXTiles", -93135961);
        setIntField(term546, term546.getClass(), "numYTiles", -112921587);
        setIntField(term546, term546.getClass(), "endX", 933028652);
        setIntField(term546, term546.getClass(), "endY", 287287233);
        setBooleanField(term546, term546.getClass(), "outOfPanel", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativeY", argTypes, term546, args);
    }

};


