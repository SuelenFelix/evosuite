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

public class Combat_escapeShip_195921544645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174189;

    public Combat_escapeShip_195921544645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174189 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term174189, term174189.getClass(), "combatShipList", null);
        setIntField(term174189, term174189.getClass(), "shipIndex", 0);
        setIntField(term174189, term174189.getClass(), "cursorX", 0);
        setIntField(term174189, term174189.getClass(), "cursorY", 0);
        setIntField(term174189, term174189.getClass(), "componentUse", 0);
        setField(term174189, term174189.getClass(), "animation", null);
        setField(term174189, term174189.getClass(), "attackerFleet", null);
        setField(term174189, term174189.getClass(), "defenderFleet", null);
        setField(term174189, term174189.getClass(), "starbaseFleet", null);
        setField(term174189, term174189.getClass(), "winner", null);
        setField(term174189, term174189.getClass(), "attackerInfo", null);
        setField(term174189, term174189.getClass(), "defenderInfo", null);
        setField(term174189, term174189.getClass(), "planet", null);
        setIntField(term174189, term174189.getClass(), "totalRounds", 0);
        setIntField(term174189, term174189.getClass(), "roundsNoDamge", 0);
        setBooleanField(term174189, term174189.getClass(), "endCombatHandled", false);
        setField(term174189, term174189.getClass(), "wormHole", null);
        setIntField(term174189, term174189.getClass(), "timerForWormHole", 0);
        setBooleanField(term174189, term174189.getClass(), "defenderEscaped", false);
        setBooleanField(term174189, term174189.getClass(), "attackerEscaped", false);
        setField(term174189, term174189.getClass(), "escapePosition", null);
        setField(term174189, term174189.getClass(), "combatEvent", null);
        setIntField(term174189, term174189.getClass(), "defenderMilitaryValue", 0);
        setIntField(term174189, term174189.getClass(), "attackerMilitaryValue", 0);
        setField(term174189, term174189.getClass(), "leaderKilledNews", null);
        setField(term174189, term174189.getClass(), "orbitalDestroyedNews", null);
        setField(term174189, term174189.getClass(), "leaderInCombat", null);
        setBooleanField(term174189, term174189.getClass(), "attackerPrivateer", false);
        setBooleanField(term174189, term174189.getClass(), "defenderPrivateer", false);
        setBooleanField(term174189, term174189.getClass(), "orbitalInCombat", false);
        setIntField(term174189, term174189.getClass(), "starYear", 0);
        setBooleanField(term174189, term174189.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "escapeShip", argTypes, term174189, args);
    }

};


