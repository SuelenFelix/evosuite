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

public class Building_setMaterialBonus_140975255637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20400;
     Object term20470;

    public Building_setMaterialBonus_140975255637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20473 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term20472 = ((Class) term20473).getDeclaredField((String) "WATER");
        ((Field) term20472).setAccessible(true);
        Object enum45 = ((Field) term20472).get((Object) null);
        term20400 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term20400, term20400.getClass(), "type", enum45);
        setIntField(term20400, term20400.getClass(), "farmBonus", 852806940);
        setIntField(term20400, term20400.getClass(), "waterBonus", 698551724);
        setIntField(term20400, term20400.getClass(), "mineBonus", -1631048635);
        setIntField(term20400, term20400.getClass(), "factBonus", 1342808731);
        setIntField(term20400, term20400.getClass(), "cultBonus", -64893740);
        setIntField(term20400, term20400.getClass(), "reseBonus", -222012928);
        setIntField(term20400, term20400.getClass(), "credBonus", -146564963);
        setIntField(term20400, term20400.getClass(), "happinessBonus", -83178716);
        setIntField(term20400, term20400.getClass(), "materialBonus", -1292704466);
        setDoubleField(term20400, term20400.getClass(), "maintenanceCost", 0.07802449704920456);
        setBooleanField(term20400, term20400.getClass(), "singleAllowed", false);
        setBooleanField(term20400, term20400.getClass(), "scientificAchievement", false);
        setBooleanField(term20400, term20400.getClass(), "broadcaster", true);
        setBooleanField(term20400, term20400.getClass(), "orbitalElevator", true);
        setIntField(term20400, term20400.getClass(), "battleBonus", 1991858584);
        setIntField(term20400, term20400.getClass(), "defenseDamage", -1300947782);
        setIntField(term20400, term20400.getClass(), "scanRange", 188512644);
        setIntField(term20400, term20400.getClass(), "scanCloakingDetection", 1851127634);
        setIntField(term20400, term20400.getClass(), "fleetCapacityBonus", 783730213);
        setIntField(term20400, term20400.getClass(), "recycleBonus", 1815951606);
        setIntField(term20400, term20400.getClass(), "ancientArtifactResearch", 1105016932);
        setIntField(term20400, term20400.getClass(), "wildLifePower", -365784998);
        setField(term20400, term20400.getClass(), "name", "PgPzMSEjjX");
        setField(term20400, term20400.getClass(), "iconId", "wzsPSPcRdj");
        setField(term20400, term20400.getClass(), "description", "kGMQdqJYyB");
        setIntField(term20400, term20400.getClass(), "prodCost", -1893236300);
        setIntField(term20400, term20400.getClass(), "metalCost", -1858909368);
        term20470 = new Integer(-280113263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20470;
        callMethod(klass, "setMaterialBonus", argTypes, term20400, args);
    }

};


