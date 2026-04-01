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

public class Fleet_addColonist_1627287039120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194014;

    public Fleet_addColonist_1627287039120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194014 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194014, term194014.getClass(), "ships", null);
        setField(term194014, term194014.getClass(), "coordinate", null);
        setField(term194014, term194014.getClass(), "name", null);
        setIntField(term194014, term194014.getClass(), "movesLeft", 0);
        setField(term194014, term194014.getClass(), "route", null);
        setField(term194014, term194014.getClass(), "commander", null);
        setField(term194014, term194014.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addColonist", argTypes, term194014, args);
    }

};


