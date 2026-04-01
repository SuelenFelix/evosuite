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

public class Combat_getWinnerFleet_131209629825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494624;

    public Combat_getWinnerFleet_131209629825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494624 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term494624, term494624.getClass(), "combatShipList", null);
        setIntField(term494624, term494624.getClass(), "shipIndex", 0);
        setIntField(term494624, term494624.getClass(), "cursorX", 0);
        setIntField(term494624, term494624.getClass(), "cursorY", 0);
        setIntField(term494624, term494624.getClass(), "componentUse", 0);
        setField(term494624, term494624.getClass(), "animation", null);
        setField(term494624, term494624.getClass(), "attackerFleet", null);
        setField(term494624, term494624.getClass(), "defenderFleet", null);
        setField(term494624, term494624.getClass(), "starbaseFleet", null);
        setField(term494624, term494624.getClass(), "winner", null);
        setField(term494624, term494624.getClass(), "attackerInfo", null);
        setField(term494624, term494624.getClass(), "defenderInfo", null);
        setField(term494624, term494624.getClass(), "planet", null);
        setIntField(term494624, term494624.getClass(), "totalRounds", 0);
        setIntField(term494624, term494624.getClass(), "roundsNoDamge", 0);
        setBooleanField(term494624, term494624.getClass(), "endCombatHandled", false);
        setField(term494624, term494624.getClass(), "wormHole", null);
        setIntField(term494624, term494624.getClass(), "timerForWormHole", 0);
        setBooleanField(term494624, term494624.getClass(), "defenderEscaped", false);
        setBooleanField(term494624, term494624.getClass(), "attackerEscaped", false);
        setField(term494624, term494624.getClass(), "escapePosition", null);
        setField(term494624, term494624.getClass(), "combatEvent", null);
        setIntField(term494624, term494624.getClass(), "defenderMilitaryValue", 0);
        setIntField(term494624, term494624.getClass(), "attackerMilitaryValue", 0);
        setField(term494624, term494624.getClass(), "leaderKilledNews", null);
        setField(term494624, term494624.getClass(), "orbitalDestroyedNews", null);
        setField(term494624, term494624.getClass(), "leaderInCombat", null);
        setBooleanField(term494624, term494624.getClass(), "attackerPrivateer", false);
        setBooleanField(term494624, term494624.getClass(), "defenderPrivateer", false);
        setBooleanField(term494624, term494624.getClass(), "orbitalInCombat", false);
        setIntField(term494624, term494624.getClass(), "starYear", 0);
        setBooleanField(term494624, term494624.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinnerFleet", argTypes, term494624, args);
    }

};


