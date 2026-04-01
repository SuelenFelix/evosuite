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

public class CombatShip_setOverloadFailure_14332098582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545960;
     Object term545975;

    public CombatShip_setOverloadFailure_14332098582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545960 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545960, term545960.getClass(), "ship", null);
        setField(term545960, term545960.getClass(), "componentUsed", null);
        setIntField(term545960, term545960.getClass(), "x", 0);
        setIntField(term545960, term545960.getClass(), "y", 0);
        setField(term545960, term545960.getClass(), "player", null);
        setBooleanField(term545960, term545960.getClass(), "flipY", false);
        setIntField(term545960, term545960.getClass(), "movesLeft", 0);
        setIntField(term545960, term545960.getClass(), "aiShotsLeft", 0);
        setIntField(term545960, term545960.getClass(), "bonusAccuracy", 0);
        setIntField(term545960, term545960.getClass(), "overloadedJammer", 0);
        setIntField(term545960, term545960.getClass(), "overloadedComputer", 0);
        setBooleanField(term545960, term545960.getClass(), "damaged", false);
        setIntField(term545960, term545960.getClass(), "privateeredCredits", 0);
        setField(term545960, term545960.getClass(), "commander", null);
        setIntField(term545960, term545960.getClass(), "overloadFailure", 0);
        setIntField(term545960, term545960.getClass(), "energyLevel", 0);
        setBooleanField(term545960, term545960.getClass(), "isOverloaded", false);
        setBooleanField(term545960, term545960.getClass(), "cloakOverloaded", false);
        term545975 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term545975;
        callMethod(klass, "setOverloadFailure", argTypes, term545960, args);
    }

};


