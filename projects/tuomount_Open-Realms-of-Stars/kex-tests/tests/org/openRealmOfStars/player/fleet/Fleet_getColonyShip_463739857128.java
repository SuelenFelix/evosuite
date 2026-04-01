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

public class Fleet_getColonyShip_463739857128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194030;
     Object term194032;

    public Fleet_getColonyShip_463739857128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194030 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194030, term194030.getClass(), "ships", null);
        setField(term194030, term194030.getClass(), "coordinate", null);
        setField(term194030, term194030.getClass(), "name", null);
        setIntField(term194030, term194030.getClass(), "movesLeft", 0);
        setField(term194030, term194030.getClass(), "route", null);
        setField(term194030, term194030.getClass(), "commander", null);
        setField(term194030, term194030.getClass(), "aStarSearch", null);
        term194032 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term194032;
        callMethod(klass, "getColonyShip", argTypes, term194030, args);
    }

};


