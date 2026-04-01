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

public class Combat_setTimerForWormHole_1357419730121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334860;
     Object term334878;

    public Combat_setTimerForWormHole_1357419730121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334860 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term334860, term334860.getClass(), "combatShipList", null);
        setIntField(term334860, term334860.getClass(), "shipIndex", 0);
        setIntField(term334860, term334860.getClass(), "cursorX", 0);
        setIntField(term334860, term334860.getClass(), "cursorY", 0);
        setIntField(term334860, term334860.getClass(), "componentUse", 0);
        setField(term334860, term334860.getClass(), "animation", null);
        setField(term334860, term334860.getClass(), "attackerFleet", null);
        setField(term334860, term334860.getClass(), "defenderFleet", null);
        setField(term334860, term334860.getClass(), "starbaseFleet", null);
        setField(term334860, term334860.getClass(), "winner", null);
        setField(term334860, term334860.getClass(), "attackerInfo", null);
        setField(term334860, term334860.getClass(), "defenderInfo", null);
        setField(term334860, term334860.getClass(), "planet", null);
        setIntField(term334860, term334860.getClass(), "totalRounds", 0);
        setIntField(term334860, term334860.getClass(), "roundsNoDamge", 0);
        setBooleanField(term334860, term334860.getClass(), "endCombatHandled", false);
        setField(term334860, term334860.getClass(), "wormHole", null);
        setIntField(term334860, term334860.getClass(), "timerForWormHole", 0);
        setBooleanField(term334860, term334860.getClass(), "defenderEscaped", false);
        setBooleanField(term334860, term334860.getClass(), "attackerEscaped", false);
        setField(term334860, term334860.getClass(), "escapePosition", null);
        setField(term334860, term334860.getClass(), "combatEvent", null);
        setIntField(term334860, term334860.getClass(), "defenderMilitaryValue", 0);
        setIntField(term334860, term334860.getClass(), "attackerMilitaryValue", 0);
        setField(term334860, term334860.getClass(), "leaderKilledNews", null);
        setField(term334860, term334860.getClass(), "orbitalDestroyedNews", null);
        setField(term334860, term334860.getClass(), "leaderInCombat", null);
        setBooleanField(term334860, term334860.getClass(), "attackerPrivateer", false);
        setBooleanField(term334860, term334860.getClass(), "defenderPrivateer", false);
        setBooleanField(term334860, term334860.getClass(), "orbitalInCombat", false);
        setIntField(term334860, term334860.getClass(), "starYear", 0);
        setBooleanField(term334860, term334860.getClass(), "worthOfWarHero", false);
        term334878 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term334878;
        callMethod(klass, "setTimerForWormHole", argTypes, term334860, args);
    }

};


