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

public class Combat_getCombatCoordinates_103617242872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239062;

    public Combat_getCombatCoordinates_103617242872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239062 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term239062, term239062.getClass(), "combatShipList", null);
        setIntField(term239062, term239062.getClass(), "shipIndex", 0);
        setIntField(term239062, term239062.getClass(), "cursorX", 0);
        setIntField(term239062, term239062.getClass(), "cursorY", 0);
        setIntField(term239062, term239062.getClass(), "componentUse", 0);
        setField(term239062, term239062.getClass(), "animation", null);
        setField(term239062, term239062.getClass(), "attackerFleet", null);
        setField(term239062, term239062.getClass(), "defenderFleet", null);
        setField(term239062, term239062.getClass(), "starbaseFleet", null);
        setField(term239062, term239062.getClass(), "winner", null);
        setField(term239062, term239062.getClass(), "attackerInfo", null);
        setField(term239062, term239062.getClass(), "defenderInfo", null);
        setField(term239062, term239062.getClass(), "planet", null);
        setIntField(term239062, term239062.getClass(), "totalRounds", 0);
        setIntField(term239062, term239062.getClass(), "roundsNoDamge", 0);
        setBooleanField(term239062, term239062.getClass(), "endCombatHandled", false);
        setField(term239062, term239062.getClass(), "wormHole", null);
        setIntField(term239062, term239062.getClass(), "timerForWormHole", 0);
        setBooleanField(term239062, term239062.getClass(), "defenderEscaped", false);
        setBooleanField(term239062, term239062.getClass(), "attackerEscaped", false);
        setField(term239062, term239062.getClass(), "escapePosition", null);
        setField(term239062, term239062.getClass(), "combatEvent", null);
        setIntField(term239062, term239062.getClass(), "defenderMilitaryValue", 0);
        setIntField(term239062, term239062.getClass(), "attackerMilitaryValue", 0);
        setField(term239062, term239062.getClass(), "leaderKilledNews", null);
        setField(term239062, term239062.getClass(), "orbitalDestroyedNews", null);
        setField(term239062, term239062.getClass(), "leaderInCombat", null);
        setBooleanField(term239062, term239062.getClass(), "attackerPrivateer", false);
        setBooleanField(term239062, term239062.getClass(), "defenderPrivateer", false);
        setBooleanField(term239062, term239062.getClass(), "orbitalInCombat", false);
        setIntField(term239062, term239062.getClass(), "starYear", 0);
        setBooleanField(term239062, term239062.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCombatCoordinates", argTypes, term239062, args);
    }

};


