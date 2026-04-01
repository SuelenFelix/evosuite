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

public class Building_setDefenseDamage_148512736327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16068;
     Object term16137;

    public Building_setDefenseDamage_148512736327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16140 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term16139 = ((Class) term16140).getDeclaredField((String) "FARM");
        ((Field) term16139).setAccessible(true);
        Object enum35 = ((Field) term16139).get((Object) null);
        term16068 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term16068, term16068.getClass(), "type", enum35);
        setIntField(term16068, term16068.getClass(), "farmBonus", -26316536);
        setIntField(term16068, term16068.getClass(), "waterBonus", 1716165145);
        setIntField(term16068, term16068.getClass(), "mineBonus", 1692937831);
        setIntField(term16068, term16068.getClass(), "factBonus", -1539747985);
        setIntField(term16068, term16068.getClass(), "cultBonus", -1982489643);
        setIntField(term16068, term16068.getClass(), "reseBonus", 550892835);
        setIntField(term16068, term16068.getClass(), "credBonus", 1237549886);
        setIntField(term16068, term16068.getClass(), "happinessBonus", -1945635750);
        setIntField(term16068, term16068.getClass(), "materialBonus", -1622760744);
        setDoubleField(term16068, term16068.getClass(), "maintenanceCost", 0.7559240768573477);
        setBooleanField(term16068, term16068.getClass(), "singleAllowed", true);
        setBooleanField(term16068, term16068.getClass(), "scientificAchievement", false);
        setBooleanField(term16068, term16068.getClass(), "broadcaster", true);
        setBooleanField(term16068, term16068.getClass(), "orbitalElevator", true);
        setIntField(term16068, term16068.getClass(), "battleBonus", 2068435279);
        setIntField(term16068, term16068.getClass(), "defenseDamage", -1556527718);
        setIntField(term16068, term16068.getClass(), "scanRange", 895255351);
        setIntField(term16068, term16068.getClass(), "scanCloakingDetection", -1317044799);
        setIntField(term16068, term16068.getClass(), "fleetCapacityBonus", -1428063820);
        setIntField(term16068, term16068.getClass(), "recycleBonus", -1271375703);
        setIntField(term16068, term16068.getClass(), "ancientArtifactResearch", 1136208236);
        setIntField(term16068, term16068.getClass(), "wildLifePower", -1220630391);
        setField(term16068, term16068.getClass(), "name", "PapWxkhEWe");
        setField(term16068, term16068.getClass(), "iconId", "smnHEqRFRx");
        setField(term16068, term16068.getClass(), "description", "XYtryyobou");
        setIntField(term16068, term16068.getClass(), "prodCost", -995822131);
        setIntField(term16068, term16068.getClass(), "metalCost", -687282231);
        term16137 = new Integer(1200440315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16137;
        callMethod(klass, "setDefenseDamage", argTypes, term16068, args);
    }

};


