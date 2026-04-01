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

public class Building_setWaterBonus_8721484165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3247;
     Object term3318;

    public Building_setWaterBonus_8721484165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3321 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term3320 = ((Class) term3321).getDeclaredField((String) "CREDIT");
        ((Field) term3320).setAccessible(true);
        Object enum5 = ((Field) term3320).get((Object) null);
        term3247 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term3247, term3247.getClass(), "type", enum5);
        setIntField(term3247, term3247.getClass(), "farmBonus", -1210583429);
        setIntField(term3247, term3247.getClass(), "waterBonus", -663691365);
        setIntField(term3247, term3247.getClass(), "mineBonus", 339854490);
        setIntField(term3247, term3247.getClass(), "factBonus", -615654495);
        setIntField(term3247, term3247.getClass(), "cultBonus", -1476117762);
        setIntField(term3247, term3247.getClass(), "reseBonus", -341962980);
        setIntField(term3247, term3247.getClass(), "credBonus", 1532716628);
        setIntField(term3247, term3247.getClass(), "happinessBonus", -1801760683);
        setIntField(term3247, term3247.getClass(), "materialBonus", 1141317871);
        setDoubleField(term3247, term3247.getClass(), "maintenanceCost", 0.28570734989730284);
        setBooleanField(term3247, term3247.getClass(), "singleAllowed", true);
        setBooleanField(term3247, term3247.getClass(), "scientificAchievement", true);
        setBooleanField(term3247, term3247.getClass(), "broadcaster", false);
        setBooleanField(term3247, term3247.getClass(), "orbitalElevator", false);
        setIntField(term3247, term3247.getClass(), "battleBonus", 890669485);
        setIntField(term3247, term3247.getClass(), "defenseDamage", 691577392);
        setIntField(term3247, term3247.getClass(), "scanRange", -893623680);
        setIntField(term3247, term3247.getClass(), "scanCloakingDetection", -1963434938);
        setIntField(term3247, term3247.getClass(), "fleetCapacityBonus", 906181092);
        setIntField(term3247, term3247.getClass(), "recycleBonus", 1045657203);
        setIntField(term3247, term3247.getClass(), "ancientArtifactResearch", 1386130016);
        setIntField(term3247, term3247.getClass(), "wildLifePower", 1072005683);
        setField(term3247, term3247.getClass(), "name", "ytSBIKXogI");
        setField(term3247, term3247.getClass(), "iconId", "nHXjMycHlU");
        setField(term3247, term3247.getClass(), "description", "ieCtQFdkii");
        setIntField(term3247, term3247.getClass(), "prodCost", 1861318859);
        setIntField(term3247, term3247.getClass(), "metalCost", 1474524152);
        term3318 = new Integer(568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3318;
        callMethod(klass, "setWaterBonus", argTypes, term3247, args);
    }

};


