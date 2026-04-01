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

public class Combat_attackerHasEscaped_493386077123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754256;

    public Combat_attackerHasEscaped_493386077123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754256 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term754256, term754256.getClass(), "combatShipList", null);
        setIntField(term754256, term754256.getClass(), "shipIndex", 0);
        setIntField(term754256, term754256.getClass(), "cursorX", 0);
        setIntField(term754256, term754256.getClass(), "cursorY", 0);
        setIntField(term754256, term754256.getClass(), "componentUse", 0);
        setField(term754256, term754256.getClass(), "animation", null);
        setField(term754256, term754256.getClass(), "attackerFleet", null);
        setField(term754256, term754256.getClass(), "defenderFleet", null);
        setField(term754256, term754256.getClass(), "starbaseFleet", null);
        setField(term754256, term754256.getClass(), "winner", null);
        setField(term754256, term754256.getClass(), "attackerInfo", null);
        setField(term754256, term754256.getClass(), "defenderInfo", null);
        setField(term754256, term754256.getClass(), "planet", null);
        setIntField(term754256, term754256.getClass(), "totalRounds", 0);
        setIntField(term754256, term754256.getClass(), "roundsNoDamge", 0);
        setBooleanField(term754256, term754256.getClass(), "endCombatHandled", false);
        setField(term754256, term754256.getClass(), "wormHole", null);
        setIntField(term754256, term754256.getClass(), "timerForWormHole", 0);
        setBooleanField(term754256, term754256.getClass(), "defenderEscaped", false);
        setBooleanField(term754256, term754256.getClass(), "attackerEscaped", false);
        setField(term754256, term754256.getClass(), "escapePosition", null);
        setField(term754256, term754256.getClass(), "combatEvent", null);
        setIntField(term754256, term754256.getClass(), "defenderMilitaryValue", 0);
        setIntField(term754256, term754256.getClass(), "attackerMilitaryValue", 0);
        setField(term754256, term754256.getClass(), "leaderKilledNews", null);
        setField(term754256, term754256.getClass(), "orbitalDestroyedNews", null);
        setField(term754256, term754256.getClass(), "leaderInCombat", null);
        setBooleanField(term754256, term754256.getClass(), "attackerPrivateer", false);
        setBooleanField(term754256, term754256.getClass(), "defenderPrivateer", false);
        setBooleanField(term754256, term754256.getClass(), "orbitalInCombat", false);
        setIntField(term754256, term754256.getClass(), "starYear", 0);
        setBooleanField(term754256, term754256.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "attackerHasEscaped", argTypes, term754256, args);
    }

};


