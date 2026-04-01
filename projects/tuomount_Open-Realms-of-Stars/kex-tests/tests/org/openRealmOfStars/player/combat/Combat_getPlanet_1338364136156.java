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

public class Combat_getPlanet_1338364136156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819401;

    public Combat_getPlanet_1338364136156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819401 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819401, term819401.getClass(), "combatShipList", null);
        setIntField(term819401, term819401.getClass(), "shipIndex", 0);
        setIntField(term819401, term819401.getClass(), "cursorX", 0);
        setIntField(term819401, term819401.getClass(), "cursorY", 0);
        setIntField(term819401, term819401.getClass(), "componentUse", 0);
        setField(term819401, term819401.getClass(), "animation", null);
        setField(term819401, term819401.getClass(), "attackerFleet", null);
        setField(term819401, term819401.getClass(), "defenderFleet", null);
        setField(term819401, term819401.getClass(), "starbaseFleet", null);
        setField(term819401, term819401.getClass(), "winner", null);
        setField(term819401, term819401.getClass(), "attackerInfo", null);
        setField(term819401, term819401.getClass(), "defenderInfo", null);
        setField(term819401, term819401.getClass(), "planet", null);
        setIntField(term819401, term819401.getClass(), "totalRounds", 0);
        setIntField(term819401, term819401.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819401, term819401.getClass(), "endCombatHandled", false);
        setField(term819401, term819401.getClass(), "wormHole", null);
        setIntField(term819401, term819401.getClass(), "timerForWormHole", 0);
        setBooleanField(term819401, term819401.getClass(), "defenderEscaped", false);
        setBooleanField(term819401, term819401.getClass(), "attackerEscaped", false);
        setField(term819401, term819401.getClass(), "escapePosition", null);
        setField(term819401, term819401.getClass(), "combatEvent", null);
        setIntField(term819401, term819401.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819401, term819401.getClass(), "attackerMilitaryValue", 0);
        setField(term819401, term819401.getClass(), "leaderKilledNews", null);
        setField(term819401, term819401.getClass(), "orbitalDestroyedNews", null);
        setField(term819401, term819401.getClass(), "leaderInCombat", null);
        setBooleanField(term819401, term819401.getClass(), "attackerPrivateer", false);
        setBooleanField(term819401, term819401.getClass(), "defenderPrivateer", false);
        setBooleanField(term819401, term819401.getClass(), "orbitalInCombat", false);
        setIntField(term819401, term819401.getClass(), "starYear", 0);
        setBooleanField(term819401, term819401.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanet", argTypes, term819401, args);
    }

};


