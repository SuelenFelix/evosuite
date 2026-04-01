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

public class Fleet_setRoute_943927769115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194004;

    public Fleet_setRoute_943927769115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194004 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194004, term194004.getClass(), "ships", null);
        setField(term194004, term194004.getClass(), "coordinate", null);
        setField(term194004, term194004.getClass(), "name", null);
        setIntField(term194004, term194004.getClass(), "movesLeft", 0);
        setField(term194004, term194004.getClass(), "route", null);
        setField(term194004, term194004.getClass(), "commander", null);
        setField(term194004, term194004.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Route");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRoute", argTypes, term194004, args);
    }

};


