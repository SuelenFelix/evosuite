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

public class Building_getDefenseDamage_56146645726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15645;

    public Building_getDefenseDamage_56146645726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15715 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term15714 = ((Class) term15715).getDeclaredField((String) "FARM");
        ((Field) term15714).setAccessible(true);
        Object enum34 = ((Field) term15714).get((Object) null);
        term15645 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term15645, term15645.getClass(), "type", enum34);
        setIntField(term15645, term15645.getClass(), "farmBonus", -763799087);
        setIntField(term15645, term15645.getClass(), "waterBonus", 1207142014);
        setIntField(term15645, term15645.getClass(), "mineBonus", -876426634);
        setIntField(term15645, term15645.getClass(), "factBonus", 213831054);
        setIntField(term15645, term15645.getClass(), "cultBonus", 330043745);
        setIntField(term15645, term15645.getClass(), "reseBonus", -509349195);
        setIntField(term15645, term15645.getClass(), "credBonus", -1639041228);
        setIntField(term15645, term15645.getClass(), "happinessBonus", 2027686272);
        setIntField(term15645, term15645.getClass(), "materialBonus", -1494356104);
        setDoubleField(term15645, term15645.getClass(), "maintenanceCost", 0.5840714198152577);
        setBooleanField(term15645, term15645.getClass(), "singleAllowed", false);
        setBooleanField(term15645, term15645.getClass(), "scientificAchievement", false);
        setBooleanField(term15645, term15645.getClass(), "broadcaster", true);
        setBooleanField(term15645, term15645.getClass(), "orbitalElevator", true);
        setIntField(term15645, term15645.getClass(), "battleBonus", -695279311);
        setIntField(term15645, term15645.getClass(), "defenseDamage", 114279242);
        setIntField(term15645, term15645.getClass(), "scanRange", 990883365);
        setIntField(term15645, term15645.getClass(), "scanCloakingDetection", 633598642);
        setIntField(term15645, term15645.getClass(), "fleetCapacityBonus", 1862841859);
        setIntField(term15645, term15645.getClass(), "recycleBonus", -1114668574);
        setIntField(term15645, term15645.getClass(), "ancientArtifactResearch", 514511037);
        setIntField(term15645, term15645.getClass(), "wildLifePower", 1713573821);
        setField(term15645, term15645.getClass(), "name", "BRIVNtfUWU");
        setField(term15645, term15645.getClass(), "iconId", "DbiCVtPPCT");
        setField(term15645, term15645.getClass(), "description", "WzFopsaDuG");
        setIntField(term15645, term15645.getClass(), "prodCost", 1956590498);
        setIntField(term15645, term15645.getClass(), "metalCost", 1467356494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefenseDamage", argTypes, term15645, args);
    }

};


