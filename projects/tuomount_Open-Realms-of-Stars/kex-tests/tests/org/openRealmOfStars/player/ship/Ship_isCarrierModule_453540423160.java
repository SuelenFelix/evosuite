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

public class Ship_isCarrierModule_453540423160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940740;

    public Ship_isCarrierModule_453540423160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940740 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940740, term940740.getClass(), "hull", null);
        setField(term940740, term940740.getClass(), "components", null);
        setField(term940740, term940740.getClass(), "hullPoints", null);
        setIntField(term940740, term940740.getClass(), "shield", 0);
        setIntField(term940740, term940740.getClass(), "armor", 0);
        setField(term940740, term940740.getClass(), "image", null);
        setIntField(term940740, term940740.getClass(), "colonist", 0);
        setIntField(term940740, term940740.getClass(), "metal", 0);
        setIntField(term940740, term940740.getClass(), "experience", 0);
        setIntField(term940740, term940740.getClass(), "culture", 0);
        setIntField(term940740, term940740.getClass(), "specialFlags", 0);
        setField(term940740, term940740.getClass(), "tradeCoordinates", null);
        setField(term940740, term940740.getClass(), "name", null);
        setField(term940740, term940740.getClass(), "iconId", null);
        setField(term940740, term940740.getClass(), "description", null);
        setIntField(term940740, term940740.getClass(), "prodCost", 0);
        setIntField(term940740, term940740.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCarrierModule", argTypes, term940740, args);
    }

};


