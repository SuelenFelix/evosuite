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

public class Combat_canPrivateer_98527903932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114003;

    public Combat_canPrivateer_98527903932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114003 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term114003, term114003.getClass(), "combatShipList", null);
        setIntField(term114003, term114003.getClass(), "shipIndex", 0);
        setIntField(term114003, term114003.getClass(), "cursorX", 0);
        setIntField(term114003, term114003.getClass(), "cursorY", 0);
        setIntField(term114003, term114003.getClass(), "componentUse", 0);
        setField(term114003, term114003.getClass(), "animation", null);
        setField(term114003, term114003.getClass(), "attackerFleet", null);
        setField(term114003, term114003.getClass(), "defenderFleet", null);
        setField(term114003, term114003.getClass(), "starbaseFleet", null);
        setField(term114003, term114003.getClass(), "winner", null);
        setField(term114003, term114003.getClass(), "attackerInfo", null);
        setField(term114003, term114003.getClass(), "defenderInfo", null);
        setField(term114003, term114003.getClass(), "planet", null);
        setIntField(term114003, term114003.getClass(), "totalRounds", 0);
        setIntField(term114003, term114003.getClass(), "roundsNoDamge", 0);
        setBooleanField(term114003, term114003.getClass(), "endCombatHandled", false);
        setField(term114003, term114003.getClass(), "wormHole", null);
        setIntField(term114003, term114003.getClass(), "timerForWormHole", 0);
        setBooleanField(term114003, term114003.getClass(), "defenderEscaped", false);
        setBooleanField(term114003, term114003.getClass(), "attackerEscaped", false);
        setField(term114003, term114003.getClass(), "escapePosition", null);
        setField(term114003, term114003.getClass(), "combatEvent", null);
        setIntField(term114003, term114003.getClass(), "defenderMilitaryValue", 0);
        setIntField(term114003, term114003.getClass(), "attackerMilitaryValue", 0);
        setField(term114003, term114003.getClass(), "leaderKilledNews", null);
        setField(term114003, term114003.getClass(), "orbitalDestroyedNews", null);
        setField(term114003, term114003.getClass(), "leaderInCombat", null);
        setBooleanField(term114003, term114003.getClass(), "attackerPrivateer", false);
        setBooleanField(term114003, term114003.getClass(), "defenderPrivateer", false);
        setBooleanField(term114003, term114003.getClass(), "orbitalInCombat", false);
        setIntField(term114003, term114003.getClass(), "starYear", 0);
        setBooleanField(term114003, term114003.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "canPrivateer", argTypes, term114003, args);
    }

};


