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

public class Combat_canTractor_151699181430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107320;

    public Combat_canTractor_151699181430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107320 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term107320, term107320.getClass(), "combatShipList", null);
        setIntField(term107320, term107320.getClass(), "shipIndex", 0);
        setIntField(term107320, term107320.getClass(), "cursorX", 0);
        setIntField(term107320, term107320.getClass(), "cursorY", 0);
        setIntField(term107320, term107320.getClass(), "componentUse", 0);
        setField(term107320, term107320.getClass(), "animation", null);
        setField(term107320, term107320.getClass(), "attackerFleet", null);
        setField(term107320, term107320.getClass(), "defenderFleet", null);
        setField(term107320, term107320.getClass(), "starbaseFleet", null);
        setField(term107320, term107320.getClass(), "winner", null);
        setField(term107320, term107320.getClass(), "attackerInfo", null);
        setField(term107320, term107320.getClass(), "defenderInfo", null);
        setField(term107320, term107320.getClass(), "planet", null);
        setIntField(term107320, term107320.getClass(), "totalRounds", 0);
        setIntField(term107320, term107320.getClass(), "roundsNoDamge", 0);
        setBooleanField(term107320, term107320.getClass(), "endCombatHandled", false);
        setField(term107320, term107320.getClass(), "wormHole", null);
        setIntField(term107320, term107320.getClass(), "timerForWormHole", 0);
        setBooleanField(term107320, term107320.getClass(), "defenderEscaped", false);
        setBooleanField(term107320, term107320.getClass(), "attackerEscaped", false);
        setField(term107320, term107320.getClass(), "escapePosition", null);
        setField(term107320, term107320.getClass(), "combatEvent", null);
        setIntField(term107320, term107320.getClass(), "defenderMilitaryValue", 0);
        setIntField(term107320, term107320.getClass(), "attackerMilitaryValue", 0);
        setField(term107320, term107320.getClass(), "leaderKilledNews", null);
        setField(term107320, term107320.getClass(), "orbitalDestroyedNews", null);
        setField(term107320, term107320.getClass(), "leaderInCombat", null);
        setBooleanField(term107320, term107320.getClass(), "attackerPrivateer", false);
        setBooleanField(term107320, term107320.getClass(), "defenderPrivateer", false);
        setBooleanField(term107320, term107320.getClass(), "orbitalInCombat", false);
        setIntField(term107320, term107320.getClass(), "starYear", 0);
        setBooleanField(term107320, term107320.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "canTractor", argTypes, term107320, args);
    }

};


