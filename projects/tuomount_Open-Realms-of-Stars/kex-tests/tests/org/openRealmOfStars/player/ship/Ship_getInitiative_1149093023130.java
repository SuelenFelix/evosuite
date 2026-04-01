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

public class Ship_getInitiative_1149093023130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940428;

    public Ship_getInitiative_1149093023130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940428 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940428, term940428.getClass(), "hull", null);
        setField(term940428, term940428.getClass(), "components", null);
        setField(term940428, term940428.getClass(), "hullPoints", null);
        setIntField(term940428, term940428.getClass(), "shield", 0);
        setIntField(term940428, term940428.getClass(), "armor", 0);
        setField(term940428, term940428.getClass(), "image", null);
        setIntField(term940428, term940428.getClass(), "colonist", 0);
        setIntField(term940428, term940428.getClass(), "metal", 0);
        setIntField(term940428, term940428.getClass(), "experience", 0);
        setIntField(term940428, term940428.getClass(), "culture", 0);
        setIntField(term940428, term940428.getClass(), "specialFlags", 0);
        setField(term940428, term940428.getClass(), "tradeCoordinates", null);
        setField(term940428, term940428.getClass(), "name", null);
        setField(term940428, term940428.getClass(), "iconId", null);
        setField(term940428, term940428.getClass(), "description", null);
        setIntField(term940428, term940428.getClass(), "prodCost", 0);
        setIntField(term940428, term940428.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitiative", argTypes, term940428, args);
    }

};


