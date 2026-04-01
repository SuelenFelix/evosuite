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

public class PixelsToMapCoordinate_getMapCoordinate_10065943533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518;

    public PixelsToMapCoordinate_getMapCoordinate_10065943533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term518 = newInstance(Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate"));
        setIntField(term518, term518.getClass(), "relativeMapX", -1087774327);
        setIntField(term518, term518.getClass(), "relativeMapY", -1530420153);
        setIntField(term518, term518.getClass(), "centerMapX", -469968304);
        setIntField(term518, term518.getClass(), "centerMapY", -1145578966);
        setIntField(term518, term518.getClass(), "pixelX", 679763016);
        setIntField(term518, term518.getClass(), "pixelY", 1962444399);
        setIntField(term518, term518.getClass(), "startX", 767834723);
        setIntField(term518, term518.getClass(), "startY", -602026508);
        setIntField(term518, term518.getClass(), "numXTiles", -157887805);
        setIntField(term518, term518.getClass(), "numYTiles", 1876565163);
        setIntField(term518, term518.getClass(), "endX", -817164822);
        setIntField(term518, term518.getClass(), "endY", -1016503459);
        setBooleanField(term518, term518.getClass(), "outOfPanel", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.PixelsToMapCoordinate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapCoordinate", argTypes, term518, args);
    }

};


