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

public class ShipComponent_setHitBonus_173739255050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480584;
     Object term480634;

    public ShipComponent_setHitBonus_173739255050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term480637 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term480636 = ((Class) term480637).getDeclaredField((String) "WEAPON_BEAM");
        ((Field) term480636).setAccessible(true);
        Object enum1522 = ((Field) term480636).get((Object) null);
        term480584 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term480584, term480584.getClass(), "index", -998359895);
        setField(term480584, term480584.getClass(), "type", enum1522);
        setIntField(term480584, term480584.getClass(), "cost", -578729253);
        setIntField(term480584, term480584.getClass(), "metalCost", 1220247325);
        setField(term480584, term480584.getClass(), "name", "HktXumuvFp");
        setIntField(term480584, term480584.getClass(), "energyRequirement", 1778196538);
        setIntField(term480584, term480584.getClass(), "energyResource", 1744440592);
        setIntField(term480584, term480584.getClass(), "ftlSpeed", 1945121505);
        setIntField(term480584, term480584.getClass(), "speed", -944730326);
        setIntField(term480584, term480584.getClass(), "tacticSpeed", -1773155590);
        setIntField(term480584, term480584.getClass(), "scannerRange", 153561632);
        setIntField(term480584, term480584.getClass(), "cloakDetection", 216386937);
        setIntField(term480584, term480584.getClass(), "cloaking", -261620665);
        setIntField(term480584, term480584.getClass(), "defenseValue", -406858348);
        setIntField(term480584, term480584.getClass(), "baySize", 533081936);
        setIntField(term480584, term480584.getClass(), "damage", -418681567);
        setIntField(term480584, term480584.getClass(), "weaponRange", -1387152349);
        setIntField(term480584, term480584.getClass(), "initiativeBoost", -1513582711);
        setIntField(term480584, term480584.getClass(), "cultureBonus", -1229638409);
        setIntField(term480584, term480584.getClass(), "creditBonus", 2066431097);
        setIntField(term480584, term480584.getClass(), "researchBonus", 2133764630);
        setIntField(term480584, term480584.getClass(), "espionageBonus", -1522058627);
        setIntField(term480584, term480584.getClass(), "fleetCapacityBonus", 353441774);
        setIntField(term480584, term480584.getClass(), "hitBonus", -1461119207);
        term480634 = new Integer(1443058018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term480634;
        callMethod(klass, "setHitBonus", argTypes, term480584, args);
    }

};


