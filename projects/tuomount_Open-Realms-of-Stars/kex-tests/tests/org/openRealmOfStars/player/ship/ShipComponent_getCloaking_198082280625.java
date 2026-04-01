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
import java.lang.String;
import java.lang.Object;

public class ShipComponent_getCloaking_198082280625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471720;

    public ShipComponent_getCloaking_198082280625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term471773 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term471772 = ((Class) term471773).getDeclaredField((String) "ORBITAL_BOMBS");
        ((Field) term471772).setAccessible(true);
        Object enum1497 = ((Field) term471772).get((Object) null);
        term471720 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term471720, term471720.getClass(), "index", -1728711778);
        setField(term471720, term471720.getClass(), "type", enum1497);
        setIntField(term471720, term471720.getClass(), "cost", 800733694);
        setIntField(term471720, term471720.getClass(), "metalCost", 1960110038);
        setField(term471720, term471720.getClass(), "name", "uMQMSzFzJe");
        setIntField(term471720, term471720.getClass(), "energyRequirement", 1089415716);
        setIntField(term471720, term471720.getClass(), "energyResource", 2091132733);
        setIntField(term471720, term471720.getClass(), "ftlSpeed", 163419995);
        setIntField(term471720, term471720.getClass(), "speed", -1077085727);
        setIntField(term471720, term471720.getClass(), "tacticSpeed", 839351605);
        setIntField(term471720, term471720.getClass(), "scannerRange", 585407284);
        setIntField(term471720, term471720.getClass(), "cloakDetection", -1453114237);
        setIntField(term471720, term471720.getClass(), "cloaking", 1408014748);
        setIntField(term471720, term471720.getClass(), "defenseValue", -1808362201);
        setIntField(term471720, term471720.getClass(), "baySize", -1948153194);
        setIntField(term471720, term471720.getClass(), "damage", 847610205);
        setIntField(term471720, term471720.getClass(), "weaponRange", 278413809);
        setIntField(term471720, term471720.getClass(), "initiativeBoost", 917959261);
        setIntField(term471720, term471720.getClass(), "cultureBonus", 919466486);
        setIntField(term471720, term471720.getClass(), "creditBonus", -1201638276);
        setIntField(term471720, term471720.getClass(), "researchBonus", 1343406968);
        setIntField(term471720, term471720.getClass(), "espionageBonus", -279850700);
        setIntField(term471720, term471720.getClass(), "fleetCapacityBonus", 2061426713);
        setIntField(term471720, term471720.getClass(), "hitBonus", -1674907707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCloaking", argTypes, term471720, args);
    }

};


