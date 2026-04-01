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

public class Ship_damageBy_117115471143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940566;
     Object term940576;

    public Ship_damageBy_117115471143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940566 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940566, term940566.getClass(), "hull", null);
        setField(term940566, term940566.getClass(), "components", null);
        setField(term940566, term940566.getClass(), "hullPoints", null);
        setIntField(term940566, term940566.getClass(), "shield", 0);
        setIntField(term940566, term940566.getClass(), "armor", 0);
        setField(term940566, term940566.getClass(), "image", null);
        setIntField(term940566, term940566.getClass(), "colonist", 0);
        setIntField(term940566, term940566.getClass(), "metal", 0);
        setIntField(term940566, term940566.getClass(), "experience", 0);
        setIntField(term940566, term940566.getClass(), "culture", 0);
        setIntField(term940566, term940566.getClass(), "specialFlags", 0);
        setField(term940566, term940566.getClass(), "tradeCoordinates", null);
        setField(term940566, term940566.getClass(), "name", null);
        setField(term940566, term940566.getClass(), "iconId", null);
        setField(term940566, term940566.getClass(), "description", null);
        setIntField(term940566, term940566.getClass(), "prodCost", 0);
        setIntField(term940566, term940566.getClass(), "metalCost", 0);
        term940576 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term940576;
        callMethod(klass, "damageBy", argTypes, term940566, args);
    }

};


