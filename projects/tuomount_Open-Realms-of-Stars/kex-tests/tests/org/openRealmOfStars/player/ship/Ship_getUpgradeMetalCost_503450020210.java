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

public class Ship_getUpgradeMetalCost_503450020210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941262;

    public Ship_getUpgradeMetalCost_503450020210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941262 = newInstance(Class.forName("org.openRealmOfStars.player.ship.Ship"));
        setField(term941262, term941262.getClass(), "hull", null);
        setField(term941262, term941262.getClass(), "components", null);
        setField(term941262, term941262.getClass(), "hullPoints", null);
        setIntField(term941262, term941262.getClass(), "shield", 0);
        setIntField(term941262, term941262.getClass(), "armor", 0);
        setField(term941262, term941262.getClass(), "image", null);
        setIntField(term941262, term941262.getClass(), "colonist", 0);
        setIntField(term941262, term941262.getClass(), "metal", 0);
        setIntField(term941262, term941262.getClass(), "experience", 0);
        setIntField(term941262, term941262.getClass(), "culture", 0);
        setIntField(term941262, term941262.getClass(), "specialFlags", 0);
        setField(term941262, term941262.getClass(), "tradeCoordinates", null);
        setField(term941262, term941262.getClass(), "name", null);
        setField(term941262, term941262.getClass(), "iconId", null);
        setField(term941262, term941262.getClass(), "description", null);
        setIntField(term941262, term941262.getClass(), "prodCost", 0);
        setIntField(term941262, term941262.getClass(), "metalCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getUpgradeMetalCost", argTypes, term941262, args);
    }

};


