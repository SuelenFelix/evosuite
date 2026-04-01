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

public class Combat_doFastCombat_1267685934153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405469;

    public Combat_doFastCombat_1267685934153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405469 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405469, term405469.getClass(), "combatShipList", null);
        setIntField(term405469, term405469.getClass(), "shipIndex", 0);
        setIntField(term405469, term405469.getClass(), "cursorX", 0);
        setIntField(term405469, term405469.getClass(), "cursorY", 0);
        setIntField(term405469, term405469.getClass(), "componentUse", 0);
        setField(term405469, term405469.getClass(), "animation", null);
        setField(term405469, term405469.getClass(), "attackerFleet", null);
        setField(term405469, term405469.getClass(), "defenderFleet", null);
        setField(term405469, term405469.getClass(), "starbaseFleet", null);
        setField(term405469, term405469.getClass(), "winner", null);
        setField(term405469, term405469.getClass(), "attackerInfo", null);
        setField(term405469, term405469.getClass(), "defenderInfo", null);
        setField(term405469, term405469.getClass(), "planet", null);
        setIntField(term405469, term405469.getClass(), "totalRounds", 0);
        setIntField(term405469, term405469.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405469, term405469.getClass(), "endCombatHandled", false);
        setField(term405469, term405469.getClass(), "wormHole", null);
        setIntField(term405469, term405469.getClass(), "timerForWormHole", 0);
        setBooleanField(term405469, term405469.getClass(), "defenderEscaped", false);
        setBooleanField(term405469, term405469.getClass(), "attackerEscaped", false);
        setField(term405469, term405469.getClass(), "escapePosition", null);
        setField(term405469, term405469.getClass(), "combatEvent", null);
        setIntField(term405469, term405469.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405469, term405469.getClass(), "attackerMilitaryValue", 0);
        setField(term405469, term405469.getClass(), "leaderKilledNews", null);
        setField(term405469, term405469.getClass(), "orbitalDestroyedNews", null);
        setField(term405469, term405469.getClass(), "leaderInCombat", null);
        setBooleanField(term405469, term405469.getClass(), "attackerPrivateer", false);
        setBooleanField(term405469, term405469.getClass(), "defenderPrivateer", false);
        setBooleanField(term405469, term405469.getClass(), "orbitalInCombat", false);
        setIntField(term405469, term405469.getClass(), "starYear", 0);
        setBooleanField(term405469, term405469.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doFastCombat", argTypes, term405469, args);
    }

};


