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

public class Combat_destroyShip_180336283144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577846;

    public Combat_destroyShip_180336283144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577846 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term577846, term577846.getClass(), "combatShipList", null);
        setIntField(term577846, term577846.getClass(), "shipIndex", 0);
        setIntField(term577846, term577846.getClass(), "cursorX", 0);
        setIntField(term577846, term577846.getClass(), "cursorY", 0);
        setIntField(term577846, term577846.getClass(), "componentUse", 0);
        setField(term577846, term577846.getClass(), "animation", null);
        setField(term577846, term577846.getClass(), "attackerFleet", null);
        setField(term577846, term577846.getClass(), "defenderFleet", null);
        setField(term577846, term577846.getClass(), "starbaseFleet", null);
        setField(term577846, term577846.getClass(), "winner", null);
        setField(term577846, term577846.getClass(), "attackerInfo", null);
        setField(term577846, term577846.getClass(), "defenderInfo", null);
        setField(term577846, term577846.getClass(), "planet", null);
        setIntField(term577846, term577846.getClass(), "totalRounds", 0);
        setIntField(term577846, term577846.getClass(), "roundsNoDamge", 0);
        setBooleanField(term577846, term577846.getClass(), "endCombatHandled", false);
        setField(term577846, term577846.getClass(), "wormHole", null);
        setIntField(term577846, term577846.getClass(), "timerForWormHole", 0);
        setBooleanField(term577846, term577846.getClass(), "defenderEscaped", false);
        setBooleanField(term577846, term577846.getClass(), "attackerEscaped", false);
        setField(term577846, term577846.getClass(), "escapePosition", null);
        setField(term577846, term577846.getClass(), "combatEvent", null);
        setIntField(term577846, term577846.getClass(), "defenderMilitaryValue", 0);
        setIntField(term577846, term577846.getClass(), "attackerMilitaryValue", 0);
        setField(term577846, term577846.getClass(), "leaderKilledNews", null);
        setField(term577846, term577846.getClass(), "orbitalDestroyedNews", null);
        setField(term577846, term577846.getClass(), "leaderInCombat", null);
        setBooleanField(term577846, term577846.getClass(), "attackerPrivateer", false);
        setBooleanField(term577846, term577846.getClass(), "defenderPrivateer", false);
        setBooleanField(term577846, term577846.getClass(), "orbitalInCombat", false);
        setIntField(term577846, term577846.getClass(), "starYear", 0);
        setBooleanField(term577846, term577846.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "destroyShip", argTypes, term577846, args);
    }

};


