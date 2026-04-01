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

public class CombatShip_reInitShipForRound_24700376562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545644;

    public CombatShip_reInitShipForRound_24700376562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545644 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545644, term545644.getClass(), "ship", null);
        setField(term545644, term545644.getClass(), "componentUsed", null);
        setIntField(term545644, term545644.getClass(), "x", 0);
        setIntField(term545644, term545644.getClass(), "y", 0);
        setField(term545644, term545644.getClass(), "player", null);
        setBooleanField(term545644, term545644.getClass(), "flipY", false);
        setIntField(term545644, term545644.getClass(), "movesLeft", 0);
        setIntField(term545644, term545644.getClass(), "aiShotsLeft", 0);
        setIntField(term545644, term545644.getClass(), "bonusAccuracy", 0);
        setIntField(term545644, term545644.getClass(), "overloadedJammer", 0);
        setIntField(term545644, term545644.getClass(), "overloadedComputer", 0);
        setBooleanField(term545644, term545644.getClass(), "damaged", false);
        setIntField(term545644, term545644.getClass(), "privateeredCredits", 0);
        setField(term545644, term545644.getClass(), "commander", null);
        setIntField(term545644, term545644.getClass(), "overloadFailure", 0);
        setIntField(term545644, term545644.getClass(), "energyLevel", 0);
        setBooleanField(term545644, term545644.getClass(), "isOverloaded", false);
        setBooleanField(term545644, term545644.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reInitShipForRound", argTypes, term545644, args);
    }

};


