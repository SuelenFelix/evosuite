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

public class Ship_isColonyShip_1342652639149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940630;

    public Ship_isColonyShip_1342652639149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940630 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940630, term940630.getClass(), "hull", null);
        setField(term940630, term940630.getClass(), "components", null);
        setField(term940630, term940630.getClass(), "hullPoints", null);
        setIntField(term940630, term940630.getClass(), "shield", 0);
        setIntField(term940630, term940630.getClass(), "armor", 0);
        setField(term940630, term940630.getClass(), "image", null);
        setIntField(term940630, term940630.getClass(), "colonist", 0);
        setIntField(term940630, term940630.getClass(), "metal", 0);
        setIntField(term940630, term940630.getClass(), "experience", 0);
        setIntField(term940630, term940630.getClass(), "culture", 0);
        setIntField(term940630, term940630.getClass(), "specialFlags", 0);
        setField(term940630, term940630.getClass(), "tradeCoordinates", null);
        setField(term940630, term940630.getClass(), "name", null);
        setField(term940630, term940630.getClass(), "iconId", null);
        setField(term940630, term940630.getClass(), "description", null);
        setIntField(term940630, term940630.getClass(), "prodCost", 0);
        setIntField(term940630, term940630.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isColonyShip", argTypes, term940630, args);
    }

};


