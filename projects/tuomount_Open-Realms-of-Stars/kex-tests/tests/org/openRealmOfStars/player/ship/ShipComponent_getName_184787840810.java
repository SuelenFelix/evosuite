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

public class ShipComponent_getName_184787840810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466356;

    public ShipComponent_getName_184787840810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term466409 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term466408 = ((Class) term466409).getDeclaredField((String) "PLASMA_CANNON");
        ((Field) term466408).setAccessible(true);
        Object enum1482 = ((Field) term466408).get((Object) null);
        term466356 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term466356, term466356.getClass(), "index", 1016730846);
        setField(term466356, term466356.getClass(), "type", enum1482);
        setIntField(term466356, term466356.getClass(), "cost", -1082475050);
        setIntField(term466356, term466356.getClass(), "metalCost", 1725611156);
        setField(term466356, term466356.getClass(), "name", "nnMRBuOUoG");
        setIntField(term466356, term466356.getClass(), "energyRequirement", -709553672);
        setIntField(term466356, term466356.getClass(), "energyResource", -517614001);
        setIntField(term466356, term466356.getClass(), "ftlSpeed", 308141202);
        setIntField(term466356, term466356.getClass(), "speed", -1422788814);
        setIntField(term466356, term466356.getClass(), "tacticSpeed", 1870092235);
        setIntField(term466356, term466356.getClass(), "scannerRange", -348482192);
        setIntField(term466356, term466356.getClass(), "cloakDetection", -261423404);
        setIntField(term466356, term466356.getClass(), "cloaking", -64510316);
        setIntField(term466356, term466356.getClass(), "defenseValue", -1442185390);
        setIntField(term466356, term466356.getClass(), "baySize", 379077201);
        setIntField(term466356, term466356.getClass(), "damage", -1349144811);
        setIntField(term466356, term466356.getClass(), "weaponRange", 1721203580);
        setIntField(term466356, term466356.getClass(), "initiativeBoost", -1541596493);
        setIntField(term466356, term466356.getClass(), "cultureBonus", 530537769);
        setIntField(term466356, term466356.getClass(), "creditBonus", -1130731328);
        setIntField(term466356, term466356.getClass(), "researchBonus", 158445574);
        setIntField(term466356, term466356.getClass(), "espionageBonus", 1089267384);
        setIntField(term466356, term466356.getClass(), "fleetCapacityBonus", -1026397095);
        setIntField(term466356, term466356.getClass(), "hitBonus", -120229920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term466356, args);
    }

};


