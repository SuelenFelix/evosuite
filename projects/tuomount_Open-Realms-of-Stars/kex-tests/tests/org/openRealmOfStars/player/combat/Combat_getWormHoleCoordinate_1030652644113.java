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

public class Combat_getWormHoleCoordinate_1030652644113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742737;

    public Combat_getWormHoleCoordinate_1030652644113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term742737 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term742737, term742737.getClass(), "combatShipList", null);
        setIntField(term742737, term742737.getClass(), "shipIndex", 0);
        setIntField(term742737, term742737.getClass(), "cursorX", 0);
        setIntField(term742737, term742737.getClass(), "cursorY", 0);
        setIntField(term742737, term742737.getClass(), "componentUse", 0);
        setField(term742737, term742737.getClass(), "animation", null);
        setField(term742737, term742737.getClass(), "attackerFleet", null);
        setField(term742737, term742737.getClass(), "defenderFleet", null);
        setField(term742737, term742737.getClass(), "starbaseFleet", null);
        setField(term742737, term742737.getClass(), "winner", null);
        setField(term742737, term742737.getClass(), "attackerInfo", null);
        setField(term742737, term742737.getClass(), "defenderInfo", null);
        setField(term742737, term742737.getClass(), "planet", null);
        setIntField(term742737, term742737.getClass(), "totalRounds", 0);
        setIntField(term742737, term742737.getClass(), "roundsNoDamge", 0);
        setBooleanField(term742737, term742737.getClass(), "endCombatHandled", false);
        setField(term742737, term742737.getClass(), "wormHole", null);
        setIntField(term742737, term742737.getClass(), "timerForWormHole", 0);
        setBooleanField(term742737, term742737.getClass(), "defenderEscaped", false);
        setBooleanField(term742737, term742737.getClass(), "attackerEscaped", false);
        setField(term742737, term742737.getClass(), "escapePosition", null);
        setField(term742737, term742737.getClass(), "combatEvent", null);
        setIntField(term742737, term742737.getClass(), "defenderMilitaryValue", 0);
        setIntField(term742737, term742737.getClass(), "attackerMilitaryValue", 0);
        setField(term742737, term742737.getClass(), "leaderKilledNews", null);
        setField(term742737, term742737.getClass(), "orbitalDestroyedNews", null);
        setField(term742737, term742737.getClass(), "leaderInCombat", null);
        setBooleanField(term742737, term742737.getClass(), "attackerPrivateer", false);
        setBooleanField(term742737, term742737.getClass(), "defenderPrivateer", false);
        setBooleanField(term742737, term742737.getClass(), "orbitalInCombat", false);
        setIntField(term742737, term742737.getClass(), "starYear", 0);
        setBooleanField(term742737, term742737.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWormHoleCoordinate", argTypes, term742737, args);
    }

};


