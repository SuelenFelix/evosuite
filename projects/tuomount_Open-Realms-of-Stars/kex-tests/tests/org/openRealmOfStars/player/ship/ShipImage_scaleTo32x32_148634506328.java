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

public class ShipImage_scaleTo32x32_148634506328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942440;

    public ShipImage_scaleTo32x32_148634506328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942440 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipImage"));
        setField(term942440, term942440.getClass(), "largeShipImages", null);
        setField(term942440, term942440.getClass(), "largerShipImages", null);
        setField(term942440, term942440.getClass(), "normalShipImages", null);
        setField(term942440, term942440.getClass(), "smallerShipImages", null);
        setField(term942440, term942440.getClass(), "smallShipImages", null);
        setField(term942440, term942440.getClass(), "id", null);
        setBooleanField(term942440, term942440.getClass(), "customImage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipImage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "scaleTo32x32", argTypes, term942440, args);
    }

};


