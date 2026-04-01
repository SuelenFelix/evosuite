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

public class Tile_isSunTile_9640624644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2290;

    public Tile_isSunTile_9640624644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2290 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        setField(term2290, term2290.getClass(), "img", null);
        setField(term2290, term2290.getClass(), "name", null);
        setIntField(term2290, term2290.getClass(), "tileIndex", 0);
        setIntField(term2290, term2290.getClass(), "nextAnimIndex", 0);
        setField(term2290, term2290.getClass(), "tileDescription", null);
        setIntField(term2290, term2290.getClass(), "zoomLevel", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSunTile", argTypes, term2290, args);
    }

};


