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

public class Ship_getComponent_1971509317162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940760;
     Object term940770;

    public Ship_getComponent_1971509317162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940760 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940760, term940760.getClass(), "hull", null);
        setField(term940760, term940760.getClass(), "components", null);
        setField(term940760, term940760.getClass(), "hullPoints", null);
        setIntField(term940760, term940760.getClass(), "shield", 0);
        setIntField(term940760, term940760.getClass(), "armor", 0);
        setField(term940760, term940760.getClass(), "image", null);
        setIntField(term940760, term940760.getClass(), "colonist", 0);
        setIntField(term940760, term940760.getClass(), "metal", 0);
        setIntField(term940760, term940760.getClass(), "experience", 0);
        setIntField(term940760, term940760.getClass(), "culture", 0);
        setIntField(term940760, term940760.getClass(), "specialFlags", 0);
        setField(term940760, term940760.getClass(), "tradeCoordinates", null);
        setField(term940760, term940760.getClass(), "name", null);
        setField(term940760, term940760.getClass(), "iconId", null);
        setField(term940760, term940760.getClass(), "description", null);
        setIntField(term940760, term940760.getClass(), "prodCost", 0);
        setIntField(term940760, term940760.getClass(), "metalCost", 0);
        term940770 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term940770;
        callMethod(klass, "getComponent", argTypes, term940760, args);
    }

};


