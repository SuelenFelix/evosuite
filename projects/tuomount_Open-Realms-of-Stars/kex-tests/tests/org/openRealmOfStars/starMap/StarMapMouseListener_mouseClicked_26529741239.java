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

public class StarMapMouseListener_mouseClicked_26529741239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4253906;

    public StarMapMouseListener_mouseClicked_26529741239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4253906 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener"));
        setField(term4253906, term4253906.getClass(), "starMap", null);
        setField(term4253906, term4253906.getClass(), "mapPanel", null);
        setField(term4253906, term4253906.getClass(), "mapInfoPanel", null);
        setBooleanField(term4253906, term4253906.getClass(), "routePlanning", false);
        setBooleanField(term4253906, term4253906.getClass(), "regularRoute", false);
        setBooleanField(term4253906, term4253906.getClass(), "onBorder", false);
        setField(term4253906, term4253906.getClass(), "coord", null);
        setField(term4253906, term4253906.getClass(), "lastClickedPlanet", null);
        setField(term4253906, term4253906.getClass(), "lastClickedFleet", null);
        setBooleanField(term4253906, term4253906.getClass(), "doubleClicked", false);
        setBooleanField(term4253906, term4253906.getClass(), "moveClicked", false);
        setBooleanField(term4253906, term4253906.getClass(), "warningShown", false);
        setIntField(term4253906, term4253906.getClass(), "moveX", 0);
        setIntField(term4253906, term4253906.getClass(), "moveY", 0);
        setIntField(term4253906, term4253906.getClass(), "dragOrigX", 0);
        setIntField(term4253906, term4253906.getClass(), "dragOrigY", 0);
        setIntField(term4253906, term4253906.getClass(), "dragOrigMapX", 0);
        setIntField(term4253906, term4253906.getClass(), "dragOrigMapY", 0);
        setBooleanField(term4253906, term4253906.getClass(), "dragging", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseClicked", argTypes, term4253906, args);
    }

};


