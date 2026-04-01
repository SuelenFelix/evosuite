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

public class Combat_getLeaderInCombatNews_168787499716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69814;

    public Combat_getLeaderInCombatNews_168787499716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69814 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term69814, term69814.getClass(), "combatShipList", null);
        setIntField(term69814, term69814.getClass(), "shipIndex", 0);
        setIntField(term69814, term69814.getClass(), "cursorX", 0);
        setIntField(term69814, term69814.getClass(), "cursorY", 0);
        setIntField(term69814, term69814.getClass(), "componentUse", 0);
        setField(term69814, term69814.getClass(), "animation", null);
        setField(term69814, term69814.getClass(), "attackerFleet", null);
        setField(term69814, term69814.getClass(), "defenderFleet", null);
        setField(term69814, term69814.getClass(), "starbaseFleet", null);
        setField(term69814, term69814.getClass(), "winner", null);
        setField(term69814, term69814.getClass(), "attackerInfo", null);
        setField(term69814, term69814.getClass(), "defenderInfo", null);
        setField(term69814, term69814.getClass(), "planet", null);
        setIntField(term69814, term69814.getClass(), "totalRounds", 0);
        setIntField(term69814, term69814.getClass(), "roundsNoDamge", 0);
        setBooleanField(term69814, term69814.getClass(), "endCombatHandled", false);
        setField(term69814, term69814.getClass(), "wormHole", null);
        setIntField(term69814, term69814.getClass(), "timerForWormHole", 0);
        setBooleanField(term69814, term69814.getClass(), "defenderEscaped", false);
        setBooleanField(term69814, term69814.getClass(), "attackerEscaped", false);
        setField(term69814, term69814.getClass(), "escapePosition", null);
        setField(term69814, term69814.getClass(), "combatEvent", null);
        setIntField(term69814, term69814.getClass(), "defenderMilitaryValue", 0);
        setIntField(term69814, term69814.getClass(), "attackerMilitaryValue", 0);
        setField(term69814, term69814.getClass(), "leaderKilledNews", null);
        setField(term69814, term69814.getClass(), "orbitalDestroyedNews", null);
        setField(term69814, term69814.getClass(), "leaderInCombat", null);
        setBooleanField(term69814, term69814.getClass(), "attackerPrivateer", false);
        setBooleanField(term69814, term69814.getClass(), "defenderPrivateer", false);
        setBooleanField(term69814, term69814.getClass(), "orbitalInCombat", false);
        setIntField(term69814, term69814.getClass(), "starYear", 0);
        setBooleanField(term69814, term69814.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeaderInCombatNews", argTypes, term69814, args);
    }

};


