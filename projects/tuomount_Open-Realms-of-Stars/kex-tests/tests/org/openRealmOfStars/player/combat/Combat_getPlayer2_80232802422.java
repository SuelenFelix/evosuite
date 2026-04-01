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

public class Combat_getPlayer2_80232802422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490194;

    public Combat_getPlayer2_80232802422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490194 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term490194, term490194.getClass(), "combatShipList", null);
        setIntField(term490194, term490194.getClass(), "shipIndex", 0);
        setIntField(term490194, term490194.getClass(), "cursorX", 0);
        setIntField(term490194, term490194.getClass(), "cursorY", 0);
        setIntField(term490194, term490194.getClass(), "componentUse", 0);
        setField(term490194, term490194.getClass(), "animation", null);
        setField(term490194, term490194.getClass(), "attackerFleet", null);
        setField(term490194, term490194.getClass(), "defenderFleet", null);
        setField(term490194, term490194.getClass(), "starbaseFleet", null);
        setField(term490194, term490194.getClass(), "winner", null);
        setField(term490194, term490194.getClass(), "attackerInfo", null);
        setField(term490194, term490194.getClass(), "defenderInfo", null);
        setField(term490194, term490194.getClass(), "planet", null);
        setIntField(term490194, term490194.getClass(), "totalRounds", 0);
        setIntField(term490194, term490194.getClass(), "roundsNoDamge", 0);
        setBooleanField(term490194, term490194.getClass(), "endCombatHandled", false);
        setField(term490194, term490194.getClass(), "wormHole", null);
        setIntField(term490194, term490194.getClass(), "timerForWormHole", 0);
        setBooleanField(term490194, term490194.getClass(), "defenderEscaped", false);
        setBooleanField(term490194, term490194.getClass(), "attackerEscaped", false);
        setField(term490194, term490194.getClass(), "escapePosition", null);
        setField(term490194, term490194.getClass(), "combatEvent", null);
        setIntField(term490194, term490194.getClass(), "defenderMilitaryValue", 0);
        setIntField(term490194, term490194.getClass(), "attackerMilitaryValue", 0);
        setField(term490194, term490194.getClass(), "leaderKilledNews", null);
        setField(term490194, term490194.getClass(), "orbitalDestroyedNews", null);
        setField(term490194, term490194.getClass(), "leaderInCombat", null);
        setBooleanField(term490194, term490194.getClass(), "attackerPrivateer", false);
        setBooleanField(term490194, term490194.getClass(), "defenderPrivateer", false);
        setBooleanField(term490194, term490194.getClass(), "orbitalInCombat", false);
        setIntField(term490194, term490194.getClass(), "starYear", 0);
        setBooleanField(term490194, term490194.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer2", argTypes, term490194, args);
    }

};


