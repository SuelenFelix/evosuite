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

public class ShipDesign_hasEngine_189317272077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176519;

    public ShipDesign_hasEngine_189317272077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176519 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        setField(term176519, term176519.getClass(), "name", null);
        setField(term176519, term176519.getClass(), "hull", null);
        setField(term176519, term176519.getClass(), "components", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasEngine", argTypes, term176519, args);
    }

};


