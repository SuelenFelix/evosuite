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

public class Building_getScanRange_141003828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16493;

    public Building_getScanRange_141003828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16567 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term16566 = ((Class) term16567).getDeclaredField((String) "MILITARY");
        ((Field) term16566).setAccessible(true);
        Object enum36 = ((Field) term16566).get((Object) null);
        term16493 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term16493, term16493.getClass(), "type", enum36);
        setIntField(term16493, term16493.getClass(), "farmBonus", 40571662);
        setIntField(term16493, term16493.getClass(), "waterBonus", 1863910269);
        setIntField(term16493, term16493.getClass(), "mineBonus", 864645689);
        setIntField(term16493, term16493.getClass(), "factBonus", 279384872);
        setIntField(term16493, term16493.getClass(), "cultBonus", 1427305953);
        setIntField(term16493, term16493.getClass(), "reseBonus", -781832877);
        setIntField(term16493, term16493.getClass(), "credBonus", 797203987);
        setIntField(term16493, term16493.getClass(), "happinessBonus", 1973060703);
        setIntField(term16493, term16493.getClass(), "materialBonus", -138239905);
        setDoubleField(term16493, term16493.getClass(), "maintenanceCost", 0.10667076642995188);
        setBooleanField(term16493, term16493.getClass(), "singleAllowed", true);
        setBooleanField(term16493, term16493.getClass(), "scientificAchievement", false);
        setBooleanField(term16493, term16493.getClass(), "broadcaster", true);
        setBooleanField(term16493, term16493.getClass(), "orbitalElevator", false);
        setIntField(term16493, term16493.getClass(), "battleBonus", 1709474063);
        setIntField(term16493, term16493.getClass(), "defenseDamage", 1406617209);
        setIntField(term16493, term16493.getClass(), "scanRange", 1706047059);
        setIntField(term16493, term16493.getClass(), "scanCloakingDetection", 590451710);
        setIntField(term16493, term16493.getClass(), "fleetCapacityBonus", -1999787419);
        setIntField(term16493, term16493.getClass(), "recycleBonus", -1224443634);
        setIntField(term16493, term16493.getClass(), "ancientArtifactResearch", 1048451946);
        setIntField(term16493, term16493.getClass(), "wildLifePower", 5603560);
        setField(term16493, term16493.getClass(), "name", "OYbzXylRWW");
        setField(term16493, term16493.getClass(), "iconId", "DSNsTGYXDF");
        setField(term16493, term16493.getClass(), "description", "sQvGcVjdEx");
        setIntField(term16493, term16493.getClass(), "prodCost", -1079020032);
        setIntField(term16493, term16493.getClass(), "metalCost", -1973791064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScanRange", argTypes, term16493, args);
    }

};


