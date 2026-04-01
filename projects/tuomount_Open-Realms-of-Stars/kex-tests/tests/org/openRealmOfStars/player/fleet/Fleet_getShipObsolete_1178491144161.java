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

public class Fleet_getShipObsolete_1178491144161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194102;

    public Fleet_getShipObsolete_1178491144161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194102 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194102, term194102.getClass(), "ships", null);
        setField(term194102, term194102.getClass(), "coordinate", null);
        setField(term194102, term194102.getClass(), "name", null);
        setIntField(term194102, term194102.getClass(), "movesLeft", 0);
        setField(term194102, term194102.getClass(), "route", null);
        setField(term194102, term194102.getClass(), "commander", null);
        setField(term194102, term194102.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        argTypes[1] = Array.newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getShipObsolete", argTypes, term194102, args);
    }

};


