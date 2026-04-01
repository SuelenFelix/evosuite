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

public class Ship_setTradeDistance_8550448202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941182;

    public Ship_setTradeDistance_8550448202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941182 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term941182, term941182.getClass(), "hull", null);
        setField(term941182, term941182.getClass(), "components", null);
        setField(term941182, term941182.getClass(), "hullPoints", null);
        setIntField(term941182, term941182.getClass(), "shield", 0);
        setIntField(term941182, term941182.getClass(), "armor", 0);
        setField(term941182, term941182.getClass(), "image", null);
        setIntField(term941182, term941182.getClass(), "colonist", 0);
        setIntField(term941182, term941182.getClass(), "metal", 0);
        setIntField(term941182, term941182.getClass(), "experience", 0);
        setIntField(term941182, term941182.getClass(), "culture", 0);
        setIntField(term941182, term941182.getClass(), "specialFlags", 0);
        setField(term941182, term941182.getClass(), "tradeCoordinates", null);
        setField(term941182, term941182.getClass(), "name", null);
        setField(term941182, term941182.getClass(), "iconId", null);
        setField(term941182, term941182.getClass(), "description", null);
        setIntField(term941182, term941182.getClass(), "prodCost", 0);
        setIntField(term941182, term941182.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTradeDistance", argTypes, term941182, args);
    }

};


