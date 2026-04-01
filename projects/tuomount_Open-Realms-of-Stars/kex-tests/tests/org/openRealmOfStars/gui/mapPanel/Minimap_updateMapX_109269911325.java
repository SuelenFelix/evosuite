package org.openRealmOfStars.gui.mapPanel;

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
import static org.openRealmOfStars.gui.mapPanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Minimap_updateMapX_109269911325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41426;
     Object term41437;

    public Minimap_updateMapX_109269911325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41426 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        setIntField(term41426, term41426.getClass(), "size", 0);
        setIntField(term41426, term41426.getClass(), "sectorsToShow", 0);
        setIntField(term41426, term41426.getClass(), "sectorSize", 0);
        setField(term41426, term41426.getClass(), "images", null);
        setIntField(term41426, term41426.getClass(), "showImage", 0);
        setIntField(term41426, term41426.getClass(), "drawImage", 0);
        setField(term41426, term41426.getClass(), "map", null);
        setIntField(term41426, term41426.getClass(), "topX", 0);
        setIntField(term41426, term41426.getClass(), "topY", 0);
        setIntField(term41426, term41426.getClass(), "drawX", 0);
        setIntField(term41426, term41426.getClass(), "drawY", 0);
        setBooleanField(term41426, term41426.getClass(), "needsUpdate", false);
        term41437 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41437;
        callMethod(klass, "updateMapX", argTypes, term41426, args);
    }

};


