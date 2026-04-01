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

public class ShipComponent_setResearchBonus_137411785044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478434;
     Object term478485;

    public ShipComponent_setResearchBonus_137411785044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term478488 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term478487 = ((Class) term478488).getDeclaredField((String) "ORBITAL_NUKE");
        ((Field) term478487).setAccessible(true);
        Object enum1516 = ((Field) term478487).get((Object) null);
        term478434 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term478434, term478434.getClass(), "index", 1640365049);
        setField(term478434, term478434.getClass(), "type", enum1516);
        setIntField(term478434, term478434.getClass(), "cost", 1288816449);
        setIntField(term478434, term478434.getClass(), "metalCost", 1261399430);
        setField(term478434, term478434.getClass(), "name", "DEbtEvScYS");
        setIntField(term478434, term478434.getClass(), "energyRequirement", 1575653315);
        setIntField(term478434, term478434.getClass(), "energyResource", 2116845908);
        setIntField(term478434, term478434.getClass(), "ftlSpeed", 936161131);
        setIntField(term478434, term478434.getClass(), "speed", -691701814);
        setIntField(term478434, term478434.getClass(), "tacticSpeed", 1510066525);
        setIntField(term478434, term478434.getClass(), "scannerRange", 1469611278);
        setIntField(term478434, term478434.getClass(), "cloakDetection", -1162670035);
        setIntField(term478434, term478434.getClass(), "cloaking", -1451867244);
        setIntField(term478434, term478434.getClass(), "defenseValue", 559904906);
        setIntField(term478434, term478434.getClass(), "baySize", 393431288);
        setIntField(term478434, term478434.getClass(), "damage", 644691432);
        setIntField(term478434, term478434.getClass(), "weaponRange", -531017774);
        setIntField(term478434, term478434.getClass(), "initiativeBoost", 854607935);
        setIntField(term478434, term478434.getClass(), "cultureBonus", -1266627939);
        setIntField(term478434, term478434.getClass(), "creditBonus", 1228954206);
        setIntField(term478434, term478434.getClass(), "researchBonus", 43427568);
        setIntField(term478434, term478434.getClass(), "espionageBonus", -887356821);
        setIntField(term478434, term478434.getClass(), "fleetCapacityBonus", 1123610004);
        setIntField(term478434, term478434.getClass(), "hitBonus", 184496760);
        term478485 = new Integer(-903785659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term478485;
        callMethod(klass, "setResearchBonus", argTypes, term478434, args);
    }

};


