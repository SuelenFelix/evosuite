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

public class Combat_handleOrbitalDefenseGrid_123157660276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243424;

    public Combat_handleOrbitalDefenseGrid_123157660276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243424 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term243424, term243424.getClass(), "combatShipList", null);
        setIntField(term243424, term243424.getClass(), "shipIndex", 0);
        setIntField(term243424, term243424.getClass(), "cursorX", 0);
        setIntField(term243424, term243424.getClass(), "cursorY", 0);
        setIntField(term243424, term243424.getClass(), "componentUse", 0);
        setField(term243424, term243424.getClass(), "animation", null);
        setField(term243424, term243424.getClass(), "attackerFleet", null);
        setField(term243424, term243424.getClass(), "defenderFleet", null);
        setField(term243424, term243424.getClass(), "starbaseFleet", null);
        setField(term243424, term243424.getClass(), "winner", null);
        setField(term243424, term243424.getClass(), "attackerInfo", null);
        setField(term243424, term243424.getClass(), "defenderInfo", null);
        setField(term243424, term243424.getClass(), "planet", null);
        setIntField(term243424, term243424.getClass(), "totalRounds", 0);
        setIntField(term243424, term243424.getClass(), "roundsNoDamge", 0);
        setBooleanField(term243424, term243424.getClass(), "endCombatHandled", false);
        setField(term243424, term243424.getClass(), "wormHole", null);
        setIntField(term243424, term243424.getClass(), "timerForWormHole", 0);
        setBooleanField(term243424, term243424.getClass(), "defenderEscaped", false);
        setBooleanField(term243424, term243424.getClass(), "attackerEscaped", false);
        setField(term243424, term243424.getClass(), "escapePosition", null);
        setField(term243424, term243424.getClass(), "combatEvent", null);
        setIntField(term243424, term243424.getClass(), "defenderMilitaryValue", 0);
        setIntField(term243424, term243424.getClass(), "attackerMilitaryValue", 0);
        setField(term243424, term243424.getClass(), "leaderKilledNews", null);
        setField(term243424, term243424.getClass(), "orbitalDestroyedNews", null);
        setField(term243424, term243424.getClass(), "leaderInCombat", null);
        setBooleanField(term243424, term243424.getClass(), "attackerPrivateer", false);
        setBooleanField(term243424, term243424.getClass(), "defenderPrivateer", false);
        setBooleanField(term243424, term243424.getClass(), "orbitalInCombat", false);
        setIntField(term243424, term243424.getClass(), "starYear", 0);
        setBooleanField(term243424, term243424.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleOrbitalDefenseGrid", argTypes, term243424, args);
    }

};


