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

public class CombatShip_isDamaged_172597214271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545791;

    public CombatShip_isDamaged_172597214271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545791 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545791, term545791.getClass(), "ship", null);
        setField(term545791, term545791.getClass(), "componentUsed", null);
        setIntField(term545791, term545791.getClass(), "x", 0);
        setIntField(term545791, term545791.getClass(), "y", 0);
        setField(term545791, term545791.getClass(), "player", null);
        setBooleanField(term545791, term545791.getClass(), "flipY", false);
        setIntField(term545791, term545791.getClass(), "movesLeft", 0);
        setIntField(term545791, term545791.getClass(), "aiShotsLeft", 0);
        setIntField(term545791, term545791.getClass(), "bonusAccuracy", 0);
        setIntField(term545791, term545791.getClass(), "overloadedJammer", 0);
        setIntField(term545791, term545791.getClass(), "overloadedComputer", 0);
        setBooleanField(term545791, term545791.getClass(), "damaged", false);
        setIntField(term545791, term545791.getClass(), "privateeredCredits", 0);
        setField(term545791, term545791.getClass(), "commander", null);
        setIntField(term545791, term545791.getClass(), "overloadFailure", 0);
        setIntField(term545791, term545791.getClass(), "energyLevel", 0);
        setBooleanField(term545791, term545791.getClass(), "isOverloaded", false);
        setBooleanField(term545791, term545791.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDamaged", argTypes, term545791, args);
    }

};


