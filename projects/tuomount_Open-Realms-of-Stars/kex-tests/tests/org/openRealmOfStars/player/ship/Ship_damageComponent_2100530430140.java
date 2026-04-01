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

public class Ship_damageComponent_2100530430140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940528;
     Object term940538;

    public Ship_damageComponent_2100530430140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940528 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940528, term940528.getClass(), "hull", null);
        setField(term940528, term940528.getClass(), "components", null);
        setField(term940528, term940528.getClass(), "hullPoints", null);
        setIntField(term940528, term940528.getClass(), "shield", 0);
        setIntField(term940528, term940528.getClass(), "armor", 0);
        setField(term940528, term940528.getClass(), "image", null);
        setIntField(term940528, term940528.getClass(), "colonist", 0);
        setIntField(term940528, term940528.getClass(), "metal", 0);
        setIntField(term940528, term940528.getClass(), "experience", 0);
        setIntField(term940528, term940528.getClass(), "culture", 0);
        setIntField(term940528, term940528.getClass(), "specialFlags", 0);
        setField(term940528, term940528.getClass(), "tradeCoordinates", null);
        setField(term940528, term940528.getClass(), "name", null);
        setField(term940528, term940528.getClass(), "iconId", null);
        setField(term940528, term940528.getClass(), "description", null);
        setIntField(term940528, term940528.getClass(), "prodCost", 0);
        setIntField(term940528, term940528.getClass(), "metalCost", 0);
        term940538 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.ship.ShipDamage");
        Object[] args = new Object[2];
        args[0] = term940538;
        args[1] = null;
        callMethod(klass, "damageComponent", argTypes, term940528, args);
    }

};


