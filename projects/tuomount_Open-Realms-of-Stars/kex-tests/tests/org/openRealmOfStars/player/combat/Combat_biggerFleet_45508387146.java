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

public class Combat_biggerFleet_45508387146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405343;

    public Combat_biggerFleet_45508387146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405343 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405343, term405343.getClass(), "combatShipList", null);
        setIntField(term405343, term405343.getClass(), "shipIndex", 0);
        setIntField(term405343, term405343.getClass(), "cursorX", 0);
        setIntField(term405343, term405343.getClass(), "cursorY", 0);
        setIntField(term405343, term405343.getClass(), "componentUse", 0);
        setField(term405343, term405343.getClass(), "animation", null);
        setField(term405343, term405343.getClass(), "attackerFleet", null);
        setField(term405343, term405343.getClass(), "defenderFleet", null);
        setField(term405343, term405343.getClass(), "starbaseFleet", null);
        setField(term405343, term405343.getClass(), "winner", null);
        setField(term405343, term405343.getClass(), "attackerInfo", null);
        setField(term405343, term405343.getClass(), "defenderInfo", null);
        setField(term405343, term405343.getClass(), "planet", null);
        setIntField(term405343, term405343.getClass(), "totalRounds", 0);
        setIntField(term405343, term405343.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405343, term405343.getClass(), "endCombatHandled", false);
        setField(term405343, term405343.getClass(), "wormHole", null);
        setIntField(term405343, term405343.getClass(), "timerForWormHole", 0);
        setBooleanField(term405343, term405343.getClass(), "defenderEscaped", false);
        setBooleanField(term405343, term405343.getClass(), "attackerEscaped", false);
        setField(term405343, term405343.getClass(), "escapePosition", null);
        setField(term405343, term405343.getClass(), "combatEvent", null);
        setIntField(term405343, term405343.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405343, term405343.getClass(), "attackerMilitaryValue", 0);
        setField(term405343, term405343.getClass(), "leaderKilledNews", null);
        setField(term405343, term405343.getClass(), "orbitalDestroyedNews", null);
        setField(term405343, term405343.getClass(), "leaderInCombat", null);
        setBooleanField(term405343, term405343.getClass(), "attackerPrivateer", false);
        setBooleanField(term405343, term405343.getClass(), "defenderPrivateer", false);
        setBooleanField(term405343, term405343.getClass(), "orbitalInCombat", false);
        setIntField(term405343, term405343.getClass(), "starYear", 0);
        setBooleanField(term405343, term405343.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "biggerFleet", argTypes, term405343, args);
    }

};


