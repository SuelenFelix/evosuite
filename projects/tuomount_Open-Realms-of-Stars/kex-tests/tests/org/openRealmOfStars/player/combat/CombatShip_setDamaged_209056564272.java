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

public class CombatShip_setDamaged_209056564272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545806;

    public CombatShip_setDamaged_209056564272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545806 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545806, term545806.getClass(), "ship", null);
        setField(term545806, term545806.getClass(), "componentUsed", null);
        setIntField(term545806, term545806.getClass(), "x", 0);
        setIntField(term545806, term545806.getClass(), "y", 0);
        setField(term545806, term545806.getClass(), "player", null);
        setBooleanField(term545806, term545806.getClass(), "flipY", false);
        setIntField(term545806, term545806.getClass(), "movesLeft", 0);
        setIntField(term545806, term545806.getClass(), "aiShotsLeft", 0);
        setIntField(term545806, term545806.getClass(), "bonusAccuracy", 0);
        setIntField(term545806, term545806.getClass(), "overloadedJammer", 0);
        setIntField(term545806, term545806.getClass(), "overloadedComputer", 0);
        setBooleanField(term545806, term545806.getClass(), "damaged", false);
        setIntField(term545806, term545806.getClass(), "privateeredCredits", 0);
        setField(term545806, term545806.getClass(), "commander", null);
        setIntField(term545806, term545806.getClass(), "overloadFailure", 0);
        setIntField(term545806, term545806.getClass(), "energyLevel", 0);
        setBooleanField(term545806, term545806.getClass(), "isOverloaded", false);
        setBooleanField(term545806, term545806.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setDamaged", argTypes, term545806, args);
    }

};


