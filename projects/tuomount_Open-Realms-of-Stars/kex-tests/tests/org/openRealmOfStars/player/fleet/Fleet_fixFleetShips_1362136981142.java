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

public class Fleet_fixFleetShips_1362136981142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194060;
     Object term194062;

    public Fleet_fixFleetShips_1362136981142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194060 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194060, term194060.getClass(), "ships", null);
        setField(term194060, term194060.getClass(), "coordinate", null);
        setField(term194060, term194060.getClass(), "name", null);
        setIntField(term194060, term194060.getClass(), "movesLeft", 0);
        setField(term194060, term194060.getClass(), "route", null);
        setField(term194060, term194060.getClass(), "commander", null);
        setField(term194060, term194060.getClass(), "aStarSearch", null);
        term194062 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term194062;
        callMethod(klass, "fixFleetShips", argTypes, term194060, args);
    }

};


