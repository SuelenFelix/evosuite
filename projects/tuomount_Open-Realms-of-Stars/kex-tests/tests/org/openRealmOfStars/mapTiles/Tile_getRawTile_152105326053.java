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

public class Tile_getRawTile_152105326053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2326;

    public Tile_getRawTile_152105326053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2326 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        setField(term2326, term2326.getClass(), "img", null);
        setField(term2326, term2326.getClass(), "name", null);
        setIntField(term2326, term2326.getClass(), "tileIndex", 0);
        setIntField(term2326, term2326.getClass(), "nextAnimIndex", 0);
        setField(term2326, term2326.getClass(), "tileDescription", null);
        setIntField(term2326, term2326.getClass(), "zoomLevel", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawTile", argTypes, term2326, args);
    }

};


