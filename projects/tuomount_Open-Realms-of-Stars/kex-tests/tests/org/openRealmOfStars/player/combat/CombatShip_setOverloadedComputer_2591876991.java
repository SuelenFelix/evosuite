package org.openRealmOfStars.player.combat;

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
import static org.openRealmOfStars.player.combat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CombatShip_setOverloadedComputer_2591876991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546103;
     Object term546118;

    public CombatShip_setOverloadedComputer_2591876991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546103 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term546103, term546103.getClass(), "ship", null);
        setField(term546103, term546103.getClass(), "componentUsed", null);
        setIntField(term546103, term546103.getClass(), "x", 0);
        setIntField(term546103, term546103.getClass(), "y", 0);
        setField(term546103, term546103.getClass(), "player", null);
        setBooleanField(term546103, term546103.getClass(), "flipY", false);
        setIntField(term546103, term546103.getClass(), "movesLeft", 0);
        setIntField(term546103, term546103.getClass(), "aiShotsLeft", 0);
        setIntField(term546103, term546103.getClass(), "bonusAccuracy", 0);
        setIntField(term546103, term546103.getClass(), "overloadedJammer", 0);
        setIntField(term546103, term546103.getClass(), "overloadedComputer", 0);
        setBooleanField(term546103, term546103.getClass(), "damaged", false);
        setIntField(term546103, term546103.getClass(), "privateeredCredits", 0);
        setField(term546103, term546103.getClass(), "commander", null);
        setIntField(term546103, term546103.getClass(), "overloadFailure", 0);
        setIntField(term546103, term546103.getClass(), "energyLevel", 0);
        setBooleanField(term546103, term546103.getClass(), "isOverloaded", false);
        setBooleanField(term546103, term546103.getClass(), "cloakOverloaded", false);
        term546118 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term546118;
        callMethod(klass, "setOverloadedComputer", argTypes, term546103, args);
    }

};


