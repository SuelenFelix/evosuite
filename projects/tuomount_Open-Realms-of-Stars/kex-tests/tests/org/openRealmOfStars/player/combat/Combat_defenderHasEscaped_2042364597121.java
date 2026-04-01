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

public class Combat_defenderHasEscaped_2042364597121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751984;

    public Combat_defenderHasEscaped_2042364597121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term751984 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term751984, term751984.getClass(), "combatShipList", null);
        setIntField(term751984, term751984.getClass(), "shipIndex", 0);
        setIntField(term751984, term751984.getClass(), "cursorX", 0);
        setIntField(term751984, term751984.getClass(), "cursorY", 0);
        setIntField(term751984, term751984.getClass(), "componentUse", 0);
        setField(term751984, term751984.getClass(), "animation", null);
        setField(term751984, term751984.getClass(), "attackerFleet", null);
        setField(term751984, term751984.getClass(), "defenderFleet", null);
        setField(term751984, term751984.getClass(), "starbaseFleet", null);
        setField(term751984, term751984.getClass(), "winner", null);
        setField(term751984, term751984.getClass(), "attackerInfo", null);
        setField(term751984, term751984.getClass(), "defenderInfo", null);
        setField(term751984, term751984.getClass(), "planet", null);
        setIntField(term751984, term751984.getClass(), "totalRounds", 0);
        setIntField(term751984, term751984.getClass(), "roundsNoDamge", 0);
        setBooleanField(term751984, term751984.getClass(), "endCombatHandled", false);
        setField(term751984, term751984.getClass(), "wormHole", null);
        setIntField(term751984, term751984.getClass(), "timerForWormHole", 0);
        setBooleanField(term751984, term751984.getClass(), "defenderEscaped", false);
        setBooleanField(term751984, term751984.getClass(), "attackerEscaped", false);
        setField(term751984, term751984.getClass(), "escapePosition", null);
        setField(term751984, term751984.getClass(), "combatEvent", null);
        setIntField(term751984, term751984.getClass(), "defenderMilitaryValue", 0);
        setIntField(term751984, term751984.getClass(), "attackerMilitaryValue", 0);
        setField(term751984, term751984.getClass(), "leaderKilledNews", null);
        setField(term751984, term751984.getClass(), "orbitalDestroyedNews", null);
        setField(term751984, term751984.getClass(), "leaderInCombat", null);
        setBooleanField(term751984, term751984.getClass(), "attackerPrivateer", false);
        setBooleanField(term751984, term751984.getClass(), "defenderPrivateer", false);
        setBooleanField(term751984, term751984.getClass(), "orbitalInCombat", false);
        setIntField(term751984, term751984.getClass(), "starYear", 0);
        setBooleanField(term751984, term751984.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "defenderHasEscaped", argTypes, term751984, args);
    }

};


