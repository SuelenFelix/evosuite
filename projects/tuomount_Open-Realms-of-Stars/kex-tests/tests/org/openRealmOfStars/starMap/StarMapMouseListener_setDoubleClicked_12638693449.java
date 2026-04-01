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
import java.lang.Boolean;

public class StarMapMouseListener_setDoubleClicked_12638693449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4254050;
     Object term4254064;

    public StarMapMouseListener_setDoubleClicked_12638693449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4254050 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener"));
        setField(term4254050, term4254050.getClass(), "starMap", null);
        setField(term4254050, term4254050.getClass(), "mapPanel", null);
        setField(term4254050, term4254050.getClass(), "mapInfoPanel", null);
        setBooleanField(term4254050, term4254050.getClass(), "routePlanning", false);
        setBooleanField(term4254050, term4254050.getClass(), "regularRoute", false);
        setBooleanField(term4254050, term4254050.getClass(), "onBorder", false);
        setField(term4254050, term4254050.getClass(), "coord", null);
        setField(term4254050, term4254050.getClass(), "lastClickedPlanet", null);
        setField(term4254050, term4254050.getClass(), "lastClickedFleet", null);
        setBooleanField(term4254050, term4254050.getClass(), "doubleClicked", false);
        setBooleanField(term4254050, term4254050.getClass(), "moveClicked", false);
        setBooleanField(term4254050, term4254050.getClass(), "warningShown", false);
        setIntField(term4254050, term4254050.getClass(), "moveX", 0);
        setIntField(term4254050, term4254050.getClass(), "moveY", 0);
        setIntField(term4254050, term4254050.getClass(), "dragOrigX", 0);
        setIntField(term4254050, term4254050.getClass(), "dragOrigY", 0);
        setIntField(term4254050, term4254050.getClass(), "dragOrigMapX", 0);
        setIntField(term4254050, term4254050.getClass(), "dragOrigMapY", 0);
        setBooleanField(term4254050, term4254050.getClass(), "dragging", false);
        term4254064 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4254064;
        callMethod(klass, "setDoubleClicked", argTypes, term4254050, args);
    }

};


