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
import java.lang.Boolean;

public class Combat_isBlocked_81006534166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232475;
     Object term232493;
     Object term232495;
     Object term232497;

    public Combat_isBlocked_81006534166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232475 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term232475, term232475.getClass(), "combatShipList", null);
        setIntField(term232475, term232475.getClass(), "shipIndex", 0);
        setIntField(term232475, term232475.getClass(), "cursorX", 0);
        setIntField(term232475, term232475.getClass(), "cursorY", 0);
        setIntField(term232475, term232475.getClass(), "componentUse", 0);
        setField(term232475, term232475.getClass(), "animation", null);
        setField(term232475, term232475.getClass(), "attackerFleet", null);
        setField(term232475, term232475.getClass(), "defenderFleet", null);
        setField(term232475, term232475.getClass(), "starbaseFleet", null);
        setField(term232475, term232475.getClass(), "winner", null);
        setField(term232475, term232475.getClass(), "attackerInfo", null);
        setField(term232475, term232475.getClass(), "defenderInfo", null);
        setField(term232475, term232475.getClass(), "planet", null);
        setIntField(term232475, term232475.getClass(), "totalRounds", 0);
        setIntField(term232475, term232475.getClass(), "roundsNoDamge", 0);
        setBooleanField(term232475, term232475.getClass(), "endCombatHandled", false);
        setField(term232475, term232475.getClass(), "wormHole", null);
        setIntField(term232475, term232475.getClass(), "timerForWormHole", 0);
        setBooleanField(term232475, term232475.getClass(), "defenderEscaped", false);
        setBooleanField(term232475, term232475.getClass(), "attackerEscaped", false);
        setField(term232475, term232475.getClass(), "escapePosition", null);
        setField(term232475, term232475.getClass(), "combatEvent", null);
        setIntField(term232475, term232475.getClass(), "defenderMilitaryValue", 0);
        setIntField(term232475, term232475.getClass(), "attackerMilitaryValue", 0);
        setField(term232475, term232475.getClass(), "leaderKilledNews", null);
        setField(term232475, term232475.getClass(), "orbitalDestroyedNews", null);
        setField(term232475, term232475.getClass(), "leaderInCombat", null);
        setBooleanField(term232475, term232475.getClass(), "attackerPrivateer", false);
        setBooleanField(term232475, term232475.getClass(), "defenderPrivateer", false);
        setBooleanField(term232475, term232475.getClass(), "orbitalInCombat", false);
        setIntField(term232475, term232475.getClass(), "starYear", 0);
        setBooleanField(term232475, term232475.getClass(), "worthOfWarHero", false);
        term232493 = new Integer(0);
        term232495 = new Integer(0);
        term232497 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term232493;
        args[1] = term232495;
        args[2] = term232497;
        callMethod(klass, "isBlocked", argTypes, term232475, args);
    }

};


