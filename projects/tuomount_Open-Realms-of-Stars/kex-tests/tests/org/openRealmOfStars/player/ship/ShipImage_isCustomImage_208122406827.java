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

public class ShipImage_isCustomImage_208122406827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942438;

    public ShipImage_isCustomImage_208122406827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942438 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipImage"));
        setField(term942438, term942438.getClass(), "largeShipImages", null);
        setField(term942438, term942438.getClass(), "largerShipImages", null);
        setField(term942438, term942438.getClass(), "normalShipImages", null);
        setField(term942438, term942438.getClass(), "smallerShipImages", null);
        setField(term942438, term942438.getClass(), "smallShipImages", null);
        setField(term942438, term942438.getClass(), "id", null);
        setBooleanField(term942438, term942438.getClass(), "customImage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCustomImage", argTypes, term942438, args);
    }

};


