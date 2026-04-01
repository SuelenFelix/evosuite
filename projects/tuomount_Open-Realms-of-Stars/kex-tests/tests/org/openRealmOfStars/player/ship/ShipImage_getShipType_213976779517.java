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

public class ShipImage_getShipType_213976779517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942400;

    public ShipImage_getShipType_213976779517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942400 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipImage"));
        setField(term942400, term942400.getClass(), "largeShipImages", null);
        setField(term942400, term942400.getClass(), "largerShipImages", null);
        setField(term942400, term942400.getClass(), "normalShipImages", null);
        setField(term942400, term942400.getClass(), "smallerShipImages", null);
        setField(term942400, term942400.getClass(), "smallShipImages", null);
        setField(term942400, term942400.getClass(), "id", null);
        setBooleanField(term942400, term942400.getClass(), "customImage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getShipType", argTypes, term942400, args);
    }

};


