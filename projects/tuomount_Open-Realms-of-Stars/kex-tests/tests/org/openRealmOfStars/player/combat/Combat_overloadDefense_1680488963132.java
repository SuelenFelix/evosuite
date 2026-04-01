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

public class Combat_overloadDefense_1680488963132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356492;

    public Combat_overloadDefense_1680488963132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356492 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term356492, term356492.getClass(), "combatShipList", null);
        setIntField(term356492, term356492.getClass(), "shipIndex", 0);
        setIntField(term356492, term356492.getClass(), "cursorX", 0);
        setIntField(term356492, term356492.getClass(), "cursorY", 0);
        setIntField(term356492, term356492.getClass(), "componentUse", 0);
        setField(term356492, term356492.getClass(), "animation", null);
        setField(term356492, term356492.getClass(), "attackerFleet", null);
        setField(term356492, term356492.getClass(), "defenderFleet", null);
        setField(term356492, term356492.getClass(), "starbaseFleet", null);
        setField(term356492, term356492.getClass(), "winner", null);
        setField(term356492, term356492.getClass(), "attackerInfo", null);
        setField(term356492, term356492.getClass(), "defenderInfo", null);
        setField(term356492, term356492.getClass(), "planet", null);
        setIntField(term356492, term356492.getClass(), "totalRounds", 0);
        setIntField(term356492, term356492.getClass(), "roundsNoDamge", 0);
        setBooleanField(term356492, term356492.getClass(), "endCombatHandled", false);
        setField(term356492, term356492.getClass(), "wormHole", null);
        setIntField(term356492, term356492.getClass(), "timerForWormHole", 0);
        setBooleanField(term356492, term356492.getClass(), "defenderEscaped", false);
        setBooleanField(term356492, term356492.getClass(), "attackerEscaped", false);
        setField(term356492, term356492.getClass(), "escapePosition", null);
        setField(term356492, term356492.getClass(), "combatEvent", null);
        setIntField(term356492, term356492.getClass(), "defenderMilitaryValue", 0);
        setIntField(term356492, term356492.getClass(), "attackerMilitaryValue", 0);
        setField(term356492, term356492.getClass(), "leaderKilledNews", null);
        setField(term356492, term356492.getClass(), "orbitalDestroyedNews", null);
        setField(term356492, term356492.getClass(), "leaderInCombat", null);
        setBooleanField(term356492, term356492.getClass(), "attackerPrivateer", false);
        setBooleanField(term356492, term356492.getClass(), "defenderPrivateer", false);
        setBooleanField(term356492, term356492.getClass(), "orbitalInCombat", false);
        setIntField(term356492, term356492.getClass(), "starYear", 0);
        setBooleanField(term356492, term356492.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "overloadDefense", argTypes, term356492, args);
    }

};


