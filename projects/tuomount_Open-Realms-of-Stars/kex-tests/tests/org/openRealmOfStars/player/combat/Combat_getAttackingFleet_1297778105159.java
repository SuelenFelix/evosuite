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

public class Combat_getAttackingFleet_1297778105159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405581;

    public Combat_getAttackingFleet_1297778105159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405581 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405581, term405581.getClass(), "combatShipList", null);
        setIntField(term405581, term405581.getClass(), "shipIndex", 0);
        setIntField(term405581, term405581.getClass(), "cursorX", 0);
        setIntField(term405581, term405581.getClass(), "cursorY", 0);
        setIntField(term405581, term405581.getClass(), "componentUse", 0);
        setField(term405581, term405581.getClass(), "animation", null);
        setField(term405581, term405581.getClass(), "attackerFleet", null);
        setField(term405581, term405581.getClass(), "defenderFleet", null);
        setField(term405581, term405581.getClass(), "starbaseFleet", null);
        setField(term405581, term405581.getClass(), "winner", null);
        setField(term405581, term405581.getClass(), "attackerInfo", null);
        setField(term405581, term405581.getClass(), "defenderInfo", null);
        setField(term405581, term405581.getClass(), "planet", null);
        setIntField(term405581, term405581.getClass(), "totalRounds", 0);
        setIntField(term405581, term405581.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405581, term405581.getClass(), "endCombatHandled", false);
        setField(term405581, term405581.getClass(), "wormHole", null);
        setIntField(term405581, term405581.getClass(), "timerForWormHole", 0);
        setBooleanField(term405581, term405581.getClass(), "defenderEscaped", false);
        setBooleanField(term405581, term405581.getClass(), "attackerEscaped", false);
        setField(term405581, term405581.getClass(), "escapePosition", null);
        setField(term405581, term405581.getClass(), "combatEvent", null);
        setIntField(term405581, term405581.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405581, term405581.getClass(), "attackerMilitaryValue", 0);
        setField(term405581, term405581.getClass(), "leaderKilledNews", null);
        setField(term405581, term405581.getClass(), "orbitalDestroyedNews", null);
        setField(term405581, term405581.getClass(), "leaderInCombat", null);
        setBooleanField(term405581, term405581.getClass(), "attackerPrivateer", false);
        setBooleanField(term405581, term405581.getClass(), "defenderPrivateer", false);
        setBooleanField(term405581, term405581.getClass(), "orbitalInCombat", false);
        setIntField(term405581, term405581.getClass(), "starYear", 0);
        setBooleanField(term405581, term405581.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttackingFleet", argTypes, term405581, args);
    }

};


