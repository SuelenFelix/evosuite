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

public class Ship_isIndexValid_1740785493113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940246;
     Object term940256;

    public Ship_isIndexValid_1740785493113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940246 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term940246, term940246.getClass(), "hull", null);
        setField(term940246, term940246.getClass(), "components", null);
        setField(term940246, term940246.getClass(), "hullPoints", null);
        setIntField(term940246, term940246.getClass(), "shield", 0);
        setIntField(term940246, term940246.getClass(), "armor", 0);
        setField(term940246, term940246.getClass(), "image", null);
        setIntField(term940246, term940246.getClass(), "colonist", 0);
        setIntField(term940246, term940246.getClass(), "metal", 0);
        setIntField(term940246, term940246.getClass(), "experience", 0);
        setIntField(term940246, term940246.getClass(), "culture", 0);
        setIntField(term940246, term940246.getClass(), "specialFlags", 0);
        setField(term940246, term940246.getClass(), "tradeCoordinates", null);
        setField(term940246, term940246.getClass(), "name", null);
        setField(term940246, term940246.getClass(), "iconId", null);
        setField(term940246, term940246.getClass(), "description", null);
        setIntField(term940246, term940246.getClass(), "prodCost", 0);
        setIntField(term940246, term940246.getClass(), "metalCost", 0);
        term940256 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term940256;
        callMethod(klass, "isIndexValid", argTypes, term940246, args);
    }

};


