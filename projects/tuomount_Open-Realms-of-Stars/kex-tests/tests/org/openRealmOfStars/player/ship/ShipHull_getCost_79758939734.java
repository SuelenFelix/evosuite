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

public class ShipHull_getCost_79758939734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537729;

    public ShipHull_getCost_79758939734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537729 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        setIntField(term537729, term537729.getClass(), "index", 0);
        setField(term537729, term537729.getClass(), "name", null);
        setIntField(term537729, term537729.getClass(), "maxSlot", 0);
        setIntField(term537729, term537729.getClass(), "slotHull", 0);
        setField(term537729, term537729.getClass(), "hullType", null);
        setField(term537729, term537729.getClass(), "size", null);
        setIntField(term537729, term537729.getClass(), "cost", 0);
        setIntField(term537729, term537729.getClass(), "metalCost", 0);
        setIntField(term537729, term537729.getClass(), "imageIndex", 0);
        setDoubleField(term537729, term537729.getClass(), "fleetCapacity", 0.0);
        setField(term537729, term537729.getClass(), "originalBuilder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCost", argTypes, term537729, args);
    }

};


