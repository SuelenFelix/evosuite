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

public class Building_getScientificAchievement_42642894435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19522;

    public Building_getScientificAchievement_42642894435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19596 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term19595 = ((Class) term19596).getDeclaredField((String) "MILITARY");
        ((Field) term19595).setAccessible(true);
        Object enum43 = ((Field) term19595).get((Object) null);
        term19522 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term19522, term19522.getClass(), "type", enum43);
        setIntField(term19522, term19522.getClass(), "farmBonus", -751079123);
        setIntField(term19522, term19522.getClass(), "waterBonus", -110837188);
        setIntField(term19522, term19522.getClass(), "mineBonus", -271094506);
        setIntField(term19522, term19522.getClass(), "factBonus", 455632030);
        setIntField(term19522, term19522.getClass(), "cultBonus", -1632929393);
        setIntField(term19522, term19522.getClass(), "reseBonus", -431440129);
        setIntField(term19522, term19522.getClass(), "credBonus", -763576148);
        setIntField(term19522, term19522.getClass(), "happinessBonus", 1568948514);
        setIntField(term19522, term19522.getClass(), "materialBonus", -1511130237);
        setDoubleField(term19522, term19522.getClass(), "maintenanceCost", 0.0668892744806211);
        setBooleanField(term19522, term19522.getClass(), "singleAllowed", true);
        setBooleanField(term19522, term19522.getClass(), "scientificAchievement", true);
        setBooleanField(term19522, term19522.getClass(), "broadcaster", false);
        setBooleanField(term19522, term19522.getClass(), "orbitalElevator", true);
        setIntField(term19522, term19522.getClass(), "battleBonus", 452088587);
        setIntField(term19522, term19522.getClass(), "defenseDamage", -1630069454);
        setIntField(term19522, term19522.getClass(), "scanRange", 1499735894);
        setIntField(term19522, term19522.getClass(), "scanCloakingDetection", 716486048);
        setIntField(term19522, term19522.getClass(), "fleetCapacityBonus", -466708718);
        setIntField(term19522, term19522.getClass(), "recycleBonus", 1038029515);
        setIntField(term19522, term19522.getClass(), "ancientArtifactResearch", 1137154606);
        setIntField(term19522, term19522.getClass(), "wildLifePower", -100681578);
        setField(term19522, term19522.getClass(), "name", "vKQukfbJUd");
        setField(term19522, term19522.getClass(), "iconId", "lFRJFUMVbx");
        setField(term19522, term19522.getClass(), "description", "sZdUNdggUW");
        setIntField(term19522, term19522.getClass(), "prodCost", 296568835);
        setIntField(term19522, term19522.getClass(), "metalCost", 1431951992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScientificAchievement", argTypes, term19522, args);
    }

};


