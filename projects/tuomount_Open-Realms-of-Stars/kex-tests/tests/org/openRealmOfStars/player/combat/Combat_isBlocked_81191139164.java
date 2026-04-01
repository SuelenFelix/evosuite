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

public class Combat_isBlocked_81191139164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230241;
     Object term230259;
     Object term230261;

    public Combat_isBlocked_81191139164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230241 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term230241, term230241.getClass(), "combatShipList", null);
        setIntField(term230241, term230241.getClass(), "shipIndex", 0);
        setIntField(term230241, term230241.getClass(), "cursorX", 0);
        setIntField(term230241, term230241.getClass(), "cursorY", 0);
        setIntField(term230241, term230241.getClass(), "componentUse", 0);
        setField(term230241, term230241.getClass(), "animation", null);
        setField(term230241, term230241.getClass(), "attackerFleet", null);
        setField(term230241, term230241.getClass(), "defenderFleet", null);
        setField(term230241, term230241.getClass(), "starbaseFleet", null);
        setField(term230241, term230241.getClass(), "winner", null);
        setField(term230241, term230241.getClass(), "attackerInfo", null);
        setField(term230241, term230241.getClass(), "defenderInfo", null);
        setField(term230241, term230241.getClass(), "planet", null);
        setIntField(term230241, term230241.getClass(), "totalRounds", 0);
        setIntField(term230241, term230241.getClass(), "roundsNoDamge", 0);
        setBooleanField(term230241, term230241.getClass(), "endCombatHandled", false);
        setField(term230241, term230241.getClass(), "wormHole", null);
        setIntField(term230241, term230241.getClass(), "timerForWormHole", 0);
        setBooleanField(term230241, term230241.getClass(), "defenderEscaped", false);
        setBooleanField(term230241, term230241.getClass(), "attackerEscaped", false);
        setField(term230241, term230241.getClass(), "escapePosition", null);
        setField(term230241, term230241.getClass(), "combatEvent", null);
        setIntField(term230241, term230241.getClass(), "defenderMilitaryValue", 0);
        setIntField(term230241, term230241.getClass(), "attackerMilitaryValue", 0);
        setField(term230241, term230241.getClass(), "leaderKilledNews", null);
        setField(term230241, term230241.getClass(), "orbitalDestroyedNews", null);
        setField(term230241, term230241.getClass(), "leaderInCombat", null);
        setBooleanField(term230241, term230241.getClass(), "attackerPrivateer", false);
        setBooleanField(term230241, term230241.getClass(), "defenderPrivateer", false);
        setBooleanField(term230241, term230241.getClass(), "orbitalInCombat", false);
        setIntField(term230241, term230241.getClass(), "starYear", 0);
        setBooleanField(term230241, term230241.getClass(), "worthOfWarHero", false);
        term230259 = new Integer(0);
        term230261 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term230259;
        args[1] = term230261;
        callMethod(klass, "isBlocked", argTypes, term230241, args);
    }

};


