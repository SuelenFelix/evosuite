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

public class Combat_getPlanet_1338364136103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297436;

    public Combat_getPlanet_1338364136103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297436 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term297436, term297436.getClass(), "combatShipList", null);
        setIntField(term297436, term297436.getClass(), "shipIndex", 0);
        setIntField(term297436, term297436.getClass(), "cursorX", 0);
        setIntField(term297436, term297436.getClass(), "cursorY", 0);
        setIntField(term297436, term297436.getClass(), "componentUse", 0);
        setField(term297436, term297436.getClass(), "animation", null);
        setField(term297436, term297436.getClass(), "attackerFleet", null);
        setField(term297436, term297436.getClass(), "defenderFleet", null);
        setField(term297436, term297436.getClass(), "starbaseFleet", null);
        setField(term297436, term297436.getClass(), "winner", null);
        setField(term297436, term297436.getClass(), "attackerInfo", null);
        setField(term297436, term297436.getClass(), "defenderInfo", null);
        setField(term297436, term297436.getClass(), "planet", null);
        setIntField(term297436, term297436.getClass(), "totalRounds", 0);
        setIntField(term297436, term297436.getClass(), "roundsNoDamge", 0);
        setBooleanField(term297436, term297436.getClass(), "endCombatHandled", false);
        setField(term297436, term297436.getClass(), "wormHole", null);
        setIntField(term297436, term297436.getClass(), "timerForWormHole", 0);
        setBooleanField(term297436, term297436.getClass(), "defenderEscaped", false);
        setBooleanField(term297436, term297436.getClass(), "attackerEscaped", false);
        setField(term297436, term297436.getClass(), "escapePosition", null);
        setField(term297436, term297436.getClass(), "combatEvent", null);
        setIntField(term297436, term297436.getClass(), "defenderMilitaryValue", 0);
        setIntField(term297436, term297436.getClass(), "attackerMilitaryValue", 0);
        setField(term297436, term297436.getClass(), "leaderKilledNews", null);
        setField(term297436, term297436.getClass(), "orbitalDestroyedNews", null);
        setField(term297436, term297436.getClass(), "leaderInCombat", null);
        setBooleanField(term297436, term297436.getClass(), "attackerPrivateer", false);
        setBooleanField(term297436, term297436.getClass(), "defenderPrivateer", false);
        setBooleanField(term297436, term297436.getClass(), "orbitalInCombat", false);
        setIntField(term297436, term297436.getClass(), "starYear", 0);
        setBooleanField(term297436, term297436.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanet", argTypes, term297436, args);
    }

};


