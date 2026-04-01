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

public class Ship_saveShip_233451463109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940204;

    public Ship_saveShip_233451463109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940204 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940204, term940204.getClass(), "hull", null);
        setField(term940204, term940204.getClass(), "components", null);
        setField(term940204, term940204.getClass(), "hullPoints", null);
        setIntField(term940204, term940204.getClass(), "shield", 0);
        setIntField(term940204, term940204.getClass(), "armor", 0);
        setField(term940204, term940204.getClass(), "image", null);
        setIntField(term940204, term940204.getClass(), "colonist", 0);
        setIntField(term940204, term940204.getClass(), "metal", 0);
        setIntField(term940204, term940204.getClass(), "experience", 0);
        setIntField(term940204, term940204.getClass(), "culture", 0);
        setIntField(term940204, term940204.getClass(), "specialFlags", 0);
        setField(term940204, term940204.getClass(), "tradeCoordinates", null);
        setField(term940204, term940204.getClass(), "name", null);
        setField(term940204, term940204.getClass(), "iconId", null);
        setField(term940204, term940204.getClass(), "description", null);
        setIntField(term940204, term940204.getClass(), "prodCost", 0);
        setIntField(term940204, term940204.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "saveShip", argTypes, term940204, args);
    }

};


