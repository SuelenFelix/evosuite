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

public class Combat_calculateDistance_1245772107151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405433;

    public Combat_calculateDistance_1245772107151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405433 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405433, term405433.getClass(), "combatShipList", null);
        setIntField(term405433, term405433.getClass(), "shipIndex", 0);
        setIntField(term405433, term405433.getClass(), "cursorX", 0);
        setIntField(term405433, term405433.getClass(), "cursorY", 0);
        setIntField(term405433, term405433.getClass(), "componentUse", 0);
        setField(term405433, term405433.getClass(), "animation", null);
        setField(term405433, term405433.getClass(), "attackerFleet", null);
        setField(term405433, term405433.getClass(), "defenderFleet", null);
        setField(term405433, term405433.getClass(), "starbaseFleet", null);
        setField(term405433, term405433.getClass(), "winner", null);
        setField(term405433, term405433.getClass(), "attackerInfo", null);
        setField(term405433, term405433.getClass(), "defenderInfo", null);
        setField(term405433, term405433.getClass(), "planet", null);
        setIntField(term405433, term405433.getClass(), "totalRounds", 0);
        setIntField(term405433, term405433.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405433, term405433.getClass(), "endCombatHandled", false);
        setField(term405433, term405433.getClass(), "wormHole", null);
        setIntField(term405433, term405433.getClass(), "timerForWormHole", 0);
        setBooleanField(term405433, term405433.getClass(), "defenderEscaped", false);
        setBooleanField(term405433, term405433.getClass(), "attackerEscaped", false);
        setField(term405433, term405433.getClass(), "escapePosition", null);
        setField(term405433, term405433.getClass(), "combatEvent", null);
        setIntField(term405433, term405433.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405433, term405433.getClass(), "attackerMilitaryValue", 0);
        setField(term405433, term405433.getClass(), "leaderKilledNews", null);
        setField(term405433, term405433.getClass(), "orbitalDestroyedNews", null);
        setField(term405433, term405433.getClass(), "leaderInCombat", null);
        setBooleanField(term405433, term405433.getClass(), "attackerPrivateer", false);
        setBooleanField(term405433, term405433.getClass(), "defenderPrivateer", false);
        setBooleanField(term405433, term405433.getClass(), "orbitalInCombat", false);
        setIntField(term405433, term405433.getClass(), "starYear", 0);
        setBooleanField(term405433, term405433.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "calculateDistance", argTypes, term405433, args);
    }

};


