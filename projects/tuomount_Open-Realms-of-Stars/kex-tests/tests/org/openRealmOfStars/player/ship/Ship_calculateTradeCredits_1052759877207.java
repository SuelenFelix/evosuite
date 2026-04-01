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

public class Ship_calculateTradeCredits_1052759877207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941232;

    public Ship_calculateTradeCredits_1052759877207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941232 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term941232, term941232.getClass(), "hull", null);
        setField(term941232, term941232.getClass(), "components", null);
        setField(term941232, term941232.getClass(), "hullPoints", null);
        setIntField(term941232, term941232.getClass(), "shield", 0);
        setIntField(term941232, term941232.getClass(), "armor", 0);
        setField(term941232, term941232.getClass(), "image", null);
        setIntField(term941232, term941232.getClass(), "colonist", 0);
        setIntField(term941232, term941232.getClass(), "metal", 0);
        setIntField(term941232, term941232.getClass(), "experience", 0);
        setIntField(term941232, term941232.getClass(), "culture", 0);
        setIntField(term941232, term941232.getClass(), "specialFlags", 0);
        setField(term941232, term941232.getClass(), "tradeCoordinates", null);
        setField(term941232, term941232.getClass(), "name", null);
        setField(term941232, term941232.getClass(), "iconId", null);
        setField(term941232, term941232.getClass(), "description", null);
        setIntField(term941232, term941232.getClass(), "prodCost", 0);
        setIntField(term941232, term941232.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "calculateTradeCredits", argTypes, term941232, args);
    }

};


