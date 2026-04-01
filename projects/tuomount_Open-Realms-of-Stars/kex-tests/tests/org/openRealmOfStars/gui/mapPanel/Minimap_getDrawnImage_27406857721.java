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

public class Minimap_getDrawnImage_27406857721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41378;

    public Minimap_getDrawnImage_27406857721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41378 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap"));
        setIntField(term41378, term41378.getClass(), "size", 0);
        setIntField(term41378, term41378.getClass(), "sectorsToShow", 0);
        setIntField(term41378, term41378.getClass(), "sectorSize", 0);
        setField(term41378, term41378.getClass(), "images", null);
        setIntField(term41378, term41378.getClass(), "showImage", 0);
        setIntField(term41378, term41378.getClass(), "drawImage", 0);
        setField(term41378, term41378.getClass(), "map", null);
        setIntField(term41378, term41378.getClass(), "topX", 0);
        setIntField(term41378, term41378.getClass(), "topY", 0);
        setIntField(term41378, term41378.getClass(), "drawX", 0);
        setIntField(term41378, term41378.getClass(), "drawY", 0);
        setBooleanField(term41378, term41378.getClass(), "needsUpdate", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.Minimap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDrawnImage", argTypes, term41378, args);
    }

};


