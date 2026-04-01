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

public class ShipImage_getShipZoomedImage_165549714720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942410;
     Object term942412;
     Object term942414;

    public ShipImage_getShipZoomedImage_165549714720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942410 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipImage"));
        setField(term942410, term942410.getClass(), "largeShipImages", null);
        setField(term942410, term942410.getClass(), "largerShipImages", null);
        setField(term942410, term942410.getClass(), "normalShipImages", null);
        setField(term942410, term942410.getClass(), "smallerShipImages", null);
        setField(term942410, term942410.getClass(), "smallShipImages", null);
        setField(term942410, term942410.getClass(), "id", null);
        setBooleanField(term942410, term942410.getClass(), "customImage", false);
        term942412 = new Integer(0);
        term942414 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term942412;
        args[1] = term942414;
        callMethod(klass, "getShipZoomedImage", argTypes, term942410, args);
    }

};


