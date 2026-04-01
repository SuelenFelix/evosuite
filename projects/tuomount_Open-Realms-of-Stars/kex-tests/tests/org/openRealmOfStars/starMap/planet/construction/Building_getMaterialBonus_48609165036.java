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

public class Building_getMaterialBonus_48609165036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19961;

    public Building_getMaterialBonus_48609165036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20035 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term20034 = ((Class) term20035).getDeclaredField((String) "MILITARY");
        ((Field) term20034).setAccessible(true);
        Object enum44 = ((Field) term20034).get((Object) null);
        term19961 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term19961, term19961.getClass(), "type", enum44);
        setIntField(term19961, term19961.getClass(), "farmBonus", -1608123016);
        setIntField(term19961, term19961.getClass(), "waterBonus", -896473214);
        setIntField(term19961, term19961.getClass(), "mineBonus", 401203924);
        setIntField(term19961, term19961.getClass(), "factBonus", -1212399479);
        setIntField(term19961, term19961.getClass(), "cultBonus", 2107679041);
        setIntField(term19961, term19961.getClass(), "reseBonus", 2040965507);
        setIntField(term19961, term19961.getClass(), "credBonus", -1281083262);
        setIntField(term19961, term19961.getClass(), "happinessBonus", 1059930704);
        setIntField(term19961, term19961.getClass(), "materialBonus", -1967153290);
        setDoubleField(term19961, term19961.getClass(), "maintenanceCost", 0.3587267442738795);
        setBooleanField(term19961, term19961.getClass(), "singleAllowed", false);
        setBooleanField(term19961, term19961.getClass(), "scientificAchievement", false);
        setBooleanField(term19961, term19961.getClass(), "broadcaster", true);
        setBooleanField(term19961, term19961.getClass(), "orbitalElevator", false);
        setIntField(term19961, term19961.getClass(), "battleBonus", -1397251956);
        setIntField(term19961, term19961.getClass(), "defenseDamage", -796934571);
        setIntField(term19961, term19961.getClass(), "scanRange", 405295896);
        setIntField(term19961, term19961.getClass(), "scanCloakingDetection", -814977075);
        setIntField(term19961, term19961.getClass(), "fleetCapacityBonus", 808614267);
        setIntField(term19961, term19961.getClass(), "recycleBonus", 1611734632);
        setIntField(term19961, term19961.getClass(), "ancientArtifactResearch", 868908117);
        setIntField(term19961, term19961.getClass(), "wildLifePower", 1789351397);
        setField(term19961, term19961.getClass(), "name", "OqbwYQfvAe");
        setField(term19961, term19961.getClass(), "iconId", "tRxZafjqIx");
        setField(term19961, term19961.getClass(), "description", "DhjNLmRMCu");
        setIntField(term19961, term19961.getClass(), "prodCost", 2145528170);
        setIntField(term19961, term19961.getClass(), "metalCost", -585773976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaterialBonus", argTypes, term19961, args);
    }

};


