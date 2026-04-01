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

public class CombatShip_setCommander_15072120176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545868;

    public CombatShip_setCommander_15072120176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545868 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545868, term545868.getClass(), "ship", null);
        setField(term545868, term545868.getClass(), "componentUsed", null);
        setIntField(term545868, term545868.getClass(), "x", 0);
        setIntField(term545868, term545868.getClass(), "y", 0);
        setField(term545868, term545868.getClass(), "player", null);
        setBooleanField(term545868, term545868.getClass(), "flipY", false);
        setIntField(term545868, term545868.getClass(), "movesLeft", 0);
        setIntField(term545868, term545868.getClass(), "aiShotsLeft", 0);
        setIntField(term545868, term545868.getClass(), "bonusAccuracy", 0);
        setIntField(term545868, term545868.getClass(), "overloadedJammer", 0);
        setIntField(term545868, term545868.getClass(), "overloadedComputer", 0);
        setBooleanField(term545868, term545868.getClass(), "damaged", false);
        setIntField(term545868, term545868.getClass(), "privateeredCredits", 0);
        setField(term545868, term545868.getClass(), "commander", null);
        setIntField(term545868, term545868.getClass(), "overloadFailure", 0);
        setIntField(term545868, term545868.getClass(), "energyLevel", 0);
        setBooleanField(term545868, term545868.getClass(), "isOverloaded", false);
        setBooleanField(term545868, term545868.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCommander", argTypes, term545868, args);
    }

};


