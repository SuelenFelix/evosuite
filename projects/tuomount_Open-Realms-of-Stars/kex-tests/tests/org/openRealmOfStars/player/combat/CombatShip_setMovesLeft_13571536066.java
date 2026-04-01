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

public class CombatShip_setMovesLeft_13571536066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545710;
     Object term545725;

    public CombatShip_setMovesLeft_13571536066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545710 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545710, term545710.getClass(), "ship", null);
        setField(term545710, term545710.getClass(), "componentUsed", null);
        setIntField(term545710, term545710.getClass(), "x", 0);
        setIntField(term545710, term545710.getClass(), "y", 0);
        setField(term545710, term545710.getClass(), "player", null);
        setBooleanField(term545710, term545710.getClass(), "flipY", false);
        setIntField(term545710, term545710.getClass(), "movesLeft", 0);
        setIntField(term545710, term545710.getClass(), "aiShotsLeft", 0);
        setIntField(term545710, term545710.getClass(), "bonusAccuracy", 0);
        setIntField(term545710, term545710.getClass(), "overloadedJammer", 0);
        setIntField(term545710, term545710.getClass(), "overloadedComputer", 0);
        setBooleanField(term545710, term545710.getClass(), "damaged", false);
        setIntField(term545710, term545710.getClass(), "privateeredCredits", 0);
        setField(term545710, term545710.getClass(), "commander", null);
        setIntField(term545710, term545710.getClass(), "overloadFailure", 0);
        setIntField(term545710, term545710.getClass(), "energyLevel", 0);
        setBooleanField(term545710, term545710.getClass(), "isOverloaded", false);
        setBooleanField(term545710, term545710.getClass(), "cloakOverloaded", false);
        term545725 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term545725;
        callMethod(klass, "setMovesLeft", argTypes, term545710, args);
    }

};


