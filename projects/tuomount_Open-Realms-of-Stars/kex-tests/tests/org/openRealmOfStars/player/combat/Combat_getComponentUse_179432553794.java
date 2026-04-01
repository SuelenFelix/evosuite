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

public class Combat_getComponentUse_179432553794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283093;

    public Combat_getComponentUse_179432553794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283093 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term283093, term283093.getClass(), "combatShipList", null);
        setIntField(term283093, term283093.getClass(), "shipIndex", 0);
        setIntField(term283093, term283093.getClass(), "cursorX", 0);
        setIntField(term283093, term283093.getClass(), "cursorY", 0);
        setIntField(term283093, term283093.getClass(), "componentUse", 0);
        setField(term283093, term283093.getClass(), "animation", null);
        setField(term283093, term283093.getClass(), "attackerFleet", null);
        setField(term283093, term283093.getClass(), "defenderFleet", null);
        setField(term283093, term283093.getClass(), "starbaseFleet", null);
        setField(term283093, term283093.getClass(), "winner", null);
        setField(term283093, term283093.getClass(), "attackerInfo", null);
        setField(term283093, term283093.getClass(), "defenderInfo", null);
        setField(term283093, term283093.getClass(), "planet", null);
        setIntField(term283093, term283093.getClass(), "totalRounds", 0);
        setIntField(term283093, term283093.getClass(), "roundsNoDamge", 0);
        setBooleanField(term283093, term283093.getClass(), "endCombatHandled", false);
        setField(term283093, term283093.getClass(), "wormHole", null);
        setIntField(term283093, term283093.getClass(), "timerForWormHole", 0);
        setBooleanField(term283093, term283093.getClass(), "defenderEscaped", false);
        setBooleanField(term283093, term283093.getClass(), "attackerEscaped", false);
        setField(term283093, term283093.getClass(), "escapePosition", null);
        setField(term283093, term283093.getClass(), "combatEvent", null);
        setIntField(term283093, term283093.getClass(), "defenderMilitaryValue", 0);
        setIntField(term283093, term283093.getClass(), "attackerMilitaryValue", 0);
        setField(term283093, term283093.getClass(), "leaderKilledNews", null);
        setField(term283093, term283093.getClass(), "orbitalDestroyedNews", null);
        setField(term283093, term283093.getClass(), "leaderInCombat", null);
        setBooleanField(term283093, term283093.getClass(), "attackerPrivateer", false);
        setBooleanField(term283093, term283093.getClass(), "defenderPrivateer", false);
        setBooleanField(term283093, term283093.getClass(), "orbitalInCombat", false);
        setIntField(term283093, term283093.getClass(), "starYear", 0);
        setBooleanField(term283093, term283093.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComponentUse", argTypes, term283093, args);
    }

};


