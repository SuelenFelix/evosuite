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

public class ShipHull_getDefenseValueByShipHullSize_138205919440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537779;

    public ShipHull_getDefenseValueByShipHullSize_138205919440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537779 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        setIntField(term537779, term537779.getClass(), "index", 0);
        setField(term537779, term537779.getClass(), "name", null);
        setIntField(term537779, term537779.getClass(), "maxSlot", 0);
        setIntField(term537779, term537779.getClass(), "slotHull", 0);
        setField(term537779, term537779.getClass(), "hullType", null);
        setField(term537779, term537779.getClass(), "size", null);
        setIntField(term537779, term537779.getClass(), "cost", 0);
        setIntField(term537779, term537779.getClass(), "metalCost", 0);
        setIntField(term537779, term537779.getClass(), "imageIndex", 0);
        setDoubleField(term537779, term537779.getClass(), "fleetCapacity", 0.0);
        setField(term537779, term537779.getClass(), "originalBuilder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefenseValueByShipHullSize", argTypes, term537779, args);
    }

};


