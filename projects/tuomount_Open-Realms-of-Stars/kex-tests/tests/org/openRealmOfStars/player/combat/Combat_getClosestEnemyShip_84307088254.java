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

public class Combat_getClosestEnemyShip_84307088254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207060;

    public Combat_getClosestEnemyShip_84307088254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207060 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term207060, term207060.getClass(), "combatShipList", null);
        setIntField(term207060, term207060.getClass(), "shipIndex", 0);
        setIntField(term207060, term207060.getClass(), "cursorX", 0);
        setIntField(term207060, term207060.getClass(), "cursorY", 0);
        setIntField(term207060, term207060.getClass(), "componentUse", 0);
        setField(term207060, term207060.getClass(), "animation", null);
        setField(term207060, term207060.getClass(), "attackerFleet", null);
        setField(term207060, term207060.getClass(), "defenderFleet", null);
        setField(term207060, term207060.getClass(), "starbaseFleet", null);
        setField(term207060, term207060.getClass(), "winner", null);
        setField(term207060, term207060.getClass(), "attackerInfo", null);
        setField(term207060, term207060.getClass(), "defenderInfo", null);
        setField(term207060, term207060.getClass(), "planet", null);
        setIntField(term207060, term207060.getClass(), "totalRounds", 0);
        setIntField(term207060, term207060.getClass(), "roundsNoDamge", 0);
        setBooleanField(term207060, term207060.getClass(), "endCombatHandled", false);
        setField(term207060, term207060.getClass(), "wormHole", null);
        setIntField(term207060, term207060.getClass(), "timerForWormHole", 0);
        setBooleanField(term207060, term207060.getClass(), "defenderEscaped", false);
        setBooleanField(term207060, term207060.getClass(), "attackerEscaped", false);
        setField(term207060, term207060.getClass(), "escapePosition", null);
        setField(term207060, term207060.getClass(), "combatEvent", null);
        setIntField(term207060, term207060.getClass(), "defenderMilitaryValue", 0);
        setIntField(term207060, term207060.getClass(), "attackerMilitaryValue", 0);
        setField(term207060, term207060.getClass(), "leaderKilledNews", null);
        setField(term207060, term207060.getClass(), "orbitalDestroyedNews", null);
        setField(term207060, term207060.getClass(), "leaderInCombat", null);
        setBooleanField(term207060, term207060.getClass(), "attackerPrivateer", false);
        setBooleanField(term207060, term207060.getClass(), "defenderPrivateer", false);
        setBooleanField(term207060, term207060.getClass(), "orbitalInCombat", false);
        setIntField(term207060, term207060.getClass(), "starYear", 0);
        setBooleanField(term207060, term207060.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "getClosestEnemyShip", argTypes, term207060, args);
    }

};


