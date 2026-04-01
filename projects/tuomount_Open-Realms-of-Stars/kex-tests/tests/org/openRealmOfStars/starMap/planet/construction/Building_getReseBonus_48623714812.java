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

public class Building_getReseBonus_48623714812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6296;

    public Building_getReseBonus_48623714812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6369 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term6368 = ((Class) term6369).getDeclaredField((String) "FACTORY");
        ((Field) term6368).setAccessible(true);
        Object enum12 = ((Field) term6368).get((Object) null);
        term6296 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term6296, term6296.getClass(), "type", enum12);
        setIntField(term6296, term6296.getClass(), "farmBonus", 534834644);
        setIntField(term6296, term6296.getClass(), "waterBonus", 1959097203);
        setIntField(term6296, term6296.getClass(), "mineBonus", -209654048);
        setIntField(term6296, term6296.getClass(), "factBonus", 477625804);
        setIntField(term6296, term6296.getClass(), "cultBonus", 252575029);
        setIntField(term6296, term6296.getClass(), "reseBonus", 57189932);
        setIntField(term6296, term6296.getClass(), "credBonus", 1460722225);
        setIntField(term6296, term6296.getClass(), "happinessBonus", 1743224434);
        setIntField(term6296, term6296.getClass(), "materialBonus", 842904495);
        setDoubleField(term6296, term6296.getClass(), "maintenanceCost", 0.5183269973490326);
        setBooleanField(term6296, term6296.getClass(), "singleAllowed", false);
        setBooleanField(term6296, term6296.getClass(), "scientificAchievement", true);
        setBooleanField(term6296, term6296.getClass(), "broadcaster", true);
        setBooleanField(term6296, term6296.getClass(), "orbitalElevator", true);
        setIntField(term6296, term6296.getClass(), "battleBonus", 1008080511);
        setIntField(term6296, term6296.getClass(), "defenseDamage", 1935707624);
        setIntField(term6296, term6296.getClass(), "scanRange", 1507074215);
        setIntField(term6296, term6296.getClass(), "scanCloakingDetection", -282881827);
        setIntField(term6296, term6296.getClass(), "fleetCapacityBonus", -1183353915);
        setIntField(term6296, term6296.getClass(), "recycleBonus", -420030135);
        setIntField(term6296, term6296.getClass(), "ancientArtifactResearch", 267763294);
        setIntField(term6296, term6296.getClass(), "wildLifePower", -1497710478);
        setField(term6296, term6296.getClass(), "name", "wGmYcqUkgE");
        setField(term6296, term6296.getClass(), "iconId", "idgaQsnJpQ");
        setField(term6296, term6296.getClass(), "description", "VgZnGoIFwQ");
        setIntField(term6296, term6296.getClass(), "prodCost", 49950830);
        setIntField(term6296, term6296.getClass(), "metalCost", -525257914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReseBonus", argTypes, term6296, args);
    }

};


