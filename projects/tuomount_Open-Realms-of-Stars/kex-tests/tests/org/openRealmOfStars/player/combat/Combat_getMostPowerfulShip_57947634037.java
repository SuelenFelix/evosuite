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

public class Combat_getMostPowerfulShip_57947634037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532218;

    public Combat_getMostPowerfulShip_57947634037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term532218 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term532218, term532218.getClass(), "combatShipList", null);
        setIntField(term532218, term532218.getClass(), "shipIndex", 0);
        setIntField(term532218, term532218.getClass(), "cursorX", 0);
        setIntField(term532218, term532218.getClass(), "cursorY", 0);
        setIntField(term532218, term532218.getClass(), "componentUse", 0);
        setField(term532218, term532218.getClass(), "animation", null);
        setField(term532218, term532218.getClass(), "attackerFleet", null);
        setField(term532218, term532218.getClass(), "defenderFleet", null);
        setField(term532218, term532218.getClass(), "starbaseFleet", null);
        setField(term532218, term532218.getClass(), "winner", null);
        setField(term532218, term532218.getClass(), "attackerInfo", null);
        setField(term532218, term532218.getClass(), "defenderInfo", null);
        setField(term532218, term532218.getClass(), "planet", null);
        setIntField(term532218, term532218.getClass(), "totalRounds", 0);
        setIntField(term532218, term532218.getClass(), "roundsNoDamge", 0);
        setBooleanField(term532218, term532218.getClass(), "endCombatHandled", false);
        setField(term532218, term532218.getClass(), "wormHole", null);
        setIntField(term532218, term532218.getClass(), "timerForWormHole", 0);
        setBooleanField(term532218, term532218.getClass(), "defenderEscaped", false);
        setBooleanField(term532218, term532218.getClass(), "attackerEscaped", false);
        setField(term532218, term532218.getClass(), "escapePosition", null);
        setField(term532218, term532218.getClass(), "combatEvent", null);
        setIntField(term532218, term532218.getClass(), "defenderMilitaryValue", 0);
        setIntField(term532218, term532218.getClass(), "attackerMilitaryValue", 0);
        setField(term532218, term532218.getClass(), "leaderKilledNews", null);
        setField(term532218, term532218.getClass(), "orbitalDestroyedNews", null);
        setField(term532218, term532218.getClass(), "leaderInCombat", null);
        setBooleanField(term532218, term532218.getClass(), "attackerPrivateer", false);
        setBooleanField(term532218, term532218.getClass(), "defenderPrivateer", false);
        setBooleanField(term532218, term532218.getClass(), "orbitalInCombat", false);
        setIntField(term532218, term532218.getClass(), "starYear", 0);
        setBooleanField(term532218, term532218.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getMostPowerfulShip", argTypes, term532218, args);
    }

};


