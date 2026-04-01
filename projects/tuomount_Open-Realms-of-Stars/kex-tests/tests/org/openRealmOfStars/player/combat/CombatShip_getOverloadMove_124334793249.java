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

public class CombatShip_getOverloadMove_124334793249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545445;

    public CombatShip_getOverloadMove_124334793249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545445 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545445, term545445.getClass(), "ship", null);
        setField(term545445, term545445.getClass(), "componentUsed", null);
        setIntField(term545445, term545445.getClass(), "x", 0);
        setIntField(term545445, term545445.getClass(), "y", 0);
        setField(term545445, term545445.getClass(), "player", null);
        setBooleanField(term545445, term545445.getClass(), "flipY", false);
        setIntField(term545445, term545445.getClass(), "movesLeft", 0);
        setIntField(term545445, term545445.getClass(), "aiShotsLeft", 0);
        setIntField(term545445, term545445.getClass(), "bonusAccuracy", 0);
        setIntField(term545445, term545445.getClass(), "overloadedJammer", 0);
        setIntField(term545445, term545445.getClass(), "overloadedComputer", 0);
        setBooleanField(term545445, term545445.getClass(), "damaged", false);
        setIntField(term545445, term545445.getClass(), "privateeredCredits", 0);
        setField(term545445, term545445.getClass(), "commander", null);
        setIntField(term545445, term545445.getClass(), "overloadFailure", 0);
        setIntField(term545445, term545445.getClass(), "energyLevel", 0);
        setBooleanField(term545445, term545445.getClass(), "isOverloaded", false);
        setBooleanField(term545445, term545445.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverloadMove", argTypes, term545445, args);
    }

};


