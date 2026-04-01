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
import java.lang.Boolean;

public class Ship_setFlag_1903556385192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941076;
     Object term941086;
     Object term941088;

    public Ship_setFlag_1903556385192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941076 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term941076, term941076.getClass(), "hull", null);
        setField(term941076, term941076.getClass(), "components", null);
        setField(term941076, term941076.getClass(), "hullPoints", null);
        setIntField(term941076, term941076.getClass(), "shield", 0);
        setIntField(term941076, term941076.getClass(), "armor", 0);
        setField(term941076, term941076.getClass(), "image", null);
        setIntField(term941076, term941076.getClass(), "colonist", 0);
        setIntField(term941076, term941076.getClass(), "metal", 0);
        setIntField(term941076, term941076.getClass(), "experience", 0);
        setIntField(term941076, term941076.getClass(), "culture", 0);
        setIntField(term941076, term941076.getClass(), "specialFlags", 0);
        setField(term941076, term941076.getClass(), "tradeCoordinates", null);
        setField(term941076, term941076.getClass(), "name", null);
        setField(term941076, term941076.getClass(), "iconId", null);
        setField(term941076, term941076.getClass(), "description", null);
        setIntField(term941076, term941076.getClass(), "prodCost", 0);
        setIntField(term941076, term941076.getClass(), "metalCost", 0);
        term941086 = new Integer(0);
        term941088 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term941086;
        args[1] = term941088;
        callMethod(klass, "setFlag", argTypes, term941076, args);
    }

};


