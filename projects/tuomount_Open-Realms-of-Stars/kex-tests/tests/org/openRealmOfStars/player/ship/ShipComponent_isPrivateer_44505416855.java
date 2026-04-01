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

public class ShipComponent_isPrivateer_44505416855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480992;

    public ShipComponent_isPrivateer_44505416855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480992 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term480992, term480992.getClass(), "index", 0);
        setField(term480992, term480992.getClass(), "type", null);
        setIntField(term480992, term480992.getClass(), "cost", 0);
        setIntField(term480992, term480992.getClass(), "metalCost", 0);
        setField(term480992, term480992.getClass(), "name", null);
        setIntField(term480992, term480992.getClass(), "energyRequirement", 0);
        setIntField(term480992, term480992.getClass(), "energyResource", 0);
        setIntField(term480992, term480992.getClass(), "ftlSpeed", 0);
        setIntField(term480992, term480992.getClass(), "speed", 0);
        setIntField(term480992, term480992.getClass(), "tacticSpeed", 0);
        setIntField(term480992, term480992.getClass(), "scannerRange", 0);
        setIntField(term480992, term480992.getClass(), "cloakDetection", 0);
        setIntField(term480992, term480992.getClass(), "cloaking", 0);
        setIntField(term480992, term480992.getClass(), "defenseValue", 0);
        setIntField(term480992, term480992.getClass(), "baySize", 0);
        setIntField(term480992, term480992.getClass(), "damage", 0);
        setIntField(term480992, term480992.getClass(), "weaponRange", 0);
        setIntField(term480992, term480992.getClass(), "initiativeBoost", 0);
        setIntField(term480992, term480992.getClass(), "cultureBonus", 0);
        setIntField(term480992, term480992.getClass(), "creditBonus", 0);
        setIntField(term480992, term480992.getClass(), "researchBonus", 0);
        setIntField(term480992, term480992.getClass(), "espionageBonus", 0);
        setIntField(term480992, term480992.getClass(), "fleetCapacityBonus", 0);
        setIntField(term480992, term480992.getClass(), "hitBonus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrivateer", argTypes, term480992, args);
    }

};


