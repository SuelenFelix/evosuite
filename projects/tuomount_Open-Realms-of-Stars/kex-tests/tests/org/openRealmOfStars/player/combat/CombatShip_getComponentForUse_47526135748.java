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

public class CombatShip_getComponentForUse_47526135748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545430;

    public CombatShip_getComponentForUse_47526135748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545430 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545430, term545430.getClass(), "ship", null);
        setField(term545430, term545430.getClass(), "componentUsed", null);
        setIntField(term545430, term545430.getClass(), "x", 0);
        setIntField(term545430, term545430.getClass(), "y", 0);
        setField(term545430, term545430.getClass(), "player", null);
        setBooleanField(term545430, term545430.getClass(), "flipY", false);
        setIntField(term545430, term545430.getClass(), "movesLeft", 0);
        setIntField(term545430, term545430.getClass(), "aiShotsLeft", 0);
        setIntField(term545430, term545430.getClass(), "bonusAccuracy", 0);
        setIntField(term545430, term545430.getClass(), "overloadedJammer", 0);
        setIntField(term545430, term545430.getClass(), "overloadedComputer", 0);
        setBooleanField(term545430, term545430.getClass(), "damaged", false);
        setIntField(term545430, term545430.getClass(), "privateeredCredits", 0);
        setField(term545430, term545430.getClass(), "commander", null);
        setIntField(term545430, term545430.getClass(), "overloadFailure", 0);
        setIntField(term545430, term545430.getClass(), "energyLevel", 0);
        setBooleanField(term545430, term545430.getClass(), "isOverloaded", false);
        setBooleanField(term545430, term545430.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipComponentType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getComponentForUse", argTypes, term545430, args);
    }

};


