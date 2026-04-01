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

public class StarMapMouseListener_setLastClickedPlanet_77907843041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4253934;

    public StarMapMouseListener_setLastClickedPlanet_77907843041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4253934 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener"));
        setField(term4253934, term4253934.getClass(), "starMap", null);
        setField(term4253934, term4253934.getClass(), "mapPanel", null);
        setField(term4253934, term4253934.getClass(), "mapInfoPanel", null);
        setBooleanField(term4253934, term4253934.getClass(), "routePlanning", false);
        setBooleanField(term4253934, term4253934.getClass(), "regularRoute", false);
        setBooleanField(term4253934, term4253934.getClass(), "onBorder", false);
        setField(term4253934, term4253934.getClass(), "coord", null);
        setField(term4253934, term4253934.getClass(), "lastClickedPlanet", null);
        setField(term4253934, term4253934.getClass(), "lastClickedFleet", null);
        setBooleanField(term4253934, term4253934.getClass(), "doubleClicked", false);
        setBooleanField(term4253934, term4253934.getClass(), "moveClicked", false);
        setBooleanField(term4253934, term4253934.getClass(), "warningShown", false);
        setIntField(term4253934, term4253934.getClass(), "moveX", 0);
        setIntField(term4253934, term4253934.getClass(), "moveY", 0);
        setIntField(term4253934, term4253934.getClass(), "dragOrigX", 0);
        setIntField(term4253934, term4253934.getClass(), "dragOrigY", 0);
        setIntField(term4253934, term4253934.getClass(), "dragOrigMapX", 0);
        setIntField(term4253934, term4253934.getClass(), "dragOrigMapY", 0);
        setBooleanField(term4253934, term4253934.getClass(), "dragging", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastClickedPlanet", argTypes, term4253934, args);
    }

};


