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

public class Combat_setCursorPos_173453969560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225628;
     Object term225646;
     Object term225648;

    public Combat_setCursorPos_173453969560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225628 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term225628, term225628.getClass(), "combatShipList", null);
        setIntField(term225628, term225628.getClass(), "shipIndex", 0);
        setIntField(term225628, term225628.getClass(), "cursorX", 0);
        setIntField(term225628, term225628.getClass(), "cursorY", 0);
        setIntField(term225628, term225628.getClass(), "componentUse", 0);
        setField(term225628, term225628.getClass(), "animation", null);
        setField(term225628, term225628.getClass(), "attackerFleet", null);
        setField(term225628, term225628.getClass(), "defenderFleet", null);
        setField(term225628, term225628.getClass(), "starbaseFleet", null);
        setField(term225628, term225628.getClass(), "winner", null);
        setField(term225628, term225628.getClass(), "attackerInfo", null);
        setField(term225628, term225628.getClass(), "defenderInfo", null);
        setField(term225628, term225628.getClass(), "planet", null);
        setIntField(term225628, term225628.getClass(), "totalRounds", 0);
        setIntField(term225628, term225628.getClass(), "roundsNoDamge", 0);
        setBooleanField(term225628, term225628.getClass(), "endCombatHandled", false);
        setField(term225628, term225628.getClass(), "wormHole", null);
        setIntField(term225628, term225628.getClass(), "timerForWormHole", 0);
        setBooleanField(term225628, term225628.getClass(), "defenderEscaped", false);
        setBooleanField(term225628, term225628.getClass(), "attackerEscaped", false);
        setField(term225628, term225628.getClass(), "escapePosition", null);
        setField(term225628, term225628.getClass(), "combatEvent", null);
        setIntField(term225628, term225628.getClass(), "defenderMilitaryValue", 0);
        setIntField(term225628, term225628.getClass(), "attackerMilitaryValue", 0);
        setField(term225628, term225628.getClass(), "leaderKilledNews", null);
        setField(term225628, term225628.getClass(), "orbitalDestroyedNews", null);
        setField(term225628, term225628.getClass(), "leaderInCombat", null);
        setBooleanField(term225628, term225628.getClass(), "attackerPrivateer", false);
        setBooleanField(term225628, term225628.getClass(), "defenderPrivateer", false);
        setBooleanField(term225628, term225628.getClass(), "orbitalInCombat", false);
        setIntField(term225628, term225628.getClass(), "starYear", 0);
        setBooleanField(term225628, term225628.getClass(), "worthOfWarHero", false);
        term225646 = new Integer(0);
        term225648 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term225646;
        args[1] = term225648;
        callMethod(klass, "setCursorPos", argTypes, term225628, args);
    }

};


