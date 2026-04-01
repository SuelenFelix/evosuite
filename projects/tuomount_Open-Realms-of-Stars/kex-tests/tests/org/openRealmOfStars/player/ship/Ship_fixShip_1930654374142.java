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
import java.lang.Boolean;

public class Ship_fixShip_1930654374142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940554;
     Object term940564;

    public Ship_fixShip_1930654374142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940554 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940554, term940554.getClass(), "hull", null);
        setField(term940554, term940554.getClass(), "components", null);
        setField(term940554, term940554.getClass(), "hullPoints", null);
        setIntField(term940554, term940554.getClass(), "shield", 0);
        setIntField(term940554, term940554.getClass(), "armor", 0);
        setField(term940554, term940554.getClass(), "image", null);
        setIntField(term940554, term940554.getClass(), "colonist", 0);
        setIntField(term940554, term940554.getClass(), "metal", 0);
        setIntField(term940554, term940554.getClass(), "experience", 0);
        setIntField(term940554, term940554.getClass(), "culture", 0);
        setIntField(term940554, term940554.getClass(), "specialFlags", 0);
        setField(term940554, term940554.getClass(), "tradeCoordinates", null);
        setField(term940554, term940554.getClass(), "name", null);
        setField(term940554, term940554.getClass(), "iconId", null);
        setField(term940554, term940554.getClass(), "description", null);
        setIntField(term940554, term940554.getClass(), "prodCost", 0);
        setIntField(term940554, term940554.getClass(), "metalCost", 0);
        term940564 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term940564;
        callMethod(klass, "fixShip", argTypes, term940554, args);
    }

};


