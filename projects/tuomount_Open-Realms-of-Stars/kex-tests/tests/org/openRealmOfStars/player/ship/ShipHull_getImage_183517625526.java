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

public class ShipHull_getImage_183517625526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537665;

    public ShipHull_getImage_183517625526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537665 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        setIntField(term537665, term537665.getClass(), "index", 0);
        setField(term537665, term537665.getClass(), "name", null);
        setIntField(term537665, term537665.getClass(), "maxSlot", 0);
        setIntField(term537665, term537665.getClass(), "slotHull", 0);
        setField(term537665, term537665.getClass(), "hullType", null);
        setField(term537665, term537665.getClass(), "size", null);
        setIntField(term537665, term537665.getClass(), "cost", 0);
        setIntField(term537665, term537665.getClass(), "metalCost", 0);
        setIntField(term537665, term537665.getClass(), "imageIndex", 0);
        setDoubleField(term537665, term537665.getClass(), "fleetCapacity", 0.0);
        setField(term537665, term537665.getClass(), "originalBuilder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term537665, args);
    }

};


