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

public class Combat_getOrbitalDestoyedNews_45229589714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67621;

    public Combat_getOrbitalDestoyedNews_45229589714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67621 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term67621, term67621.getClass(), "combatShipList", null);
        setIntField(term67621, term67621.getClass(), "shipIndex", 0);
        setIntField(term67621, term67621.getClass(), "cursorX", 0);
        setIntField(term67621, term67621.getClass(), "cursorY", 0);
        setIntField(term67621, term67621.getClass(), "componentUse", 0);
        setField(term67621, term67621.getClass(), "animation", null);
        setField(term67621, term67621.getClass(), "attackerFleet", null);
        setField(term67621, term67621.getClass(), "defenderFleet", null);
        setField(term67621, term67621.getClass(), "starbaseFleet", null);
        setField(term67621, term67621.getClass(), "winner", null);
        setField(term67621, term67621.getClass(), "attackerInfo", null);
        setField(term67621, term67621.getClass(), "defenderInfo", null);
        setField(term67621, term67621.getClass(), "planet", null);
        setIntField(term67621, term67621.getClass(), "totalRounds", 0);
        setIntField(term67621, term67621.getClass(), "roundsNoDamge", 0);
        setBooleanField(term67621, term67621.getClass(), "endCombatHandled", false);
        setField(term67621, term67621.getClass(), "wormHole", null);
        setIntField(term67621, term67621.getClass(), "timerForWormHole", 0);
        setBooleanField(term67621, term67621.getClass(), "defenderEscaped", false);
        setBooleanField(term67621, term67621.getClass(), "attackerEscaped", false);
        setField(term67621, term67621.getClass(), "escapePosition", null);
        setField(term67621, term67621.getClass(), "combatEvent", null);
        setIntField(term67621, term67621.getClass(), "defenderMilitaryValue", 0);
        setIntField(term67621, term67621.getClass(), "attackerMilitaryValue", 0);
        setField(term67621, term67621.getClass(), "leaderKilledNews", null);
        setField(term67621, term67621.getClass(), "orbitalDestroyedNews", null);
        setField(term67621, term67621.getClass(), "leaderInCombat", null);
        setBooleanField(term67621, term67621.getClass(), "attackerPrivateer", false);
        setBooleanField(term67621, term67621.getClass(), "defenderPrivateer", false);
        setBooleanField(term67621, term67621.getClass(), "orbitalInCombat", false);
        setIntField(term67621, term67621.getClass(), "starYear", 0);
        setBooleanField(term67621, term67621.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrbitalDestoyedNews", argTypes, term67621, args);
    }

};


