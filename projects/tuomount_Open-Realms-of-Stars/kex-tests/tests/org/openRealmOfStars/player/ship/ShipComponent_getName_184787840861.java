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

public class ShipComponent_getName_184787840861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481130;

    public ShipComponent_getName_184787840861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481130 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term481130, term481130.getClass(), "index", 0);
        setField(term481130, term481130.getClass(), "type", null);
        setIntField(term481130, term481130.getClass(), "cost", 0);
        setIntField(term481130, term481130.getClass(), "metalCost", 0);
        setField(term481130, term481130.getClass(), "name", null);
        setIntField(term481130, term481130.getClass(), "energyRequirement", 0);
        setIntField(term481130, term481130.getClass(), "energyResource", 0);
        setIntField(term481130, term481130.getClass(), "ftlSpeed", 0);
        setIntField(term481130, term481130.getClass(), "speed", 0);
        setIntField(term481130, term481130.getClass(), "tacticSpeed", 0);
        setIntField(term481130, term481130.getClass(), "scannerRange", 0);
        setIntField(term481130, term481130.getClass(), "cloakDetection", 0);
        setIntField(term481130, term481130.getClass(), "cloaking", 0);
        setIntField(term481130, term481130.getClass(), "defenseValue", 0);
        setIntField(term481130, term481130.getClass(), "baySize", 0);
        setIntField(term481130, term481130.getClass(), "damage", 0);
        setIntField(term481130, term481130.getClass(), "weaponRange", 0);
        setIntField(term481130, term481130.getClass(), "initiativeBoost", 0);
        setIntField(term481130, term481130.getClass(), "cultureBonus", 0);
        setIntField(term481130, term481130.getClass(), "creditBonus", 0);
        setIntField(term481130, term481130.getClass(), "researchBonus", 0);
        setIntField(term481130, term481130.getClass(), "espionageBonus", 0);
        setIntField(term481130, term481130.getClass(), "fleetCapacityBonus", 0);
        setIntField(term481130, term481130.getClass(), "hitBonus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term481130, args);
    }

};


