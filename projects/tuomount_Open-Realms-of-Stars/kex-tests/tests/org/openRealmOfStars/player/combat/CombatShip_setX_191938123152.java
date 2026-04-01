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

public class CombatShip_setX_191938123152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545490;
     Object term545505;

    public CombatShip_setX_191938123152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545490 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545490, term545490.getClass(), "ship", null);
        setField(term545490, term545490.getClass(), "componentUsed", null);
        setIntField(term545490, term545490.getClass(), "x", 0);
        setIntField(term545490, term545490.getClass(), "y", 0);
        setField(term545490, term545490.getClass(), "player", null);
        setBooleanField(term545490, term545490.getClass(), "flipY", false);
        setIntField(term545490, term545490.getClass(), "movesLeft", 0);
        setIntField(term545490, term545490.getClass(), "aiShotsLeft", 0);
        setIntField(term545490, term545490.getClass(), "bonusAccuracy", 0);
        setIntField(term545490, term545490.getClass(), "overloadedJammer", 0);
        setIntField(term545490, term545490.getClass(), "overloadedComputer", 0);
        setBooleanField(term545490, term545490.getClass(), "damaged", false);
        setIntField(term545490, term545490.getClass(), "privateeredCredits", 0);
        setField(term545490, term545490.getClass(), "commander", null);
        setIntField(term545490, term545490.getClass(), "overloadFailure", 0);
        setIntField(term545490, term545490.getClass(), "energyLevel", 0);
        setBooleanField(term545490, term545490.getClass(), "isOverloaded", false);
        setBooleanField(term545490, term545490.getClass(), "cloakOverloaded", false);
        term545505 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term545505;
        callMethod(klass, "setX", argTypes, term545490, args);
    }

};


