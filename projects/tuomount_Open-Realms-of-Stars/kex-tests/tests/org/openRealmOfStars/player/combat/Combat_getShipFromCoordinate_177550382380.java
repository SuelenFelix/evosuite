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

public class Combat_getShipFromCoordinate_177550382380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248009;
     Object term248027;
     Object term248029;

    public Combat_getShipFromCoordinate_177550382380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248009 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term248009, term248009.getClass(), "combatShipList", null);
        setIntField(term248009, term248009.getClass(), "shipIndex", 0);
        setIntField(term248009, term248009.getClass(), "cursorX", 0);
        setIntField(term248009, term248009.getClass(), "cursorY", 0);
        setIntField(term248009, term248009.getClass(), "componentUse", 0);
        setField(term248009, term248009.getClass(), "animation", null);
        setField(term248009, term248009.getClass(), "attackerFleet", null);
        setField(term248009, term248009.getClass(), "defenderFleet", null);
        setField(term248009, term248009.getClass(), "starbaseFleet", null);
        setField(term248009, term248009.getClass(), "winner", null);
        setField(term248009, term248009.getClass(), "attackerInfo", null);
        setField(term248009, term248009.getClass(), "defenderInfo", null);
        setField(term248009, term248009.getClass(), "planet", null);
        setIntField(term248009, term248009.getClass(), "totalRounds", 0);
        setIntField(term248009, term248009.getClass(), "roundsNoDamge", 0);
        setBooleanField(term248009, term248009.getClass(), "endCombatHandled", false);
        setField(term248009, term248009.getClass(), "wormHole", null);
        setIntField(term248009, term248009.getClass(), "timerForWormHole", 0);
        setBooleanField(term248009, term248009.getClass(), "defenderEscaped", false);
        setBooleanField(term248009, term248009.getClass(), "attackerEscaped", false);
        setField(term248009, term248009.getClass(), "escapePosition", null);
        setField(term248009, term248009.getClass(), "combatEvent", null);
        setIntField(term248009, term248009.getClass(), "defenderMilitaryValue", 0);
        setIntField(term248009, term248009.getClass(), "attackerMilitaryValue", 0);
        setField(term248009, term248009.getClass(), "leaderKilledNews", null);
        setField(term248009, term248009.getClass(), "orbitalDestroyedNews", null);
        setField(term248009, term248009.getClass(), "leaderInCombat", null);
        setBooleanField(term248009, term248009.getClass(), "attackerPrivateer", false);
        setBooleanField(term248009, term248009.getClass(), "defenderPrivateer", false);
        setBooleanField(term248009, term248009.getClass(), "orbitalInCombat", false);
        setIntField(term248009, term248009.getClass(), "starYear", 0);
        setBooleanField(term248009, term248009.getClass(), "worthOfWarHero", false);
        term248027 = new Integer(0);
        term248029 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term248027;
        args[1] = term248029;
        callMethod(klass, "getShipFromCoordinate", argTypes, term248009, args);
    }

};


