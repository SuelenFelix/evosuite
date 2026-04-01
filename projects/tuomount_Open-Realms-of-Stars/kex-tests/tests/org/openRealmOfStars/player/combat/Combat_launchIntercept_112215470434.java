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

public class Combat_launchIntercept_112215470434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116144;
     Object term116162;

    public Combat_launchIntercept_112215470434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116144 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term116144, term116144.getClass(), "combatShipList", null);
        setIntField(term116144, term116144.getClass(), "shipIndex", 0);
        setIntField(term116144, term116144.getClass(), "cursorX", 0);
        setIntField(term116144, term116144.getClass(), "cursorY", 0);
        setIntField(term116144, term116144.getClass(), "componentUse", 0);
        setField(term116144, term116144.getClass(), "animation", null);
        setField(term116144, term116144.getClass(), "attackerFleet", null);
        setField(term116144, term116144.getClass(), "defenderFleet", null);
        setField(term116144, term116144.getClass(), "starbaseFleet", null);
        setField(term116144, term116144.getClass(), "winner", null);
        setField(term116144, term116144.getClass(), "attackerInfo", null);
        setField(term116144, term116144.getClass(), "defenderInfo", null);
        setField(term116144, term116144.getClass(), "planet", null);
        setIntField(term116144, term116144.getClass(), "totalRounds", 0);
        setIntField(term116144, term116144.getClass(), "roundsNoDamge", 0);
        setBooleanField(term116144, term116144.getClass(), "endCombatHandled", false);
        setField(term116144, term116144.getClass(), "wormHole", null);
        setIntField(term116144, term116144.getClass(), "timerForWormHole", 0);
        setBooleanField(term116144, term116144.getClass(), "defenderEscaped", false);
        setBooleanField(term116144, term116144.getClass(), "attackerEscaped", false);
        setField(term116144, term116144.getClass(), "escapePosition", null);
        setField(term116144, term116144.getClass(), "combatEvent", null);
        setIntField(term116144, term116144.getClass(), "defenderMilitaryValue", 0);
        setIntField(term116144, term116144.getClass(), "attackerMilitaryValue", 0);
        setField(term116144, term116144.getClass(), "leaderKilledNews", null);
        setField(term116144, term116144.getClass(), "orbitalDestroyedNews", null);
        setField(term116144, term116144.getClass(), "leaderInCombat", null);
        setBooleanField(term116144, term116144.getClass(), "attackerPrivateer", false);
        setBooleanField(term116144, term116144.getClass(), "defenderPrivateer", false);
        setBooleanField(term116144, term116144.getClass(), "orbitalInCombat", false);
        setIntField(term116144, term116144.getClass(), "starYear", 0);
        setBooleanField(term116144, term116144.getClass(), "worthOfWarHero", false);
        term116162 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.combat.CombatCoordinate");
        Object[] args = new Object[3];
        args[0] = term116162;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "launchIntercept", argTypes, term116144, args);
    }

};


