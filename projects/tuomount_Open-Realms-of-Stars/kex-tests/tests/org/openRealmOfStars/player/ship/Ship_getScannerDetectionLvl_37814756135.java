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

public class Ship_getScannerDetectionLvl_37814756135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940478;

    public Ship_getScannerDetectionLvl_37814756135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940478 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940478, term940478.getClass(), "hull", null);
        setField(term940478, term940478.getClass(), "components", null);
        setField(term940478, term940478.getClass(), "hullPoints", null);
        setIntField(term940478, term940478.getClass(), "shield", 0);
        setIntField(term940478, term940478.getClass(), "armor", 0);
        setField(term940478, term940478.getClass(), "image", null);
        setIntField(term940478, term940478.getClass(), "colonist", 0);
        setIntField(term940478, term940478.getClass(), "metal", 0);
        setIntField(term940478, term940478.getClass(), "experience", 0);
        setIntField(term940478, term940478.getClass(), "culture", 0);
        setIntField(term940478, term940478.getClass(), "specialFlags", 0);
        setField(term940478, term940478.getClass(), "tradeCoordinates", null);
        setField(term940478, term940478.getClass(), "name", null);
        setField(term940478, term940478.getClass(), "iconId", null);
        setField(term940478, term940478.getClass(), "description", null);
        setIntField(term940478, term940478.getClass(), "prodCost", 0);
        setIntField(term940478, term940478.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScannerDetectionLvl", argTypes, term940478, args);
    }

};


