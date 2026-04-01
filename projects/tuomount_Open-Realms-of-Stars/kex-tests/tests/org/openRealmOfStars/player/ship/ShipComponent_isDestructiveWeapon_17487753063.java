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

public class ShipComponent_isDestructiveWeapon_17487753063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463810;

    public ShipComponent_isDestructiveWeapon_17487753063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term463863 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term463862 = ((Class) term463863).getDeclaredField((String) "COLONY_MODULE");
        ((Field) term463862).setAccessible(true);
        Object enum1475 = ((Field) term463862).get((Object) null);
        term463810 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term463810, term463810.getClass(), "index", -421652245);
        setField(term463810, term463810.getClass(), "type", enum1475);
        setIntField(term463810, term463810.getClass(), "cost", 1322177151);
        setIntField(term463810, term463810.getClass(), "metalCost", 233940754);
        setField(term463810, term463810.getClass(), "name", "rYcZdXyZVp");
        setIntField(term463810, term463810.getClass(), "energyRequirement", 193794265);
        setIntField(term463810, term463810.getClass(), "energyResource", 851696638);
        setIntField(term463810, term463810.getClass(), "ftlSpeed", 101083079);
        setIntField(term463810, term463810.getClass(), "speed", -389509495);
        setIntField(term463810, term463810.getClass(), "tacticSpeed", 1355682915);
        setIntField(term463810, term463810.getClass(), "scannerRange", -143860949);
        setIntField(term463810, term463810.getClass(), "cloakDetection", -199507260);
        setIntField(term463810, term463810.getClass(), "cloaking", 279510269);
        setIntField(term463810, term463810.getClass(), "defenseValue", 1637234291);
        setIntField(term463810, term463810.getClass(), "baySize", -653743992);
        setIntField(term463810, term463810.getClass(), "damage", 202545148);
        setIntField(term463810, term463810.getClass(), "weaponRange", 1455433906);
        setIntField(term463810, term463810.getClass(), "initiativeBoost", -503364604);
        setIntField(term463810, term463810.getClass(), "cultureBonus", -940394359);
        setIntField(term463810, term463810.getClass(), "creditBonus", 1125467468);
        setIntField(term463810, term463810.getClass(), "researchBonus", 2062219450);
        setIntField(term463810, term463810.getClass(), "espionageBonus", 1267978887);
        setIntField(term463810, term463810.getClass(), "fleetCapacityBonus", 1628831213);
        setIntField(term463810, term463810.getClass(), "hitBonus", -2028140041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDestructiveWeapon", argTypes, term463810, args);
    }

};


