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
import java.lang.Integer;

public class ShipComponent_setFleetCapacityBonus_168573771397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481990;
     Object term482013;

    public ShipComponent_setFleetCapacityBonus_168573771397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481990 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term481990, term481990.getClass(), "index", 0);
        setField(term481990, term481990.getClass(), "type", null);
        setIntField(term481990, term481990.getClass(), "cost", 0);
        setIntField(term481990, term481990.getClass(), "metalCost", 0);
        setField(term481990, term481990.getClass(), "name", null);
        setIntField(term481990, term481990.getClass(), "energyRequirement", 0);
        setIntField(term481990, term481990.getClass(), "energyResource", 0);
        setIntField(term481990, term481990.getClass(), "ftlSpeed", 0);
        setIntField(term481990, term481990.getClass(), "speed", 0);
        setIntField(term481990, term481990.getClass(), "tacticSpeed", 0);
        setIntField(term481990, term481990.getClass(), "scannerRange", 0);
        setIntField(term481990, term481990.getClass(), "cloakDetection", 0);
        setIntField(term481990, term481990.getClass(), "cloaking", 0);
        setIntField(term481990, term481990.getClass(), "defenseValue", 0);
        setIntField(term481990, term481990.getClass(), "baySize", 0);
        setIntField(term481990, term481990.getClass(), "damage", 0);
        setIntField(term481990, term481990.getClass(), "weaponRange", 0);
        setIntField(term481990, term481990.getClass(), "initiativeBoost", 0);
        setIntField(term481990, term481990.getClass(), "cultureBonus", 0);
        setIntField(term481990, term481990.getClass(), "creditBonus", 0);
        setIntField(term481990, term481990.getClass(), "researchBonus", 0);
        setIntField(term481990, term481990.getClass(), "espionageBonus", 0);
        setIntField(term481990, term481990.getClass(), "fleetCapacityBonus", 0);
        setIntField(term481990, term481990.getClass(), "hitBonus", 0);
        term482013 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term482013;
        callMethod(klass, "setFleetCapacityBonus", argTypes, term481990, args);
    }

};


