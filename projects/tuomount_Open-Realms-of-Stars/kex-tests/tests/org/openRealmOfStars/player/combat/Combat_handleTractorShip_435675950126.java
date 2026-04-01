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

public class Combat_handleTractorShip_435675950126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764018;

    public Combat_handleTractorShip_435675950126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764018 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term764018, term764018.getClass(), "combatShipList", null);
        setIntField(term764018, term764018.getClass(), "shipIndex", 0);
        setIntField(term764018, term764018.getClass(), "cursorX", 0);
        setIntField(term764018, term764018.getClass(), "cursorY", 0);
        setIntField(term764018, term764018.getClass(), "componentUse", 0);
        setField(term764018, term764018.getClass(), "animation", null);
        setField(term764018, term764018.getClass(), "attackerFleet", null);
        setField(term764018, term764018.getClass(), "defenderFleet", null);
        setField(term764018, term764018.getClass(), "starbaseFleet", null);
        setField(term764018, term764018.getClass(), "winner", null);
        setField(term764018, term764018.getClass(), "attackerInfo", null);
        setField(term764018, term764018.getClass(), "defenderInfo", null);
        setField(term764018, term764018.getClass(), "planet", null);
        setIntField(term764018, term764018.getClass(), "totalRounds", 0);
        setIntField(term764018, term764018.getClass(), "roundsNoDamge", 0);
        setBooleanField(term764018, term764018.getClass(), "endCombatHandled", false);
        setField(term764018, term764018.getClass(), "wormHole", null);
        setIntField(term764018, term764018.getClass(), "timerForWormHole", 0);
        setBooleanField(term764018, term764018.getClass(), "defenderEscaped", false);
        setBooleanField(term764018, term764018.getClass(), "attackerEscaped", false);
        setField(term764018, term764018.getClass(), "escapePosition", null);
        setField(term764018, term764018.getClass(), "combatEvent", null);
        setIntField(term764018, term764018.getClass(), "defenderMilitaryValue", 0);
        setIntField(term764018, term764018.getClass(), "attackerMilitaryValue", 0);
        setField(term764018, term764018.getClass(), "leaderKilledNews", null);
        setField(term764018, term764018.getClass(), "orbitalDestroyedNews", null);
        setField(term764018, term764018.getClass(), "leaderInCombat", null);
        setBooleanField(term764018, term764018.getClass(), "attackerPrivateer", false);
        setBooleanField(term764018, term764018.getClass(), "defenderPrivateer", false);
        setBooleanField(term764018, term764018.getClass(), "orbitalInCombat", false);
        setIntField(term764018, term764018.getClass(), "starYear", 0);
        setBooleanField(term764018, term764018.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "handleTractorShip", argTypes, term764018, args);
    }

};


