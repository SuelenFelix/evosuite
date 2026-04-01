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

public class Fleet_splitFromFleet_55621166989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193944;
     Object term193946;

    public Fleet_splitFromFleet_55621166989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193944 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term193944, term193944.getClass(), "ships", null);
        setField(term193944, term193944.getClass(), "coordinate", null);
        setField(term193944, term193944.getClass(), "name", null);
        setIntField(term193944, term193944.getClass(), "movesLeft", 0);
        setField(term193944, term193944.getClass(), "route", null);
        setField(term193944, term193944.getClass(), "commander", null);
        setField(term193944, term193944.getClass(), "aStarSearch", null);
        term193946 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = term193946;
        args[1] = null;
        callMethod(klass, "splitFromFleet", argTypes, term193944, args);
    }

};


