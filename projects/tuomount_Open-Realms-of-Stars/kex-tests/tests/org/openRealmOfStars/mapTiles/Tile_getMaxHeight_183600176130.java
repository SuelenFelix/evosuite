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

public class Tile_getMaxHeight_183600176130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2218;
     Object term2222;

    public Tile_getMaxHeight_183600176130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2218 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        setField(term2218, term2218.getClass(), "img", null);
        setField(term2218, term2218.getClass(), "name", null);
        setIntField(term2218, term2218.getClass(), "tileIndex", 0);
        setIntField(term2218, term2218.getClass(), "nextAnimIndex", 0);
        setField(term2218, term2218.getClass(), "tileDescription", null);
        setIntField(term2218, term2218.getClass(), "zoomLevel", 0);
        term2222 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2222;
        callMethod(klass, "getMaxHeight", argTypes, term2218, args);
    }

};


