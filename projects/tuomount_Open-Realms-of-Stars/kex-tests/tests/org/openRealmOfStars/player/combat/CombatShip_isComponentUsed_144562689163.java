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

public class CombatShip_isComponentUsed_144562689163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545659;
     Object term545674;

    public CombatShip_isComponentUsed_144562689163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545659 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545659, term545659.getClass(), "ship", null);
        setField(term545659, term545659.getClass(), "componentUsed", null);
        setIntField(term545659, term545659.getClass(), "x", 0);
        setIntField(term545659, term545659.getClass(), "y", 0);
        setField(term545659, term545659.getClass(), "player", null);
        setBooleanField(term545659, term545659.getClass(), "flipY", false);
        setIntField(term545659, term545659.getClass(), "movesLeft", 0);
        setIntField(term545659, term545659.getClass(), "aiShotsLeft", 0);
        setIntField(term545659, term545659.getClass(), "bonusAccuracy", 0);
        setIntField(term545659, term545659.getClass(), "overloadedJammer", 0);
        setIntField(term545659, term545659.getClass(), "overloadedComputer", 0);
        setBooleanField(term545659, term545659.getClass(), "damaged", false);
        setIntField(term545659, term545659.getClass(), "privateeredCredits", 0);
        setField(term545659, term545659.getClass(), "commander", null);
        setIntField(term545659, term545659.getClass(), "overloadFailure", 0);
        setIntField(term545659, term545659.getClass(), "energyLevel", 0);
        setBooleanField(term545659, term545659.getClass(), "isOverloaded", false);
        setBooleanField(term545659, term545659.getClass(), "cloakOverloaded", false);
        term545674 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term545674;
        callMethod(klass, "isComponentUsed", argTypes, term545659, args);
    }

};


