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

public class Combat_isAbleToShoot_28702441728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101388;

    public Combat_isAbleToShoot_28702441728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101388 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term101388, term101388.getClass(), "combatShipList", null);
        setIntField(term101388, term101388.getClass(), "shipIndex", 0);
        setIntField(term101388, term101388.getClass(), "cursorX", 0);
        setIntField(term101388, term101388.getClass(), "cursorY", 0);
        setIntField(term101388, term101388.getClass(), "componentUse", 0);
        setField(term101388, term101388.getClass(), "animation", null);
        setField(term101388, term101388.getClass(), "attackerFleet", null);
        setField(term101388, term101388.getClass(), "defenderFleet", null);
        setField(term101388, term101388.getClass(), "starbaseFleet", null);
        setField(term101388, term101388.getClass(), "winner", null);
        setField(term101388, term101388.getClass(), "attackerInfo", null);
        setField(term101388, term101388.getClass(), "defenderInfo", null);
        setField(term101388, term101388.getClass(), "planet", null);
        setIntField(term101388, term101388.getClass(), "totalRounds", 0);
        setIntField(term101388, term101388.getClass(), "roundsNoDamge", 0);
        setBooleanField(term101388, term101388.getClass(), "endCombatHandled", false);
        setField(term101388, term101388.getClass(), "wormHole", null);
        setIntField(term101388, term101388.getClass(), "timerForWormHole", 0);
        setBooleanField(term101388, term101388.getClass(), "defenderEscaped", false);
        setBooleanField(term101388, term101388.getClass(), "attackerEscaped", false);
        setField(term101388, term101388.getClass(), "escapePosition", null);
        setField(term101388, term101388.getClass(), "combatEvent", null);
        setIntField(term101388, term101388.getClass(), "defenderMilitaryValue", 0);
        setIntField(term101388, term101388.getClass(), "attackerMilitaryValue", 0);
        setField(term101388, term101388.getClass(), "leaderKilledNews", null);
        setField(term101388, term101388.getClass(), "orbitalDestroyedNews", null);
        setField(term101388, term101388.getClass(), "leaderInCombat", null);
        setBooleanField(term101388, term101388.getClass(), "attackerPrivateer", false);
        setBooleanField(term101388, term101388.getClass(), "defenderPrivateer", false);
        setBooleanField(term101388, term101388.getClass(), "orbitalInCombat", false);
        setIntField(term101388, term101388.getClass(), "starYear", 0);
        setBooleanField(term101388, term101388.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "isAbleToShoot", argTypes, term101388, args);
    }

};


