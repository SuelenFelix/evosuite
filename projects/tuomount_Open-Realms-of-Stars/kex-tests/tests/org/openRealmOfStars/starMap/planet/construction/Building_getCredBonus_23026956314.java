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

public class Building_getCredBonus_23026956314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7164;

    public Building_getCredBonus_23026956314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7237 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term7236 = ((Class) term7237).getDeclaredField((String) "FACTORY");
        ((Field) term7236).setAccessible(true);
        Object enum14 = ((Field) term7236).get((Object) null);
        term7164 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term7164, term7164.getClass(), "type", enum14);
        setIntField(term7164, term7164.getClass(), "farmBonus", -249614216);
        setIntField(term7164, term7164.getClass(), "waterBonus", 1870727665);
        setIntField(term7164, term7164.getClass(), "mineBonus", -519881101);
        setIntField(term7164, term7164.getClass(), "factBonus", -680920524);
        setIntField(term7164, term7164.getClass(), "cultBonus", -916335264);
        setIntField(term7164, term7164.getClass(), "reseBonus", -919416536);
        setIntField(term7164, term7164.getClass(), "credBonus", -43417861);
        setIntField(term7164, term7164.getClass(), "happinessBonus", -1533843432);
        setIntField(term7164, term7164.getClass(), "materialBonus", -123338791);
        setDoubleField(term7164, term7164.getClass(), "maintenanceCost", 0.1374549299694151);
        setBooleanField(term7164, term7164.getClass(), "singleAllowed", true);
        setBooleanField(term7164, term7164.getClass(), "scientificAchievement", false);
        setBooleanField(term7164, term7164.getClass(), "broadcaster", true);
        setBooleanField(term7164, term7164.getClass(), "orbitalElevator", false);
        setIntField(term7164, term7164.getClass(), "battleBonus", -1467089634);
        setIntField(term7164, term7164.getClass(), "defenseDamage", 413548937);
        setIntField(term7164, term7164.getClass(), "scanRange", 1901317214);
        setIntField(term7164, term7164.getClass(), "scanCloakingDetection", 1166710220);
        setIntField(term7164, term7164.getClass(), "fleetCapacityBonus", -1070592289);
        setIntField(term7164, term7164.getClass(), "recycleBonus", -1464172784);
        setIntField(term7164, term7164.getClass(), "ancientArtifactResearch", 32185364);
        setIntField(term7164, term7164.getClass(), "wildLifePower", 1768204942);
        setField(term7164, term7164.getClass(), "name", "LvJFtLBaxj");
        setField(term7164, term7164.getClass(), "iconId", "PHvxnGHptP");
        setField(term7164, term7164.getClass(), "description", "TimdotUuNC");
        setIntField(term7164, term7164.getClass(), "prodCost", 1252951645);
        setIntField(term7164, term7164.getClass(), "metalCost", 574481092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCredBonus", argTypes, term7164, args);
    }

};


