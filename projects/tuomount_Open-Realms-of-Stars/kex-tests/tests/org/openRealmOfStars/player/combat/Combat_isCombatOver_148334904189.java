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

public class Combat_isCombatOver_148334904189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276712;

    public Combat_isCombatOver_148334904189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276712 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term276712, term276712.getClass(), "combatShipList", null);
        setIntField(term276712, term276712.getClass(), "shipIndex", 0);
        setIntField(term276712, term276712.getClass(), "cursorX", 0);
        setIntField(term276712, term276712.getClass(), "cursorY", 0);
        setIntField(term276712, term276712.getClass(), "componentUse", 0);
        setField(term276712, term276712.getClass(), "animation", null);
        setField(term276712, term276712.getClass(), "attackerFleet", null);
        setField(term276712, term276712.getClass(), "defenderFleet", null);
        setField(term276712, term276712.getClass(), "starbaseFleet", null);
        setField(term276712, term276712.getClass(), "winner", null);
        setField(term276712, term276712.getClass(), "attackerInfo", null);
        setField(term276712, term276712.getClass(), "defenderInfo", null);
        setField(term276712, term276712.getClass(), "planet", null);
        setIntField(term276712, term276712.getClass(), "totalRounds", 0);
        setIntField(term276712, term276712.getClass(), "roundsNoDamge", 0);
        setBooleanField(term276712, term276712.getClass(), "endCombatHandled", false);
        setField(term276712, term276712.getClass(), "wormHole", null);
        setIntField(term276712, term276712.getClass(), "timerForWormHole", 0);
        setBooleanField(term276712, term276712.getClass(), "defenderEscaped", false);
        setBooleanField(term276712, term276712.getClass(), "attackerEscaped", false);
        setField(term276712, term276712.getClass(), "escapePosition", null);
        setField(term276712, term276712.getClass(), "combatEvent", null);
        setIntField(term276712, term276712.getClass(), "defenderMilitaryValue", 0);
        setIntField(term276712, term276712.getClass(), "attackerMilitaryValue", 0);
        setField(term276712, term276712.getClass(), "leaderKilledNews", null);
        setField(term276712, term276712.getClass(), "orbitalDestroyedNews", null);
        setField(term276712, term276712.getClass(), "leaderInCombat", null);
        setBooleanField(term276712, term276712.getClass(), "attackerPrivateer", false);
        setBooleanField(term276712, term276712.getClass(), "defenderPrivateer", false);
        setBooleanField(term276712, term276712.getClass(), "orbitalInCombat", false);
        setIntField(term276712, term276712.getClass(), "starYear", 0);
        setBooleanField(term276712, term276712.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCombatOver", argTypes, term276712, args);
    }

};


