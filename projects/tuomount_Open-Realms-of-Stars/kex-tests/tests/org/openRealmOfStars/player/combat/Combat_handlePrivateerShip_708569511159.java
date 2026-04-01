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

public class Combat_handlePrivateerShip_708569511159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819459;

    public Combat_handlePrivateerShip_708569511159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819459 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819459, term819459.getClass(), "combatShipList", null);
        setIntField(term819459, term819459.getClass(), "shipIndex", 0);
        setIntField(term819459, term819459.getClass(), "cursorX", 0);
        setIntField(term819459, term819459.getClass(), "cursorY", 0);
        setIntField(term819459, term819459.getClass(), "componentUse", 0);
        setField(term819459, term819459.getClass(), "animation", null);
        setField(term819459, term819459.getClass(), "attackerFleet", null);
        setField(term819459, term819459.getClass(), "defenderFleet", null);
        setField(term819459, term819459.getClass(), "starbaseFleet", null);
        setField(term819459, term819459.getClass(), "winner", null);
        setField(term819459, term819459.getClass(), "attackerInfo", null);
        setField(term819459, term819459.getClass(), "defenderInfo", null);
        setField(term819459, term819459.getClass(), "planet", null);
        setIntField(term819459, term819459.getClass(), "totalRounds", 0);
        setIntField(term819459, term819459.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819459, term819459.getClass(), "endCombatHandled", false);
        setField(term819459, term819459.getClass(), "wormHole", null);
        setIntField(term819459, term819459.getClass(), "timerForWormHole", 0);
        setBooleanField(term819459, term819459.getClass(), "defenderEscaped", false);
        setBooleanField(term819459, term819459.getClass(), "attackerEscaped", false);
        setField(term819459, term819459.getClass(), "escapePosition", null);
        setField(term819459, term819459.getClass(), "combatEvent", null);
        setIntField(term819459, term819459.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819459, term819459.getClass(), "attackerMilitaryValue", 0);
        setField(term819459, term819459.getClass(), "leaderKilledNews", null);
        setField(term819459, term819459.getClass(), "orbitalDestroyedNews", null);
        setField(term819459, term819459.getClass(), "leaderInCombat", null);
        setBooleanField(term819459, term819459.getClass(), "attackerPrivateer", false);
        setBooleanField(term819459, term819459.getClass(), "defenderPrivateer", false);
        setBooleanField(term819459, term819459.getClass(), "orbitalInCombat", false);
        setIntField(term819459, term819459.getClass(), "starYear", 0);
        setBooleanField(term819459, term819459.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        argTypes[1] = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "handlePrivateerShip", argTypes, term819459, args);
    }

};


