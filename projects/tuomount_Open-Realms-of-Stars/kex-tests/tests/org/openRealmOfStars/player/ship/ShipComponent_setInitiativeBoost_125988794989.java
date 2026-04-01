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

public class ShipComponent_setInitiativeBoost_125988794989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481798;
     Object term481821;

    public ShipComponent_setInitiativeBoost_125988794989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481798 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term481798, term481798.getClass(), "index", 0);
        setField(term481798, term481798.getClass(), "type", null);
        setIntField(term481798, term481798.getClass(), "cost", 0);
        setIntField(term481798, term481798.getClass(), "metalCost", 0);
        setField(term481798, term481798.getClass(), "name", null);
        setIntField(term481798, term481798.getClass(), "energyRequirement", 0);
        setIntField(term481798, term481798.getClass(), "energyResource", 0);
        setIntField(term481798, term481798.getClass(), "ftlSpeed", 0);
        setIntField(term481798, term481798.getClass(), "speed", 0);
        setIntField(term481798, term481798.getClass(), "tacticSpeed", 0);
        setIntField(term481798, term481798.getClass(), "scannerRange", 0);
        setIntField(term481798, term481798.getClass(), "cloakDetection", 0);
        setIntField(term481798, term481798.getClass(), "cloaking", 0);
        setIntField(term481798, term481798.getClass(), "defenseValue", 0);
        setIntField(term481798, term481798.getClass(), "baySize", 0);
        setIntField(term481798, term481798.getClass(), "damage", 0);
        setIntField(term481798, term481798.getClass(), "weaponRange", 0);
        setIntField(term481798, term481798.getClass(), "initiativeBoost", 0);
        setIntField(term481798, term481798.getClass(), "cultureBonus", 0);
        setIntField(term481798, term481798.getClass(), "creditBonus", 0);
        setIntField(term481798, term481798.getClass(), "researchBonus", 0);
        setIntField(term481798, term481798.getClass(), "espionageBonus", 0);
        setIntField(term481798, term481798.getClass(), "fleetCapacityBonus", 0);
        setIntField(term481798, term481798.getClass(), "hitBonus", 0);
        term481821 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term481821;
        callMethod(klass, "setInitiativeBoost", argTypes, term481798, args);
    }

};


