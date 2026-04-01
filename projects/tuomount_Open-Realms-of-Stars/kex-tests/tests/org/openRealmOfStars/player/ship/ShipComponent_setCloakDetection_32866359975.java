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

public class ShipComponent_setCloakDetection_32866359975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481464;
     Object term481487;

    public ShipComponent_setCloakDetection_32866359975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481464 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term481464, term481464.getClass(), "index", 0);
        setField(term481464, term481464.getClass(), "type", null);
        setIntField(term481464, term481464.getClass(), "cost", 0);
        setIntField(term481464, term481464.getClass(), "metalCost", 0);
        setField(term481464, term481464.getClass(), "name", null);
        setIntField(term481464, term481464.getClass(), "energyRequirement", 0);
        setIntField(term481464, term481464.getClass(), "energyResource", 0);
        setIntField(term481464, term481464.getClass(), "ftlSpeed", 0);
        setIntField(term481464, term481464.getClass(), "speed", 0);
        setIntField(term481464, term481464.getClass(), "tacticSpeed", 0);
        setIntField(term481464, term481464.getClass(), "scannerRange", 0);
        setIntField(term481464, term481464.getClass(), "cloakDetection", 0);
        setIntField(term481464, term481464.getClass(), "cloaking", 0);
        setIntField(term481464, term481464.getClass(), "defenseValue", 0);
        setIntField(term481464, term481464.getClass(), "baySize", 0);
        setIntField(term481464, term481464.getClass(), "damage", 0);
        setIntField(term481464, term481464.getClass(), "weaponRange", 0);
        setIntField(term481464, term481464.getClass(), "initiativeBoost", 0);
        setIntField(term481464, term481464.getClass(), "cultureBonus", 0);
        setIntField(term481464, term481464.getClass(), "creditBonus", 0);
        setIntField(term481464, term481464.getClass(), "researchBonus", 0);
        setIntField(term481464, term481464.getClass(), "espionageBonus", 0);
        setIntField(term481464, term481464.getClass(), "fleetCapacityBonus", 0);
        setIntField(term481464, term481464.getClass(), "hitBonus", 0);
        term481487 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term481487;
        callMethod(klass, "setCloakDetection", argTypes, term481464, args);
    }

};


