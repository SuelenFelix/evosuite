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

public class Combat_isHumanPlayer_1584985059115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745140;

    public Combat_isHumanPlayer_1584985059115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745140 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term745140, term745140.getClass(), "combatShipList", null);
        setIntField(term745140, term745140.getClass(), "shipIndex", 0);
        setIntField(term745140, term745140.getClass(), "cursorX", 0);
        setIntField(term745140, term745140.getClass(), "cursorY", 0);
        setIntField(term745140, term745140.getClass(), "componentUse", 0);
        setField(term745140, term745140.getClass(), "animation", null);
        setField(term745140, term745140.getClass(), "attackerFleet", null);
        setField(term745140, term745140.getClass(), "defenderFleet", null);
        setField(term745140, term745140.getClass(), "starbaseFleet", null);
        setField(term745140, term745140.getClass(), "winner", null);
        setField(term745140, term745140.getClass(), "attackerInfo", null);
        setField(term745140, term745140.getClass(), "defenderInfo", null);
        setField(term745140, term745140.getClass(), "planet", null);
        setIntField(term745140, term745140.getClass(), "totalRounds", 0);
        setIntField(term745140, term745140.getClass(), "roundsNoDamge", 0);
        setBooleanField(term745140, term745140.getClass(), "endCombatHandled", false);
        setField(term745140, term745140.getClass(), "wormHole", null);
        setIntField(term745140, term745140.getClass(), "timerForWormHole", 0);
        setBooleanField(term745140, term745140.getClass(), "defenderEscaped", false);
        setBooleanField(term745140, term745140.getClass(), "attackerEscaped", false);
        setField(term745140, term745140.getClass(), "escapePosition", null);
        setField(term745140, term745140.getClass(), "combatEvent", null);
        setIntField(term745140, term745140.getClass(), "defenderMilitaryValue", 0);
        setIntField(term745140, term745140.getClass(), "attackerMilitaryValue", 0);
        setField(term745140, term745140.getClass(), "leaderKilledNews", null);
        setField(term745140, term745140.getClass(), "orbitalDestroyedNews", null);
        setField(term745140, term745140.getClass(), "leaderInCombat", null);
        setBooleanField(term745140, term745140.getClass(), "attackerPrivateer", false);
        setBooleanField(term745140, term745140.getClass(), "defenderPrivateer", false);
        setBooleanField(term745140, term745140.getClass(), "orbitalInCombat", false);
        setIntField(term745140, term745140.getClass(), "starYear", 0);
        setBooleanField(term745140, term745140.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHumanPlayer", argTypes, term745140, args);
    }

};


