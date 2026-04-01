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

public class CombatShip_setOverloaded_21061874089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546071;
     Object term546086;

    public CombatShip_setOverloaded_21061874089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546071 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term546071, term546071.getClass(), "ship", null);
        setField(term546071, term546071.getClass(), "componentUsed", null);
        setIntField(term546071, term546071.getClass(), "x", 0);
        setIntField(term546071, term546071.getClass(), "y", 0);
        setField(term546071, term546071.getClass(), "player", null);
        setBooleanField(term546071, term546071.getClass(), "flipY", false);
        setIntField(term546071, term546071.getClass(), "movesLeft", 0);
        setIntField(term546071, term546071.getClass(), "aiShotsLeft", 0);
        setIntField(term546071, term546071.getClass(), "bonusAccuracy", 0);
        setIntField(term546071, term546071.getClass(), "overloadedJammer", 0);
        setIntField(term546071, term546071.getClass(), "overloadedComputer", 0);
        setBooleanField(term546071, term546071.getClass(), "damaged", false);
        setIntField(term546071, term546071.getClass(), "privateeredCredits", 0);
        setField(term546071, term546071.getClass(), "commander", null);
        setIntField(term546071, term546071.getClass(), "overloadFailure", 0);
        setIntField(term546071, term546071.getClass(), "energyLevel", 0);
        setBooleanField(term546071, term546071.getClass(), "isOverloaded", false);
        setBooleanField(term546071, term546071.getClass(), "cloakOverloaded", false);
        term546086 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term546086;
        callMethod(klass, "setOverloaded", argTypes, term546071, args);
    }

};


