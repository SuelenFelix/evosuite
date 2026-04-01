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

public class Fleet_removeShip_200593444192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193954;

    public Fleet_removeShip_200593444192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193954 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term193954, term193954.getClass(), "ships", null);
        setField(term193954, term193954.getClass(), "coordinate", null);
        setField(term193954, term193954.getClass(), "name", null);
        setIntField(term193954, term193954.getClass(), "movesLeft", 0);
        setField(term193954, term193954.getClass(), "route", null);
        setField(term193954, term193954.getClass(), "commander", null);
        setField(term193954, term193954.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeShip", argTypes, term193954, args);
    }

};


