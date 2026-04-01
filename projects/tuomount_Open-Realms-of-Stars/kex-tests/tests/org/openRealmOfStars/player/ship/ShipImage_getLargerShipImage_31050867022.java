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

public class ShipImage_getLargerShipImage_31050867022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942420;
     Object term942422;

    public ShipImage_getLargerShipImage_31050867022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942420 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipImage"));
        setField(term942420, term942420.getClass(), "largeShipImages", null);
        setField(term942420, term942420.getClass(), "largerShipImages", null);
        setField(term942420, term942420.getClass(), "normalShipImages", null);
        setField(term942420, term942420.getClass(), "smallerShipImages", null);
        setField(term942420, term942420.getClass(), "smallShipImages", null);
        setField(term942420, term942420.getClass(), "id", null);
        setBooleanField(term942420, term942420.getClass(), "customImage", false);
        term942422 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term942422;
        callMethod(klass, "getLargerShipImage", argTypes, term942420, args);
    }

};


