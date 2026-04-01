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

public class Minimap_setCenterPoint_76174509316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41319;
     Object term41330;
     Object term41332;

    public Minimap_setCenterPoint_76174509316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41319 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        setIntField(term41319, term41319.getClass(), "size", 0);
        setIntField(term41319, term41319.getClass(), "sectorsToShow", 0);
        setIntField(term41319, term41319.getClass(), "sectorSize", 0);
        setField(term41319, term41319.getClass(), "images", null);
        setIntField(term41319, term41319.getClass(), "showImage", 0);
        setIntField(term41319, term41319.getClass(), "drawImage", 0);
        setField(term41319, term41319.getClass(), "map", null);
        setIntField(term41319, term41319.getClass(), "topX", 0);
        setIntField(term41319, term41319.getClass(), "topY", 0);
        setIntField(term41319, term41319.getClass(), "drawX", 0);
        setIntField(term41319, term41319.getClass(), "drawY", 0);
        setBooleanField(term41319, term41319.getClass(), "needsUpdate", false);
        term41330 = new Integer(0);
        term41332 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term41330;
        args[1] = term41332;
        callMethod(klass, "setCenterPoint", argTypes, term41319, args);
    }

};


