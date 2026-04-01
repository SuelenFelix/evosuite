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

public class Combat_setCursorPos_1734539695152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819321;
     Object term819339;
     Object term819341;

    public Combat_setCursorPos_1734539695152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819321 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819321, term819321.getClass(), "combatShipList", null);
        setIntField(term819321, term819321.getClass(), "shipIndex", 0);
        setIntField(term819321, term819321.getClass(), "cursorX", 0);
        setIntField(term819321, term819321.getClass(), "cursorY", 0);
        setIntField(term819321, term819321.getClass(), "componentUse", 0);
        setField(term819321, term819321.getClass(), "animation", null);
        setField(term819321, term819321.getClass(), "attackerFleet", null);
        setField(term819321, term819321.getClass(), "defenderFleet", null);
        setField(term819321, term819321.getClass(), "starbaseFleet", null);
        setField(term819321, term819321.getClass(), "winner", null);
        setField(term819321, term819321.getClass(), "attackerInfo", null);
        setField(term819321, term819321.getClass(), "defenderInfo", null);
        setField(term819321, term819321.getClass(), "planet", null);
        setIntField(term819321, term819321.getClass(), "totalRounds", 0);
        setIntField(term819321, term819321.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819321, term819321.getClass(), "endCombatHandled", false);
        setField(term819321, term819321.getClass(), "wormHole", null);
        setIntField(term819321, term819321.getClass(), "timerForWormHole", 0);
        setBooleanField(term819321, term819321.getClass(), "defenderEscaped", false);
        setBooleanField(term819321, term819321.getClass(), "attackerEscaped", false);
        setField(term819321, term819321.getClass(), "escapePosition", null);
        setField(term819321, term819321.getClass(), "combatEvent", null);
        setIntField(term819321, term819321.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819321, term819321.getClass(), "attackerMilitaryValue", 0);
        setField(term819321, term819321.getClass(), "leaderKilledNews", null);
        setField(term819321, term819321.getClass(), "orbitalDestroyedNews", null);
        setField(term819321, term819321.getClass(), "leaderInCombat", null);
        setBooleanField(term819321, term819321.getClass(), "attackerPrivateer", false);
        setBooleanField(term819321, term819321.getClass(), "defenderPrivateer", false);
        setBooleanField(term819321, term819321.getClass(), "orbitalInCombat", false);
        setIntField(term819321, term819321.getClass(), "starYear", 0);
        setBooleanField(term819321, term819321.getClass(), "worthOfWarHero", false);
        term819339 = new Integer(0);
        term819341 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term819339;
        args[1] = term819341;
        callMethod(klass, "setCursorPos", argTypes, term819321, args);
    }

};


