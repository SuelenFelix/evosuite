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

public class Combat_getAnimation_93571217155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819383;

    public Combat_getAnimation_93571217155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819383 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819383, term819383.getClass(), "combatShipList", null);
        setIntField(term819383, term819383.getClass(), "shipIndex", 0);
        setIntField(term819383, term819383.getClass(), "cursorX", 0);
        setIntField(term819383, term819383.getClass(), "cursorY", 0);
        setIntField(term819383, term819383.getClass(), "componentUse", 0);
        setField(term819383, term819383.getClass(), "animation", null);
        setField(term819383, term819383.getClass(), "attackerFleet", null);
        setField(term819383, term819383.getClass(), "defenderFleet", null);
        setField(term819383, term819383.getClass(), "starbaseFleet", null);
        setField(term819383, term819383.getClass(), "winner", null);
        setField(term819383, term819383.getClass(), "attackerInfo", null);
        setField(term819383, term819383.getClass(), "defenderInfo", null);
        setField(term819383, term819383.getClass(), "planet", null);
        setIntField(term819383, term819383.getClass(), "totalRounds", 0);
        setIntField(term819383, term819383.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819383, term819383.getClass(), "endCombatHandled", false);
        setField(term819383, term819383.getClass(), "wormHole", null);
        setIntField(term819383, term819383.getClass(), "timerForWormHole", 0);
        setBooleanField(term819383, term819383.getClass(), "defenderEscaped", false);
        setBooleanField(term819383, term819383.getClass(), "attackerEscaped", false);
        setField(term819383, term819383.getClass(), "escapePosition", null);
        setField(term819383, term819383.getClass(), "combatEvent", null);
        setIntField(term819383, term819383.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819383, term819383.getClass(), "attackerMilitaryValue", 0);
        setField(term819383, term819383.getClass(), "leaderKilledNews", null);
        setField(term819383, term819383.getClass(), "orbitalDestroyedNews", null);
        setField(term819383, term819383.getClass(), "leaderInCombat", null);
        setBooleanField(term819383, term819383.getClass(), "attackerPrivateer", false);
        setBooleanField(term819383, term819383.getClass(), "defenderPrivateer", false);
        setBooleanField(term819383, term819383.getClass(), "orbitalInCombat", false);
        setIntField(term819383, term819383.getClass(), "starYear", 0);
        setBooleanField(term819383, term819383.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnimation", argTypes, term819383, args);
    }

};


