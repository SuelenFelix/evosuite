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

public class Building_setScanCloakingDetection_105170861833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18656;
     Object term18726;

    public Building_setScanCloakingDetection_105170861833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18729 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term18728 = ((Class) term18729).getDeclaredField((String) "WATER");
        ((Field) term18728).setAccessible(true);
        Object enum41 = ((Field) term18728).get((Object) null);
        term18656 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term18656, term18656.getClass(), "type", enum41);
        setIntField(term18656, term18656.getClass(), "farmBonus", -995785731);
        setIntField(term18656, term18656.getClass(), "waterBonus", 1349815364);
        setIntField(term18656, term18656.getClass(), "mineBonus", 2128383340);
        setIntField(term18656, term18656.getClass(), "factBonus", 1238598518);
        setIntField(term18656, term18656.getClass(), "cultBonus", -558146961);
        setIntField(term18656, term18656.getClass(), "reseBonus", 1505480070);
        setIntField(term18656, term18656.getClass(), "credBonus", -829088844);
        setIntField(term18656, term18656.getClass(), "happinessBonus", -31751777);
        setIntField(term18656, term18656.getClass(), "materialBonus", -246967963);
        setDoubleField(term18656, term18656.getClass(), "maintenanceCost", 0.6300849762307866);
        setBooleanField(term18656, term18656.getClass(), "singleAllowed", true);
        setBooleanField(term18656, term18656.getClass(), "scientificAchievement", false);
        setBooleanField(term18656, term18656.getClass(), "broadcaster", false);
        setBooleanField(term18656, term18656.getClass(), "orbitalElevator", true);
        setIntField(term18656, term18656.getClass(), "battleBonus", -1777140369);
        setIntField(term18656, term18656.getClass(), "defenseDamage", 993627098);
        setIntField(term18656, term18656.getClass(), "scanRange", 872295704);
        setIntField(term18656, term18656.getClass(), "scanCloakingDetection", 86041387);
        setIntField(term18656, term18656.getClass(), "fleetCapacityBonus", 1010721666);
        setIntField(term18656, term18656.getClass(), "recycleBonus", 27043781);
        setIntField(term18656, term18656.getClass(), "ancientArtifactResearch", -1367122405);
        setIntField(term18656, term18656.getClass(), "wildLifePower", -1703625118);
        setField(term18656, term18656.getClass(), "name", "ekxGuOYIwi");
        setField(term18656, term18656.getClass(), "iconId", "RbVQXSpxXy");
        setField(term18656, term18656.getClass(), "description", "YpJbIgJWWv");
        setIntField(term18656, term18656.getClass(), "prodCost", 1104108112);
        setIntField(term18656, term18656.getClass(), "metalCost", 1648665618);
        term18726 = new Integer(633765954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18726;
        callMethod(klass, "setScanCloakingDetection", argTypes, term18656, args);
    }

};


