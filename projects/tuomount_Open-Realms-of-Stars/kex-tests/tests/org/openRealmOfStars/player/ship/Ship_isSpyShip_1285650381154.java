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

public class Ship_isSpyShip_1285650381154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940680;

    public Ship_isSpyShip_1285650381154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940680 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940680, term940680.getClass(), "hull", null);
        setField(term940680, term940680.getClass(), "components", null);
        setField(term940680, term940680.getClass(), "hullPoints", null);
        setIntField(term940680, term940680.getClass(), "shield", 0);
        setIntField(term940680, term940680.getClass(), "armor", 0);
        setField(term940680, term940680.getClass(), "image", null);
        setIntField(term940680, term940680.getClass(), "colonist", 0);
        setIntField(term940680, term940680.getClass(), "metal", 0);
        setIntField(term940680, term940680.getClass(), "experience", 0);
        setIntField(term940680, term940680.getClass(), "culture", 0);
        setIntField(term940680, term940680.getClass(), "specialFlags", 0);
        setField(term940680, term940680.getClass(), "tradeCoordinates", null);
        setField(term940680, term940680.getClass(), "name", null);
        setField(term940680, term940680.getClass(), "iconId", null);
        setField(term940680, term940680.getClass(), "description", null);
        setIntField(term940680, term940680.getClass(), "prodCost", 0);
        setIntField(term940680, term940680.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSpyShip", argTypes, term940680, args);
    }

};


