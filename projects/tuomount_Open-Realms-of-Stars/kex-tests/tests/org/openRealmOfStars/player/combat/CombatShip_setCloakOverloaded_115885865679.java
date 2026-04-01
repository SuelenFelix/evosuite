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
import java.lang.Boolean;

public class CombatShip_setCloakOverloaded_115885865679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545913;
     Object term545928;

    public CombatShip_setCloakOverloaded_115885865679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545913 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545913, term545913.getClass(), "ship", null);
        setField(term545913, term545913.getClass(), "componentUsed", null);
        setIntField(term545913, term545913.getClass(), "x", 0);
        setIntField(term545913, term545913.getClass(), "y", 0);
        setField(term545913, term545913.getClass(), "player", null);
        setBooleanField(term545913, term545913.getClass(), "flipY", false);
        setIntField(term545913, term545913.getClass(), "movesLeft", 0);
        setIntField(term545913, term545913.getClass(), "aiShotsLeft", 0);
        setIntField(term545913, term545913.getClass(), "bonusAccuracy", 0);
        setIntField(term545913, term545913.getClass(), "overloadedJammer", 0);
        setIntField(term545913, term545913.getClass(), "overloadedComputer", 0);
        setBooleanField(term545913, term545913.getClass(), "damaged", false);
        setIntField(term545913, term545913.getClass(), "privateeredCredits", 0);
        setField(term545913, term545913.getClass(), "commander", null);
        setIntField(term545913, term545913.getClass(), "overloadFailure", 0);
        setIntField(term545913, term545913.getClass(), "energyLevel", 0);
        setBooleanField(term545913, term545913.getClass(), "isOverloaded", false);
        setBooleanField(term545913, term545913.getClass(), "cloakOverloaded", false);
        term545928 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term545928;
        callMethod(klass, "setCloakOverloaded", argTypes, term545913, args);
    }

};


