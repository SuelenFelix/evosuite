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

public class Combat_handleAI_2081793809137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364572;

    public Combat_handleAI_2081793809137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364572 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term364572, term364572.getClass(), "combatShipList", null);
        setIntField(term364572, term364572.getClass(), "shipIndex", 0);
        setIntField(term364572, term364572.getClass(), "cursorX", 0);
        setIntField(term364572, term364572.getClass(), "cursorY", 0);
        setIntField(term364572, term364572.getClass(), "componentUse", 0);
        setField(term364572, term364572.getClass(), "animation", null);
        setField(term364572, term364572.getClass(), "attackerFleet", null);
        setField(term364572, term364572.getClass(), "defenderFleet", null);
        setField(term364572, term364572.getClass(), "starbaseFleet", null);
        setField(term364572, term364572.getClass(), "winner", null);
        setField(term364572, term364572.getClass(), "attackerInfo", null);
        setField(term364572, term364572.getClass(), "defenderInfo", null);
        setField(term364572, term364572.getClass(), "planet", null);
        setIntField(term364572, term364572.getClass(), "totalRounds", 0);
        setIntField(term364572, term364572.getClass(), "roundsNoDamge", 0);
        setBooleanField(term364572, term364572.getClass(), "endCombatHandled", false);
        setField(term364572, term364572.getClass(), "wormHole", null);
        setIntField(term364572, term364572.getClass(), "timerForWormHole", 0);
        setBooleanField(term364572, term364572.getClass(), "defenderEscaped", false);
        setBooleanField(term364572, term364572.getClass(), "attackerEscaped", false);
        setField(term364572, term364572.getClass(), "escapePosition", null);
        setField(term364572, term364572.getClass(), "combatEvent", null);
        setIntField(term364572, term364572.getClass(), "defenderMilitaryValue", 0);
        setIntField(term364572, term364572.getClass(), "attackerMilitaryValue", 0);
        setField(term364572, term364572.getClass(), "leaderKilledNews", null);
        setField(term364572, term364572.getClass(), "orbitalDestroyedNews", null);
        setField(term364572, term364572.getClass(), "leaderInCombat", null);
        setBooleanField(term364572, term364572.getClass(), "attackerPrivateer", false);
        setBooleanField(term364572, term364572.getClass(), "defenderPrivateer", false);
        setBooleanField(term364572, term364572.getClass(), "orbitalInCombat", false);
        setIntField(term364572, term364572.getClass(), "starYear", 0);
        setBooleanField(term364572, term364572.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "handleAI", argTypes, term364572, args);
    }

};


