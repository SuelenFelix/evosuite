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

public class ShipHull_setImageIndex_124368102522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537637;
     Object term537645;

    public ShipHull_setImageIndex_124368102522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537637 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        setIntField(term537637, term537637.getClass(), "index", 0);
        setField(term537637, term537637.getClass(), "name", null);
        setIntField(term537637, term537637.getClass(), "maxSlot", 0);
        setIntField(term537637, term537637.getClass(), "slotHull", 0);
        setField(term537637, term537637.getClass(), "hullType", null);
        setField(term537637, term537637.getClass(), "size", null);
        setIntField(term537637, term537637.getClass(), "cost", 0);
        setIntField(term537637, term537637.getClass(), "metalCost", 0);
        setIntField(term537637, term537637.getClass(), "imageIndex", 0);
        setDoubleField(term537637, term537637.getClass(), "fleetCapacity", 0.0);
        setField(term537637, term537637.getClass(), "originalBuilder", null);
        term537645 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term537645;
        callMethod(klass, "setImageIndex", argTypes, term537637, args);
    }

};


