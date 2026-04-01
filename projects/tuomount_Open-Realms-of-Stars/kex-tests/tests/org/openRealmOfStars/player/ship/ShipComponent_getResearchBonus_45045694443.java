package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ShipComponent_getResearchBonus_45045694443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478088;

    public ShipComponent_getResearchBonus_45045694443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term478138 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term478137 = ((Class) term478138).getDeclaredField((String) "ION_CANNON");
        ((Field) term478137).setAccessible(true);
        Object enum1515 = ((Field) term478137).get((Object) null);
        term478088 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term478088, term478088.getClass(), "index", 1206480279);
        setField(term478088, term478088.getClass(), "type", enum1515);
        setIntField(term478088, term478088.getClass(), "cost", -496495218);
        setIntField(term478088, term478088.getClass(), "metalCost", 1283663634);
        setField(term478088, term478088.getClass(), "name", "CAoRKdEDwC");
        setIntField(term478088, term478088.getClass(), "energyRequirement", 1978334259);
        setIntField(term478088, term478088.getClass(), "energyResource", 690850678);
        setIntField(term478088, term478088.getClass(), "ftlSpeed", 2045633891);
        setIntField(term478088, term478088.getClass(), "speed", 1795515119);
        setIntField(term478088, term478088.getClass(), "tacticSpeed", 968600347);
        setIntField(term478088, term478088.getClass(), "scannerRange", -700468612);
        setIntField(term478088, term478088.getClass(), "cloakDetection", 321982765);
        setIntField(term478088, term478088.getClass(), "cloaking", 48114166);
        setIntField(term478088, term478088.getClass(), "defenseValue", -2034531066);
        setIntField(term478088, term478088.getClass(), "baySize", -198669254);
        setIntField(term478088, term478088.getClass(), "damage", -1240490694);
        setIntField(term478088, term478088.getClass(), "weaponRange", 244720262);
        setIntField(term478088, term478088.getClass(), "initiativeBoost", 370854194);
        setIntField(term478088, term478088.getClass(), "cultureBonus", -17070269);
        setIntField(term478088, term478088.getClass(), "creditBonus", 1467833271);
        setIntField(term478088, term478088.getClass(), "researchBonus", 1376444883);
        setIntField(term478088, term478088.getClass(), "espionageBonus", 48103208);
        setIntField(term478088, term478088.getClass(), "fleetCapacityBonus", -655467488);
        setIntField(term478088, term478088.getClass(), "hitBonus", 283820186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResearchBonus", argTypes, term478088, args);
    }

};


