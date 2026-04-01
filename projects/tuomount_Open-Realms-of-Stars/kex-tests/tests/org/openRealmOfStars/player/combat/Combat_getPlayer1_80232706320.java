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

public class Combat_getPlayer1_80232706320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487969;

    public Combat_getPlayer1_80232706320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487969 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term487969, term487969.getClass(), "combatShipList", null);
        setIntField(term487969, term487969.getClass(), "shipIndex", 0);
        setIntField(term487969, term487969.getClass(), "cursorX", 0);
        setIntField(term487969, term487969.getClass(), "cursorY", 0);
        setIntField(term487969, term487969.getClass(), "componentUse", 0);
        setField(term487969, term487969.getClass(), "animation", null);
        setField(term487969, term487969.getClass(), "attackerFleet", null);
        setField(term487969, term487969.getClass(), "defenderFleet", null);
        setField(term487969, term487969.getClass(), "starbaseFleet", null);
        setField(term487969, term487969.getClass(), "winner", null);
        setField(term487969, term487969.getClass(), "attackerInfo", null);
        setField(term487969, term487969.getClass(), "defenderInfo", null);
        setField(term487969, term487969.getClass(), "planet", null);
        setIntField(term487969, term487969.getClass(), "totalRounds", 0);
        setIntField(term487969, term487969.getClass(), "roundsNoDamge", 0);
        setBooleanField(term487969, term487969.getClass(), "endCombatHandled", false);
        setField(term487969, term487969.getClass(), "wormHole", null);
        setIntField(term487969, term487969.getClass(), "timerForWormHole", 0);
        setBooleanField(term487969, term487969.getClass(), "defenderEscaped", false);
        setBooleanField(term487969, term487969.getClass(), "attackerEscaped", false);
        setField(term487969, term487969.getClass(), "escapePosition", null);
        setField(term487969, term487969.getClass(), "combatEvent", null);
        setIntField(term487969, term487969.getClass(), "defenderMilitaryValue", 0);
        setIntField(term487969, term487969.getClass(), "attackerMilitaryValue", 0);
        setField(term487969, term487969.getClass(), "leaderKilledNews", null);
        setField(term487969, term487969.getClass(), "orbitalDestroyedNews", null);
        setField(term487969, term487969.getClass(), "leaderInCombat", null);
        setBooleanField(term487969, term487969.getClass(), "attackerPrivateer", false);
        setBooleanField(term487969, term487969.getClass(), "defenderPrivateer", false);
        setBooleanField(term487969, term487969.getClass(), "orbitalInCombat", false);
        setIntField(term487969, term487969.getClass(), "starYear", 0);
        setBooleanField(term487969, term487969.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer1", argTypes, term487969, args);
    }

};


