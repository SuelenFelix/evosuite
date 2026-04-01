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

public class ShipComponent_setFleetCapacityBonus_168573771346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479124;
     Object term479174;

    public ShipComponent_setFleetCapacityBonus_168573771346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term479177 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term479176 = ((Class) term479177).getDeclaredField((String) "PLASMA_SPIT");
        ((Field) term479176).setAccessible(true);
        Object enum1518 = ((Field) term479176).get((Object) null);
        term479124 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term479124, term479124.getClass(), "index", -242915796);
        setField(term479124, term479124.getClass(), "type", enum1518);
        setIntField(term479124, term479124.getClass(), "cost", 798178790);
        setIntField(term479124, term479124.getClass(), "metalCost", 1885105361);
        setField(term479124, term479124.getClass(), "name", "LaeKHifZJH");
        setIntField(term479124, term479124.getClass(), "energyRequirement", 406483559);
        setIntField(term479124, term479124.getClass(), "energyResource", -882073821);
        setIntField(term479124, term479124.getClass(), "ftlSpeed", -1619724361);
        setIntField(term479124, term479124.getClass(), "speed", -448769991);
        setIntField(term479124, term479124.getClass(), "tacticSpeed", -2115906125);
        setIntField(term479124, term479124.getClass(), "scannerRange", -1115852180);
        setIntField(term479124, term479124.getClass(), "cloakDetection", 410129937);
        setIntField(term479124, term479124.getClass(), "cloaking", -1826076292);
        setIntField(term479124, term479124.getClass(), "defenseValue", 1375700443);
        setIntField(term479124, term479124.getClass(), "baySize", -1592779289);
        setIntField(term479124, term479124.getClass(), "damage", -1382233254);
        setIntField(term479124, term479124.getClass(), "weaponRange", -52296693);
        setIntField(term479124, term479124.getClass(), "initiativeBoost", -1374309882);
        setIntField(term479124, term479124.getClass(), "cultureBonus", -1954550269);
        setIntField(term479124, term479124.getClass(), "creditBonus", 120683825);
        setIntField(term479124, term479124.getClass(), "researchBonus", 1923456353);
        setIntField(term479124, term479124.getClass(), "espionageBonus", -1649560697);
        setIntField(term479124, term479124.getClass(), "fleetCapacityBonus", 580727356);
        setIntField(term479124, term479124.getClass(), "hitBonus", -1703249761);
        term479174 = new Integer(-1444931808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term479174;
        callMethod(klass, "setFleetCapacityBonus", argTypes, term479124, args);
    }

};


