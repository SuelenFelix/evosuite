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

public class Combat_calculateAccuracy_968589179108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315523;

    public Combat_calculateAccuracy_968589179108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315523 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term315523, term315523.getClass(), "combatShipList", null);
        setIntField(term315523, term315523.getClass(), "shipIndex", 0);
        setIntField(term315523, term315523.getClass(), "cursorX", 0);
        setIntField(term315523, term315523.getClass(), "cursorY", 0);
        setIntField(term315523, term315523.getClass(), "componentUse", 0);
        setField(term315523, term315523.getClass(), "animation", null);
        setField(term315523, term315523.getClass(), "attackerFleet", null);
        setField(term315523, term315523.getClass(), "defenderFleet", null);
        setField(term315523, term315523.getClass(), "starbaseFleet", null);
        setField(term315523, term315523.getClass(), "winner", null);
        setField(term315523, term315523.getClass(), "attackerInfo", null);
        setField(term315523, term315523.getClass(), "defenderInfo", null);
        setField(term315523, term315523.getClass(), "planet", null);
        setIntField(term315523, term315523.getClass(), "totalRounds", 0);
        setIntField(term315523, term315523.getClass(), "roundsNoDamge", 0);
        setBooleanField(term315523, term315523.getClass(), "endCombatHandled", false);
        setField(term315523, term315523.getClass(), "wormHole", null);
        setIntField(term315523, term315523.getClass(), "timerForWormHole", 0);
        setBooleanField(term315523, term315523.getClass(), "defenderEscaped", false);
        setBooleanField(term315523, term315523.getClass(), "attackerEscaped", false);
        setField(term315523, term315523.getClass(), "escapePosition", null);
        setField(term315523, term315523.getClass(), "combatEvent", null);
        setIntField(term315523, term315523.getClass(), "defenderMilitaryValue", 0);
        setIntField(term315523, term315523.getClass(), "attackerMilitaryValue", 0);
        setField(term315523, term315523.getClass(), "leaderKilledNews", null);
        setField(term315523, term315523.getClass(), "orbitalDestroyedNews", null);
        setField(term315523, term315523.getClass(), "leaderInCombat", null);
        setBooleanField(term315523, term315523.getClass(), "attackerPrivateer", false);
        setBooleanField(term315523, term315523.getClass(), "defenderPrivateer", false);
        setBooleanField(term315523, term315523.getClass(), "orbitalInCombat", false);
        setIntField(term315523, term315523.getClass(), "starYear", 0);
        setBooleanField(term315523, term315523.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "calculateAccuracy", argTypes, term315523, args);
    }

};


