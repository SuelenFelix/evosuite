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

public class Combat_doPrivateering_1416724721141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391207;

    public Combat_doPrivateering_1416724721141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391207 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term391207, term391207.getClass(), "combatShipList", null);
        setIntField(term391207, term391207.getClass(), "shipIndex", 0);
        setIntField(term391207, term391207.getClass(), "cursorX", 0);
        setIntField(term391207, term391207.getClass(), "cursorY", 0);
        setIntField(term391207, term391207.getClass(), "componentUse", 0);
        setField(term391207, term391207.getClass(), "animation", null);
        setField(term391207, term391207.getClass(), "attackerFleet", null);
        setField(term391207, term391207.getClass(), "defenderFleet", null);
        setField(term391207, term391207.getClass(), "starbaseFleet", null);
        setField(term391207, term391207.getClass(), "winner", null);
        setField(term391207, term391207.getClass(), "attackerInfo", null);
        setField(term391207, term391207.getClass(), "defenderInfo", null);
        setField(term391207, term391207.getClass(), "planet", null);
        setIntField(term391207, term391207.getClass(), "totalRounds", 0);
        setIntField(term391207, term391207.getClass(), "roundsNoDamge", 0);
        setBooleanField(term391207, term391207.getClass(), "endCombatHandled", false);
        setField(term391207, term391207.getClass(), "wormHole", null);
        setIntField(term391207, term391207.getClass(), "timerForWormHole", 0);
        setBooleanField(term391207, term391207.getClass(), "defenderEscaped", false);
        setBooleanField(term391207, term391207.getClass(), "attackerEscaped", false);
        setField(term391207, term391207.getClass(), "escapePosition", null);
        setField(term391207, term391207.getClass(), "combatEvent", null);
        setIntField(term391207, term391207.getClass(), "defenderMilitaryValue", 0);
        setIntField(term391207, term391207.getClass(), "attackerMilitaryValue", 0);
        setField(term391207, term391207.getClass(), "leaderKilledNews", null);
        setField(term391207, term391207.getClass(), "orbitalDestroyedNews", null);
        setField(term391207, term391207.getClass(), "leaderInCombat", null);
        setBooleanField(term391207, term391207.getClass(), "attackerPrivateer", false);
        setBooleanField(term391207, term391207.getClass(), "defenderPrivateer", false);
        setBooleanField(term391207, term391207.getClass(), "orbitalInCombat", false);
        setIntField(term391207, term391207.getClass(), "starYear", 0);
        setBooleanField(term391207, term391207.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "doPrivateering", argTypes, term391207, args);
    }

};


