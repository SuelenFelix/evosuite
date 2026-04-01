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

public class Ship_getHitChanceByWeapon_1980577800138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940508;

    public Ship_getHitChanceByWeapon_1980577800138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940508 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940508, term940508.getClass(), "hull", null);
        setField(term940508, term940508.getClass(), "components", null);
        setField(term940508, term940508.getClass(), "hullPoints", null);
        setIntField(term940508, term940508.getClass(), "shield", 0);
        setIntField(term940508, term940508.getClass(), "armor", 0);
        setField(term940508, term940508.getClass(), "image", null);
        setIntField(term940508, term940508.getClass(), "colonist", 0);
        setIntField(term940508, term940508.getClass(), "metal", 0);
        setIntField(term940508, term940508.getClass(), "experience", 0);
        setIntField(term940508, term940508.getClass(), "culture", 0);
        setIntField(term940508, term940508.getClass(), "specialFlags", 0);
        setField(term940508, term940508.getClass(), "tradeCoordinates", null);
        setField(term940508, term940508.getClass(), "name", null);
        setField(term940508, term940508.getClass(), "iconId", null);
        setField(term940508, term940508.getClass(), "description", null);
        setIntField(term940508, term940508.getClass(), "prodCost", 0);
        setIntField(term940508, term940508.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getHitChanceByWeapon", argTypes, term940508, args);
    }

};


