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

public class StarMapMouseListener_setMoveClicked_19277556251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4254080;
     Object term4254094;

    public StarMapMouseListener_setMoveClicked_19277556251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4254080 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener"));
        setField(term4254080, term4254080.getClass(), "starMap", null);
        setField(term4254080, term4254080.getClass(), "mapPanel", null);
        setField(term4254080, term4254080.getClass(), "mapInfoPanel", null);
        setBooleanField(term4254080, term4254080.getClass(), "routePlanning", false);
        setBooleanField(term4254080, term4254080.getClass(), "regularRoute", false);
        setBooleanField(term4254080, term4254080.getClass(), "onBorder", false);
        setField(term4254080, term4254080.getClass(), "coord", null);
        setField(term4254080, term4254080.getClass(), "lastClickedPlanet", null);
        setField(term4254080, term4254080.getClass(), "lastClickedFleet", null);
        setBooleanField(term4254080, term4254080.getClass(), "doubleClicked", false);
        setBooleanField(term4254080, term4254080.getClass(), "moveClicked", false);
        setBooleanField(term4254080, term4254080.getClass(), "warningShown", false);
        setIntField(term4254080, term4254080.getClass(), "moveX", 0);
        setIntField(term4254080, term4254080.getClass(), "moveY", 0);
        setIntField(term4254080, term4254080.getClass(), "dragOrigX", 0);
        setIntField(term4254080, term4254080.getClass(), "dragOrigY", 0);
        setIntField(term4254080, term4254080.getClass(), "dragOrigMapX", 0);
        setIntField(term4254080, term4254080.getClass(), "dragOrigMapY", 0);
        setBooleanField(term4254080, term4254080.getClass(), "dragging", false);
        term4254094 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4254094;
        callMethod(klass, "setMoveClicked", argTypes, term4254080, args);
    }

};


