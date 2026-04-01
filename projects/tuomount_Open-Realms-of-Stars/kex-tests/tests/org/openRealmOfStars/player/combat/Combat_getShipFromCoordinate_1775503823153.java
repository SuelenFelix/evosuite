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

public class Combat_getShipFromCoordinate_1775503823153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819343;
     Object term819361;
     Object term819363;

    public Combat_getShipFromCoordinate_1775503823153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819343 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819343, term819343.getClass(), "combatShipList", null);
        setIntField(term819343, term819343.getClass(), "shipIndex", 0);
        setIntField(term819343, term819343.getClass(), "cursorX", 0);
        setIntField(term819343, term819343.getClass(), "cursorY", 0);
        setIntField(term819343, term819343.getClass(), "componentUse", 0);
        setField(term819343, term819343.getClass(), "animation", null);
        setField(term819343, term819343.getClass(), "attackerFleet", null);
        setField(term819343, term819343.getClass(), "defenderFleet", null);
        setField(term819343, term819343.getClass(), "starbaseFleet", null);
        setField(term819343, term819343.getClass(), "winner", null);
        setField(term819343, term819343.getClass(), "attackerInfo", null);
        setField(term819343, term819343.getClass(), "defenderInfo", null);
        setField(term819343, term819343.getClass(), "planet", null);
        setIntField(term819343, term819343.getClass(), "totalRounds", 0);
        setIntField(term819343, term819343.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819343, term819343.getClass(), "endCombatHandled", false);
        setField(term819343, term819343.getClass(), "wormHole", null);
        setIntField(term819343, term819343.getClass(), "timerForWormHole", 0);
        setBooleanField(term819343, term819343.getClass(), "defenderEscaped", false);
        setBooleanField(term819343, term819343.getClass(), "attackerEscaped", false);
        setField(term819343, term819343.getClass(), "escapePosition", null);
        setField(term819343, term819343.getClass(), "combatEvent", null);
        setIntField(term819343, term819343.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819343, term819343.getClass(), "attackerMilitaryValue", 0);
        setField(term819343, term819343.getClass(), "leaderKilledNews", null);
        setField(term819343, term819343.getClass(), "orbitalDestroyedNews", null);
        setField(term819343, term819343.getClass(), "leaderInCombat", null);
        setBooleanField(term819343, term819343.getClass(), "attackerPrivateer", false);
        setBooleanField(term819343, term819343.getClass(), "defenderPrivateer", false);
        setBooleanField(term819343, term819343.getClass(), "orbitalInCombat", false);
        setIntField(term819343, term819343.getClass(), "starYear", 0);
        setBooleanField(term819343, term819343.getClass(), "worthOfWarHero", false);
        term819361 = new Integer(0);
        term819363 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term819361;
        args[1] = term819363;
        callMethod(klass, "getShipFromCoordinate", argTypes, term819343, args);
    }

};


