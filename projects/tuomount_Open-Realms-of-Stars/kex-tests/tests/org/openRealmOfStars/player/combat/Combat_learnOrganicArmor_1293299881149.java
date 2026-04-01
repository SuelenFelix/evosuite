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

public class Combat_learnOrganicArmor_1293299881149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819267;

    public Combat_learnOrganicArmor_1293299881149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819267 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term819267, term819267.getClass(), "combatShipList", null);
        setIntField(term819267, term819267.getClass(), "shipIndex", 0);
        setIntField(term819267, term819267.getClass(), "cursorX", 0);
        setIntField(term819267, term819267.getClass(), "cursorY", 0);
        setIntField(term819267, term819267.getClass(), "componentUse", 0);
        setField(term819267, term819267.getClass(), "animation", null);
        setField(term819267, term819267.getClass(), "attackerFleet", null);
        setField(term819267, term819267.getClass(), "defenderFleet", null);
        setField(term819267, term819267.getClass(), "starbaseFleet", null);
        setField(term819267, term819267.getClass(), "winner", null);
        setField(term819267, term819267.getClass(), "attackerInfo", null);
        setField(term819267, term819267.getClass(), "defenderInfo", null);
        setField(term819267, term819267.getClass(), "planet", null);
        setIntField(term819267, term819267.getClass(), "totalRounds", 0);
        setIntField(term819267, term819267.getClass(), "roundsNoDamge", 0);
        setBooleanField(term819267, term819267.getClass(), "endCombatHandled", false);
        setField(term819267, term819267.getClass(), "wormHole", null);
        setIntField(term819267, term819267.getClass(), "timerForWormHole", 0);
        setBooleanField(term819267, term819267.getClass(), "defenderEscaped", false);
        setBooleanField(term819267, term819267.getClass(), "attackerEscaped", false);
        setField(term819267, term819267.getClass(), "escapePosition", null);
        setField(term819267, term819267.getClass(), "combatEvent", null);
        setIntField(term819267, term819267.getClass(), "defenderMilitaryValue", 0);
        setIntField(term819267, term819267.getClass(), "attackerMilitaryValue", 0);
        setField(term819267, term819267.getClass(), "leaderKilledNews", null);
        setField(term819267, term819267.getClass(), "orbitalDestroyedNews", null);
        setField(term819267, term819267.getClass(), "leaderInCombat", null);
        setBooleanField(term819267, term819267.getClass(), "attackerPrivateer", false);
        setBooleanField(term819267, term819267.getClass(), "defenderPrivateer", false);
        setBooleanField(term819267, term819267.getClass(), "orbitalInCombat", false);
        setIntField(term819267, term819267.getClass(), "starYear", 0);
        setBooleanField(term819267, term819267.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "learnOrganicArmor", argTypes, term819267, args);
    }

};


