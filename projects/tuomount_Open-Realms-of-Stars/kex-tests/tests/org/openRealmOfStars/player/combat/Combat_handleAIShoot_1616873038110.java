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
import java.lang.Boolean;

public class Combat_handleAIShoot_1616873038110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321770;
     Object term321788;

    public Combat_handleAIShoot_1616873038110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321770 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term321770, term321770.getClass(), "combatShipList", null);
        setIntField(term321770, term321770.getClass(), "shipIndex", 0);
        setIntField(term321770, term321770.getClass(), "cursorX", 0);
        setIntField(term321770, term321770.getClass(), "cursorY", 0);
        setIntField(term321770, term321770.getClass(), "componentUse", 0);
        setField(term321770, term321770.getClass(), "animation", null);
        setField(term321770, term321770.getClass(), "attackerFleet", null);
        setField(term321770, term321770.getClass(), "defenderFleet", null);
        setField(term321770, term321770.getClass(), "starbaseFleet", null);
        setField(term321770, term321770.getClass(), "winner", null);
        setField(term321770, term321770.getClass(), "attackerInfo", null);
        setField(term321770, term321770.getClass(), "defenderInfo", null);
        setField(term321770, term321770.getClass(), "planet", null);
        setIntField(term321770, term321770.getClass(), "totalRounds", 0);
        setIntField(term321770, term321770.getClass(), "roundsNoDamge", 0);
        setBooleanField(term321770, term321770.getClass(), "endCombatHandled", false);
        setField(term321770, term321770.getClass(), "wormHole", null);
        setIntField(term321770, term321770.getClass(), "timerForWormHole", 0);
        setBooleanField(term321770, term321770.getClass(), "defenderEscaped", false);
        setBooleanField(term321770, term321770.getClass(), "attackerEscaped", false);
        setField(term321770, term321770.getClass(), "escapePosition", null);
        setField(term321770, term321770.getClass(), "combatEvent", null);
        setIntField(term321770, term321770.getClass(), "defenderMilitaryValue", 0);
        setIntField(term321770, term321770.getClass(), "attackerMilitaryValue", 0);
        setField(term321770, term321770.getClass(), "leaderKilledNews", null);
        setField(term321770, term321770.getClass(), "orbitalDestroyedNews", null);
        setField(term321770, term321770.getClass(), "leaderInCombat", null);
        setBooleanField(term321770, term321770.getClass(), "attackerPrivateer", false);
        setBooleanField(term321770, term321770.getClass(), "defenderPrivateer", false);
        setBooleanField(term321770, term321770.getClass(), "orbitalInCombat", false);
        setIntField(term321770, term321770.getClass(), "starYear", 0);
        setBooleanField(term321770, term321770.getClass(), "worthOfWarHero", false);
        term321788 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[2] = Class.forName("org.openRealmOfStars.utilities.Logger");
        argTypes[3] = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term321788;
        callMethod(klass, "handleAIShoot", argTypes, term321770, args);
    }

};


