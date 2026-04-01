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

public class ShipComponent_getFleetCapacityBonus_37016142545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478790;

    public ShipComponent_getFleetCapacityBonus_37016142545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term478837 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term478836 = ((Class) term478837).getDeclaredField((String) "SCANNER");
        ((Field) term478836).setAccessible(true);
        Object enum1517 = ((Field) term478836).get((Object) null);
        term478790 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term478790, term478790.getClass(), "index", -759603874);
        setField(term478790, term478790.getClass(), "type", enum1517);
        setIntField(term478790, term478790.getClass(), "cost", -854724842);
        setIntField(term478790, term478790.getClass(), "metalCost", 1250890819);
        setField(term478790, term478790.getClass(), "name", "JHsrcnGhTe");
        setIntField(term478790, term478790.getClass(), "energyRequirement", -1723849008);
        setIntField(term478790, term478790.getClass(), "energyResource", -5850264);
        setIntField(term478790, term478790.getClass(), "ftlSpeed", 1397968591);
        setIntField(term478790, term478790.getClass(), "speed", 1636497723);
        setIntField(term478790, term478790.getClass(), "tacticSpeed", 162449955);
        setIntField(term478790, term478790.getClass(), "scannerRange", -633552703);
        setIntField(term478790, term478790.getClass(), "cloakDetection", -144541448);
        setIntField(term478790, term478790.getClass(), "cloaking", 1604182220);
        setIntField(term478790, term478790.getClass(), "defenseValue", -1337178466);
        setIntField(term478790, term478790.getClass(), "baySize", 1589240744);
        setIntField(term478790, term478790.getClass(), "damage", 1935113637);
        setIntField(term478790, term478790.getClass(), "weaponRange", -792570091);
        setIntField(term478790, term478790.getClass(), "initiativeBoost", -840204320);
        setIntField(term478790, term478790.getClass(), "cultureBonus", 571759309);
        setIntField(term478790, term478790.getClass(), "creditBonus", -544118437);
        setIntField(term478790, term478790.getClass(), "researchBonus", -1070783506);
        setIntField(term478790, term478790.getClass(), "espionageBonus", 908939387);
        setIntField(term478790, term478790.getClass(), "fleetCapacityBonus", 546442739);
        setIntField(term478790, term478790.getClass(), "hitBonus", 986125029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetCapacityBonus", argTypes, term478790, args);
    }

};


