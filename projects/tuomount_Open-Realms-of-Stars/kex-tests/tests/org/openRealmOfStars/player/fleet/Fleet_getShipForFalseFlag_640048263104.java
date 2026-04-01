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

public class Fleet_getShipForFalseFlag_640048263104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193980;

    public Fleet_getShipForFalseFlag_640048263104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193980 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term193980, term193980.getClass(), "ships", null);
        setField(term193980, term193980.getClass(), "coordinate", null);
        setField(term193980, term193980.getClass(), "name", null);
        setIntField(term193980, term193980.getClass(), "movesLeft", 0);
        setField(term193980, term193980.getClass(), "route", null);
        setField(term193980, term193980.getClass(), "commander", null);
        setField(term193980, term193980.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShipForFalseFlag", argTypes, term193980, args);
    }

};


