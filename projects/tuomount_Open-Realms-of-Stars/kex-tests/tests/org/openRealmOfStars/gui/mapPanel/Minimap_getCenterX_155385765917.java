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

public class Minimap_getCenterX_155385765917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41334;

    public Minimap_getCenterX_155385765917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41334 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        setIntField(term41334, term41334.getClass(), "size", 0);
        setIntField(term41334, term41334.getClass(), "sectorsToShow", 0);
        setIntField(term41334, term41334.getClass(), "sectorSize", 0);
        setField(term41334, term41334.getClass(), "images", null);
        setIntField(term41334, term41334.getClass(), "showImage", 0);
        setIntField(term41334, term41334.getClass(), "drawImage", 0);
        setField(term41334, term41334.getClass(), "map", null);
        setIntField(term41334, term41334.getClass(), "topX", 0);
        setIntField(term41334, term41334.getClass(), "topY", 0);
        setIntField(term41334, term41334.getClass(), "drawX", 0);
        setIntField(term41334, term41334.getClass(), "drawY", 0);
        setBooleanField(term41334, term41334.getClass(), "needsUpdate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCenterX", argTypes, term41334, args);
    }

};


