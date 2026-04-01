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
import java.lang.Double;

public class ShipHull_setFleetCapacity_161351043538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537761;
     Object term537769;

    public ShipHull_setFleetCapacity_161351043538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537761 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        setIntField(term537761, term537761.getClass(), "index", 0);
        setField(term537761, term537761.getClass(), "name", null);
        setIntField(term537761, term537761.getClass(), "maxSlot", 0);
        setIntField(term537761, term537761.getClass(), "slotHull", 0);
        setField(term537761, term537761.getClass(), "hullType", null);
        setField(term537761, term537761.getClass(), "size", null);
        setIntField(term537761, term537761.getClass(), "cost", 0);
        setIntField(term537761, term537761.getClass(), "metalCost", 0);
        setIntField(term537761, term537761.getClass(), "imageIndex", 0);
        setDoubleField(term537761, term537761.getClass(), "fleetCapacity", 0.0);
        setField(term537761, term537761.getClass(), "originalBuilder", null);
        term537769 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term537769;
        callMethod(klass, "setFleetCapacity", argTypes, term537761, args);
    }

};


