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

public class Combat_handleWinner_77188442280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673981;

    public Combat_handleWinner_77188442280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term673981 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term673981, term673981.getClass(), "combatShipList", null);
        setIntField(term673981, term673981.getClass(), "shipIndex", 0);
        setIntField(term673981, term673981.getClass(), "cursorX", 0);
        setIntField(term673981, term673981.getClass(), "cursorY", 0);
        setIntField(term673981, term673981.getClass(), "componentUse", 0);
        setField(term673981, term673981.getClass(), "animation", null);
        setField(term673981, term673981.getClass(), "attackerFleet", null);
        setField(term673981, term673981.getClass(), "defenderFleet", null);
        setField(term673981, term673981.getClass(), "starbaseFleet", null);
        setField(term673981, term673981.getClass(), "winner", null);
        setField(term673981, term673981.getClass(), "attackerInfo", null);
        setField(term673981, term673981.getClass(), "defenderInfo", null);
        setField(term673981, term673981.getClass(), "planet", null);
        setIntField(term673981, term673981.getClass(), "totalRounds", 0);
        setIntField(term673981, term673981.getClass(), "roundsNoDamge", 0);
        setBooleanField(term673981, term673981.getClass(), "endCombatHandled", false);
        setField(term673981, term673981.getClass(), "wormHole", null);
        setIntField(term673981, term673981.getClass(), "timerForWormHole", 0);
        setBooleanField(term673981, term673981.getClass(), "defenderEscaped", false);
        setBooleanField(term673981, term673981.getClass(), "attackerEscaped", false);
        setField(term673981, term673981.getClass(), "escapePosition", null);
        setField(term673981, term673981.getClass(), "combatEvent", null);
        setIntField(term673981, term673981.getClass(), "defenderMilitaryValue", 0);
        setIntField(term673981, term673981.getClass(), "attackerMilitaryValue", 0);
        setField(term673981, term673981.getClass(), "leaderKilledNews", null);
        setField(term673981, term673981.getClass(), "orbitalDestroyedNews", null);
        setField(term673981, term673981.getClass(), "leaderInCombat", null);
        setBooleanField(term673981, term673981.getClass(), "attackerPrivateer", false);
        setBooleanField(term673981, term673981.getClass(), "defenderPrivateer", false);
        setBooleanField(term673981, term673981.getClass(), "orbitalInCombat", false);
        setIntField(term673981, term673981.getClass(), "starYear", 0);
        setBooleanField(term673981, term673981.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "handleWinner", argTypes, term673981, args);
    }

};


