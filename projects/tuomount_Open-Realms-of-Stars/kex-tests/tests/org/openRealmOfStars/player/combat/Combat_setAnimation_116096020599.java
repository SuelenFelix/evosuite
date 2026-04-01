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

public class Combat_setAnimation_116096020599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292800;

    public Combat_setAnimation_116096020599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292800 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term292800, term292800.getClass(), "combatShipList", null);
        setIntField(term292800, term292800.getClass(), "shipIndex", 0);
        setIntField(term292800, term292800.getClass(), "cursorX", 0);
        setIntField(term292800, term292800.getClass(), "cursorY", 0);
        setIntField(term292800, term292800.getClass(), "componentUse", 0);
        setField(term292800, term292800.getClass(), "animation", null);
        setField(term292800, term292800.getClass(), "attackerFleet", null);
        setField(term292800, term292800.getClass(), "defenderFleet", null);
        setField(term292800, term292800.getClass(), "starbaseFleet", null);
        setField(term292800, term292800.getClass(), "winner", null);
        setField(term292800, term292800.getClass(), "attackerInfo", null);
        setField(term292800, term292800.getClass(), "defenderInfo", null);
        setField(term292800, term292800.getClass(), "planet", null);
        setIntField(term292800, term292800.getClass(), "totalRounds", 0);
        setIntField(term292800, term292800.getClass(), "roundsNoDamge", 0);
        setBooleanField(term292800, term292800.getClass(), "endCombatHandled", false);
        setField(term292800, term292800.getClass(), "wormHole", null);
        setIntField(term292800, term292800.getClass(), "timerForWormHole", 0);
        setBooleanField(term292800, term292800.getClass(), "defenderEscaped", false);
        setBooleanField(term292800, term292800.getClass(), "attackerEscaped", false);
        setField(term292800, term292800.getClass(), "escapePosition", null);
        setField(term292800, term292800.getClass(), "combatEvent", null);
        setIntField(term292800, term292800.getClass(), "defenderMilitaryValue", 0);
        setIntField(term292800, term292800.getClass(), "attackerMilitaryValue", 0);
        setField(term292800, term292800.getClass(), "leaderKilledNews", null);
        setField(term292800, term292800.getClass(), "orbitalDestroyedNews", null);
        setField(term292800, term292800.getClass(), "leaderInCombat", null);
        setBooleanField(term292800, term292800.getClass(), "attackerPrivateer", false);
        setBooleanField(term292800, term292800.getClass(), "defenderPrivateer", false);
        setBooleanField(term292800, term292800.getClass(), "orbitalInCombat", false);
        setIntField(term292800, term292800.getClass(), "starYear", 0);
        setBooleanField(term292800, term292800.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatAnimation");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAnimation", argTypes, term292800, args);
    }

};


