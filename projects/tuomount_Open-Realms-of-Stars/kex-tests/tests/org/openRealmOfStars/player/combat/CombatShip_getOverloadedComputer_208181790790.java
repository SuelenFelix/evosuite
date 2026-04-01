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

public class CombatShip_getOverloadedComputer_208181790790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546088;

    public CombatShip_getOverloadedComputer_208181790790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546088 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term546088, term546088.getClass(), "ship", null);
        setField(term546088, term546088.getClass(), "componentUsed", null);
        setIntField(term546088, term546088.getClass(), "x", 0);
        setIntField(term546088, term546088.getClass(), "y", 0);
        setField(term546088, term546088.getClass(), "player", null);
        setBooleanField(term546088, term546088.getClass(), "flipY", false);
        setIntField(term546088, term546088.getClass(), "movesLeft", 0);
        setIntField(term546088, term546088.getClass(), "aiShotsLeft", 0);
        setIntField(term546088, term546088.getClass(), "bonusAccuracy", 0);
        setIntField(term546088, term546088.getClass(), "overloadedJammer", 0);
        setIntField(term546088, term546088.getClass(), "overloadedComputer", 0);
        setBooleanField(term546088, term546088.getClass(), "damaged", false);
        setIntField(term546088, term546088.getClass(), "privateeredCredits", 0);
        setField(term546088, term546088.getClass(), "commander", null);
        setIntField(term546088, term546088.getClass(), "overloadFailure", 0);
        setIntField(term546088, term546088.getClass(), "energyLevel", 0);
        setBooleanField(term546088, term546088.getClass(), "isOverloaded", false);
        setBooleanField(term546088, term546088.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverloadedComputer", argTypes, term546088, args);
    }

};


