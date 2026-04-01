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
import java.lang.Boolean;

public class Building_setBroadcaster_195094374641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22132;
     Object term22201;

    public Building_setBroadcaster_195094374641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22204 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term22203 = ((Class) term22204).getDeclaredField((String) "FARM");
        ((Field) term22203).setAccessible(true);
        Object enum49 = ((Field) term22203).get((Object) null);
        term22132 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term22132, term22132.getClass(), "type", enum49);
        setIntField(term22132, term22132.getClass(), "farmBonus", -179238712);
        setIntField(term22132, term22132.getClass(), "waterBonus", -2018735535);
        setIntField(term22132, term22132.getClass(), "mineBonus", -658524954);
        setIntField(term22132, term22132.getClass(), "factBonus", -2009613557);
        setIntField(term22132, term22132.getClass(), "cultBonus", 654195547);
        setIntField(term22132, term22132.getClass(), "reseBonus", 1622857008);
        setIntField(term22132, term22132.getClass(), "credBonus", 934338954);
        setIntField(term22132, term22132.getClass(), "happinessBonus", 598635505);
        setIntField(term22132, term22132.getClass(), "materialBonus", -944986533);
        setDoubleField(term22132, term22132.getClass(), "maintenanceCost", 0.8878841294187743);
        setBooleanField(term22132, term22132.getClass(), "singleAllowed", false);
        setBooleanField(term22132, term22132.getClass(), "scientificAchievement", true);
        setBooleanField(term22132, term22132.getClass(), "broadcaster", true);
        setBooleanField(term22132, term22132.getClass(), "orbitalElevator", false);
        setIntField(term22132, term22132.getClass(), "battleBonus", 1894454926);
        setIntField(term22132, term22132.getClass(), "defenseDamage", 1415142780);
        setIntField(term22132, term22132.getClass(), "scanRange", -574105759);
        setIntField(term22132, term22132.getClass(), "scanCloakingDetection", -1165271567);
        setIntField(term22132, term22132.getClass(), "fleetCapacityBonus", 376834234);
        setIntField(term22132, term22132.getClass(), "recycleBonus", -1911972560);
        setIntField(term22132, term22132.getClass(), "ancientArtifactResearch", -642716895);
        setIntField(term22132, term22132.getClass(), "wildLifePower", 1743398246);
        setField(term22132, term22132.getClass(), "name", "AZdLeSugwv");
        setField(term22132, term22132.getClass(), "iconId", "RMsXuyzKJV");
        setField(term22132, term22132.getClass(), "description", "FwPbDZcHmB");
        setIntField(term22132, term22132.getClass(), "prodCost", -934658823);
        setIntField(term22132, term22132.getClass(), "metalCost", 1632177303);
        term22201 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term22201;
        callMethod(klass, "setBroadcaster", argTypes, term22132, args);
    }

};


