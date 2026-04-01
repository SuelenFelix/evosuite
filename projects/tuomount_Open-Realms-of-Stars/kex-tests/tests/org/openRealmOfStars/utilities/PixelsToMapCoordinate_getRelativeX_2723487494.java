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

public class PixelsToMapCoordinate_getRelativeX_2723487494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532;

    public PixelsToMapCoordinate_getRelativeX_2723487494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term532 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term532, term532.getClass(), "relativeMapX", -1968847291);
        setIntField(term532, term532.getClass(), "relativeMapY", 579005622);
        setIntField(term532, term532.getClass(), "centerMapX", -14890619);
        setIntField(term532, term532.getClass(), "centerMapY", 1632125673);
        setIntField(term532, term532.getClass(), "pixelX", 454281060);
        setIntField(term532, term532.getClass(), "pixelY", -1786399638);
        setIntField(term532, term532.getClass(), "startX", 2055867847);
        setIntField(term532, term532.getClass(), "startY", -1048298087);
        setIntField(term532, term532.getClass(), "numXTiles", 292681826);
        setIntField(term532, term532.getClass(), "numYTiles", 458147407);
        setIntField(term532, term532.getClass(), "endX", -184153539);
        setIntField(term532, term532.getClass(), "endY", 493620644);
        setBooleanField(term532, term532.getClass(), "outOfPanel", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativeX", argTypes, term532, args);
    }

};


