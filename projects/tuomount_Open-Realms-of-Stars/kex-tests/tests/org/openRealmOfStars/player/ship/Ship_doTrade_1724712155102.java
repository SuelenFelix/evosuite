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

public class Ship_doTrade_1724712155102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917557;

    public Ship_doTrade_1724712155102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term917557 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term917557, term917557.getClass(), "hull", null);
        setField(term917557, term917557.getClass(), "components", null);
        setField(term917557, term917557.getClass(), "hullPoints", null);
        setIntField(term917557, term917557.getClass(), "shield", 0);
        setIntField(term917557, term917557.getClass(), "armor", 0);
        setField(term917557, term917557.getClass(), "image", null);
        setIntField(term917557, term917557.getClass(), "colonist", 0);
        setIntField(term917557, term917557.getClass(), "metal", 0);
        setIntField(term917557, term917557.getClass(), "experience", 0);
        setIntField(term917557, term917557.getClass(), "culture", 0);
        setIntField(term917557, term917557.getClass(), "specialFlags", 0);
        setField(term917557, term917557.getClass(), "tradeCoordinates", null);
        setField(term917557, term917557.getClass(), "name", null);
        setField(term917557, term917557.getClass(), "iconId", null);
        setField(term917557, term917557.getClass(), "description", null);
        setIntField(term917557, term917557.getClass(), "prodCost", 0);
        setIntField(term917557, term917557.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "doTrade", argTypes, term917557, args);
    }

};


