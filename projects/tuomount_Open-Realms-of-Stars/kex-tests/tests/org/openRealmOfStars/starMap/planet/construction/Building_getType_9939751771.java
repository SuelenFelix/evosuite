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

public class Building_getType_9939751771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1517;

    public Building_getType_9939751771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1590 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term1589 = ((Class) term1590).getDeclaredField((String) "FACTORY");
        ((Field) term1589).setAccessible(true);
        Object enum1 = ((Field) term1589).get((Object) null);
        term1517 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term1517, term1517.getClass(), "type", enum1);
        setIntField(term1517, term1517.getClass(), "farmBonus", -1275173084);
        setIntField(term1517, term1517.getClass(), "waterBonus", -244121226);
        setIntField(term1517, term1517.getClass(), "mineBonus", -203030934);
        setIntField(term1517, term1517.getClass(), "factBonus", -1179120542);
        setIntField(term1517, term1517.getClass(), "cultBonus", -73683645);
        setIntField(term1517, term1517.getClass(), "reseBonus", -226514366);
        setIntField(term1517, term1517.getClass(), "credBonus", 1193880199);
        setIntField(term1517, term1517.getClass(), "happinessBonus", -1087774327);
        setIntField(term1517, term1517.getClass(), "materialBonus", -1530420153);
        setDoubleField(term1517, term1517.getClass(), "maintenanceCost", 0.13238746331190498);
        setBooleanField(term1517, term1517.getClass(), "singleAllowed", false);
        setBooleanField(term1517, term1517.getClass(), "scientificAchievement", false);
        setBooleanField(term1517, term1517.getClass(), "broadcaster", false);
        setBooleanField(term1517, term1517.getClass(), "orbitalElevator", false);
        setIntField(term1517, term1517.getClass(), "battleBonus", -469968304);
        setIntField(term1517, term1517.getClass(), "defenseDamage", -1145578966);
        setIntField(term1517, term1517.getClass(), "scanRange", 679763016);
        setIntField(term1517, term1517.getClass(), "scanCloakingDetection", 1962444399);
        setIntField(term1517, term1517.getClass(), "fleetCapacityBonus", 767834723);
        setIntField(term1517, term1517.getClass(), "recycleBonus", -602026508);
        setIntField(term1517, term1517.getClass(), "ancientArtifactResearch", -157887805);
        setIntField(term1517, term1517.getClass(), "wildLifePower", 1876565163);
        setField(term1517, term1517.getClass(), "name", "tShwQLRGNe");
        setField(term1517, term1517.getClass(), "iconId", "LvtrsXUliU");
        setField(term1517, term1517.getClass(), "description", "xLbjWUgOIL");
        setIntField(term1517, term1517.getClass(), "prodCost", -817164822);
        setIntField(term1517, term1517.getClass(), "metalCost", -1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1517, args);
    }

};


