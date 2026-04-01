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

public class Combat_getPlayer1_802327063148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405379;

    public Combat_getPlayer1_802327063148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405379 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405379, term405379.getClass(), "combatShipList", null);
        setIntField(term405379, term405379.getClass(), "shipIndex", 0);
        setIntField(term405379, term405379.getClass(), "cursorX", 0);
        setIntField(term405379, term405379.getClass(), "cursorY", 0);
        setIntField(term405379, term405379.getClass(), "componentUse", 0);
        setField(term405379, term405379.getClass(), "animation", null);
        setField(term405379, term405379.getClass(), "attackerFleet", null);
        setField(term405379, term405379.getClass(), "defenderFleet", null);
        setField(term405379, term405379.getClass(), "starbaseFleet", null);
        setField(term405379, term405379.getClass(), "winner", null);
        setField(term405379, term405379.getClass(), "attackerInfo", null);
        setField(term405379, term405379.getClass(), "defenderInfo", null);
        setField(term405379, term405379.getClass(), "planet", null);
        setIntField(term405379, term405379.getClass(), "totalRounds", 0);
        setIntField(term405379, term405379.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405379, term405379.getClass(), "endCombatHandled", false);
        setField(term405379, term405379.getClass(), "wormHole", null);
        setIntField(term405379, term405379.getClass(), "timerForWormHole", 0);
        setBooleanField(term405379, term405379.getClass(), "defenderEscaped", false);
        setBooleanField(term405379, term405379.getClass(), "attackerEscaped", false);
        setField(term405379, term405379.getClass(), "escapePosition", null);
        setField(term405379, term405379.getClass(), "combatEvent", null);
        setIntField(term405379, term405379.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405379, term405379.getClass(), "attackerMilitaryValue", 0);
        setField(term405379, term405379.getClass(), "leaderKilledNews", null);
        setField(term405379, term405379.getClass(), "orbitalDestroyedNews", null);
        setField(term405379, term405379.getClass(), "leaderInCombat", null);
        setBooleanField(term405379, term405379.getClass(), "attackerPrivateer", false);
        setBooleanField(term405379, term405379.getClass(), "defenderPrivateer", false);
        setBooleanField(term405379, term405379.getClass(), "orbitalInCombat", false);
        setIntField(term405379, term405379.getClass(), "starYear", 0);
        setBooleanField(term405379, term405379.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer1", argTypes, term405379, args);
    }

};


