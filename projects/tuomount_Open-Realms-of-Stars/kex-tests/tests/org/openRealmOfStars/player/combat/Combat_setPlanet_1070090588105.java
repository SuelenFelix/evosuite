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

public class Combat_setPlanet_1070090588105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306068;

    public Combat_setPlanet_1070090588105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306068 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term306068, term306068.getClass(), "combatShipList", null);
        setIntField(term306068, term306068.getClass(), "shipIndex", 0);
        setIntField(term306068, term306068.getClass(), "cursorX", 0);
        setIntField(term306068, term306068.getClass(), "cursorY", 0);
        setIntField(term306068, term306068.getClass(), "componentUse", 0);
        setField(term306068, term306068.getClass(), "animation", null);
        setField(term306068, term306068.getClass(), "attackerFleet", null);
        setField(term306068, term306068.getClass(), "defenderFleet", null);
        setField(term306068, term306068.getClass(), "starbaseFleet", null);
        setField(term306068, term306068.getClass(), "winner", null);
        setField(term306068, term306068.getClass(), "attackerInfo", null);
        setField(term306068, term306068.getClass(), "defenderInfo", null);
        setField(term306068, term306068.getClass(), "planet", null);
        setIntField(term306068, term306068.getClass(), "totalRounds", 0);
        setIntField(term306068, term306068.getClass(), "roundsNoDamge", 0);
        setBooleanField(term306068, term306068.getClass(), "endCombatHandled", false);
        setField(term306068, term306068.getClass(), "wormHole", null);
        setIntField(term306068, term306068.getClass(), "timerForWormHole", 0);
        setBooleanField(term306068, term306068.getClass(), "defenderEscaped", false);
        setBooleanField(term306068, term306068.getClass(), "attackerEscaped", false);
        setField(term306068, term306068.getClass(), "escapePosition", null);
        setField(term306068, term306068.getClass(), "combatEvent", null);
        setIntField(term306068, term306068.getClass(), "defenderMilitaryValue", 0);
        setIntField(term306068, term306068.getClass(), "attackerMilitaryValue", 0);
        setField(term306068, term306068.getClass(), "leaderKilledNews", null);
        setField(term306068, term306068.getClass(), "orbitalDestroyedNews", null);
        setField(term306068, term306068.getClass(), "leaderInCombat", null);
        setBooleanField(term306068, term306068.getClass(), "attackerPrivateer", false);
        setBooleanField(term306068, term306068.getClass(), "defenderPrivateer", false);
        setBooleanField(term306068, term306068.getClass(), "orbitalInCombat", false);
        setIntField(term306068, term306068.getClass(), "starYear", 0);
        setBooleanField(term306068, term306068.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanet", argTypes, term306068, args);
    }

};


