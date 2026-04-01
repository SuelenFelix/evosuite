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

public class ShipImage_image64x64_68774445119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942404;
     Object term942406;
     Object term942408;

    public ShipImage_image64x64_68774445119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942404 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipImage"));
        setField(term942404, term942404.getClass(), "largeShipImages", null);
        setField(term942404, term942404.getClass(), "largerShipImages", null);
        setField(term942404, term942404.getClass(), "normalShipImages", null);
        setField(term942404, term942404.getClass(), "smallerShipImages", null);
        setField(term942404, term942404.getClass(), "smallShipImages", null);
        setField(term942404, term942404.getClass(), "id", null);
        setBooleanField(term942404, term942404.getClass(), "customImage", false);
        term942406 = new Integer(0);
        term942408 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term942406;
        args[2] = term942408;
        callMethod(klass, "image64x64", argTypes, term942404, args);
    }

};


