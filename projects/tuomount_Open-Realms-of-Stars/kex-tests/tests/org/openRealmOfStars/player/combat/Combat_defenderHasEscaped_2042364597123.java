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

public class Combat_defenderHasEscaped_2042364597123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337094;

    public Combat_defenderHasEscaped_2042364597123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337094 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term337094, term337094.getClass(), "combatShipList", null);
        setIntField(term337094, term337094.getClass(), "shipIndex", 0);
        setIntField(term337094, term337094.getClass(), "cursorX", 0);
        setIntField(term337094, term337094.getClass(), "cursorY", 0);
        setIntField(term337094, term337094.getClass(), "componentUse", 0);
        setField(term337094, term337094.getClass(), "animation", null);
        setField(term337094, term337094.getClass(), "attackerFleet", null);
        setField(term337094, term337094.getClass(), "defenderFleet", null);
        setField(term337094, term337094.getClass(), "starbaseFleet", null);
        setField(term337094, term337094.getClass(), "winner", null);
        setField(term337094, term337094.getClass(), "attackerInfo", null);
        setField(term337094, term337094.getClass(), "defenderInfo", null);
        setField(term337094, term337094.getClass(), "planet", null);
        setIntField(term337094, term337094.getClass(), "totalRounds", 0);
        setIntField(term337094, term337094.getClass(), "roundsNoDamge", 0);
        setBooleanField(term337094, term337094.getClass(), "endCombatHandled", false);
        setField(term337094, term337094.getClass(), "wormHole", null);
        setIntField(term337094, term337094.getClass(), "timerForWormHole", 0);
        setBooleanField(term337094, term337094.getClass(), "defenderEscaped", false);
        setBooleanField(term337094, term337094.getClass(), "attackerEscaped", false);
        setField(term337094, term337094.getClass(), "escapePosition", null);
        setField(term337094, term337094.getClass(), "combatEvent", null);
        setIntField(term337094, term337094.getClass(), "defenderMilitaryValue", 0);
        setIntField(term337094, term337094.getClass(), "attackerMilitaryValue", 0);
        setField(term337094, term337094.getClass(), "leaderKilledNews", null);
        setField(term337094, term337094.getClass(), "orbitalDestroyedNews", null);
        setField(term337094, term337094.getClass(), "leaderInCombat", null);
        setBooleanField(term337094, term337094.getClass(), "attackerPrivateer", false);
        setBooleanField(term337094, term337094.getClass(), "defenderPrivateer", false);
        setBooleanField(term337094, term337094.getClass(), "orbitalInCombat", false);
        setIntField(term337094, term337094.getClass(), "starYear", 0);
        setBooleanField(term337094, term337094.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "defenderHasEscaped", argTypes, term337094, args);
    }

};


