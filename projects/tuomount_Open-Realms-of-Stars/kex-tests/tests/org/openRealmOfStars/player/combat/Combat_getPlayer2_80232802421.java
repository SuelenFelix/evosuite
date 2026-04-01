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

public class Combat_getPlayer2_80232802421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84757;

    public Combat_getPlayer2_80232802421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84757 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term84757, term84757.getClass(), "combatShipList", null);
        setIntField(term84757, term84757.getClass(), "shipIndex", 0);
        setIntField(term84757, term84757.getClass(), "cursorX", 0);
        setIntField(term84757, term84757.getClass(), "cursorY", 0);
        setIntField(term84757, term84757.getClass(), "componentUse", 0);
        setField(term84757, term84757.getClass(), "animation", null);
        setField(term84757, term84757.getClass(), "attackerFleet", null);
        setField(term84757, term84757.getClass(), "defenderFleet", null);
        setField(term84757, term84757.getClass(), "starbaseFleet", null);
        setField(term84757, term84757.getClass(), "winner", null);
        setField(term84757, term84757.getClass(), "attackerInfo", null);
        setField(term84757, term84757.getClass(), "defenderInfo", null);
        setField(term84757, term84757.getClass(), "planet", null);
        setIntField(term84757, term84757.getClass(), "totalRounds", 0);
        setIntField(term84757, term84757.getClass(), "roundsNoDamge", 0);
        setBooleanField(term84757, term84757.getClass(), "endCombatHandled", false);
        setField(term84757, term84757.getClass(), "wormHole", null);
        setIntField(term84757, term84757.getClass(), "timerForWormHole", 0);
        setBooleanField(term84757, term84757.getClass(), "defenderEscaped", false);
        setBooleanField(term84757, term84757.getClass(), "attackerEscaped", false);
        setField(term84757, term84757.getClass(), "escapePosition", null);
        setField(term84757, term84757.getClass(), "combatEvent", null);
        setIntField(term84757, term84757.getClass(), "defenderMilitaryValue", 0);
        setIntField(term84757, term84757.getClass(), "attackerMilitaryValue", 0);
        setField(term84757, term84757.getClass(), "leaderKilledNews", null);
        setField(term84757, term84757.getClass(), "orbitalDestroyedNews", null);
        setField(term84757, term84757.getClass(), "leaderInCombat", null);
        setBooleanField(term84757, term84757.getClass(), "attackerPrivateer", false);
        setBooleanField(term84757, term84757.getClass(), "defenderPrivateer", false);
        setBooleanField(term84757, term84757.getClass(), "orbitalInCombat", false);
        setIntField(term84757, term84757.getClass(), "starYear", 0);
        setBooleanField(term84757, term84757.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer2", argTypes, term84757, args);
    }

};


