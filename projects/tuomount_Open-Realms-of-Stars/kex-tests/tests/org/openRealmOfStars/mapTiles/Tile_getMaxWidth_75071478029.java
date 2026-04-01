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

public class Tile_getMaxWidth_75071478029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2212;
     Object term2216;

    public Tile_getMaxWidth_75071478029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2212 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        setField(term2212, term2212.getClass(), "img", null);
        setField(term2212, term2212.getClass(), "name", null);
        setIntField(term2212, term2212.getClass(), "tileIndex", 0);
        setIntField(term2212, term2212.getClass(), "nextAnimIndex", 0);
        setField(term2212, term2212.getClass(), "tileDescription", null);
        setIntField(term2212, term2212.getClass(), "zoomLevel", 0);
        term2216 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2216;
        callMethod(klass, "getMaxWidth", argTypes, term2212, args);
    }

};


