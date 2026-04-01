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

public class ShipDesign_gotCertainType_78345563166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176508;

    public ShipDesign_gotCertainType_78345563166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176508 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        setField(term176508, term176508.getClass(), "name", null);
        setField(term176508, term176508.getClass(), "hull", null);
        setField(term176508, term176508.getClass(), "components", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipComponentType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "gotCertainType", argTypes, term176508, args);
    }

};


