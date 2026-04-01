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

public class StarMapMouseListener_setWarningShown_92296378353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4254110;
     Object term4254124;

    public StarMapMouseListener_setWarningShown_92296378353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4254110 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener"));
        setField(term4254110, term4254110.getClass(), "starMap", null);
        setField(term4254110, term4254110.getClass(), "mapPanel", null);
        setField(term4254110, term4254110.getClass(), "mapInfoPanel", null);
        setBooleanField(term4254110, term4254110.getClass(), "routePlanning", false);
        setBooleanField(term4254110, term4254110.getClass(), "regularRoute", false);
        setBooleanField(term4254110, term4254110.getClass(), "onBorder", false);
        setField(term4254110, term4254110.getClass(), "coord", null);
        setField(term4254110, term4254110.getClass(), "lastClickedPlanet", null);
        setField(term4254110, term4254110.getClass(), "lastClickedFleet", null);
        setBooleanField(term4254110, term4254110.getClass(), "doubleClicked", false);
        setBooleanField(term4254110, term4254110.getClass(), "moveClicked", false);
        setBooleanField(term4254110, term4254110.getClass(), "warningShown", false);
        setIntField(term4254110, term4254110.getClass(), "moveX", 0);
        setIntField(term4254110, term4254110.getClass(), "moveY", 0);
        setIntField(term4254110, term4254110.getClass(), "dragOrigX", 0);
        setIntField(term4254110, term4254110.getClass(), "dragOrigY", 0);
        setIntField(term4254110, term4254110.getClass(), "dragOrigMapX", 0);
        setIntField(term4254110, term4254110.getClass(), "dragOrigMapY", 0);
        setBooleanField(term4254110, term4254110.getClass(), "dragging", false);
        term4254124 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4254124;
        callMethod(klass, "setWarningShown", argTypes, term4254110, args);
    }

};


