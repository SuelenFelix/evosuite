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

public class ShipComponent_setEnergyRequirement_128953230363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481176;
     Object term481199;

    public ShipComponent_setEnergyRequirement_128953230363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481176 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term481176, term481176.getClass(), "index", 0);
        setField(term481176, term481176.getClass(), "type", null);
        setIntField(term481176, term481176.getClass(), "cost", 0);
        setIntField(term481176, term481176.getClass(), "metalCost", 0);
        setField(term481176, term481176.getClass(), "name", null);
        setIntField(term481176, term481176.getClass(), "energyRequirement", 0);
        setIntField(term481176, term481176.getClass(), "energyResource", 0);
        setIntField(term481176, term481176.getClass(), "ftlSpeed", 0);
        setIntField(term481176, term481176.getClass(), "speed", 0);
        setIntField(term481176, term481176.getClass(), "tacticSpeed", 0);
        setIntField(term481176, term481176.getClass(), "scannerRange", 0);
        setIntField(term481176, term481176.getClass(), "cloakDetection", 0);
        setIntField(term481176, term481176.getClass(), "cloaking", 0);
        setIntField(term481176, term481176.getClass(), "defenseValue", 0);
        setIntField(term481176, term481176.getClass(), "baySize", 0);
        setIntField(term481176, term481176.getClass(), "damage", 0);
        setIntField(term481176, term481176.getClass(), "weaponRange", 0);
        setIntField(term481176, term481176.getClass(), "initiativeBoost", 0);
        setIntField(term481176, term481176.getClass(), "cultureBonus", 0);
        setIntField(term481176, term481176.getClass(), "creditBonus", 0);
        setIntField(term481176, term481176.getClass(), "researchBonus", 0);
        setIntField(term481176, term481176.getClass(), "espionageBonus", 0);
        setIntField(term481176, term481176.getClass(), "fleetCapacityBonus", 0);
        setIntField(term481176, term481176.getClass(), "hitBonus", 0);
        term481199 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term481199;
        callMethod(klass, "setEnergyRequirement", argTypes, term481176, args);
    }

};


