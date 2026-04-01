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

public class Ship_increaseInitivativeByComponent_1723555935131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940438;

    public Ship_increaseInitivativeByComponent_1723555935131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940438 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940438, term940438.getClass(), "hull", null);
        setField(term940438, term940438.getClass(), "components", null);
        setField(term940438, term940438.getClass(), "hullPoints", null);
        setIntField(term940438, term940438.getClass(), "shield", 0);
        setIntField(term940438, term940438.getClass(), "armor", 0);
        setField(term940438, term940438.getClass(), "image", null);
        setIntField(term940438, term940438.getClass(), "colonist", 0);
        setIntField(term940438, term940438.getClass(), "metal", 0);
        setIntField(term940438, term940438.getClass(), "experience", 0);
        setIntField(term940438, term940438.getClass(), "culture", 0);
        setIntField(term940438, term940438.getClass(), "specialFlags", 0);
        setField(term940438, term940438.getClass(), "tradeCoordinates", null);
        setField(term940438, term940438.getClass(), "name", null);
        setField(term940438, term940438.getClass(), "iconId", null);
        setField(term940438, term940438.getClass(), "description", null);
        setIntField(term940438, term940438.getClass(), "prodCost", 0);
        setIntField(term940438, term940438.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "increaseInitivativeByComponent", argTypes, term940438, args);
    }

};


