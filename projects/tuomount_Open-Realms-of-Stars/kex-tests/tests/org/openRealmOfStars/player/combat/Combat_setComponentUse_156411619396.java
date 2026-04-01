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

public class Combat_setComponentUse_156411619396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285404;
     Object term285422;

    public Combat_setComponentUse_156411619396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285404 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term285404, term285404.getClass(), "combatShipList", null);
        setIntField(term285404, term285404.getClass(), "shipIndex", 0);
        setIntField(term285404, term285404.getClass(), "cursorX", 0);
        setIntField(term285404, term285404.getClass(), "cursorY", 0);
        setIntField(term285404, term285404.getClass(), "componentUse", 0);
        setField(term285404, term285404.getClass(), "animation", null);
        setField(term285404, term285404.getClass(), "attackerFleet", null);
        setField(term285404, term285404.getClass(), "defenderFleet", null);
        setField(term285404, term285404.getClass(), "starbaseFleet", null);
        setField(term285404, term285404.getClass(), "winner", null);
        setField(term285404, term285404.getClass(), "attackerInfo", null);
        setField(term285404, term285404.getClass(), "defenderInfo", null);
        setField(term285404, term285404.getClass(), "planet", null);
        setIntField(term285404, term285404.getClass(), "totalRounds", 0);
        setIntField(term285404, term285404.getClass(), "roundsNoDamge", 0);
        setBooleanField(term285404, term285404.getClass(), "endCombatHandled", false);
        setField(term285404, term285404.getClass(), "wormHole", null);
        setIntField(term285404, term285404.getClass(), "timerForWormHole", 0);
        setBooleanField(term285404, term285404.getClass(), "defenderEscaped", false);
        setBooleanField(term285404, term285404.getClass(), "attackerEscaped", false);
        setField(term285404, term285404.getClass(), "escapePosition", null);
        setField(term285404, term285404.getClass(), "combatEvent", null);
        setIntField(term285404, term285404.getClass(), "defenderMilitaryValue", 0);
        setIntField(term285404, term285404.getClass(), "attackerMilitaryValue", 0);
        setField(term285404, term285404.getClass(), "leaderKilledNews", null);
        setField(term285404, term285404.getClass(), "orbitalDestroyedNews", null);
        setField(term285404, term285404.getClass(), "leaderInCombat", null);
        setBooleanField(term285404, term285404.getClass(), "attackerPrivateer", false);
        setBooleanField(term285404, term285404.getClass(), "defenderPrivateer", false);
        setBooleanField(term285404, term285404.getClass(), "orbitalInCombat", false);
        setIntField(term285404, term285404.getClass(), "starYear", 0);
        setBooleanField(term285404, term285404.getClass(), "worthOfWarHero", false);
        term285422 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term285422;
        callMethod(klass, "setComponentUse", argTypes, term285404, args);
    }

};


