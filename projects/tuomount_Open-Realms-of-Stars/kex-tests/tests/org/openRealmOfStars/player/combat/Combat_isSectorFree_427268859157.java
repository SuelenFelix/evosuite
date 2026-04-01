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
import java.lang.Integer;

public class Combat_isSectorFree_427268859157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819419;
     Object term819437;
     Object term819439;

    public Combat_isSectorFree_427268859157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819419 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819419, term819419.getClass(), "combatShipList", null);
        setIntField(term819419, term819419.getClass(), "shipIndex", 0);
        setIntField(term819419, term819419.getClass(), "cursorX", 0);
        setIntField(term819419, term819419.getClass(), "cursorY", 0);
        setIntField(term819419, term819419.getClass(), "componentUse", 0);
        setField(term819419, term819419.getClass(), "animation", null);
        setField(term819419, term819419.getClass(), "attackerFleet", null);
        setField(term819419, term819419.getClass(), "defenderFleet", null);
        setField(term819419, term819419.getClass(), "starbaseFleet", null);
        setField(term819419, term819419.getClass(), "winner", null);
        setField(term819419, term819419.getClass(), "attackerInfo", null);
        setField(term819419, term819419.getClass(), "defenderInfo", null);
        setField(term819419, term819419.getClass(), "planet", null);
        setIntField(term819419, term819419.getClass(), "totalRounds", 0);
        setIntField(term819419, term819419.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819419, term819419.getClass(), "endCombatHandled", false);
        setField(term819419, term819419.getClass(), "wormHole", null);
        setIntField(term819419, term819419.getClass(), "timerForWormHole", 0);
        setBooleanField(term819419, term819419.getClass(), "defenderEscaped", false);
        setBooleanField(term819419, term819419.getClass(), "attackerEscaped", false);
        setField(term819419, term819419.getClass(), "escapePosition", null);
        setField(term819419, term819419.getClass(), "combatEvent", null);
        setIntField(term819419, term819419.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819419, term819419.getClass(), "attackerMilitaryValue", 0);
        setField(term819419, term819419.getClass(), "leaderKilledNews", null);
        setField(term819419, term819419.getClass(), "orbitalDestroyedNews", null);
        setField(term819419, term819419.getClass(), "leaderInCombat", null);
        setBooleanField(term819419, term819419.getClass(), "attackerPrivateer", false);
        setBooleanField(term819419, term819419.getClass(), "defenderPrivateer", false);
        setBooleanField(term819419, term819419.getClass(), "orbitalInCombat", false);
        setIntField(term819419, term819419.getClass(), "starYear", 0);
        setBooleanField(term819419, term819419.getClass(), "worthOfWarHero", false);
        term819437 = new Integer(0);
        term819439 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term819437;
        args[1] = term819439;
        callMethod(klass, "isSectorFree", argTypes, term819419, args);
    }

};


