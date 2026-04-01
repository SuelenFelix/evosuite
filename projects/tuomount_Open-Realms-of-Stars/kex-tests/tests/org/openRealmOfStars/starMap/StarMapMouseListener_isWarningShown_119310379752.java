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

public class StarMapMouseListener_isWarningShown_119310379752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4254096;

    public StarMapMouseListener_isWarningShown_119310379752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4254096 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener"));
        setField(term4254096, term4254096.getClass(), "starMap", null);
        setField(term4254096, term4254096.getClass(), "mapPanel", null);
        setField(term4254096, term4254096.getClass(), "mapInfoPanel", null);
        setBooleanField(term4254096, term4254096.getClass(), "routePlanning", false);
        setBooleanField(term4254096, term4254096.getClass(), "regularRoute", false);
        setBooleanField(term4254096, term4254096.getClass(), "onBorder", false);
        setField(term4254096, term4254096.getClass(), "coord", null);
        setField(term4254096, term4254096.getClass(), "lastClickedPlanet", null);
        setField(term4254096, term4254096.getClass(), "lastClickedFleet", null);
        setBooleanField(term4254096, term4254096.getClass(), "doubleClicked", false);
        setBooleanField(term4254096, term4254096.getClass(), "moveClicked", false);
        setBooleanField(term4254096, term4254096.getClass(), "warningShown", false);
        setIntField(term4254096, term4254096.getClass(), "moveX", 0);
        setIntField(term4254096, term4254096.getClass(), "moveY", 0);
        setIntField(term4254096, term4254096.getClass(), "dragOrigX", 0);
        setIntField(term4254096, term4254096.getClass(), "dragOrigY", 0);
        setIntField(term4254096, term4254096.getClass(), "dragOrigMapX", 0);
        setIntField(term4254096, term4254096.getClass(), "dragOrigMapY", 0);
        setBooleanField(term4254096, term4254096.getClass(), "dragging", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWarningShown", argTypes, term4254096, args);
    }

};


