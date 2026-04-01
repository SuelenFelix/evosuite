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

public class Combat_canPrivateer_98527903933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519921;

    public Combat_canPrivateer_98527903933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519921 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term519921, term519921.getClass(), "combatShipList", null);
        setIntField(term519921, term519921.getClass(), "shipIndex", 0);
        setIntField(term519921, term519921.getClass(), "cursorX", 0);
        setIntField(term519921, term519921.getClass(), "cursorY", 0);
        setIntField(term519921, term519921.getClass(), "componentUse", 0);
        setField(term519921, term519921.getClass(), "animation", null);
        setField(term519921, term519921.getClass(), "attackerFleet", null);
        setField(term519921, term519921.getClass(), "defenderFleet", null);
        setField(term519921, term519921.getClass(), "starbaseFleet", null);
        setField(term519921, term519921.getClass(), "winner", null);
        setField(term519921, term519921.getClass(), "attackerInfo", null);
        setField(term519921, term519921.getClass(), "defenderInfo", null);
        setField(term519921, term519921.getClass(), "planet", null);
        setIntField(term519921, term519921.getClass(), "totalRounds", 0);
        setIntField(term519921, term519921.getClass(), "roundsNoDamge", 0);
        setBooleanField(term519921, term519921.getClass(), "endCombatHandled", false);
        setField(term519921, term519921.getClass(), "wormHole", null);
        setIntField(term519921, term519921.getClass(), "timerForWormHole", 0);
        setBooleanField(term519921, term519921.getClass(), "defenderEscaped", false);
        setBooleanField(term519921, term519921.getClass(), "attackerEscaped", false);
        setField(term519921, term519921.getClass(), "escapePosition", null);
        setField(term519921, term519921.getClass(), "combatEvent", null);
        setIntField(term519921, term519921.getClass(), "defenderMilitaryValue", 0);
        setIntField(term519921, term519921.getClass(), "attackerMilitaryValue", 0);
        setField(term519921, term519921.getClass(), "leaderKilledNews", null);
        setField(term519921, term519921.getClass(), "orbitalDestroyedNews", null);
        setField(term519921, term519921.getClass(), "leaderInCombat", null);
        setBooleanField(term519921, term519921.getClass(), "attackerPrivateer", false);
        setBooleanField(term519921, term519921.getClass(), "defenderPrivateer", false);
        setBooleanField(term519921, term519921.getClass(), "orbitalInCombat", false);
        setIntField(term519921, term519921.getClass(), "starYear", 0);
        setBooleanField(term519921, term519921.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "canPrivateer", argTypes, term519921, args);
    }

};


