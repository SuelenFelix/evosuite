package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ShipHull_init_99843300723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537647;
     Object term537649;
     Object term537651;
     Object term537653;
     Object term537655;

    public ShipHull_init_99843300723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537647 = new Integer(0);
        term537649 = new Integer(0);
        term537651 = new Integer(0);
        term537653 = new Integer(0);
        term537655 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("org.openRealmOfStars.player.ship.ShipHullType");
        argTypes[5] = Class.forName("org.openRealmOfStars.player.ship.ShipSize");
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[9];
        args[0] = term537647;
        args[1] = null;
        args[2] = term537649;
        args[3] = term537651;
        args[4] = null;
        args[5] = null;
        args[6] = term537653;
        args[7] = term537655;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


