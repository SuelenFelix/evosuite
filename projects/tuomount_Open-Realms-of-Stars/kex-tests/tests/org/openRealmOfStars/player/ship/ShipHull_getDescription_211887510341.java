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
import java.lang.Boolean;

public class ShipHull_getDescription_211887510341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537787;
     Object term537795;

    public ShipHull_getDescription_211887510341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537787 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        setIntField(term537787, term537787.getClass(), "index", 0);
        setField(term537787, term537787.getClass(), "name", null);
        setIntField(term537787, term537787.getClass(), "maxSlot", 0);
        setIntField(term537787, term537787.getClass(), "slotHull", 0);
        setField(term537787, term537787.getClass(), "hullType", null);
        setField(term537787, term537787.getClass(), "size", null);
        setIntField(term537787, term537787.getClass(), "cost", 0);
        setIntField(term537787, term537787.getClass(), "metalCost", 0);
        setIntField(term537787, term537787.getClass(), "imageIndex", 0);
        setDoubleField(term537787, term537787.getClass(), "fleetCapacity", 0.0);
        setField(term537787, term537787.getClass(), "originalBuilder", null);
        term537795 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term537795;
        callMethod(klass, "getDescription", argTypes, term537787, args);
    }

};


