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

public class ShipComponent_getType_5358613217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465266;

    public ShipComponent_getType_5358613217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term465319 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term465318 = ((Class) term465319).getDeclaredField((String) "ORGANIC_ARMOR");
        ((Field) term465318).setAccessible(true);
        Object enum1479 = ((Field) term465318).get((Object) null);
        term465266 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term465266, term465266.getClass(), "index", 1717231473);
        setField(term465266, term465266.getClass(), "type", enum1479);
        setIntField(term465266, term465266.getClass(), "cost", -692019993);
        setIntField(term465266, term465266.getClass(), "metalCost", 232421375);
        setField(term465266, term465266.getClass(), "name", "wlpBfKyzud");
        setIntField(term465266, term465266.getClass(), "energyRequirement", -2134429009);
        setIntField(term465266, term465266.getClass(), "energyResource", 709648293);
        setIntField(term465266, term465266.getClass(), "ftlSpeed", 1968045816);
        setIntField(term465266, term465266.getClass(), "speed", 2026259813);
        setIntField(term465266, term465266.getClass(), "tacticSpeed", 1869405361);
        setIntField(term465266, term465266.getClass(), "scannerRange", -1535999317);
        setIntField(term465266, term465266.getClass(), "cloakDetection", -1668505013);
        setIntField(term465266, term465266.getClass(), "cloaking", -180162862);
        setIntField(term465266, term465266.getClass(), "defenseValue", -912795408);
        setIntField(term465266, term465266.getClass(), "baySize", -2050437434);
        setIntField(term465266, term465266.getClass(), "damage", -22408249);
        setIntField(term465266, term465266.getClass(), "weaponRange", 448698422);
        setIntField(term465266, term465266.getClass(), "initiativeBoost", -2016448879);
        setIntField(term465266, term465266.getClass(), "cultureBonus", -433794574);
        setIntField(term465266, term465266.getClass(), "creditBonus", -556957666);
        setIntField(term465266, term465266.getClass(), "researchBonus", 255448931);
        setIntField(term465266, term465266.getClass(), "espionageBonus", 389248106);
        setIntField(term465266, term465266.getClass(), "fleetCapacityBonus", 1115142984);
        setIntField(term465266, term465266.getClass(), "hitBonus", 1661328229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term465266, args);
    }

};


