package org.openRealmOfStars.player.fleet;

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
import static org.openRealmOfStars.player.fleet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Fleet_splitFromFleet_484906743164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194108;
     Object term194110;

    public Fleet_splitFromFleet_484906743164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194108 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194108, term194108.getClass(), "ships", null);
        setField(term194108, term194108.getClass(), "coordinate", null);
        setField(term194108, term194108.getClass(), "name", null);
        setIntField(term194108, term194108.getClass(), "movesLeft", 0);
        setField(term194108, term194108.getClass(), "route", null);
        setField(term194108, term194108.getClass(), "commander", null);
        setField(term194108, term194108.getClass(), "aStarSearch", null);
        term194110 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Array.newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term194110;
        args[1] = null;
        callMethod(klass, "splitFromFleet", argTypes, term194108, args);
    }

};


