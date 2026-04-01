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

public class Building_getAncientArtifactResearch_99041972946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24289;

    public Building_getAncientArtifactResearch_99041972946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24361 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term24360 = ((Class) term24361).getDeclaredField((String) "CREDIT");
        ((Field) term24360).setAccessible(true);
        Object enum54 = ((Field) term24360).get((Object) null);
        term24289 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term24289, term24289.getClass(), "type", enum54);
        setIntField(term24289, term24289.getClass(), "farmBonus", 263859424);
        setIntField(term24289, term24289.getClass(), "waterBonus", 1436978289);
        setIntField(term24289, term24289.getClass(), "mineBonus", 696225243);
        setIntField(term24289, term24289.getClass(), "factBonus", -1421649118);
        setIntField(term24289, term24289.getClass(), "cultBonus", -511248284);
        setIntField(term24289, term24289.getClass(), "reseBonus", 788630042);
        setIntField(term24289, term24289.getClass(), "credBonus", 1430066560);
        setIntField(term24289, term24289.getClass(), "happinessBonus", 836734074);
        setIntField(term24289, term24289.getClass(), "materialBonus", -1747711865);
        setDoubleField(term24289, term24289.getClass(), "maintenanceCost", 0.8823181080774973);
        setBooleanField(term24289, term24289.getClass(), "singleAllowed", true);
        setBooleanField(term24289, term24289.getClass(), "scientificAchievement", true);
        setBooleanField(term24289, term24289.getClass(), "broadcaster", true);
        setBooleanField(term24289, term24289.getClass(), "orbitalElevator", false);
        setIntField(term24289, term24289.getClass(), "battleBonus", 682812715);
        setIntField(term24289, term24289.getClass(), "defenseDamage", -1092883950);
        setIntField(term24289, term24289.getClass(), "scanRange", 950385621);
        setIntField(term24289, term24289.getClass(), "scanCloakingDetection", -232352320);
        setIntField(term24289, term24289.getClass(), "fleetCapacityBonus", -232333014);
        setIntField(term24289, term24289.getClass(), "recycleBonus", -139694079);
        setIntField(term24289, term24289.getClass(), "ancientArtifactResearch", -1602072035);
        setIntField(term24289, term24289.getClass(), "wildLifePower", 1902624392);
        setField(term24289, term24289.getClass(), "name", "WXMWFDGcLB");
        setField(term24289, term24289.getClass(), "iconId", "wKWbJssZuG");
        setField(term24289, term24289.getClass(), "description", "NzBMMhkhpT");
        setIntField(term24289, term24289.getClass(), "prodCost", 904607217);
        setIntField(term24289, term24289.getClass(), "metalCost", 434914590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAncientArtifactResearch", argTypes, term24289, args);
    }

};


