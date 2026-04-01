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
import java.lang.Integer;

public class Combat_launchIntercept_112215470435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522248;
     Object term522266;

    public Combat_launchIntercept_112215470435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522248 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term522248, term522248.getClass(), "combatShipList", null);
        setIntField(term522248, term522248.getClass(), "shipIndex", 0);
        setIntField(term522248, term522248.getClass(), "cursorX", 0);
        setIntField(term522248, term522248.getClass(), "cursorY", 0);
        setIntField(term522248, term522248.getClass(), "componentUse", 0);
        setField(term522248, term522248.getClass(), "animation", null);
        setField(term522248, term522248.getClass(), "attackerFleet", null);
        setField(term522248, term522248.getClass(), "defenderFleet", null);
        setField(term522248, term522248.getClass(), "starbaseFleet", null);
        setField(term522248, term522248.getClass(), "winner", null);
        setField(term522248, term522248.getClass(), "attackerInfo", null);
        setField(term522248, term522248.getClass(), "defenderInfo", null);
        setField(term522248, term522248.getClass(), "planet", null);
        setIntField(term522248, term522248.getClass(), "totalRounds", 0);
        setIntField(term522248, term522248.getClass(), "roundsNoDamge", 0);
        setBooleanField(term522248, term522248.getClass(), "endCombatHandled", false);
        setField(term522248, term522248.getClass(), "wormHole", null);
        setIntField(term522248, term522248.getClass(), "timerForWormHole", 0);
        setBooleanField(term522248, term522248.getClass(), "defenderEscaped", false);
        setBooleanField(term522248, term522248.getClass(), "attackerEscaped", false);
        setField(term522248, term522248.getClass(), "escapePosition", null);
        setField(term522248, term522248.getClass(), "combatEvent", null);
        setIntField(term522248, term522248.getClass(), "defenderMilitaryValue", 0);
        setIntField(term522248, term522248.getClass(), "attackerMilitaryValue", 0);
        setField(term522248, term522248.getClass(), "leaderKilledNews", null);
        setField(term522248, term522248.getClass(), "orbitalDestroyedNews", null);
        setField(term522248, term522248.getClass(), "leaderInCombat", null);
        setBooleanField(term522248, term522248.getClass(), "attackerPrivateer", false);
        setBooleanField(term522248, term522248.getClass(), "defenderPrivateer", false);
        setBooleanField(term522248, term522248.getClass(), "orbitalInCombat", false);
        setIntField(term522248, term522248.getClass(), "starYear", 0);
        setBooleanField(term522248, term522248.getClass(), "worthOfWarHero", false);
        term522266 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate");
        Object[] args = new Object[3];
        args[0] = term522266;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "launchIntercept", argTypes, term522248, args);
    }

};


