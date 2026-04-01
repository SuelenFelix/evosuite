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

public class ShipComponent_setBaySize_75641636780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481583;
     Object term481606;

    public ShipComponent_setBaySize_75641636780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481583 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term481583, term481583.getClass(), "index", 0);
        setField(term481583, term481583.getClass(), "type", null);
        setIntField(term481583, term481583.getClass(), "cost", 0);
        setIntField(term481583, term481583.getClass(), "metalCost", 0);
        setField(term481583, term481583.getClass(), "name", null);
        setIntField(term481583, term481583.getClass(), "energyRequirement", 0);
        setIntField(term481583, term481583.getClass(), "energyResource", 0);
        setIntField(term481583, term481583.getClass(), "ftlSpeed", 0);
        setIntField(term481583, term481583.getClass(), "speed", 0);
        setIntField(term481583, term481583.getClass(), "tacticSpeed", 0);
        setIntField(term481583, term481583.getClass(), "scannerRange", 0);
        setIntField(term481583, term481583.getClass(), "cloakDetection", 0);
        setIntField(term481583, term481583.getClass(), "cloaking", 0);
        setIntField(term481583, term481583.getClass(), "defenseValue", 0);
        setIntField(term481583, term481583.getClass(), "baySize", 0);
        setIntField(term481583, term481583.getClass(), "damage", 0);
        setIntField(term481583, term481583.getClass(), "weaponRange", 0);
        setIntField(term481583, term481583.getClass(), "initiativeBoost", 0);
        setIntField(term481583, term481583.getClass(), "cultureBonus", 0);
        setIntField(term481583, term481583.getClass(), "creditBonus", 0);
        setIntField(term481583, term481583.getClass(), "researchBonus", 0);
        setIntField(term481583, term481583.getClass(), "espionageBonus", 0);
        setIntField(term481583, term481583.getClass(), "fleetCapacityBonus", 0);
        setIntField(term481583, term481583.getClass(), "hitBonus", 0);
        term481606 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term481606;
        callMethod(klass, "setBaySize", argTypes, term481583, args);
    }

};


