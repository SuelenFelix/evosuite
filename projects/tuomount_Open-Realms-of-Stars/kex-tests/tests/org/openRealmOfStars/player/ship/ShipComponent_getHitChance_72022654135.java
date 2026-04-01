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

public class ShipComponent_getHitChance_72022654135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475258;

    public ShipComponent_getHitChance_72022654135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term475309 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term475308 = ((Class) term475309).getDeclaredField((String) "PLASMA_SPIT");
        ((Field) term475308).setAccessible(true);
        Object enum1507 = ((Field) term475308).get((Object) null);
        term475258 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term475258, term475258.getClass(), "index", -1162950143);
        setField(term475258, term475258.getClass(), "type", enum1507);
        setIntField(term475258, term475258.getClass(), "cost", 211497672);
        setIntField(term475258, term475258.getClass(), "metalCost", -1763728099);
        setField(term475258, term475258.getClass(), "name", "PJZSvisrOr");
        setIntField(term475258, term475258.getClass(), "energyRequirement", 535763464);
        setIntField(term475258, term475258.getClass(), "energyResource", 369176479);
        setIntField(term475258, term475258.getClass(), "ftlSpeed", -968433681);
        setIntField(term475258, term475258.getClass(), "speed", 905327545);
        setIntField(term475258, term475258.getClass(), "tacticSpeed", 1664191791);
        setIntField(term475258, term475258.getClass(), "scannerRange", -427560957);
        setIntField(term475258, term475258.getClass(), "cloakDetection", -581810177);
        setIntField(term475258, term475258.getClass(), "cloaking", -285538295);
        setIntField(term475258, term475258.getClass(), "defenseValue", -901566153);
        setIntField(term475258, term475258.getClass(), "baySize", -1797034561);
        setIntField(term475258, term475258.getClass(), "damage", -258947595);
        setIntField(term475258, term475258.getClass(), "weaponRange", 1492766673);
        setIntField(term475258, term475258.getClass(), "initiativeBoost", 768722873);
        setIntField(term475258, term475258.getClass(), "cultureBonus", 1881997045);
        setIntField(term475258, term475258.getClass(), "creditBonus", -208521759);
        setIntField(term475258, term475258.getClass(), "researchBonus", -1398952792);
        setIntField(term475258, term475258.getClass(), "espionageBonus", 207531746);
        setIntField(term475258, term475258.getClass(), "fleetCapacityBonus", -898437128);
        setIntField(term475258, term475258.getClass(), "hitBonus", 1644653752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHitChance", argTypes, term475258, args);
    }

};


