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

public class ShipComponent_getScannerRange_159741735321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470284;

    public ShipComponent_getScannerRange_159741735321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term470337 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term470336 = ((Class) term470337).getDeclaredField((String) "COLONY_MODULE");
        ((Field) term470336).setAccessible(true);
        Object enum1493 = ((Field) term470336).get((Object) null);
        term470284 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term470284, term470284.getClass(), "index", -1298705021);
        setField(term470284, term470284.getClass(), "type", enum1493);
        setIntField(term470284, term470284.getClass(), "cost", 802170906);
        setIntField(term470284, term470284.getClass(), "metalCost", 39907880);
        setField(term470284, term470284.getClass(), "name", "zYXwtgtXdm");
        setIntField(term470284, term470284.getClass(), "energyRequirement", 358366676);
        setIntField(term470284, term470284.getClass(), "energyResource", -18998104);
        setIntField(term470284, term470284.getClass(), "ftlSpeed", -1335254334);
        setIntField(term470284, term470284.getClass(), "speed", 2039605156);
        setIntField(term470284, term470284.getClass(), "tacticSpeed", -1335894442);
        setIntField(term470284, term470284.getClass(), "scannerRange", 269878407);
        setIntField(term470284, term470284.getClass(), "cloakDetection", 1951853449);
        setIntField(term470284, term470284.getClass(), "cloaking", -1576630796);
        setIntField(term470284, term470284.getClass(), "defenseValue", -1476732663);
        setIntField(term470284, term470284.getClass(), "baySize", 1985555115);
        setIntField(term470284, term470284.getClass(), "damage", 2017881557);
        setIntField(term470284, term470284.getClass(), "weaponRange", 1409539871);
        setIntField(term470284, term470284.getClass(), "initiativeBoost", -252004629);
        setIntField(term470284, term470284.getClass(), "cultureBonus", 1176748358);
        setIntField(term470284, term470284.getClass(), "creditBonus", -888350999);
        setIntField(term470284, term470284.getClass(), "researchBonus", 2010116469);
        setIntField(term470284, term470284.getClass(), "espionageBonus", 564948);
        setIntField(term470284, term470284.getClass(), "fleetCapacityBonus", -515527615);
        setIntField(term470284, term470284.getClass(), "hitBonus", 1444212583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScannerRange", argTypes, term470284, args);
    }

};


