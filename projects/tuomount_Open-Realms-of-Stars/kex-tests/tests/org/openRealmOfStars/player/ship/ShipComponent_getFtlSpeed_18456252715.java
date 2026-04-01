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

public class ShipComponent_getFtlSpeed_18456252715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468130;

    public ShipComponent_getFtlSpeed_18456252715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term468181 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term468180 = ((Class) term468181).getDeclaredField((String) "FIGHTER_BAY");
        ((Field) term468180).setAccessible(true);
        Object enum1487 = ((Field) term468180).get((Object) null);
        term468130 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term468130, term468130.getClass(), "index", 727263670);
        setField(term468130, term468130.getClass(), "type", enum1487);
        setIntField(term468130, term468130.getClass(), "cost", -2042954517);
        setIntField(term468130, term468130.getClass(), "metalCost", -1585735136);
        setField(term468130, term468130.getClass(), "name", "NAESUvpOAY");
        setIntField(term468130, term468130.getClass(), "energyRequirement", -202469528);
        setIntField(term468130, term468130.getClass(), "energyResource", -1147825822);
        setIntField(term468130, term468130.getClass(), "ftlSpeed", -192227369);
        setIntField(term468130, term468130.getClass(), "speed", 1203299299);
        setIntField(term468130, term468130.getClass(), "tacticSpeed", -115406772);
        setIntField(term468130, term468130.getClass(), "scannerRange", -1194681287);
        setIntField(term468130, term468130.getClass(), "cloakDetection", -24531941);
        setIntField(term468130, term468130.getClass(), "cloaking", 1265656841);
        setIntField(term468130, term468130.getClass(), "defenseValue", -1881871368);
        setIntField(term468130, term468130.getClass(), "baySize", -1725616340);
        setIntField(term468130, term468130.getClass(), "damage", 1579393316);
        setIntField(term468130, term468130.getClass(), "weaponRange", 291434697);
        setIntField(term468130, term468130.getClass(), "initiativeBoost", 1157245504);
        setIntField(term468130, term468130.getClass(), "cultureBonus", -1468740029);
        setIntField(term468130, term468130.getClass(), "creditBonus", 1419365246);
        setIntField(term468130, term468130.getClass(), "researchBonus", -591173078);
        setIntField(term468130, term468130.getClass(), "espionageBonus", 1565076807);
        setIntField(term468130, term468130.getClass(), "fleetCapacityBonus", 1016664474);
        setIntField(term468130, term468130.getClass(), "hitBonus", -1410426998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFtlSpeed", argTypes, term468130, args);
    }

};


