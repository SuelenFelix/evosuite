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

public class Combat_setPlanet_1070090588103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720732;

    public Combat_setPlanet_1070090588103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term720732 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term720732, term720732.getClass(), "combatShipList", null);
        setIntField(term720732, term720732.getClass(), "shipIndex", 0);
        setIntField(term720732, term720732.getClass(), "cursorX", 0);
        setIntField(term720732, term720732.getClass(), "cursorY", 0);
        setIntField(term720732, term720732.getClass(), "componentUse", 0);
        setField(term720732, term720732.getClass(), "animation", null);
        setField(term720732, term720732.getClass(), "attackerFleet", null);
        setField(term720732, term720732.getClass(), "defenderFleet", null);
        setField(term720732, term720732.getClass(), "starbaseFleet", null);
        setField(term720732, term720732.getClass(), "winner", null);
        setField(term720732, term720732.getClass(), "attackerInfo", null);
        setField(term720732, term720732.getClass(), "defenderInfo", null);
        setField(term720732, term720732.getClass(), "planet", null);
        setIntField(term720732, term720732.getClass(), "totalRounds", 0);
        setIntField(term720732, term720732.getClass(), "roundsNoDamge", 0);
        setBooleanField(term720732, term720732.getClass(), "endCombatHandled", false);
        setField(term720732, term720732.getClass(), "wormHole", null);
        setIntField(term720732, term720732.getClass(), "timerForWormHole", 0);
        setBooleanField(term720732, term720732.getClass(), "defenderEscaped", false);
        setBooleanField(term720732, term720732.getClass(), "attackerEscaped", false);
        setField(term720732, term720732.getClass(), "escapePosition", null);
        setField(term720732, term720732.getClass(), "combatEvent", null);
        setIntField(term720732, term720732.getClass(), "defenderMilitaryValue", 0);
        setIntField(term720732, term720732.getClass(), "attackerMilitaryValue", 0);
        setField(term720732, term720732.getClass(), "leaderKilledNews", null);
        setField(term720732, term720732.getClass(), "orbitalDestroyedNews", null);
        setField(term720732, term720732.getClass(), "leaderInCombat", null);
        setBooleanField(term720732, term720732.getClass(), "attackerPrivateer", false);
        setBooleanField(term720732, term720732.getClass(), "defenderPrivateer", false);
        setBooleanField(term720732, term720732.getClass(), "orbitalInCombat", false);
        setIntField(term720732, term720732.getClass(), "starYear", 0);
        setBooleanField(term720732, term720732.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanet", argTypes, term720732, args);
    }

};


