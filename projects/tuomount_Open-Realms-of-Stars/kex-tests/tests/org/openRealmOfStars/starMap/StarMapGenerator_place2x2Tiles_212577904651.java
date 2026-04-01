package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StarMapGenerator_place2x2Tiles_212577904651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152339;
     Object term1152342;
     Object term1152344;

    public StarMapGenerator_place2x2Tiles_212577904651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152339 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152339, term1152339.getClass(), "nameGenerator", null);
        setBooleanField(term1152339, term1152339.getClass(), "solHasAdded", false);
        setBooleanField(term1152339, term1152339.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152339, term1152339.getClass(), "solarSystem", null);
        setField(term1152339, term1152339.getClass(), "starMap", null);
        term1152342 = new Integer(0);
        term1152344 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        argTypes[3] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        argTypes[4] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        argTypes[5] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Object[] args = new Object[6];
        args[0] = term1152342;
        args[1] = term1152344;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "place2x2Tiles", argTypes, term1152339, args);
    }

};


