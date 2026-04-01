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

public class CombatShip_setEnergyLevel_26691118784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545992;
     Object term546007;

    public CombatShip_setEnergyLevel_26691118784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545992 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545992, term545992.getClass(), "ship", null);
        setField(term545992, term545992.getClass(), "componentUsed", null);
        setIntField(term545992, term545992.getClass(), "x", 0);
        setIntField(term545992, term545992.getClass(), "y", 0);
        setField(term545992, term545992.getClass(), "player", null);
        setBooleanField(term545992, term545992.getClass(), "flipY", false);
        setIntField(term545992, term545992.getClass(), "movesLeft", 0);
        setIntField(term545992, term545992.getClass(), "aiShotsLeft", 0);
        setIntField(term545992, term545992.getClass(), "bonusAccuracy", 0);
        setIntField(term545992, term545992.getClass(), "overloadedJammer", 0);
        setIntField(term545992, term545992.getClass(), "overloadedComputer", 0);
        setBooleanField(term545992, term545992.getClass(), "damaged", false);
        setIntField(term545992, term545992.getClass(), "privateeredCredits", 0);
        setField(term545992, term545992.getClass(), "commander", null);
        setIntField(term545992, term545992.getClass(), "overloadFailure", 0);
        setIntField(term545992, term545992.getClass(), "energyLevel", 0);
        setBooleanField(term545992, term545992.getClass(), "isOverloaded", false);
        setBooleanField(term545992, term545992.getClass(), "cloakOverloaded", false);
        term546007 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term546007;
        callMethod(klass, "setEnergyLevel", argTypes, term545992, args);
    }

};


