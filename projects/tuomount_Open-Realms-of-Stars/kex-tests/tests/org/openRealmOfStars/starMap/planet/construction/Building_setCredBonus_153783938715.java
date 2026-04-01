package org.openRealmOfStars.starMap.planet.construction;

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
import static org.openRealmOfStars.starMap.planet.construction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Building_setCredBonus_153783938715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7599;
     Object term7668;

    public Building_setCredBonus_153783938715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7671 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term7670 = ((Class) term7671).getDeclaredField((String) "FARM");
        ((Field) term7670).setAccessible(true);
        Object enum15 = ((Field) term7670).get((Object) null);
        term7599 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term7599, term7599.getClass(), "type", enum15);
        setIntField(term7599, term7599.getClass(), "farmBonus", -310528004);
        setIntField(term7599, term7599.getClass(), "waterBonus", -634976996);
        setIntField(term7599, term7599.getClass(), "mineBonus", -1015274146);
        setIntField(term7599, term7599.getClass(), "factBonus", -49052672);
        setIntField(term7599, term7599.getClass(), "cultBonus", 339372704);
        setIntField(term7599, term7599.getClass(), "reseBonus", -851097944);
        setIntField(term7599, term7599.getClass(), "credBonus", 803925431);
        setIntField(term7599, term7599.getClass(), "happinessBonus", 76929641);
        setIntField(term7599, term7599.getClass(), "materialBonus", -2003192918);
        setDoubleField(term7599, term7599.getClass(), "maintenanceCost", 0.7031006357544823);
        setBooleanField(term7599, term7599.getClass(), "singleAllowed", false);
        setBooleanField(term7599, term7599.getClass(), "scientificAchievement", true);
        setBooleanField(term7599, term7599.getClass(), "broadcaster", false);
        setBooleanField(term7599, term7599.getClass(), "orbitalElevator", false);
        setIntField(term7599, term7599.getClass(), "battleBonus", -1362856620);
        setIntField(term7599, term7599.getClass(), "defenseDamage", -1835839814);
        setIntField(term7599, term7599.getClass(), "scanRange", -1404350380);
        setIntField(term7599, term7599.getClass(), "scanCloakingDetection", -2013924238);
        setIntField(term7599, term7599.getClass(), "fleetCapacityBonus", 579006268);
        setIntField(term7599, term7599.getClass(), "recycleBonus", -1694747156);
        setIntField(term7599, term7599.getClass(), "ancientArtifactResearch", 1466373988);
        setIntField(term7599, term7599.getClass(), "wildLifePower", -358526505);
        setField(term7599, term7599.getClass(), "name", "PkWMRdJcBb");
        setField(term7599, term7599.getClass(), "iconId", "jSpAteRute");
        setField(term7599, term7599.getClass(), "description", "swZVeJAxjt");
        setIntField(term7599, term7599.getClass(), "prodCost", 1843268026);
        setIntField(term7599, term7599.getClass(), "metalCost", 954660603);
        term7668 = new Integer(-1351605385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7668;
        callMethod(klass, "setCredBonus", argTypes, term7599, args);
    }

};


