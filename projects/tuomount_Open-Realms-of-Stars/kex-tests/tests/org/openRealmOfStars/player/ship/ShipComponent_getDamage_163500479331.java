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

public class ShipComponent_getDamage_163500479331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473850;

    public ShipComponent_getDamage_163500479331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term473896 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term473895 = ((Class) term473896).getDeclaredField((String) "JAMMER");
        ((Field) term473895).setAccessible(true);
        Object enum1503 = ((Field) term473895).get((Object) null);
        term473850 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term473850, term473850.getClass(), "index", -283472712);
        setField(term473850, term473850.getClass(), "type", enum1503);
        setIntField(term473850, term473850.getClass(), "cost", 2086485920);
        setIntField(term473850, term473850.getClass(), "metalCost", -844733146);
        setField(term473850, term473850.getClass(), "name", "JVfDXmoTtQ");
        setIntField(term473850, term473850.getClass(), "energyRequirement", 844968617);
        setIntField(term473850, term473850.getClass(), "energyResource", 1715915962);
        setIntField(term473850, term473850.getClass(), "ftlSpeed", -1131069791);
        setIntField(term473850, term473850.getClass(), "speed", 1323940733);
        setIntField(term473850, term473850.getClass(), "tacticSpeed", -293767776);
        setIntField(term473850, term473850.getClass(), "scannerRange", -340181571);
        setIntField(term473850, term473850.getClass(), "cloakDetection", 1150709730);
        setIntField(term473850, term473850.getClass(), "cloaking", -935342742);
        setIntField(term473850, term473850.getClass(), "defenseValue", -1343188975);
        setIntField(term473850, term473850.getClass(), "baySize", -1142240411);
        setIntField(term473850, term473850.getClass(), "damage", 37630929);
        setIntField(term473850, term473850.getClass(), "weaponRange", -255383207);
        setIntField(term473850, term473850.getClass(), "initiativeBoost", 2012928001);
        setIntField(term473850, term473850.getClass(), "cultureBonus", 610380050);
        setIntField(term473850, term473850.getClass(), "creditBonus", -1248880765);
        setIntField(term473850, term473850.getClass(), "researchBonus", 1182147696);
        setIntField(term473850, term473850.getClass(), "espionageBonus", 1238039697);
        setIntField(term473850, term473850.getClass(), "fleetCapacityBonus", 406825318);
        setIntField(term473850, term473850.getClass(), "hitBonus", 966733800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDamage", argTypes, term473850, args);
    }

};


