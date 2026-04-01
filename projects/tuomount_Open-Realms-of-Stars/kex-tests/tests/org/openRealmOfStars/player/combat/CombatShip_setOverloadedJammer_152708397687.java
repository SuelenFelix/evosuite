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

public class CombatShip_setOverloadedJammer_152708397687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546039;
     Object term546054;

    public CombatShip_setOverloadedJammer_152708397687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546039 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term546039, term546039.getClass(), "ship", null);
        setField(term546039, term546039.getClass(), "componentUsed", null);
        setIntField(term546039, term546039.getClass(), "x", 0);
        setIntField(term546039, term546039.getClass(), "y", 0);
        setField(term546039, term546039.getClass(), "player", null);
        setBooleanField(term546039, term546039.getClass(), "flipY", false);
        setIntField(term546039, term546039.getClass(), "movesLeft", 0);
        setIntField(term546039, term546039.getClass(), "aiShotsLeft", 0);
        setIntField(term546039, term546039.getClass(), "bonusAccuracy", 0);
        setIntField(term546039, term546039.getClass(), "overloadedJammer", 0);
        setIntField(term546039, term546039.getClass(), "overloadedComputer", 0);
        setBooleanField(term546039, term546039.getClass(), "damaged", false);
        setIntField(term546039, term546039.getClass(), "privateeredCredits", 0);
        setField(term546039, term546039.getClass(), "commander", null);
        setIntField(term546039, term546039.getClass(), "overloadFailure", 0);
        setIntField(term546039, term546039.getClass(), "energyLevel", 0);
        setBooleanField(term546039, term546039.getClass(), "isOverloaded", false);
        setBooleanField(term546039, term546039.getClass(), "cloakOverloaded", false);
        term546054 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term546054;
        callMethod(klass, "setOverloadedJammer", argTypes, term546039, args);
    }

};


