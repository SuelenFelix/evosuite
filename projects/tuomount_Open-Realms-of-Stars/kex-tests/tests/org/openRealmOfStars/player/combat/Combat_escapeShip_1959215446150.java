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

public class Combat_escapeShip_1959215446150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819285;

    public Combat_escapeShip_1959215446150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819285 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819285, term819285.getClass(), "combatShipList", null);
        setIntField(term819285, term819285.getClass(), "shipIndex", 0);
        setIntField(term819285, term819285.getClass(), "cursorX", 0);
        setIntField(term819285, term819285.getClass(), "cursorY", 0);
        setIntField(term819285, term819285.getClass(), "componentUse", 0);
        setField(term819285, term819285.getClass(), "animation", null);
        setField(term819285, term819285.getClass(), "attackerFleet", null);
        setField(term819285, term819285.getClass(), "defenderFleet", null);
        setField(term819285, term819285.getClass(), "starbaseFleet", null);
        setField(term819285, term819285.getClass(), "winner", null);
        setField(term819285, term819285.getClass(), "attackerInfo", null);
        setField(term819285, term819285.getClass(), "defenderInfo", null);
        setField(term819285, term819285.getClass(), "planet", null);
        setIntField(term819285, term819285.getClass(), "totalRounds", 0);
        setIntField(term819285, term819285.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819285, term819285.getClass(), "endCombatHandled", false);
        setField(term819285, term819285.getClass(), "wormHole", null);
        setIntField(term819285, term819285.getClass(), "timerForWormHole", 0);
        setBooleanField(term819285, term819285.getClass(), "defenderEscaped", false);
        setBooleanField(term819285, term819285.getClass(), "attackerEscaped", false);
        setField(term819285, term819285.getClass(), "escapePosition", null);
        setField(term819285, term819285.getClass(), "combatEvent", null);
        setIntField(term819285, term819285.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819285, term819285.getClass(), "attackerMilitaryValue", 0);
        setField(term819285, term819285.getClass(), "leaderKilledNews", null);
        setField(term819285, term819285.getClass(), "orbitalDestroyedNews", null);
        setField(term819285, term819285.getClass(), "leaderInCombat", null);
        setBooleanField(term819285, term819285.getClass(), "attackerPrivateer", false);
        setBooleanField(term819285, term819285.getClass(), "defenderPrivateer", false);
        setBooleanField(term819285, term819285.getClass(), "orbitalInCombat", false);
        setIntField(term819285, term819285.getClass(), "starYear", 0);
        setBooleanField(term819285, term819285.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "escapeShip", argTypes, term819285, args);
    }

};


