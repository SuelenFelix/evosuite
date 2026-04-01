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

public class Combat_stealShipFromFleet_154371745049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187559;

    public Combat_stealShipFromFleet_154371745049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187559 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term187559, term187559.getClass(), "combatShipList", null);
        setIntField(term187559, term187559.getClass(), "shipIndex", 0);
        setIntField(term187559, term187559.getClass(), "cursorX", 0);
        setIntField(term187559, term187559.getClass(), "cursorY", 0);
        setIntField(term187559, term187559.getClass(), "componentUse", 0);
        setField(term187559, term187559.getClass(), "animation", null);
        setField(term187559, term187559.getClass(), "attackerFleet", null);
        setField(term187559, term187559.getClass(), "defenderFleet", null);
        setField(term187559, term187559.getClass(), "starbaseFleet", null);
        setField(term187559, term187559.getClass(), "winner", null);
        setField(term187559, term187559.getClass(), "attackerInfo", null);
        setField(term187559, term187559.getClass(), "defenderInfo", null);
        setField(term187559, term187559.getClass(), "planet", null);
        setIntField(term187559, term187559.getClass(), "totalRounds", 0);
        setIntField(term187559, term187559.getClass(), "roundsNoDamge", 0);
        setBooleanField(term187559, term187559.getClass(), "endCombatHandled", false);
        setField(term187559, term187559.getClass(), "wormHole", null);
        setIntField(term187559, term187559.getClass(), "timerForWormHole", 0);
        setBooleanField(term187559, term187559.getClass(), "defenderEscaped", false);
        setBooleanField(term187559, term187559.getClass(), "attackerEscaped", false);
        setField(term187559, term187559.getClass(), "escapePosition", null);
        setField(term187559, term187559.getClass(), "combatEvent", null);
        setIntField(term187559, term187559.getClass(), "defenderMilitaryValue", 0);
        setIntField(term187559, term187559.getClass(), "attackerMilitaryValue", 0);
        setField(term187559, term187559.getClass(), "leaderKilledNews", null);
        setField(term187559, term187559.getClass(), "orbitalDestroyedNews", null);
        setField(term187559, term187559.getClass(), "leaderInCombat", null);
        setBooleanField(term187559, term187559.getClass(), "attackerPrivateer", false);
        setBooleanField(term187559, term187559.getClass(), "defenderPrivateer", false);
        setBooleanField(term187559, term187559.getClass(), "orbitalInCombat", false);
        setIntField(term187559, term187559.getClass(), "starYear", 0);
        setBooleanField(term187559, term187559.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "stealShipFromFleet", argTypes, term187559, args);
    }

};


