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

public class StarMapMouseListener_handleFixTradeButton_19641725357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4221870;

    public StarMapMouseListener_handleFixTradeButton_19641725357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4221870 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener"));
        setField(term4221870, term4221870.getClass(), "starMap", null);
        setField(term4221870, term4221870.getClass(), "mapPanel", null);
        setField(term4221870, term4221870.getClass(), "mapInfoPanel", null);
        setBooleanField(term4221870, term4221870.getClass(), "routePlanning", false);
        setBooleanField(term4221870, term4221870.getClass(), "regularRoute", false);
        setBooleanField(term4221870, term4221870.getClass(), "onBorder", false);
        setField(term4221870, term4221870.getClass(), "coord", null);
        setField(term4221870, term4221870.getClass(), "lastClickedPlanet", null);
        setField(term4221870, term4221870.getClass(), "lastClickedFleet", null);
        setBooleanField(term4221870, term4221870.getClass(), "doubleClicked", false);
        setBooleanField(term4221870, term4221870.getClass(), "moveClicked", false);
        setBooleanField(term4221870, term4221870.getClass(), "warningShown", false);
        setIntField(term4221870, term4221870.getClass(), "moveX", 0);
        setIntField(term4221870, term4221870.getClass(), "moveY", 0);
        setIntField(term4221870, term4221870.getClass(), "dragOrigX", 0);
        setIntField(term4221870, term4221870.getClass(), "dragOrigY", 0);
        setIntField(term4221870, term4221870.getClass(), "dragOrigMapX", 0);
        setIntField(term4221870, term4221870.getClass(), "dragOrigMapY", 0);
        setBooleanField(term4221870, term4221870.getClass(), "dragging", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapMouseListener");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "handleFixTradeButton", argTypes, term4221870, args);
    }

};


