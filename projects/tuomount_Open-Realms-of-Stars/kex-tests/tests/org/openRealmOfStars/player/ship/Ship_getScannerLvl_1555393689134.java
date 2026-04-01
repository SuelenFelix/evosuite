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

public class Ship_getScannerLvl_1555393689134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940468;

    public Ship_getScannerLvl_1555393689134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940468 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940468, term940468.getClass(), "hull", null);
        setField(term940468, term940468.getClass(), "components", null);
        setField(term940468, term940468.getClass(), "hullPoints", null);
        setIntField(term940468, term940468.getClass(), "shield", 0);
        setIntField(term940468, term940468.getClass(), "armor", 0);
        setField(term940468, term940468.getClass(), "image", null);
        setIntField(term940468, term940468.getClass(), "colonist", 0);
        setIntField(term940468, term940468.getClass(), "metal", 0);
        setIntField(term940468, term940468.getClass(), "experience", 0);
        setIntField(term940468, term940468.getClass(), "culture", 0);
        setIntField(term940468, term940468.getClass(), "specialFlags", 0);
        setField(term940468, term940468.getClass(), "tradeCoordinates", null);
        setField(term940468, term940468.getClass(), "name", null);
        setField(term940468, term940468.getClass(), "iconId", null);
        setField(term940468, term940468.getClass(), "description", null);
        setIntField(term940468, term940468.getClass(), "prodCost", 0);
        setIntField(term940468, term940468.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScannerLvl", argTypes, term940468, args);
    }

};


