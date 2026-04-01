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

public class Minimap_drawSector_20522222523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41400;
     Object term41411;
     Object term41413;

    public Minimap_drawSector_20522222523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41400 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        setIntField(term41400, term41400.getClass(), "size", 0);
        setIntField(term41400, term41400.getClass(), "sectorsToShow", 0);
        setIntField(term41400, term41400.getClass(), "sectorSize", 0);
        setField(term41400, term41400.getClass(), "images", null);
        setIntField(term41400, term41400.getClass(), "showImage", 0);
        setIntField(term41400, term41400.getClass(), "drawImage", 0);
        setField(term41400, term41400.getClass(), "map", null);
        setIntField(term41400, term41400.getClass(), "topX", 0);
        setIntField(term41400, term41400.getClass(), "topY", 0);
        setIntField(term41400, term41400.getClass(), "drawX", 0);
        setIntField(term41400, term41400.getClass(), "drawY", 0);
        setBooleanField(term41400, term41400.getClass(), "needsUpdate", false);
        term41411 = new Integer(0);
        term41413 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.awt.Color");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term41411;
        args[2] = term41413;
        args[3] = null;
        callMethod(klass, "drawSector", argTypes, term41400, args);
    }

};


