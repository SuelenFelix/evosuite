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

public class Combat_getRoundsNoDamge_14006068973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5335;

    public Combat_getRoundsNoDamge_14006068973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5335 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term5335, term5335.getClass(), "combatShipList", null);
        setIntField(term5335, term5335.getClass(), "shipIndex", 0);
        setIntField(term5335, term5335.getClass(), "cursorX", 0);
        setIntField(term5335, term5335.getClass(), "cursorY", 0);
        setIntField(term5335, term5335.getClass(), "componentUse", 0);
        setField(term5335, term5335.getClass(), "animation", null);
        setField(term5335, term5335.getClass(), "attackerFleet", null);
        setField(term5335, term5335.getClass(), "defenderFleet", null);
        setField(term5335, term5335.getClass(), "starbaseFleet", null);
        setField(term5335, term5335.getClass(), "winner", null);
        setField(term5335, term5335.getClass(), "attackerInfo", null);
        setField(term5335, term5335.getClass(), "defenderInfo", null);
        setField(term5335, term5335.getClass(), "planet", null);
        setIntField(term5335, term5335.getClass(), "totalRounds", 0);
        setIntField(term5335, term5335.getClass(), "roundsNoDamge", 0);
        setBooleanField(term5335, term5335.getClass(), "endCombatHandled", false);
        setField(term5335, term5335.getClass(), "wormHole", null);
        setIntField(term5335, term5335.getClass(), "timerForWormHole", 0);
        setBooleanField(term5335, term5335.getClass(), "defenderEscaped", false);
        setBooleanField(term5335, term5335.getClass(), "attackerEscaped", false);
        setField(term5335, term5335.getClass(), "escapePosition", null);
        setField(term5335, term5335.getClass(), "combatEvent", null);
        setIntField(term5335, term5335.getClass(), "defenderMilitaryValue", 0);
        setIntField(term5335, term5335.getClass(), "attackerMilitaryValue", 0);
        setField(term5335, term5335.getClass(), "leaderKilledNews", null);
        setField(term5335, term5335.getClass(), "orbitalDestroyedNews", null);
        setField(term5335, term5335.getClass(), "leaderInCombat", null);
        setBooleanField(term5335, term5335.getClass(), "attackerPrivateer", false);
        setBooleanField(term5335, term5335.getClass(), "defenderPrivateer", false);
        setBooleanField(term5335, term5335.getClass(), "orbitalInCombat", false);
        setIntField(term5335, term5335.getClass(), "starYear", 0);
        setBooleanField(term5335, term5335.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoundsNoDamge", argTypes, term5335, args);
    }

};


