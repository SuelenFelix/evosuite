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

public class Tiles_addTile_62033244432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4866;
     Object term4867;
     Object term4869;
     Object term4871;
     Object term4873;

    public Tiles_addTile_62033244432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4866 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.Tiles"));
        term4867 = new Integer(0);
        term4869 = new Integer(0);
        term4871 = new Integer(0);
        term4873 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.Tiles");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term4867;
        args[2] = term4869;
        args[3] = term4871;
        args[4] = null;
        args[5] = null;
        args[6] = term4873;
        callMethod(klass, "addTile", argTypes, term4866, args);
    }

};


