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

public class Combat_handleAiMilitaryShip_72494598128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767109;

    public Combat_handleAiMilitaryShip_72494598128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term767109 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term767109, term767109.getClass(), "combatShipList", null);
        setIntField(term767109, term767109.getClass(), "shipIndex", 0);
        setIntField(term767109, term767109.getClass(), "cursorX", 0);
        setIntField(term767109, term767109.getClass(), "cursorY", 0);
        setIntField(term767109, term767109.getClass(), "componentUse", 0);
        setField(term767109, term767109.getClass(), "animation", null);
        setField(term767109, term767109.getClass(), "attackerFleet", null);
        setField(term767109, term767109.getClass(), "defenderFleet", null);
        setField(term767109, term767109.getClass(), "starbaseFleet", null);
        setField(term767109, term767109.getClass(), "winner", null);
        setField(term767109, term767109.getClass(), "attackerInfo", null);
        setField(term767109, term767109.getClass(), "defenderInfo", null);
        setField(term767109, term767109.getClass(), "planet", null);
        setIntField(term767109, term767109.getClass(), "totalRounds", 0);
        setIntField(term767109, term767109.getClass(), "roundsNoDamge", 0);
        setBooleanField(term767109, term767109.getClass(), "endCombatHandled", false);
        setField(term767109, term767109.getClass(), "wormHole", null);
        setIntField(term767109, term767109.getClass(), "timerForWormHole", 0);
        setBooleanField(term767109, term767109.getClass(), "defenderEscaped", false);
        setBooleanField(term767109, term767109.getClass(), "attackerEscaped", false);
        setField(term767109, term767109.getClass(), "escapePosition", null);
        setField(term767109, term767109.getClass(), "combatEvent", null);
        setIntField(term767109, term767109.getClass(), "defenderMilitaryValue", 0);
        setIntField(term767109, term767109.getClass(), "attackerMilitaryValue", 0);
        setField(term767109, term767109.getClass(), "leaderKilledNews", null);
        setField(term767109, term767109.getClass(), "orbitalDestroyedNews", null);
        setField(term767109, term767109.getClass(), "leaderInCombat", null);
        setBooleanField(term767109, term767109.getClass(), "attackerPrivateer", false);
        setBooleanField(term767109, term767109.getClass(), "defenderPrivateer", false);
        setBooleanField(term767109, term767109.getClass(), "orbitalInCombat", false);
        setIntField(term767109, term767109.getClass(), "starYear", 0);
        setBooleanField(term767109, term767109.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "handleAiMilitaryShip", argTypes, term767109, args);
    }

};


