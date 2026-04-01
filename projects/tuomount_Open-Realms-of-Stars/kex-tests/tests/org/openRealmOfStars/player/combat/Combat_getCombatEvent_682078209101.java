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

public class Combat_getCombatEvent_682078209101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295244;

    public Combat_getCombatEvent_682078209101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295244 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term295244, term295244.getClass(), "combatShipList", null);
        setIntField(term295244, term295244.getClass(), "shipIndex", 0);
        setIntField(term295244, term295244.getClass(), "cursorX", 0);
        setIntField(term295244, term295244.getClass(), "cursorY", 0);
        setIntField(term295244, term295244.getClass(), "componentUse", 0);
        setField(term295244, term295244.getClass(), "animation", null);
        setField(term295244, term295244.getClass(), "attackerFleet", null);
        setField(term295244, term295244.getClass(), "defenderFleet", null);
        setField(term295244, term295244.getClass(), "starbaseFleet", null);
        setField(term295244, term295244.getClass(), "winner", null);
        setField(term295244, term295244.getClass(), "attackerInfo", null);
        setField(term295244, term295244.getClass(), "defenderInfo", null);
        setField(term295244, term295244.getClass(), "planet", null);
        setIntField(term295244, term295244.getClass(), "totalRounds", 0);
        setIntField(term295244, term295244.getClass(), "roundsNoDamge", 0);
        setBooleanField(term295244, term295244.getClass(), "endCombatHandled", false);
        setField(term295244, term295244.getClass(), "wormHole", null);
        setIntField(term295244, term295244.getClass(), "timerForWormHole", 0);
        setBooleanField(term295244, term295244.getClass(), "defenderEscaped", false);
        setBooleanField(term295244, term295244.getClass(), "attackerEscaped", false);
        setField(term295244, term295244.getClass(), "escapePosition", null);
        setField(term295244, term295244.getClass(), "combatEvent", null);
        setIntField(term295244, term295244.getClass(), "defenderMilitaryValue", 0);
        setIntField(term295244, term295244.getClass(), "attackerMilitaryValue", 0);
        setField(term295244, term295244.getClass(), "leaderKilledNews", null);
        setField(term295244, term295244.getClass(), "orbitalDestroyedNews", null);
        setField(term295244, term295244.getClass(), "leaderInCombat", null);
        setBooleanField(term295244, term295244.getClass(), "attackerPrivateer", false);
        setBooleanField(term295244, term295244.getClass(), "defenderPrivateer", false);
        setBooleanField(term295244, term295244.getClass(), "orbitalInCombat", false);
        setIntField(term295244, term295244.getClass(), "starYear", 0);
        setBooleanField(term295244, term295244.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCombatEvent", argTypes, term295244, args);
    }

};


