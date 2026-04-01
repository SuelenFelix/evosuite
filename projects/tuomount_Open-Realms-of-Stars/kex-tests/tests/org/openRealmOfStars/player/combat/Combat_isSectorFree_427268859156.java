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

public class Combat_isSectorFree_427268859156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405523;
     Object term405541;
     Object term405543;

    public Combat_isSectorFree_427268859156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405523 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405523, term405523.getClass(), "combatShipList", null);
        setIntField(term405523, term405523.getClass(), "shipIndex", 0);
        setIntField(term405523, term405523.getClass(), "cursorX", 0);
        setIntField(term405523, term405523.getClass(), "cursorY", 0);
        setIntField(term405523, term405523.getClass(), "componentUse", 0);
        setField(term405523, term405523.getClass(), "animation", null);
        setField(term405523, term405523.getClass(), "attackerFleet", null);
        setField(term405523, term405523.getClass(), "defenderFleet", null);
        setField(term405523, term405523.getClass(), "starbaseFleet", null);
        setField(term405523, term405523.getClass(), "winner", null);
        setField(term405523, term405523.getClass(), "attackerInfo", null);
        setField(term405523, term405523.getClass(), "defenderInfo", null);
        setField(term405523, term405523.getClass(), "planet", null);
        setIntField(term405523, term405523.getClass(), "totalRounds", 0);
        setIntField(term405523, term405523.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405523, term405523.getClass(), "endCombatHandled", false);
        setField(term405523, term405523.getClass(), "wormHole", null);
        setIntField(term405523, term405523.getClass(), "timerForWormHole", 0);
        setBooleanField(term405523, term405523.getClass(), "defenderEscaped", false);
        setBooleanField(term405523, term405523.getClass(), "attackerEscaped", false);
        setField(term405523, term405523.getClass(), "escapePosition", null);
        setField(term405523, term405523.getClass(), "combatEvent", null);
        setIntField(term405523, term405523.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405523, term405523.getClass(), "attackerMilitaryValue", 0);
        setField(term405523, term405523.getClass(), "leaderKilledNews", null);
        setField(term405523, term405523.getClass(), "orbitalDestroyedNews", null);
        setField(term405523, term405523.getClass(), "leaderInCombat", null);
        setBooleanField(term405523, term405523.getClass(), "attackerPrivateer", false);
        setBooleanField(term405523, term405523.getClass(), "defenderPrivateer", false);
        setBooleanField(term405523, term405523.getClass(), "orbitalInCombat", false);
        setIntField(term405523, term405523.getClass(), "starYear", 0);
        setBooleanField(term405523, term405523.getClass(), "worthOfWarHero", false);
        term405541 = new Integer(0);
        term405543 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term405541;
        args[1] = term405543;
        callMethod(klass, "isSectorFree", argTypes, term405523, args);
    }

};


