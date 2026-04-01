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

public class Combat_handleAiNonMilitaryShip_147182841132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term774084;

    public Combat_handleAiNonMilitaryShip_147182841132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term774084 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term774084, term774084.getClass(), "combatShipList", null);
        setIntField(term774084, term774084.getClass(), "shipIndex", 0);
        setIntField(term774084, term774084.getClass(), "cursorX", 0);
        setIntField(term774084, term774084.getClass(), "cursorY", 0);
        setIntField(term774084, term774084.getClass(), "componentUse", 0);
        setField(term774084, term774084.getClass(), "animation", null);
        setField(term774084, term774084.getClass(), "attackerFleet", null);
        setField(term774084, term774084.getClass(), "defenderFleet", null);
        setField(term774084, term774084.getClass(), "starbaseFleet", null);
        setField(term774084, term774084.getClass(), "winner", null);
        setField(term774084, term774084.getClass(), "attackerInfo", null);
        setField(term774084, term774084.getClass(), "defenderInfo", null);
        setField(term774084, term774084.getClass(), "planet", null);
        setIntField(term774084, term774084.getClass(), "totalRounds", 0);
        setIntField(term774084, term774084.getClass(), "roundsNoDamge", 0);
        setBooleanField(term774084, term774084.getClass(), "endCombatHandled", false);
        setField(term774084, term774084.getClass(), "wormHole", null);
        setIntField(term774084, term774084.getClass(), "timerForWormHole", 0);
        setBooleanField(term774084, term774084.getClass(), "defenderEscaped", false);
        setBooleanField(term774084, term774084.getClass(), "attackerEscaped", false);
        setField(term774084, term774084.getClass(), "escapePosition", null);
        setField(term774084, term774084.getClass(), "combatEvent", null);
        setIntField(term774084, term774084.getClass(), "defenderMilitaryValue", 0);
        setIntField(term774084, term774084.getClass(), "attackerMilitaryValue", 0);
        setField(term774084, term774084.getClass(), "leaderKilledNews", null);
        setField(term774084, term774084.getClass(), "orbitalDestroyedNews", null);
        setField(term774084, term774084.getClass(), "leaderInCombat", null);
        setBooleanField(term774084, term774084.getClass(), "attackerPrivateer", false);
        setBooleanField(term774084, term774084.getClass(), "defenderPrivateer", false);
        setBooleanField(term774084, term774084.getClass(), "orbitalInCombat", false);
        setIntField(term774084, term774084.getClass(), "starYear", 0);
        setBooleanField(term774084, term774084.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        argTypes[1] = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "handleAiNonMilitaryShip", argTypes, term774084, args);
    }

};


