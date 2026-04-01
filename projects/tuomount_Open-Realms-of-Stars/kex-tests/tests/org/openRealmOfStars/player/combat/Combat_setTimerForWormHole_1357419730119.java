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

public class Combat_setTimerForWormHole_1357419730119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749774;
     Object term749792;

    public Combat_setTimerForWormHole_1357419730119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749774 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term749774, term749774.getClass(), "combatShipList", null);
        setIntField(term749774, term749774.getClass(), "shipIndex", 0);
        setIntField(term749774, term749774.getClass(), "cursorX", 0);
        setIntField(term749774, term749774.getClass(), "cursorY", 0);
        setIntField(term749774, term749774.getClass(), "componentUse", 0);
        setField(term749774, term749774.getClass(), "animation", null);
        setField(term749774, term749774.getClass(), "attackerFleet", null);
        setField(term749774, term749774.getClass(), "defenderFleet", null);
        setField(term749774, term749774.getClass(), "starbaseFleet", null);
        setField(term749774, term749774.getClass(), "winner", null);
        setField(term749774, term749774.getClass(), "attackerInfo", null);
        setField(term749774, term749774.getClass(), "defenderInfo", null);
        setField(term749774, term749774.getClass(), "planet", null);
        setIntField(term749774, term749774.getClass(), "totalRounds", 0);
        setIntField(term749774, term749774.getClass(), "roundsNoDamge", 0);
        setBooleanField(term749774, term749774.getClass(), "endCombatHandled", false);
        setField(term749774, term749774.getClass(), "wormHole", null);
        setIntField(term749774, term749774.getClass(), "timerForWormHole", 0);
        setBooleanField(term749774, term749774.getClass(), "defenderEscaped", false);
        setBooleanField(term749774, term749774.getClass(), "attackerEscaped", false);
        setField(term749774, term749774.getClass(), "escapePosition", null);
        setField(term749774, term749774.getClass(), "combatEvent", null);
        setIntField(term749774, term749774.getClass(), "defenderMilitaryValue", 0);
        setIntField(term749774, term749774.getClass(), "attackerMilitaryValue", 0);
        setField(term749774, term749774.getClass(), "leaderKilledNews", null);
        setField(term749774, term749774.getClass(), "orbitalDestroyedNews", null);
        setField(term749774, term749774.getClass(), "leaderInCombat", null);
        setBooleanField(term749774, term749774.getClass(), "attackerPrivateer", false);
        setBooleanField(term749774, term749774.getClass(), "defenderPrivateer", false);
        setBooleanField(term749774, term749774.getClass(), "orbitalInCombat", false);
        setIntField(term749774, term749774.getClass(), "starYear", 0);
        setBooleanField(term749774, term749774.getClass(), "worthOfWarHero", false);
        term749792 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term749792;
        callMethod(klass, "setTimerForWormHole", argTypes, term749774, args);
    }

};


