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

public class Ship_setCulture_1361724735191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941064;
     Object term941074;

    public Ship_setCulture_1361724735191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941064 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term941064, term941064.getClass(), "hull", null);
        setField(term941064, term941064.getClass(), "components", null);
        setField(term941064, term941064.getClass(), "hullPoints", null);
        setIntField(term941064, term941064.getClass(), "shield", 0);
        setIntField(term941064, term941064.getClass(), "armor", 0);
        setField(term941064, term941064.getClass(), "image", null);
        setIntField(term941064, term941064.getClass(), "colonist", 0);
        setIntField(term941064, term941064.getClass(), "metal", 0);
        setIntField(term941064, term941064.getClass(), "experience", 0);
        setIntField(term941064, term941064.getClass(), "culture", 0);
        setIntField(term941064, term941064.getClass(), "specialFlags", 0);
        setField(term941064, term941064.getClass(), "tradeCoordinates", null);
        setField(term941064, term941064.getClass(), "name", null);
        setField(term941064, term941064.getClass(), "iconId", null);
        setField(term941064, term941064.getClass(), "description", null);
        setIntField(term941064, term941064.getClass(), "prodCost", 0);
        setIntField(term941064, term941064.getClass(), "metalCost", 0);
        term941074 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term941074;
        callMethod(klass, "setCulture", argTypes, term941064, args);
    }

};


