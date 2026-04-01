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

public class Tile_draw_82874459931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224;
     Object term2228;
     Object term2230;

    public Tile_draw_82874459931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2224 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tile"));
        setField(term2224, term2224.getClass(), "img", null);
        setField(term2224, term2224.getClass(), "name", null);
        setIntField(term2224, term2224.getClass(), "tileIndex", 0);
        setIntField(term2224, term2224.getClass(), "nextAnimIndex", 0);
        setField(term2224, term2224.getClass(), "tileDescription", null);
        setIntField(term2224, term2224.getClass(), "zoomLevel", 0);
        term2228 = new Integer(0);
        term2230 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2228;
        args[2] = term2230;
        callMethod(klass, "draw", argTypes, term2224, args);
    }

};


