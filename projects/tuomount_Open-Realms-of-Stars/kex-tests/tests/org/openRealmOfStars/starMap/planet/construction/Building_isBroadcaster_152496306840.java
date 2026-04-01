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

public class Building_isBroadcaster_152496306840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21693;

    public Building_isBroadcaster_152496306840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21767 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term21766 = ((Class) term21767).getDeclaredField((String) "RESEARCH");
        ((Field) term21766).setAccessible(true);
        Object enum48 = ((Field) term21766).get((Object) null);
        term21693 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term21693, term21693.getClass(), "type", enum48);
        setIntField(term21693, term21693.getClass(), "farmBonus", 1630231519);
        setIntField(term21693, term21693.getClass(), "waterBonus", 1460702778);
        setIntField(term21693, term21693.getClass(), "mineBonus", -1398142433);
        setIntField(term21693, term21693.getClass(), "factBonus", -1112119058);
        setIntField(term21693, term21693.getClass(), "cultBonus", 2073858334);
        setIntField(term21693, term21693.getClass(), "reseBonus", -1693535639);
        setIntField(term21693, term21693.getClass(), "credBonus", 1344744036);
        setIntField(term21693, term21693.getClass(), "happinessBonus", -98060427);
        setIntField(term21693, term21693.getClass(), "materialBonus", -1272268399);
        setDoubleField(term21693, term21693.getClass(), "maintenanceCost", 0.22651340641904605);
        setBooleanField(term21693, term21693.getClass(), "singleAllowed", false);
        setBooleanField(term21693, term21693.getClass(), "scientificAchievement", false);
        setBooleanField(term21693, term21693.getClass(), "broadcaster", true);
        setBooleanField(term21693, term21693.getClass(), "orbitalElevator", false);
        setIntField(term21693, term21693.getClass(), "battleBonus", 1120271104);
        setIntField(term21693, term21693.getClass(), "defenseDamage", -128435804);
        setIntField(term21693, term21693.getClass(), "scanRange", 2136158480);
        setIntField(term21693, term21693.getClass(), "scanCloakingDetection", 2118747457);
        setIntField(term21693, term21693.getClass(), "fleetCapacityBonus", 1868344256);
        setIntField(term21693, term21693.getClass(), "recycleBonus", 1857693976);
        setIntField(term21693, term21693.getClass(), "ancientArtifactResearch", 1631305277);
        setIntField(term21693, term21693.getClass(), "wildLifePower", 162113491);
        setField(term21693, term21693.getClass(), "name", "BjugTaMcxJ");
        setField(term21693, term21693.getClass(), "iconId", "vGiuZVPJNH");
        setField(term21693, term21693.getClass(), "description", "tlzpzIjMib");
        setIntField(term21693, term21693.getClass(), "prodCost", -932147928);
        setIntField(term21693, term21693.getClass(), "metalCost", 487369012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBroadcaster", argTypes, term21693, args);
    }

};


