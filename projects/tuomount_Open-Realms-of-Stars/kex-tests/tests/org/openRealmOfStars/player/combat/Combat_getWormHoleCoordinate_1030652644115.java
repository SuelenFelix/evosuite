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

public class Combat_getWormHoleCoordinate_1030652644115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328334;

    public Combat_getWormHoleCoordinate_1030652644115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328334 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term328334, term328334.getClass(), "combatShipList", null);
        setIntField(term328334, term328334.getClass(), "shipIndex", 0);
        setIntField(term328334, term328334.getClass(), "cursorX", 0);
        setIntField(term328334, term328334.getClass(), "cursorY", 0);
        setIntField(term328334, term328334.getClass(), "componentUse", 0);
        setField(term328334, term328334.getClass(), "animation", null);
        setField(term328334, term328334.getClass(), "attackerFleet", null);
        setField(term328334, term328334.getClass(), "defenderFleet", null);
        setField(term328334, term328334.getClass(), "starbaseFleet", null);
        setField(term328334, term328334.getClass(), "winner", null);
        setField(term328334, term328334.getClass(), "attackerInfo", null);
        setField(term328334, term328334.getClass(), "defenderInfo", null);
        setField(term328334, term328334.getClass(), "planet", null);
        setIntField(term328334, term328334.getClass(), "totalRounds", 0);
        setIntField(term328334, term328334.getClass(), "roundsNoDamge", 0);
        setBooleanField(term328334, term328334.getClass(), "endCombatHandled", false);
        setField(term328334, term328334.getClass(), "wormHole", null);
        setIntField(term328334, term328334.getClass(), "timerForWormHole", 0);
        setBooleanField(term328334, term328334.getClass(), "defenderEscaped", false);
        setBooleanField(term328334, term328334.getClass(), "attackerEscaped", false);
        setField(term328334, term328334.getClass(), "escapePosition", null);
        setField(term328334, term328334.getClass(), "combatEvent", null);
        setIntField(term328334, term328334.getClass(), "defenderMilitaryValue", 0);
        setIntField(term328334, term328334.getClass(), "attackerMilitaryValue", 0);
        setField(term328334, term328334.getClass(), "leaderKilledNews", null);
        setField(term328334, term328334.getClass(), "orbitalDestroyedNews", null);
        setField(term328334, term328334.getClass(), "leaderInCombat", null);
        setBooleanField(term328334, term328334.getClass(), "attackerPrivateer", false);
        setBooleanField(term328334, term328334.getClass(), "defenderPrivateer", false);
        setBooleanField(term328334, term328334.getClass(), "orbitalInCombat", false);
        setIntField(term328334, term328334.getClass(), "starYear", 0);
        setBooleanField(term328334, term328334.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWormHoleCoordinate", argTypes, term328334, args);
    }

};


