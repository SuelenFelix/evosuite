package org.openRealmOfStars.player.ship.shipdesign;

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
import static org.openRealmOfStars.player.ship.shipdesign.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShipDesign_getCost_195176877781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176523;

    public ShipDesign_getCost_195176877781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176523 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        setField(term176523, term176523.getClass(), "name", null);
        setField(term176523, term176523.getClass(), "hull", null);
        setField(term176523, term176523.getClass(), "components", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCost", argTypes, term176523, args);
    }

};


