package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Tile_drawMiniSector_32812919332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232;
     Object term2236;
     Object term2238;
     Object term2240;

    public Tile_drawMiniSector_32812919332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2232 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        setField(term2232, term2232.getClass(), "img", null);
        setField(term2232, term2232.getClass(), "name", null);
        setIntField(term2232, term2232.getClass(), "tileIndex", 0);
        setIntField(term2232, term2232.getClass(), "nextAnimIndex", 0);
        setField(term2232, term2232.getClass(), "tileDescription", null);
        setIntField(term2232, term2232.getClass(), "zoomLevel", 0);
        term2236 = new Integer(0);
        term2238 = new Integer(0);
        term2240 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2236;
        args[2] = term2238;
        args[3] = term2240;
        callMethod(klass, "drawMiniSector", argTypes, term2232, args);
    }

};


