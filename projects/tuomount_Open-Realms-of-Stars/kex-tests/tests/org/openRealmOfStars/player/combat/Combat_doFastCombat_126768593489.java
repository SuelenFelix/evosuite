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

public class Combat_doFastCombat_126768593489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692622;

    public Combat_doFastCombat_126768593489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term692622 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term692622, term692622.getClass(), "combatShipList", null);
        setIntField(term692622, term692622.getClass(), "shipIndex", 0);
        setIntField(term692622, term692622.getClass(), "cursorX", 0);
        setIntField(term692622, term692622.getClass(), "cursorY", 0);
        setIntField(term692622, term692622.getClass(), "componentUse", 0);
        setField(term692622, term692622.getClass(), "animation", null);
        setField(term692622, term692622.getClass(), "attackerFleet", null);
        setField(term692622, term692622.getClass(), "defenderFleet", null);
        setField(term692622, term692622.getClass(), "starbaseFleet", null);
        setField(term692622, term692622.getClass(), "winner", null);
        setField(term692622, term692622.getClass(), "attackerInfo", null);
        setField(term692622, term692622.getClass(), "defenderInfo", null);
        setField(term692622, term692622.getClass(), "planet", null);
        setIntField(term692622, term692622.getClass(), "totalRounds", 0);
        setIntField(term692622, term692622.getClass(), "roundsNoDamge", 0);
        setBooleanField(term692622, term692622.getClass(), "endCombatHandled", false);
        setField(term692622, term692622.getClass(), "wormHole", null);
        setIntField(term692622, term692622.getClass(), "timerForWormHole", 0);
        setBooleanField(term692622, term692622.getClass(), "defenderEscaped", false);
        setBooleanField(term692622, term692622.getClass(), "attackerEscaped", false);
        setField(term692622, term692622.getClass(), "escapePosition", null);
        setField(term692622, term692622.getClass(), "combatEvent", null);
        setIntField(term692622, term692622.getClass(), "defenderMilitaryValue", 0);
        setIntField(term692622, term692622.getClass(), "attackerMilitaryValue", 0);
        setField(term692622, term692622.getClass(), "leaderKilledNews", null);
        setField(term692622, term692622.getClass(), "orbitalDestroyedNews", null);
        setField(term692622, term692622.getClass(), "leaderInCombat", null);
        setBooleanField(term692622, term692622.getClass(), "attackerPrivateer", false);
        setBooleanField(term692622, term692622.getClass(), "defenderPrivateer", false);
        setBooleanField(term692622, term692622.getClass(), "orbitalInCombat", false);
        setIntField(term692622, term692622.getClass(), "starYear", 0);
        setBooleanField(term692622, term692622.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doFastCombat", argTypes, term692622, args);
    }

};


