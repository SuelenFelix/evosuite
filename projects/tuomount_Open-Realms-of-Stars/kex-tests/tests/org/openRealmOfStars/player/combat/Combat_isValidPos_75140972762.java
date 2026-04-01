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

public class Combat_isValidPos_75140972762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228026;
     Object term228044;
     Object term228046;

    public Combat_isValidPos_75140972762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228026 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term228026, term228026.getClass(), "combatShipList", null);
        setIntField(term228026, term228026.getClass(), "shipIndex", 0);
        setIntField(term228026, term228026.getClass(), "cursorX", 0);
        setIntField(term228026, term228026.getClass(), "cursorY", 0);
        setIntField(term228026, term228026.getClass(), "componentUse", 0);
        setField(term228026, term228026.getClass(), "animation", null);
        setField(term228026, term228026.getClass(), "attackerFleet", null);
        setField(term228026, term228026.getClass(), "defenderFleet", null);
        setField(term228026, term228026.getClass(), "starbaseFleet", null);
        setField(term228026, term228026.getClass(), "winner", null);
        setField(term228026, term228026.getClass(), "attackerInfo", null);
        setField(term228026, term228026.getClass(), "defenderInfo", null);
        setField(term228026, term228026.getClass(), "planet", null);
        setIntField(term228026, term228026.getClass(), "totalRounds", 0);
        setIntField(term228026, term228026.getClass(), "roundsNoDamge", 0);
        setBooleanField(term228026, term228026.getClass(), "endCombatHandled", false);
        setField(term228026, term228026.getClass(), "wormHole", null);
        setIntField(term228026, term228026.getClass(), "timerForWormHole", 0);
        setBooleanField(term228026, term228026.getClass(), "defenderEscaped", false);
        setBooleanField(term228026, term228026.getClass(), "attackerEscaped", false);
        setField(term228026, term228026.getClass(), "escapePosition", null);
        setField(term228026, term228026.getClass(), "combatEvent", null);
        setIntField(term228026, term228026.getClass(), "defenderMilitaryValue", 0);
        setIntField(term228026, term228026.getClass(), "attackerMilitaryValue", 0);
        setField(term228026, term228026.getClass(), "leaderKilledNews", null);
        setField(term228026, term228026.getClass(), "orbitalDestroyedNews", null);
        setField(term228026, term228026.getClass(), "leaderInCombat", null);
        setBooleanField(term228026, term228026.getClass(), "attackerPrivateer", false);
        setBooleanField(term228026, term228026.getClass(), "defenderPrivateer", false);
        setBooleanField(term228026, term228026.getClass(), "orbitalInCombat", false);
        setIntField(term228026, term228026.getClass(), "starYear", 0);
        setBooleanField(term228026, term228026.getClass(), "worthOfWarHero", false);
        term228044 = new Integer(0);
        term228046 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term228044;
        args[1] = term228046;
        callMethod(klass, "isValidPos", argTypes, term228026, args);
    }

};


