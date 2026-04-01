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

public class PixelsToMapCoordinate_isOutOfPanel_72486531213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;

    public PixelsToMapCoordinate_isOutOfPanel_72486531213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term660, term660.getClass(), "relativeMapX", 0);
        setIntField(term660, term660.getClass(), "relativeMapY", 0);
        setIntField(term660, term660.getClass(), "centerMapX", 0);
        setIntField(term660, term660.getClass(), "centerMapY", 0);
        setIntField(term660, term660.getClass(), "pixelX", 0);
        setIntField(term660, term660.getClass(), "pixelY", 0);
        setIntField(term660, term660.getClass(), "startX", 0);
        setIntField(term660, term660.getClass(), "startY", 0);
        setIntField(term660, term660.getClass(), "numXTiles", 0);
        setIntField(term660, term660.getClass(), "numYTiles", 0);
        setIntField(term660, term660.getClass(), "endX", 0);
        setIntField(term660, term660.getClass(), "endY", 0);
        setBooleanField(term660, term660.getClass(), "outOfPanel", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOutOfPanel", argTypes, term660, args);
    }

};


