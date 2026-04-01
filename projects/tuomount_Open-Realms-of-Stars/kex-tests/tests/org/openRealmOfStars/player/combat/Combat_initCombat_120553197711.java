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

public class Combat_initCombat_120553197711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63171;

    public Combat_initCombat_120553197711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63171 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term63171, term63171.getClass(), "combatShipList", null);
        setIntField(term63171, term63171.getClass(), "shipIndex", 0);
        setIntField(term63171, term63171.getClass(), "cursorX", 0);
        setIntField(term63171, term63171.getClass(), "cursorY", 0);
        setIntField(term63171, term63171.getClass(), "componentUse", 0);
        setField(term63171, term63171.getClass(), "animation", null);
        setField(term63171, term63171.getClass(), "attackerFleet", null);
        setField(term63171, term63171.getClass(), "defenderFleet", null);
        setField(term63171, term63171.getClass(), "starbaseFleet", null);
        setField(term63171, term63171.getClass(), "winner", null);
        setField(term63171, term63171.getClass(), "attackerInfo", null);
        setField(term63171, term63171.getClass(), "defenderInfo", null);
        setField(term63171, term63171.getClass(), "planet", null);
        setIntField(term63171, term63171.getClass(), "totalRounds", 0);
        setIntField(term63171, term63171.getClass(), "roundsNoDamge", 0);
        setBooleanField(term63171, term63171.getClass(), "endCombatHandled", false);
        setField(term63171, term63171.getClass(), "wormHole", null);
        setIntField(term63171, term63171.getClass(), "timerForWormHole", 0);
        setBooleanField(term63171, term63171.getClass(), "defenderEscaped", false);
        setBooleanField(term63171, term63171.getClass(), "attackerEscaped", false);
        setField(term63171, term63171.getClass(), "escapePosition", null);
        setField(term63171, term63171.getClass(), "combatEvent", null);
        setIntField(term63171, term63171.getClass(), "defenderMilitaryValue", 0);
        setIntField(term63171, term63171.getClass(), "attackerMilitaryValue", 0);
        setField(term63171, term63171.getClass(), "leaderKilledNews", null);
        setField(term63171, term63171.getClass(), "orbitalDestroyedNews", null);
        setField(term63171, term63171.getClass(), "leaderInCombat", null);
        setBooleanField(term63171, term63171.getClass(), "attackerPrivateer", false);
        setBooleanField(term63171, term63171.getClass(), "defenderPrivateer", false);
        setBooleanField(term63171, term63171.getClass(), "orbitalInCombat", false);
        setIntField(term63171, term63171.getClass(), "starYear", 0);
        setBooleanField(term63171, term63171.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initCombat", argTypes, term63171, args);
    }

};


