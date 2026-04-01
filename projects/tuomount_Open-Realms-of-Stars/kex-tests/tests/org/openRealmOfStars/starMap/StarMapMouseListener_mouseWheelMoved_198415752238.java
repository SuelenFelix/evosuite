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

public class StarMapMouseListener_mouseWheelMoved_198415752238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4253892;

    public StarMapMouseListener_mouseWheelMoved_198415752238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4253892 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener"));
        setField(term4253892, term4253892.getClass(), "starMap", null);
        setField(term4253892, term4253892.getClass(), "mapPanel", null);
        setField(term4253892, term4253892.getClass(), "mapInfoPanel", null);
        setBooleanField(term4253892, term4253892.getClass(), "routePlanning", false);
        setBooleanField(term4253892, term4253892.getClass(), "regularRoute", false);
        setBooleanField(term4253892, term4253892.getClass(), "onBorder", false);
        setField(term4253892, term4253892.getClass(), "coord", null);
        setField(term4253892, term4253892.getClass(), "lastClickedPlanet", null);
        setField(term4253892, term4253892.getClass(), "lastClickedFleet", null);
        setBooleanField(term4253892, term4253892.getClass(), "doubleClicked", false);
        setBooleanField(term4253892, term4253892.getClass(), "moveClicked", false);
        setBooleanField(term4253892, term4253892.getClass(), "warningShown", false);
        setIntField(term4253892, term4253892.getClass(), "moveX", 0);
        setIntField(term4253892, term4253892.getClass(), "moveY", 0);
        setIntField(term4253892, term4253892.getClass(), "dragOrigX", 0);
        setIntField(term4253892, term4253892.getClass(), "dragOrigY", 0);
        setIntField(term4253892, term4253892.getClass(), "dragOrigMapX", 0);
        setIntField(term4253892, term4253892.getClass(), "dragOrigMapY", 0);
        setBooleanField(term4253892, term4253892.getClass(), "dragging", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseWheelEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseWheelMoved", argTypes, term4253892, args);
    }

};


