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

public class Minimap_updateMapY_109270007426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41439;
     Object term41450;

    public Minimap_updateMapY_109270007426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41439 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        setIntField(term41439, term41439.getClass(), "size", 0);
        setIntField(term41439, term41439.getClass(), "sectorsToShow", 0);
        setIntField(term41439, term41439.getClass(), "sectorSize", 0);
        setField(term41439, term41439.getClass(), "images", null);
        setIntField(term41439, term41439.getClass(), "showImage", 0);
        setIntField(term41439, term41439.getClass(), "drawImage", 0);
        setField(term41439, term41439.getClass(), "map", null);
        setIntField(term41439, term41439.getClass(), "topX", 0);
        setIntField(term41439, term41439.getClass(), "topY", 0);
        setIntField(term41439, term41439.getClass(), "drawX", 0);
        setIntField(term41439, term41439.getClass(), "drawY", 0);
        setBooleanField(term41439, term41439.getClass(), "needsUpdate", false);
        term41450 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41450;
        callMethod(klass, "updateMapY", argTypes, term41439, args);
    }

};


