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

public class Combat_getCurrentShip_110396087074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241263;

    public Combat_getCurrentShip_110396087074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241263 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term241263, term241263.getClass(), "combatShipList", null);
        setIntField(term241263, term241263.getClass(), "shipIndex", 0);
        setIntField(term241263, term241263.getClass(), "cursorX", 0);
        setIntField(term241263, term241263.getClass(), "cursorY", 0);
        setIntField(term241263, term241263.getClass(), "componentUse", 0);
        setField(term241263, term241263.getClass(), "animation", null);
        setField(term241263, term241263.getClass(), "attackerFleet", null);
        setField(term241263, term241263.getClass(), "defenderFleet", null);
        setField(term241263, term241263.getClass(), "starbaseFleet", null);
        setField(term241263, term241263.getClass(), "winner", null);
        setField(term241263, term241263.getClass(), "attackerInfo", null);
        setField(term241263, term241263.getClass(), "defenderInfo", null);
        setField(term241263, term241263.getClass(), "planet", null);
        setIntField(term241263, term241263.getClass(), "totalRounds", 0);
        setIntField(term241263, term241263.getClass(), "roundsNoDamge", 0);
        setBooleanField(term241263, term241263.getClass(), "endCombatHandled", false);
        setField(term241263, term241263.getClass(), "wormHole", null);
        setIntField(term241263, term241263.getClass(), "timerForWormHole", 0);
        setBooleanField(term241263, term241263.getClass(), "defenderEscaped", false);
        setBooleanField(term241263, term241263.getClass(), "attackerEscaped", false);
        setField(term241263, term241263.getClass(), "escapePosition", null);
        setField(term241263, term241263.getClass(), "combatEvent", null);
        setIntField(term241263, term241263.getClass(), "defenderMilitaryValue", 0);
        setIntField(term241263, term241263.getClass(), "attackerMilitaryValue", 0);
        setField(term241263, term241263.getClass(), "leaderKilledNews", null);
        setField(term241263, term241263.getClass(), "orbitalDestroyedNews", null);
        setField(term241263, term241263.getClass(), "leaderInCombat", null);
        setBooleanField(term241263, term241263.getClass(), "attackerPrivateer", false);
        setBooleanField(term241263, term241263.getClass(), "defenderPrivateer", false);
        setBooleanField(term241263, term241263.getClass(), "orbitalInCombat", false);
        setIntField(term241263, term241263.getClass(), "starYear", 0);
        setBooleanField(term241263, term241263.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentShip", argTypes, term241263, args);
    }

};


