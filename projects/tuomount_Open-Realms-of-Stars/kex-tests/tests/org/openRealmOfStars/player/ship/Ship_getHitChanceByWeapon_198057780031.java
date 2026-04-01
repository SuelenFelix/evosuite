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

public class Ship_getHitChanceByWeapon_198057780031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647279;

    public Ship_getHitChanceByWeapon_198057780031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term647338 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term647337 = ((Class) term647338).getDeclaredField((String) "PRIVATEERING_MODULE");
        ((Field) term647337).setAccessible(true);
        Object enum2057 = ((Field) term647337).get((Object) null);
        term647279 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term647279, term647279.getClass(), "index", -348432573);
        setField(term647279, term647279.getClass(), "type", enum2057);
        setIntField(term647279, term647279.getClass(), "cost", -790220684);
        setIntField(term647279, term647279.getClass(), "metalCost", -1136429703);
        setField(term647279, term647279.getClass(), "name", "LnWYjuNTLD");
        setIntField(term647279, term647279.getClass(), "energyRequirement", 1641910855);
        setIntField(term647279, term647279.getClass(), "energyResource", -931705492);
        setIntField(term647279, term647279.getClass(), "ftlSpeed", -1080465792);
        setIntField(term647279, term647279.getClass(), "speed", -1135972176);
        setIntField(term647279, term647279.getClass(), "tacticSpeed", -2059730428);
        setIntField(term647279, term647279.getClass(), "scannerRange", -549676791);
        setIntField(term647279, term647279.getClass(), "cloakDetection", -156722358);
        setIntField(term647279, term647279.getClass(), "cloaking", 284639590);
        setIntField(term647279, term647279.getClass(), "defenseValue", 1183720893);
        setIntField(term647279, term647279.getClass(), "baySize", -2070454841);
        setIntField(term647279, term647279.getClass(), "damage", -1979379044);
        setIntField(term647279, term647279.getClass(), "weaponRange", -819678964);
        setIntField(term647279, term647279.getClass(), "initiativeBoost", 789003717);
        setIntField(term647279, term647279.getClass(), "cultureBonus", -1194710271);
        setIntField(term647279, term647279.getClass(), "creditBonus", 1397618451);
        setIntField(term647279, term647279.getClass(), "researchBonus", -781404647);
        setIntField(term647279, term647279.getClass(), "espionageBonus", 184970542);
        setIntField(term647279, term647279.getClass(), "fleetCapacityBonus", -1573176387);
        setIntField(term647279, term647279.getClass(), "hitBonus", -46543611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Object[] args = new Object[1];
        args[0] = term647279;
        callMethod(klass, "getHitChanceByWeapon", argTypes, null, args);
    }

};


