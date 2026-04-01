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

public class Combat_getMaxCloakDetection_170135495041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552219;

    public Combat_getMaxCloakDetection_170135495041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552219 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term552219, term552219.getClass(), "combatShipList", null);
        setIntField(term552219, term552219.getClass(), "shipIndex", 0);
        setIntField(term552219, term552219.getClass(), "cursorX", 0);
        setIntField(term552219, term552219.getClass(), "cursorY", 0);
        setIntField(term552219, term552219.getClass(), "componentUse", 0);
        setField(term552219, term552219.getClass(), "animation", null);
        setField(term552219, term552219.getClass(), "attackerFleet", null);
        setField(term552219, term552219.getClass(), "defenderFleet", null);
        setField(term552219, term552219.getClass(), "starbaseFleet", null);
        setField(term552219, term552219.getClass(), "winner", null);
        setField(term552219, term552219.getClass(), "attackerInfo", null);
        setField(term552219, term552219.getClass(), "defenderInfo", null);
        setField(term552219, term552219.getClass(), "planet", null);
        setIntField(term552219, term552219.getClass(), "totalRounds", 0);
        setIntField(term552219, term552219.getClass(), "roundsNoDamge", 0);
        setBooleanField(term552219, term552219.getClass(), "endCombatHandled", false);
        setField(term552219, term552219.getClass(), "wormHole", null);
        setIntField(term552219, term552219.getClass(), "timerForWormHole", 0);
        setBooleanField(term552219, term552219.getClass(), "defenderEscaped", false);
        setBooleanField(term552219, term552219.getClass(), "attackerEscaped", false);
        setField(term552219, term552219.getClass(), "escapePosition", null);
        setField(term552219, term552219.getClass(), "combatEvent", null);
        setIntField(term552219, term552219.getClass(), "defenderMilitaryValue", 0);
        setIntField(term552219, term552219.getClass(), "attackerMilitaryValue", 0);
        setField(term552219, term552219.getClass(), "leaderKilledNews", null);
        setField(term552219, term552219.getClass(), "orbitalDestroyedNews", null);
        setField(term552219, term552219.getClass(), "leaderInCombat", null);
        setBooleanField(term552219, term552219.getClass(), "attackerPrivateer", false);
        setBooleanField(term552219, term552219.getClass(), "defenderPrivateer", false);
        setBooleanField(term552219, term552219.getClass(), "orbitalInCombat", false);
        setIntField(term552219, term552219.getClass(), "starYear", 0);
        setBooleanField(term552219, term552219.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getMaxCloakDetection", argTypes, term552219, args);
    }

};


