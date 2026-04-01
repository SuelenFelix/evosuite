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

public class Combat_getClosestTraderShip_46688824656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218874;

    public Combat_getClosestTraderShip_46688824656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218874 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term218874, term218874.getClass(), "combatShipList", null);
        setIntField(term218874, term218874.getClass(), "shipIndex", 0);
        setIntField(term218874, term218874.getClass(), "cursorX", 0);
        setIntField(term218874, term218874.getClass(), "cursorY", 0);
        setIntField(term218874, term218874.getClass(), "componentUse", 0);
        setField(term218874, term218874.getClass(), "animation", null);
        setField(term218874, term218874.getClass(), "attackerFleet", null);
        setField(term218874, term218874.getClass(), "defenderFleet", null);
        setField(term218874, term218874.getClass(), "starbaseFleet", null);
        setField(term218874, term218874.getClass(), "winner", null);
        setField(term218874, term218874.getClass(), "attackerInfo", null);
        setField(term218874, term218874.getClass(), "defenderInfo", null);
        setField(term218874, term218874.getClass(), "planet", null);
        setIntField(term218874, term218874.getClass(), "totalRounds", 0);
        setIntField(term218874, term218874.getClass(), "roundsNoDamge", 0);
        setBooleanField(term218874, term218874.getClass(), "endCombatHandled", false);
        setField(term218874, term218874.getClass(), "wormHole", null);
        setIntField(term218874, term218874.getClass(), "timerForWormHole", 0);
        setBooleanField(term218874, term218874.getClass(), "defenderEscaped", false);
        setBooleanField(term218874, term218874.getClass(), "attackerEscaped", false);
        setField(term218874, term218874.getClass(), "escapePosition", null);
        setField(term218874, term218874.getClass(), "combatEvent", null);
        setIntField(term218874, term218874.getClass(), "defenderMilitaryValue", 0);
        setIntField(term218874, term218874.getClass(), "attackerMilitaryValue", 0);
        setField(term218874, term218874.getClass(), "leaderKilledNews", null);
        setField(term218874, term218874.getClass(), "orbitalDestroyedNews", null);
        setField(term218874, term218874.getClass(), "leaderInCombat", null);
        setBooleanField(term218874, term218874.getClass(), "attackerPrivateer", false);
        setBooleanField(term218874, term218874.getClass(), "defenderPrivateer", false);
        setBooleanField(term218874, term218874.getClass(), "orbitalInCombat", false);
        setIntField(term218874, term218874.getClass(), "starYear", 0);
        setBooleanField(term218874, term218874.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getClosestTraderShip", argTypes, term218874, args);
    }

};


