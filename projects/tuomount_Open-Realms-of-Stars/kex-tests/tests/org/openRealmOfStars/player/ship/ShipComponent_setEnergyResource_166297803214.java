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
import java.lang.Integer;

public class ShipComponent_setEnergyResource_166297803214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467774;
     Object term467825;

    public ShipComponent_setEnergyResource_166297803214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term467828 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term467827 = ((Class) term467828).getDeclaredField((String) "TRACTOR_BEAM");
        ((Field) term467827).setAccessible(true);
        Object enum1486 = ((Field) term467827).get((Object) null);
        term467774 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term467774, term467774.getClass(), "index", 78410083);
        setField(term467774, term467774.getClass(), "type", enum1486);
        setIntField(term467774, term467774.getClass(), "cost", -1308398792);
        setIntField(term467774, term467774.getClass(), "metalCost", 1624205154);
        setField(term467774, term467774.getClass(), "name", "kdycGrdEWG");
        setIntField(term467774, term467774.getClass(), "energyRequirement", 872444404);
        setIntField(term467774, term467774.getClass(), "energyResource", 1400687352);
        setIntField(term467774, term467774.getClass(), "ftlSpeed", 1391309255);
        setIntField(term467774, term467774.getClass(), "speed", 437885281);
        setIntField(term467774, term467774.getClass(), "tacticSpeed", 1144296384);
        setIntField(term467774, term467774.getClass(), "scannerRange", 375541509);
        setIntField(term467774, term467774.getClass(), "cloakDetection", 1549543162);
        setIntField(term467774, term467774.getClass(), "cloaking", -893278459);
        setIntField(term467774, term467774.getClass(), "defenseValue", -2086759387);
        setIntField(term467774, term467774.getClass(), "baySize", -1639130879);
        setIntField(term467774, term467774.getClass(), "damage", -1439372378);
        setIntField(term467774, term467774.getClass(), "weaponRange", -1838240610);
        setIntField(term467774, term467774.getClass(), "initiativeBoost", 676840233);
        setIntField(term467774, term467774.getClass(), "cultureBonus", -125724279);
        setIntField(term467774, term467774.getClass(), "creditBonus", -1125931561);
        setIntField(term467774, term467774.getClass(), "researchBonus", -1395442669);
        setIntField(term467774, term467774.getClass(), "espionageBonus", 868823701);
        setIntField(term467774, term467774.getClass(), "fleetCapacityBonus", 588180);
        setIntField(term467774, term467774.getClass(), "hitBonus", 1798567411);
        term467825 = new Integer(-1507879623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term467825;
        callMethod(klass, "setEnergyResource", argTypes, term467774, args);
    }

};


