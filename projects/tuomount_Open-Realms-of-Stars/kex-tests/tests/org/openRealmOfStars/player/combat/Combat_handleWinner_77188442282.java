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

public class Combat_handleWinner_77188442282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257917;

    public Combat_handleWinner_77188442282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257917 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term257917, term257917.getClass(), "combatShipList", null);
        setIntField(term257917, term257917.getClass(), "shipIndex", 0);
        setIntField(term257917, term257917.getClass(), "cursorX", 0);
        setIntField(term257917, term257917.getClass(), "cursorY", 0);
        setIntField(term257917, term257917.getClass(), "componentUse", 0);
        setField(term257917, term257917.getClass(), "animation", null);
        setField(term257917, term257917.getClass(), "attackerFleet", null);
        setField(term257917, term257917.getClass(), "defenderFleet", null);
        setField(term257917, term257917.getClass(), "starbaseFleet", null);
        setField(term257917, term257917.getClass(), "winner", null);
        setField(term257917, term257917.getClass(), "attackerInfo", null);
        setField(term257917, term257917.getClass(), "defenderInfo", null);
        setField(term257917, term257917.getClass(), "planet", null);
        setIntField(term257917, term257917.getClass(), "totalRounds", 0);
        setIntField(term257917, term257917.getClass(), "roundsNoDamge", 0);
        setBooleanField(term257917, term257917.getClass(), "endCombatHandled", false);
        setField(term257917, term257917.getClass(), "wormHole", null);
        setIntField(term257917, term257917.getClass(), "timerForWormHole", 0);
        setBooleanField(term257917, term257917.getClass(), "defenderEscaped", false);
        setBooleanField(term257917, term257917.getClass(), "attackerEscaped", false);
        setField(term257917, term257917.getClass(), "escapePosition", null);
        setField(term257917, term257917.getClass(), "combatEvent", null);
        setIntField(term257917, term257917.getClass(), "defenderMilitaryValue", 0);
        setIntField(term257917, term257917.getClass(), "attackerMilitaryValue", 0);
        setField(term257917, term257917.getClass(), "leaderKilledNews", null);
        setField(term257917, term257917.getClass(), "orbitalDestroyedNews", null);
        setField(term257917, term257917.getClass(), "leaderInCombat", null);
        setBooleanField(term257917, term257917.getClass(), "attackerPrivateer", false);
        setBooleanField(term257917, term257917.getClass(), "defenderPrivateer", false);
        setBooleanField(term257917, term257917.getClass(), "orbitalInCombat", false);
        setIntField(term257917, term257917.getClass(), "starYear", 0);
        setBooleanField(term257917, term257917.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "handleWinner", argTypes, term257917, args);
    }

};


