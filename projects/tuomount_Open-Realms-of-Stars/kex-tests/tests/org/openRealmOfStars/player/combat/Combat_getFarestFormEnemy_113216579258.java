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

public class Combat_getFarestFormEnemy_113216579258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223470;

    public Combat_getFarestFormEnemy_113216579258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223470 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term223470, term223470.getClass(), "combatShipList", null);
        setIntField(term223470, term223470.getClass(), "shipIndex", 0);
        setIntField(term223470, term223470.getClass(), "cursorX", 0);
        setIntField(term223470, term223470.getClass(), "cursorY", 0);
        setIntField(term223470, term223470.getClass(), "componentUse", 0);
        setField(term223470, term223470.getClass(), "animation", null);
        setField(term223470, term223470.getClass(), "attackerFleet", null);
        setField(term223470, term223470.getClass(), "defenderFleet", null);
        setField(term223470, term223470.getClass(), "starbaseFleet", null);
        setField(term223470, term223470.getClass(), "winner", null);
        setField(term223470, term223470.getClass(), "attackerInfo", null);
        setField(term223470, term223470.getClass(), "defenderInfo", null);
        setField(term223470, term223470.getClass(), "planet", null);
        setIntField(term223470, term223470.getClass(), "totalRounds", 0);
        setIntField(term223470, term223470.getClass(), "roundsNoDamge", 0);
        setBooleanField(term223470, term223470.getClass(), "endCombatHandled", false);
        setField(term223470, term223470.getClass(), "wormHole", null);
        setIntField(term223470, term223470.getClass(), "timerForWormHole", 0);
        setBooleanField(term223470, term223470.getClass(), "defenderEscaped", false);
        setBooleanField(term223470, term223470.getClass(), "attackerEscaped", false);
        setField(term223470, term223470.getClass(), "escapePosition", null);
        setField(term223470, term223470.getClass(), "combatEvent", null);
        setIntField(term223470, term223470.getClass(), "defenderMilitaryValue", 0);
        setIntField(term223470, term223470.getClass(), "attackerMilitaryValue", 0);
        setField(term223470, term223470.getClass(), "leaderKilledNews", null);
        setField(term223470, term223470.getClass(), "orbitalDestroyedNews", null);
        setField(term223470, term223470.getClass(), "leaderInCombat", null);
        setBooleanField(term223470, term223470.getClass(), "attackerPrivateer", false);
        setBooleanField(term223470, term223470.getClass(), "defenderPrivateer", false);
        setBooleanField(term223470, term223470.getClass(), "orbitalInCombat", false);
        setIntField(term223470, term223470.getClass(), "starYear", 0);
        setBooleanField(term223470, term223470.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFarestFormEnemy", argTypes, term223470, args);
    }

};


