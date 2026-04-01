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

public class CombatShip_getEnergyReserve_48690761585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546009;

    public CombatShip_getEnergyReserve_48690761585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546009 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term546009, term546009.getClass(), "ship", null);
        setField(term546009, term546009.getClass(), "componentUsed", null);
        setIntField(term546009, term546009.getClass(), "x", 0);
        setIntField(term546009, term546009.getClass(), "y", 0);
        setField(term546009, term546009.getClass(), "player", null);
        setBooleanField(term546009, term546009.getClass(), "flipY", false);
        setIntField(term546009, term546009.getClass(), "movesLeft", 0);
        setIntField(term546009, term546009.getClass(), "aiShotsLeft", 0);
        setIntField(term546009, term546009.getClass(), "bonusAccuracy", 0);
        setIntField(term546009, term546009.getClass(), "overloadedJammer", 0);
        setIntField(term546009, term546009.getClass(), "overloadedComputer", 0);
        setBooleanField(term546009, term546009.getClass(), "damaged", false);
        setIntField(term546009, term546009.getClass(), "privateeredCredits", 0);
        setField(term546009, term546009.getClass(), "commander", null);
        setIntField(term546009, term546009.getClass(), "overloadFailure", 0);
        setIntField(term546009, term546009.getClass(), "energyLevel", 0);
        setBooleanField(term546009, term546009.getClass(), "isOverloaded", false);
        setBooleanField(term546009, term546009.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnergyReserve", argTypes, term546009, args);
    }

};


