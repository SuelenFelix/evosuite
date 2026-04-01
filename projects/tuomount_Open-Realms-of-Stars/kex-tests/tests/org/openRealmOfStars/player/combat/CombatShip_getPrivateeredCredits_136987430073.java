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

public class CombatShip_getPrivateeredCredits_136987430073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545821;

    public CombatShip_getPrivateeredCredits_136987430073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545821 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545821, term545821.getClass(), "ship", null);
        setField(term545821, term545821.getClass(), "componentUsed", null);
        setIntField(term545821, term545821.getClass(), "x", 0);
        setIntField(term545821, term545821.getClass(), "y", 0);
        setField(term545821, term545821.getClass(), "player", null);
        setBooleanField(term545821, term545821.getClass(), "flipY", false);
        setIntField(term545821, term545821.getClass(), "movesLeft", 0);
        setIntField(term545821, term545821.getClass(), "aiShotsLeft", 0);
        setIntField(term545821, term545821.getClass(), "bonusAccuracy", 0);
        setIntField(term545821, term545821.getClass(), "overloadedJammer", 0);
        setIntField(term545821, term545821.getClass(), "overloadedComputer", 0);
        setBooleanField(term545821, term545821.getClass(), "damaged", false);
        setIntField(term545821, term545821.getClass(), "privateeredCredits", 0);
        setField(term545821, term545821.getClass(), "commander", null);
        setIntField(term545821, term545821.getClass(), "overloadFailure", 0);
        setIntField(term545821, term545821.getClass(), "energyLevel", 0);
        setBooleanField(term545821, term545821.getClass(), "isOverloaded", false);
        setBooleanField(term545821, term545821.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrivateeredCredits", argTypes, term545821, args);
    }

};


