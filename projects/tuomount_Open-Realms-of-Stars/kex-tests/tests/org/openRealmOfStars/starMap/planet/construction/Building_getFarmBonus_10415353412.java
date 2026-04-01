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

public class Building_getFarmBonus_10415353412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1952;

    public Building_getFarmBonus_10415353412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2025 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term2024 = ((Class) term2025).getDeclaredField((String) "FACTORY");
        ((Field) term2024).setAccessible(true);
        Object enum2 = ((Field) term2024).get((Object) null);
        term1952 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term1952, term1952.getClass(), "type", enum2);
        setIntField(term1952, term1952.getClass(), "farmBonus", -1968847291);
        setIntField(term1952, term1952.getClass(), "waterBonus", 579005622);
        setIntField(term1952, term1952.getClass(), "mineBonus", -14890619);
        setIntField(term1952, term1952.getClass(), "factBonus", 1632125673);
        setIntField(term1952, term1952.getClass(), "cultBonus", 454281060);
        setIntField(term1952, term1952.getClass(), "reseBonus", -1786399638);
        setIntField(term1952, term1952.getClass(), "credBonus", 2055867847);
        setIntField(term1952, term1952.getClass(), "happinessBonus", -1048298087);
        setIntField(term1952, term1952.getClass(), "materialBonus", 292681826);
        setDoubleField(term1952, term1952.getClass(), "maintenanceCost", 0.3455959125047594);
        setBooleanField(term1952, term1952.getClass(), "singleAllowed", true);
        setBooleanField(term1952, term1952.getClass(), "scientificAchievement", true);
        setBooleanField(term1952, term1952.getClass(), "broadcaster", true);
        setBooleanField(term1952, term1952.getClass(), "orbitalElevator", true);
        setIntField(term1952, term1952.getClass(), "battleBonus", 458147407);
        setIntField(term1952, term1952.getClass(), "defenseDamage", -184153539);
        setIntField(term1952, term1952.getClass(), "scanRange", 493620644);
        setIntField(term1952, term1952.getClass(), "scanCloakingDetection", 1328271830);
        setIntField(term1952, term1952.getClass(), "fleetCapacityBonus", 1596070772);
        setIntField(term1952, term1952.getClass(), "recycleBonus", 97029295);
        setIntField(term1952, term1952.getClass(), "ancientArtifactResearch", -1371869594);
        setIntField(term1952, term1952.getClass(), "wildLifePower", -2095575670);
        setField(term1952, term1952.getClass(), "name", "jDtqGUpnZN");
        setField(term1952, term1952.getClass(), "iconId", "nGKItKLYNC");
        setField(term1952, term1952.getClass(), "description", "UiUYnPrcCi");
        setIntField(term1952, term1952.getClass(), "prodCost", 1225272962);
        setIntField(term1952, term1952.getClass(), "metalCost", 1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFarmBonus", argTypes, term1952, args);
    }

};


