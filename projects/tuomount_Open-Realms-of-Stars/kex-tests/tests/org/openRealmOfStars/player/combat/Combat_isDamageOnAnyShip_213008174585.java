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

public class Combat_isDamageOnAnyShip_213008174585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688277;

    public Combat_isDamageOnAnyShip_213008174585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688277 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term688277, term688277.getClass(), "combatShipList", null);
        setIntField(term688277, term688277.getClass(), "shipIndex", 0);
        setIntField(term688277, term688277.getClass(), "cursorX", 0);
        setIntField(term688277, term688277.getClass(), "cursorY", 0);
        setIntField(term688277, term688277.getClass(), "componentUse", 0);
        setField(term688277, term688277.getClass(), "animation", null);
        setField(term688277, term688277.getClass(), "attackerFleet", null);
        setField(term688277, term688277.getClass(), "defenderFleet", null);
        setField(term688277, term688277.getClass(), "starbaseFleet", null);
        setField(term688277, term688277.getClass(), "winner", null);
        setField(term688277, term688277.getClass(), "attackerInfo", null);
        setField(term688277, term688277.getClass(), "defenderInfo", null);
        setField(term688277, term688277.getClass(), "planet", null);
        setIntField(term688277, term688277.getClass(), "totalRounds", 0);
        setIntField(term688277, term688277.getClass(), "roundsNoDamge", 0);
        setBooleanField(term688277, term688277.getClass(), "endCombatHandled", false);
        setField(term688277, term688277.getClass(), "wormHole", null);
        setIntField(term688277, term688277.getClass(), "timerForWormHole", 0);
        setBooleanField(term688277, term688277.getClass(), "defenderEscaped", false);
        setBooleanField(term688277, term688277.getClass(), "attackerEscaped", false);
        setField(term688277, term688277.getClass(), "escapePosition", null);
        setField(term688277, term688277.getClass(), "combatEvent", null);
        setIntField(term688277, term688277.getClass(), "defenderMilitaryValue", 0);
        setIntField(term688277, term688277.getClass(), "attackerMilitaryValue", 0);
        setField(term688277, term688277.getClass(), "leaderKilledNews", null);
        setField(term688277, term688277.getClass(), "orbitalDestroyedNews", null);
        setField(term688277, term688277.getClass(), "leaderInCombat", null);
        setBooleanField(term688277, term688277.getClass(), "attackerPrivateer", false);
        setBooleanField(term688277, term688277.getClass(), "defenderPrivateer", false);
        setBooleanField(term688277, term688277.getClass(), "orbitalInCombat", false);
        setIntField(term688277, term688277.getClass(), "starYear", 0);
        setBooleanField(term688277, term688277.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDamageOnAnyShip", argTypes, term688277, args);
    }

};


