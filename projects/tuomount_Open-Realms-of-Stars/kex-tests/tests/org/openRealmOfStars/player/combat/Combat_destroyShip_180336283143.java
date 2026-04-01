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

public class Combat_destroyShip_180336283143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169872;

    public Combat_destroyShip_180336283143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169872 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term169872, term169872.getClass(), "combatShipList", null);
        setIntField(term169872, term169872.getClass(), "shipIndex", 0);
        setIntField(term169872, term169872.getClass(), "cursorX", 0);
        setIntField(term169872, term169872.getClass(), "cursorY", 0);
        setIntField(term169872, term169872.getClass(), "componentUse", 0);
        setField(term169872, term169872.getClass(), "animation", null);
        setField(term169872, term169872.getClass(), "attackerFleet", null);
        setField(term169872, term169872.getClass(), "defenderFleet", null);
        setField(term169872, term169872.getClass(), "starbaseFleet", null);
        setField(term169872, term169872.getClass(), "winner", null);
        setField(term169872, term169872.getClass(), "attackerInfo", null);
        setField(term169872, term169872.getClass(), "defenderInfo", null);
        setField(term169872, term169872.getClass(), "planet", null);
        setIntField(term169872, term169872.getClass(), "totalRounds", 0);
        setIntField(term169872, term169872.getClass(), "roundsNoDamge", 0);
        setBooleanField(term169872, term169872.getClass(), "endCombatHandled", false);
        setField(term169872, term169872.getClass(), "wormHole", null);
        setIntField(term169872, term169872.getClass(), "timerForWormHole", 0);
        setBooleanField(term169872, term169872.getClass(), "defenderEscaped", false);
        setBooleanField(term169872, term169872.getClass(), "attackerEscaped", false);
        setField(term169872, term169872.getClass(), "escapePosition", null);
        setField(term169872, term169872.getClass(), "combatEvent", null);
        setIntField(term169872, term169872.getClass(), "defenderMilitaryValue", 0);
        setIntField(term169872, term169872.getClass(), "attackerMilitaryValue", 0);
        setField(term169872, term169872.getClass(), "leaderKilledNews", null);
        setField(term169872, term169872.getClass(), "orbitalDestroyedNews", null);
        setField(term169872, term169872.getClass(), "leaderInCombat", null);
        setBooleanField(term169872, term169872.getClass(), "attackerPrivateer", false);
        setBooleanField(term169872, term169872.getClass(), "defenderPrivateer", false);
        setBooleanField(term169872, term169872.getClass(), "orbitalInCombat", false);
        setIntField(term169872, term169872.getClass(), "starYear", 0);
        setBooleanField(term169872, term169872.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "destroyShip", argTypes, term169872, args);
    }

};


