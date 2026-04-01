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

public class Building_isOrbitalElevator_155353559142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22557;

    public Building_isOrbitalElevator_155353559142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22629 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term22628 = ((Class) term22629).getDeclaredField((String) "CREDIT");
        ((Field) term22628).setAccessible(true);
        Object enum50 = ((Field) term22628).get((Object) null);
        term22557 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term22557, term22557.getClass(), "type", enum50);
        setIntField(term22557, term22557.getClass(), "farmBonus", -802592348);
        setIntField(term22557, term22557.getClass(), "waterBonus", -1576584269);
        setIntField(term22557, term22557.getClass(), "mineBonus", 1474899591);
        setIntField(term22557, term22557.getClass(), "factBonus", 297582552);
        setIntField(term22557, term22557.getClass(), "cultBonus", -1485916498);
        setIntField(term22557, term22557.getClass(), "reseBonus", 722787672);
        setIntField(term22557, term22557.getClass(), "credBonus", 2077491675);
        setIntField(term22557, term22557.getClass(), "happinessBonus", -1728316609);
        setIntField(term22557, term22557.getClass(), "materialBonus", 47118909);
        setDoubleField(term22557, term22557.getClass(), "maintenanceCost", 0.6588948704887806);
        setBooleanField(term22557, term22557.getClass(), "singleAllowed", true);
        setBooleanField(term22557, term22557.getClass(), "scientificAchievement", false);
        setBooleanField(term22557, term22557.getClass(), "broadcaster", false);
        setBooleanField(term22557, term22557.getClass(), "orbitalElevator", true);
        setIntField(term22557, term22557.getClass(), "battleBonus", -2093707412);
        setIntField(term22557, term22557.getClass(), "defenseDamage", -680627153);
        setIntField(term22557, term22557.getClass(), "scanRange", 722519669);
        setIntField(term22557, term22557.getClass(), "scanCloakingDetection", -40335961);
        setIntField(term22557, term22557.getClass(), "fleetCapacityBonus", 175343605);
        setIntField(term22557, term22557.getClass(), "recycleBonus", 1050853183);
        setIntField(term22557, term22557.getClass(), "ancientArtifactResearch", 848428785);
        setIntField(term22557, term22557.getClass(), "wildLifePower", -1984436481);
        setField(term22557, term22557.getClass(), "name", "hOncybyCAH");
        setField(term22557, term22557.getClass(), "iconId", "QduALnDSVo");
        setField(term22557, term22557.getClass(), "description", "izPpKDErnQ");
        setIntField(term22557, term22557.getClass(), "prodCost", -407582855);
        setIntField(term22557, term22557.getClass(), "metalCost", 1190753616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOrbitalElevator", argTypes, term22557, args);
    }

};


