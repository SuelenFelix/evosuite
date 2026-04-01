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
import java.lang.Integer;

public class Combat_handleOverloading_611119661135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361799;
     Object term361817;

    public Combat_handleOverloading_611119661135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361799 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term361799, term361799.getClass(), "combatShipList", null);
        setIntField(term361799, term361799.getClass(), "shipIndex", 0);
        setIntField(term361799, term361799.getClass(), "cursorX", 0);
        setIntField(term361799, term361799.getClass(), "cursorY", 0);
        setIntField(term361799, term361799.getClass(), "componentUse", 0);
        setField(term361799, term361799.getClass(), "animation", null);
        setField(term361799, term361799.getClass(), "attackerFleet", null);
        setField(term361799, term361799.getClass(), "defenderFleet", null);
        setField(term361799, term361799.getClass(), "starbaseFleet", null);
        setField(term361799, term361799.getClass(), "winner", null);
        setField(term361799, term361799.getClass(), "attackerInfo", null);
        setField(term361799, term361799.getClass(), "defenderInfo", null);
        setField(term361799, term361799.getClass(), "planet", null);
        setIntField(term361799, term361799.getClass(), "totalRounds", 0);
        setIntField(term361799, term361799.getClass(), "roundsNoDamge", 0);
        setBooleanField(term361799, term361799.getClass(), "endCombatHandled", false);
        setField(term361799, term361799.getClass(), "wormHole", null);
        setIntField(term361799, term361799.getClass(), "timerForWormHole", 0);
        setBooleanField(term361799, term361799.getClass(), "defenderEscaped", false);
        setBooleanField(term361799, term361799.getClass(), "attackerEscaped", false);
        setField(term361799, term361799.getClass(), "escapePosition", null);
        setField(term361799, term361799.getClass(), "combatEvent", null);
        setIntField(term361799, term361799.getClass(), "defenderMilitaryValue", 0);
        setIntField(term361799, term361799.getClass(), "attackerMilitaryValue", 0);
        setField(term361799, term361799.getClass(), "leaderKilledNews", null);
        setField(term361799, term361799.getClass(), "orbitalDestroyedNews", null);
        setField(term361799, term361799.getClass(), "leaderInCombat", null);
        setBooleanField(term361799, term361799.getClass(), "attackerPrivateer", false);
        setBooleanField(term361799, term361799.getClass(), "defenderPrivateer", false);
        setBooleanField(term361799, term361799.getClass(), "orbitalInCombat", false);
        setIntField(term361799, term361799.getClass(), "starYear", 0);
        setBooleanField(term361799, term361799.getClass(), "worthOfWarHero", false);
        term361817 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term361817;
        callMethod(klass, "handleOverloading", argTypes, term361799, args);
    }

};


