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

public class Building_setOrbitalElevator_106076021543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22988;
     Object term23058;

    public Building_setOrbitalElevator_106076021543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23061 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term23060 = ((Class) term23061).getDeclaredField((String) "WATER");
        ((Field) term23060).setAccessible(true);
        Object enum51 = ((Field) term23060).get((Object) null);
        term22988 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term22988, term22988.getClass(), "type", enum51);
        setIntField(term22988, term22988.getClass(), "farmBonus", -752378450);
        setIntField(term22988, term22988.getClass(), "waterBonus", 848907965);
        setIntField(term22988, term22988.getClass(), "mineBonus", 1865070548);
        setIntField(term22988, term22988.getClass(), "factBonus", 1904515443);
        setIntField(term22988, term22988.getClass(), "cultBonus", 1361126430);
        setIntField(term22988, term22988.getClass(), "reseBonus", 1728588701);
        setIntField(term22988, term22988.getClass(), "credBonus", -355769268);
        setIntField(term22988, term22988.getClass(), "happinessBonus", -114460662);
        setIntField(term22988, term22988.getClass(), "materialBonus", -355376034);
        setDoubleField(term22988, term22988.getClass(), "maintenanceCost", 0.6397214730945112);
        setBooleanField(term22988, term22988.getClass(), "singleAllowed", false);
        setBooleanField(term22988, term22988.getClass(), "scientificAchievement", true);
        setBooleanField(term22988, term22988.getClass(), "broadcaster", false);
        setBooleanField(term22988, term22988.getClass(), "orbitalElevator", true);
        setIntField(term22988, term22988.getClass(), "battleBonus", 588390599);
        setIntField(term22988, term22988.getClass(), "defenseDamage", -95969566);
        setIntField(term22988, term22988.getClass(), "scanRange", -68615285);
        setIntField(term22988, term22988.getClass(), "scanCloakingDetection", -337504086);
        setIntField(term22988, term22988.getClass(), "fleetCapacityBonus", 2074130991);
        setIntField(term22988, term22988.getClass(), "recycleBonus", 532588266);
        setIntField(term22988, term22988.getClass(), "ancientArtifactResearch", -1286686332);
        setIntField(term22988, term22988.getClass(), "wildLifePower", -284885486);
        setField(term22988, term22988.getClass(), "name", "NnpwZBUTvx");
        setField(term22988, term22988.getClass(), "iconId", "tlQSNgTkQX");
        setField(term22988, term22988.getClass(), "description", "PCipZnmBOF");
        setIntField(term22988, term22988.getClass(), "prodCost", 1791984446);
        setIntField(term22988, term22988.getClass(), "metalCost", 804070622);
        term23058 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23058;
        callMethod(klass, "setOrbitalElevator", argTypes, term22988, args);
    }

};


