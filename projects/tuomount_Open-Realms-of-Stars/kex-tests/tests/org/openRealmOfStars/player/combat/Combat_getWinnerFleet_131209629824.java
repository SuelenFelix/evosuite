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

public class Combat_getWinnerFleet_131209629824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89126;

    public Combat_getWinnerFleet_131209629824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89126 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term89126, term89126.getClass(), "combatShipList", null);
        setIntField(term89126, term89126.getClass(), "shipIndex", 0);
        setIntField(term89126, term89126.getClass(), "cursorX", 0);
        setIntField(term89126, term89126.getClass(), "cursorY", 0);
        setIntField(term89126, term89126.getClass(), "componentUse", 0);
        setField(term89126, term89126.getClass(), "animation", null);
        setField(term89126, term89126.getClass(), "attackerFleet", null);
        setField(term89126, term89126.getClass(), "defenderFleet", null);
        setField(term89126, term89126.getClass(), "starbaseFleet", null);
        setField(term89126, term89126.getClass(), "winner", null);
        setField(term89126, term89126.getClass(), "attackerInfo", null);
        setField(term89126, term89126.getClass(), "defenderInfo", null);
        setField(term89126, term89126.getClass(), "planet", null);
        setIntField(term89126, term89126.getClass(), "totalRounds", 0);
        setIntField(term89126, term89126.getClass(), "roundsNoDamge", 0);
        setBooleanField(term89126, term89126.getClass(), "endCombatHandled", false);
        setField(term89126, term89126.getClass(), "wormHole", null);
        setIntField(term89126, term89126.getClass(), "timerForWormHole", 0);
        setBooleanField(term89126, term89126.getClass(), "defenderEscaped", false);
        setBooleanField(term89126, term89126.getClass(), "attackerEscaped", false);
        setField(term89126, term89126.getClass(), "escapePosition", null);
        setField(term89126, term89126.getClass(), "combatEvent", null);
        setIntField(term89126, term89126.getClass(), "defenderMilitaryValue", 0);
        setIntField(term89126, term89126.getClass(), "attackerMilitaryValue", 0);
        setField(term89126, term89126.getClass(), "leaderKilledNews", null);
        setField(term89126, term89126.getClass(), "orbitalDestroyedNews", null);
        setField(term89126, term89126.getClass(), "leaderInCombat", null);
        setBooleanField(term89126, term89126.getClass(), "attackerPrivateer", false);
        setBooleanField(term89126, term89126.getClass(), "defenderPrivateer", false);
        setBooleanField(term89126, term89126.getClass(), "orbitalInCombat", false);
        setIntField(term89126, term89126.getClass(), "starYear", 0);
        setBooleanField(term89126, term89126.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinnerFleet", argTypes, term89126, args);
    }

};


