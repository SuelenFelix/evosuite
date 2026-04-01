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

public class CombatShip_isOverloadFailure_153735143565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545693;
     Object term545708;

    public CombatShip_isOverloadFailure_153735143565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545693 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545693, term545693.getClass(), "ship", null);
        setField(term545693, term545693.getClass(), "componentUsed", null);
        setIntField(term545693, term545693.getClass(), "x", 0);
        setIntField(term545693, term545693.getClass(), "y", 0);
        setField(term545693, term545693.getClass(), "player", null);
        setBooleanField(term545693, term545693.getClass(), "flipY", false);
        setIntField(term545693, term545693.getClass(), "movesLeft", 0);
        setIntField(term545693, term545693.getClass(), "aiShotsLeft", 0);
        setIntField(term545693, term545693.getClass(), "bonusAccuracy", 0);
        setIntField(term545693, term545693.getClass(), "overloadedJammer", 0);
        setIntField(term545693, term545693.getClass(), "overloadedComputer", 0);
        setBooleanField(term545693, term545693.getClass(), "damaged", false);
        setIntField(term545693, term545693.getClass(), "privateeredCredits", 0);
        setField(term545693, term545693.getClass(), "commander", null);
        setIntField(term545693, term545693.getClass(), "overloadFailure", 0);
        setIntField(term545693, term545693.getClass(), "energyLevel", 0);
        setBooleanField(term545693, term545693.getClass(), "isOverloaded", false);
        setBooleanField(term545693, term545693.getClass(), "cloakOverloaded", false);
        term545708 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term545708;
        callMethod(klass, "isOverloadFailure", argTypes, term545693, args);
    }

};


