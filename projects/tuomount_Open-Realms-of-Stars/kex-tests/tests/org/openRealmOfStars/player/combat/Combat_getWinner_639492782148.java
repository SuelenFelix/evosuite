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

public class Combat_getWinner_639492782148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819249;

    public Combat_getWinner_639492782148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819249 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819249, term819249.getClass(), "combatShipList", null);
        setIntField(term819249, term819249.getClass(), "shipIndex", 0);
        setIntField(term819249, term819249.getClass(), "cursorX", 0);
        setIntField(term819249, term819249.getClass(), "cursorY", 0);
        setIntField(term819249, term819249.getClass(), "componentUse", 0);
        setField(term819249, term819249.getClass(), "animation", null);
        setField(term819249, term819249.getClass(), "attackerFleet", null);
        setField(term819249, term819249.getClass(), "defenderFleet", null);
        setField(term819249, term819249.getClass(), "starbaseFleet", null);
        setField(term819249, term819249.getClass(), "winner", null);
        setField(term819249, term819249.getClass(), "attackerInfo", null);
        setField(term819249, term819249.getClass(), "defenderInfo", null);
        setField(term819249, term819249.getClass(), "planet", null);
        setIntField(term819249, term819249.getClass(), "totalRounds", 0);
        setIntField(term819249, term819249.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819249, term819249.getClass(), "endCombatHandled", false);
        setField(term819249, term819249.getClass(), "wormHole", null);
        setIntField(term819249, term819249.getClass(), "timerForWormHole", 0);
        setBooleanField(term819249, term819249.getClass(), "defenderEscaped", false);
        setBooleanField(term819249, term819249.getClass(), "attackerEscaped", false);
        setField(term819249, term819249.getClass(), "escapePosition", null);
        setField(term819249, term819249.getClass(), "combatEvent", null);
        setIntField(term819249, term819249.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819249, term819249.getClass(), "attackerMilitaryValue", 0);
        setField(term819249, term819249.getClass(), "leaderKilledNews", null);
        setField(term819249, term819249.getClass(), "orbitalDestroyedNews", null);
        setField(term819249, term819249.getClass(), "leaderInCombat", null);
        setBooleanField(term819249, term819249.getClass(), "attackerPrivateer", false);
        setBooleanField(term819249, term819249.getClass(), "defenderPrivateer", false);
        setBooleanField(term819249, term819249.getClass(), "orbitalInCombat", false);
        setIntField(term819249, term819249.getClass(), "starYear", 0);
        setBooleanField(term819249, term819249.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinner", argTypes, term819249, args);
    }

};


