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
import java.lang.Boolean;

public class Combat_doFastCombat_126768686492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280838;
     Object term280856;

    public Combat_doFastCombat_126768686492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280838 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term280838, term280838.getClass(), "combatShipList", null);
        setIntField(term280838, term280838.getClass(), "shipIndex", 0);
        setIntField(term280838, term280838.getClass(), "cursorX", 0);
        setIntField(term280838, term280838.getClass(), "cursorY", 0);
        setIntField(term280838, term280838.getClass(), "componentUse", 0);
        setField(term280838, term280838.getClass(), "animation", null);
        setField(term280838, term280838.getClass(), "attackerFleet", null);
        setField(term280838, term280838.getClass(), "defenderFleet", null);
        setField(term280838, term280838.getClass(), "starbaseFleet", null);
        setField(term280838, term280838.getClass(), "winner", null);
        setField(term280838, term280838.getClass(), "attackerInfo", null);
        setField(term280838, term280838.getClass(), "defenderInfo", null);
        setField(term280838, term280838.getClass(), "planet", null);
        setIntField(term280838, term280838.getClass(), "totalRounds", 0);
        setIntField(term280838, term280838.getClass(), "roundsNoDamge", 0);
        setBooleanField(term280838, term280838.getClass(), "endCombatHandled", false);
        setField(term280838, term280838.getClass(), "wormHole", null);
        setIntField(term280838, term280838.getClass(), "timerForWormHole", 0);
        setBooleanField(term280838, term280838.getClass(), "defenderEscaped", false);
        setBooleanField(term280838, term280838.getClass(), "attackerEscaped", false);
        setField(term280838, term280838.getClass(), "escapePosition", null);
        setField(term280838, term280838.getClass(), "combatEvent", null);
        setIntField(term280838, term280838.getClass(), "defenderMilitaryValue", 0);
        setIntField(term280838, term280838.getClass(), "attackerMilitaryValue", 0);
        setField(term280838, term280838.getClass(), "leaderKilledNews", null);
        setField(term280838, term280838.getClass(), "orbitalDestroyedNews", null);
        setField(term280838, term280838.getClass(), "leaderInCombat", null);
        setBooleanField(term280838, term280838.getClass(), "attackerPrivateer", false);
        setBooleanField(term280838, term280838.getClass(), "defenderPrivateer", false);
        setBooleanField(term280838, term280838.getClass(), "orbitalInCombat", false);
        setIntField(term280838, term280838.getClass(), "starYear", 0);
        setBooleanField(term280838, term280838.getClass(), "worthOfWarHero", false);
        term280856 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term280856;
        callMethod(klass, "doFastCombat", argTypes, term280838, args);
    }

};


