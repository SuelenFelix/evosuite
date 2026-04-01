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

public class Combat_handleAiNonMilitaryShip_147182841158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405563;

    public Combat_handleAiNonMilitaryShip_147182841158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405563 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405563, term405563.getClass(), "combatShipList", null);
        setIntField(term405563, term405563.getClass(), "shipIndex", 0);
        setIntField(term405563, term405563.getClass(), "cursorX", 0);
        setIntField(term405563, term405563.getClass(), "cursorY", 0);
        setIntField(term405563, term405563.getClass(), "componentUse", 0);
        setField(term405563, term405563.getClass(), "animation", null);
        setField(term405563, term405563.getClass(), "attackerFleet", null);
        setField(term405563, term405563.getClass(), "defenderFleet", null);
        setField(term405563, term405563.getClass(), "starbaseFleet", null);
        setField(term405563, term405563.getClass(), "winner", null);
        setField(term405563, term405563.getClass(), "attackerInfo", null);
        setField(term405563, term405563.getClass(), "defenderInfo", null);
        setField(term405563, term405563.getClass(), "planet", null);
        setIntField(term405563, term405563.getClass(), "totalRounds", 0);
        setIntField(term405563, term405563.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405563, term405563.getClass(), "endCombatHandled", false);
        setField(term405563, term405563.getClass(), "wormHole", null);
        setIntField(term405563, term405563.getClass(), "timerForWormHole", 0);
        setBooleanField(term405563, term405563.getClass(), "defenderEscaped", false);
        setBooleanField(term405563, term405563.getClass(), "attackerEscaped", false);
        setField(term405563, term405563.getClass(), "escapePosition", null);
        setField(term405563, term405563.getClass(), "combatEvent", null);
        setIntField(term405563, term405563.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405563, term405563.getClass(), "attackerMilitaryValue", 0);
        setField(term405563, term405563.getClass(), "leaderKilledNews", null);
        setField(term405563, term405563.getClass(), "orbitalDestroyedNews", null);
        setField(term405563, term405563.getClass(), "leaderInCombat", null);
        setBooleanField(term405563, term405563.getClass(), "attackerPrivateer", false);
        setBooleanField(term405563, term405563.getClass(), "defenderPrivateer", false);
        setBooleanField(term405563, term405563.getClass(), "orbitalInCombat", false);
        setIntField(term405563, term405563.getClass(), "starYear", 0);
        setBooleanField(term405563, term405563.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "handleAiNonMilitaryShip", argTypes, term405563, args);
    }

};


