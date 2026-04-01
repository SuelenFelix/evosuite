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

public class Building_setFarmBonus_14853230053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2387;
     Object term2456;

    public Building_setFarmBonus_14853230053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2459 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term2458 = ((Class) term2459).getDeclaredField((String) "MINE");
        ((Field) term2458).setAccessible(true);
        Object enum3 = ((Field) term2458).get((Object) null);
        term2387 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term2387, term2387.getClass(), "type", enum3);
        setIntField(term2387, term2387.getClass(), "farmBonus", -1588772968);
        setIntField(term2387, term2387.getClass(), "waterBonus", -93135961);
        setIntField(term2387, term2387.getClass(), "mineBonus", -112921587);
        setIntField(term2387, term2387.getClass(), "factBonus", 933028652);
        setIntField(term2387, term2387.getClass(), "cultBonus", 287287233);
        setIntField(term2387, term2387.getClass(), "reseBonus", 962840079);
        setIntField(term2387, term2387.getClass(), "credBonus", 1540719661);
        setIntField(term2387, term2387.getClass(), "happinessBonus", 1265463001);
        setIntField(term2387, term2387.getClass(), "materialBonus", 335112684);
        setDoubleField(term2387, term2387.getClass(), "maintenanceCost", 0.5523635872663106);
        setBooleanField(term2387, term2387.getClass(), "singleAllowed", false);
        setBooleanField(term2387, term2387.getClass(), "scientificAchievement", true);
        setBooleanField(term2387, term2387.getClass(), "broadcaster", false);
        setBooleanField(term2387, term2387.getClass(), "orbitalElevator", true);
        setIntField(term2387, term2387.getClass(), "battleBonus", 1551099402);
        setIntField(term2387, term2387.getClass(), "defenseDamage", -2027534003);
        setIntField(term2387, term2387.getClass(), "scanRange", 1063420942);
        setIntField(term2387, term2387.getClass(), "scanCloakingDetection", 1375330971);
        setIntField(term2387, term2387.getClass(), "fleetCapacityBonus", -478195677);
        setIntField(term2387, term2387.getClass(), "recycleBonus", 972867650);
        setIntField(term2387, term2387.getClass(), "ancientArtifactResearch", 1655935355);
        setIntField(term2387, term2387.getClass(), "wildLifePower", -481533957);
        setField(term2387, term2387.getClass(), "name", "UoYtihxVaS");
        setField(term2387, term2387.getClass(), "iconId", "JDswTTCZHV");
        setField(term2387, term2387.getClass(), "description", "onpbIeEKoi");
        setIntField(term2387, term2387.getClass(), "prodCost", 1240914516);
        setIntField(term2387, term2387.getClass(), "metalCost", -1465035361);
        term2456 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2456;
        callMethod(klass, "setFarmBonus", argTypes, term2387, args);
    }

};


