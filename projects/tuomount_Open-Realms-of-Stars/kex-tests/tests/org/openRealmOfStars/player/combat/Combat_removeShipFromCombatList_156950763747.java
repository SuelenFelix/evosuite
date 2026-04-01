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

public class Combat_removeShipFromCombatList_156950763747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178382;

    public Combat_removeShipFromCombatList_156950763747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178382 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term178382, term178382.getClass(), "combatShipList", null);
        setIntField(term178382, term178382.getClass(), "shipIndex", 0);
        setIntField(term178382, term178382.getClass(), "cursorX", 0);
        setIntField(term178382, term178382.getClass(), "cursorY", 0);
        setIntField(term178382, term178382.getClass(), "componentUse", 0);
        setField(term178382, term178382.getClass(), "animation", null);
        setField(term178382, term178382.getClass(), "attackerFleet", null);
        setField(term178382, term178382.getClass(), "defenderFleet", null);
        setField(term178382, term178382.getClass(), "starbaseFleet", null);
        setField(term178382, term178382.getClass(), "winner", null);
        setField(term178382, term178382.getClass(), "attackerInfo", null);
        setField(term178382, term178382.getClass(), "defenderInfo", null);
        setField(term178382, term178382.getClass(), "planet", null);
        setIntField(term178382, term178382.getClass(), "totalRounds", 0);
        setIntField(term178382, term178382.getClass(), "roundsNoDamge", 0);
        setBooleanField(term178382, term178382.getClass(), "endCombatHandled", false);
        setField(term178382, term178382.getClass(), "wormHole", null);
        setIntField(term178382, term178382.getClass(), "timerForWormHole", 0);
        setBooleanField(term178382, term178382.getClass(), "defenderEscaped", false);
        setBooleanField(term178382, term178382.getClass(), "attackerEscaped", false);
        setField(term178382, term178382.getClass(), "escapePosition", null);
        setField(term178382, term178382.getClass(), "combatEvent", null);
        setIntField(term178382, term178382.getClass(), "defenderMilitaryValue", 0);
        setIntField(term178382, term178382.getClass(), "attackerMilitaryValue", 0);
        setField(term178382, term178382.getClass(), "leaderKilledNews", null);
        setField(term178382, term178382.getClass(), "orbitalDestroyedNews", null);
        setField(term178382, term178382.getClass(), "leaderInCombat", null);
        setBooleanField(term178382, term178382.getClass(), "attackerPrivateer", false);
        setBooleanField(term178382, term178382.getClass(), "defenderPrivateer", false);
        setBooleanField(term178382, term178382.getClass(), "orbitalInCombat", false);
        setIntField(term178382, term178382.getClass(), "starYear", 0);
        setBooleanField(term178382, term178382.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeShipFromCombatList", argTypes, term178382, args);
    }

};


