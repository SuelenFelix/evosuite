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

public class Combat_handleAiMilitaryShip_72494598130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352113;

    public Combat_handleAiMilitaryShip_72494598130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352113 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term352113, term352113.getClass(), "combatShipList", null);
        setIntField(term352113, term352113.getClass(), "shipIndex", 0);
        setIntField(term352113, term352113.getClass(), "cursorX", 0);
        setIntField(term352113, term352113.getClass(), "cursorY", 0);
        setIntField(term352113, term352113.getClass(), "componentUse", 0);
        setField(term352113, term352113.getClass(), "animation", null);
        setField(term352113, term352113.getClass(), "attackerFleet", null);
        setField(term352113, term352113.getClass(), "defenderFleet", null);
        setField(term352113, term352113.getClass(), "starbaseFleet", null);
        setField(term352113, term352113.getClass(), "winner", null);
        setField(term352113, term352113.getClass(), "attackerInfo", null);
        setField(term352113, term352113.getClass(), "defenderInfo", null);
        setField(term352113, term352113.getClass(), "planet", null);
        setIntField(term352113, term352113.getClass(), "totalRounds", 0);
        setIntField(term352113, term352113.getClass(), "roundsNoDamge", 0);
        setBooleanField(term352113, term352113.getClass(), "endCombatHandled", false);
        setField(term352113, term352113.getClass(), "wormHole", null);
        setIntField(term352113, term352113.getClass(), "timerForWormHole", 0);
        setBooleanField(term352113, term352113.getClass(), "defenderEscaped", false);
        setBooleanField(term352113, term352113.getClass(), "attackerEscaped", false);
        setField(term352113, term352113.getClass(), "escapePosition", null);
        setField(term352113, term352113.getClass(), "combatEvent", null);
        setIntField(term352113, term352113.getClass(), "defenderMilitaryValue", 0);
        setIntField(term352113, term352113.getClass(), "attackerMilitaryValue", 0);
        setField(term352113, term352113.getClass(), "leaderKilledNews", null);
        setField(term352113, term352113.getClass(), "orbitalDestroyedNews", null);
        setField(term352113, term352113.getClass(), "leaderInCombat", null);
        setBooleanField(term352113, term352113.getClass(), "attackerPrivateer", false);
        setBooleanField(term352113, term352113.getClass(), "defenderPrivateer", false);
        setBooleanField(term352113, term352113.getClass(), "orbitalInCombat", false);
        setIntField(term352113, term352113.getClass(), "starYear", 0);
        setBooleanField(term352113, term352113.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "handleAiMilitaryShip", argTypes, term352113, args);
    }

};


