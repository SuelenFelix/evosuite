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

public class Combat_getCursorX_211758660368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234643;

    public Combat_getCursorX_211758660368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234643 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term234643, term234643.getClass(), "combatShipList", null);
        setIntField(term234643, term234643.getClass(), "shipIndex", 0);
        setIntField(term234643, term234643.getClass(), "cursorX", 0);
        setIntField(term234643, term234643.getClass(), "cursorY", 0);
        setIntField(term234643, term234643.getClass(), "componentUse", 0);
        setField(term234643, term234643.getClass(), "animation", null);
        setField(term234643, term234643.getClass(), "attackerFleet", null);
        setField(term234643, term234643.getClass(), "defenderFleet", null);
        setField(term234643, term234643.getClass(), "starbaseFleet", null);
        setField(term234643, term234643.getClass(), "winner", null);
        setField(term234643, term234643.getClass(), "attackerInfo", null);
        setField(term234643, term234643.getClass(), "defenderInfo", null);
        setField(term234643, term234643.getClass(), "planet", null);
        setIntField(term234643, term234643.getClass(), "totalRounds", 0);
        setIntField(term234643, term234643.getClass(), "roundsNoDamge", 0);
        setBooleanField(term234643, term234643.getClass(), "endCombatHandled", false);
        setField(term234643, term234643.getClass(), "wormHole", null);
        setIntField(term234643, term234643.getClass(), "timerForWormHole", 0);
        setBooleanField(term234643, term234643.getClass(), "defenderEscaped", false);
        setBooleanField(term234643, term234643.getClass(), "attackerEscaped", false);
        setField(term234643, term234643.getClass(), "escapePosition", null);
        setField(term234643, term234643.getClass(), "combatEvent", null);
        setIntField(term234643, term234643.getClass(), "defenderMilitaryValue", 0);
        setIntField(term234643, term234643.getClass(), "attackerMilitaryValue", 0);
        setField(term234643, term234643.getClass(), "leaderKilledNews", null);
        setField(term234643, term234643.getClass(), "orbitalDestroyedNews", null);
        setField(term234643, term234643.getClass(), "leaderInCombat", null);
        setBooleanField(term234643, term234643.getClass(), "attackerPrivateer", false);
        setBooleanField(term234643, term234643.getClass(), "defenderPrivateer", false);
        setBooleanField(term234643, term234643.getClass(), "orbitalInCombat", false);
        setIntField(term234643, term234643.getClass(), "starYear", 0);
        setBooleanField(term234643, term234643.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorX", argTypes, term234643, args);
    }

};


