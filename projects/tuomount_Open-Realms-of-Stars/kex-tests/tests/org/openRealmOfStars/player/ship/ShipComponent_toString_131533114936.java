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

public class ShipComponent_toString_131533114936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475608;

    public ShipComponent_toString_131533114936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term475653 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term475652 = ((Class) term475653).getDeclaredField((String) "HEART");
        ((Field) term475652).setAccessible(true);
        Object enum1508 = ((Field) term475652).get((Object) null);
        term475608 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term475608, term475608.getClass(), "index", 957395270);
        setField(term475608, term475608.getClass(), "type", enum1508);
        setIntField(term475608, term475608.getClass(), "cost", -1969074333);
        setIntField(term475608, term475608.getClass(), "metalCost", 1826327602);
        setField(term475608, term475608.getClass(), "name", "MBtdiVGKPd");
        setIntField(term475608, term475608.getClass(), "energyRequirement", 374724967);
        setIntField(term475608, term475608.getClass(), "energyResource", 973041410);
        setIntField(term475608, term475608.getClass(), "ftlSpeed", -1310460501);
        setIntField(term475608, term475608.getClass(), "speed", 1679642951);
        setIntField(term475608, term475608.getClass(), "tacticSpeed", 1302045483);
        setIntField(term475608, term475608.getClass(), "scannerRange", 235493269);
        setIntField(term475608, term475608.getClass(), "cloakDetection", -1369863592);
        setIntField(term475608, term475608.getClass(), "cloaking", 837333114);
        setIntField(term475608, term475608.getClass(), "defenseValue", -1247356641);
        setIntField(term475608, term475608.getClass(), "baySize", 1915680547);
        setIntField(term475608, term475608.getClass(), "damage", 417717738);
        setIntField(term475608, term475608.getClass(), "weaponRange", 216138319);
        setIntField(term475608, term475608.getClass(), "initiativeBoost", 242714390);
        setIntField(term475608, term475608.getClass(), "cultureBonus", 811289212);
        setIntField(term475608, term475608.getClass(), "creditBonus", 700677049);
        setIntField(term475608, term475608.getClass(), "researchBonus", -36401038);
        setIntField(term475608, term475608.getClass(), "espionageBonus", 1242416043);
        setIntField(term475608, term475608.getClass(), "fleetCapacityBonus", 490059166);
        setIntField(term475608, term475608.getClass(), "hitBonus", 672479272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term475608, args);
    }

};


