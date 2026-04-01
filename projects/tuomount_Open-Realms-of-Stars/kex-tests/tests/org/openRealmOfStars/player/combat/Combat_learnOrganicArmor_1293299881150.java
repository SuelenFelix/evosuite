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

public class Combat_learnOrganicArmor_1293299881150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405415;

    public Combat_learnOrganicArmor_1293299881150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405415 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405415, term405415.getClass(), "combatShipList", null);
        setIntField(term405415, term405415.getClass(), "shipIndex", 0);
        setIntField(term405415, term405415.getClass(), "cursorX", 0);
        setIntField(term405415, term405415.getClass(), "cursorY", 0);
        setIntField(term405415, term405415.getClass(), "componentUse", 0);
        setField(term405415, term405415.getClass(), "animation", null);
        setField(term405415, term405415.getClass(), "attackerFleet", null);
        setField(term405415, term405415.getClass(), "defenderFleet", null);
        setField(term405415, term405415.getClass(), "starbaseFleet", null);
        setField(term405415, term405415.getClass(), "winner", null);
        setField(term405415, term405415.getClass(), "attackerInfo", null);
        setField(term405415, term405415.getClass(), "defenderInfo", null);
        setField(term405415, term405415.getClass(), "planet", null);
        setIntField(term405415, term405415.getClass(), "totalRounds", 0);
        setIntField(term405415, term405415.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405415, term405415.getClass(), "endCombatHandled", false);
        setField(term405415, term405415.getClass(), "wormHole", null);
        setIntField(term405415, term405415.getClass(), "timerForWormHole", 0);
        setBooleanField(term405415, term405415.getClass(), "defenderEscaped", false);
        setBooleanField(term405415, term405415.getClass(), "attackerEscaped", false);
        setField(term405415, term405415.getClass(), "escapePosition", null);
        setField(term405415, term405415.getClass(), "combatEvent", null);
        setIntField(term405415, term405415.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405415, term405415.getClass(), "attackerMilitaryValue", 0);
        setField(term405415, term405415.getClass(), "leaderKilledNews", null);
        setField(term405415, term405415.getClass(), "orbitalDestroyedNews", null);
        setField(term405415, term405415.getClass(), "leaderInCombat", null);
        setBooleanField(term405415, term405415.getClass(), "attackerPrivateer", false);
        setBooleanField(term405415, term405415.getClass(), "defenderPrivateer", false);
        setBooleanField(term405415, term405415.getClass(), "orbitalInCombat", false);
        setIntField(term405415, term405415.getClass(), "starYear", 0);
        setBooleanField(term405415, term405415.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "learnOrganicArmor", argTypes, term405415, args);
    }

};


