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

public class Combat_endRound_231491264105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723129;

    public Combat_endRound_231491264105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term723129 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term723129, term723129.getClass(), "combatShipList", null);
        setIntField(term723129, term723129.getClass(), "shipIndex", 0);
        setIntField(term723129, term723129.getClass(), "cursorX", 0);
        setIntField(term723129, term723129.getClass(), "cursorY", 0);
        setIntField(term723129, term723129.getClass(), "componentUse", 0);
        setField(term723129, term723129.getClass(), "animation", null);
        setField(term723129, term723129.getClass(), "attackerFleet", null);
        setField(term723129, term723129.getClass(), "defenderFleet", null);
        setField(term723129, term723129.getClass(), "starbaseFleet", null);
        setField(term723129, term723129.getClass(), "winner", null);
        setField(term723129, term723129.getClass(), "attackerInfo", null);
        setField(term723129, term723129.getClass(), "defenderInfo", null);
        setField(term723129, term723129.getClass(), "planet", null);
        setIntField(term723129, term723129.getClass(), "totalRounds", 0);
        setIntField(term723129, term723129.getClass(), "roundsNoDamge", 0);
        setBooleanField(term723129, term723129.getClass(), "endCombatHandled", false);
        setField(term723129, term723129.getClass(), "wormHole", null);
        setIntField(term723129, term723129.getClass(), "timerForWormHole", 0);
        setBooleanField(term723129, term723129.getClass(), "defenderEscaped", false);
        setBooleanField(term723129, term723129.getClass(), "attackerEscaped", false);
        setField(term723129, term723129.getClass(), "escapePosition", null);
        setField(term723129, term723129.getClass(), "combatEvent", null);
        setIntField(term723129, term723129.getClass(), "defenderMilitaryValue", 0);
        setIntField(term723129, term723129.getClass(), "attackerMilitaryValue", 0);
        setField(term723129, term723129.getClass(), "leaderKilledNews", null);
        setField(term723129, term723129.getClass(), "orbitalDestroyedNews", null);
        setField(term723129, term723129.getClass(), "leaderInCombat", null);
        setBooleanField(term723129, term723129.getClass(), "attackerPrivateer", false);
        setBooleanField(term723129, term723129.getClass(), "defenderPrivateer", false);
        setBooleanField(term723129, term723129.getClass(), "orbitalInCombat", false);
        setIntField(term723129, term723129.getClass(), "starYear", 0);
        setBooleanField(term723129, term723129.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "endRound", argTypes, term723129, args);
    }

};


