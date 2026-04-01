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

public class Tile_isAscensionVein_73499046748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2306;

    public Tile_isAscensionVein_73499046748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2306 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        setField(term2306, term2306.getClass(), "img", null);
        setField(term2306, term2306.getClass(), "name", null);
        setIntField(term2306, term2306.getClass(), "tileIndex", 0);
        setIntField(term2306, term2306.getClass(), "nextAnimIndex", 0);
        setField(term2306, term2306.getClass(), "tileDescription", null);
        setIntField(term2306, term2306.getClass(), "zoomLevel", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAscensionVein", argTypes, term2306, args);
    }

};


