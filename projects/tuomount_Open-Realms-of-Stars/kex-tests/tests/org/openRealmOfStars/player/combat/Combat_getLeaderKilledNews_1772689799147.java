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

public class Combat_getLeaderKilledNews_1772689799147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405361;

    public Combat_getLeaderKilledNews_1772689799147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405361 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405361, term405361.getClass(), "combatShipList", null);
        setIntField(term405361, term405361.getClass(), "shipIndex", 0);
        setIntField(term405361, term405361.getClass(), "cursorX", 0);
        setIntField(term405361, term405361.getClass(), "cursorY", 0);
        setIntField(term405361, term405361.getClass(), "componentUse", 0);
        setField(term405361, term405361.getClass(), "animation", null);
        setField(term405361, term405361.getClass(), "attackerFleet", null);
        setField(term405361, term405361.getClass(), "defenderFleet", null);
        setField(term405361, term405361.getClass(), "starbaseFleet", null);
        setField(term405361, term405361.getClass(), "winner", null);
        setField(term405361, term405361.getClass(), "attackerInfo", null);
        setField(term405361, term405361.getClass(), "defenderInfo", null);
        setField(term405361, term405361.getClass(), "planet", null);
        setIntField(term405361, term405361.getClass(), "totalRounds", 0);
        setIntField(term405361, term405361.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405361, term405361.getClass(), "endCombatHandled", false);
        setField(term405361, term405361.getClass(), "wormHole", null);
        setIntField(term405361, term405361.getClass(), "timerForWormHole", 0);
        setBooleanField(term405361, term405361.getClass(), "defenderEscaped", false);
        setBooleanField(term405361, term405361.getClass(), "attackerEscaped", false);
        setField(term405361, term405361.getClass(), "escapePosition", null);
        setField(term405361, term405361.getClass(), "combatEvent", null);
        setIntField(term405361, term405361.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405361, term405361.getClass(), "attackerMilitaryValue", 0);
        setField(term405361, term405361.getClass(), "leaderKilledNews", null);
        setField(term405361, term405361.getClass(), "orbitalDestroyedNews", null);
        setField(term405361, term405361.getClass(), "leaderInCombat", null);
        setBooleanField(term405361, term405361.getClass(), "attackerPrivateer", false);
        setBooleanField(term405361, term405361.getClass(), "defenderPrivateer", false);
        setBooleanField(term405361, term405361.getClass(), "orbitalInCombat", false);
        setIntField(term405361, term405361.getClass(), "starYear", 0);
        setBooleanField(term405361, term405361.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeaderKilledNews", argTypes, term405361, args);
    }

};


