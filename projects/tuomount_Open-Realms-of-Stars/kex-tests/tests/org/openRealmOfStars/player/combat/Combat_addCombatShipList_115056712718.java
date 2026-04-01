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
import java.lang.Boolean;

public class Combat_addCombatShipList_115056712718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80138;
     Object term80156;

    public Combat_addCombatShipList_115056712718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80138 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term80138, term80138.getClass(), "combatShipList", null);
        setIntField(term80138, term80138.getClass(), "shipIndex", 0);
        setIntField(term80138, term80138.getClass(), "cursorX", 0);
        setIntField(term80138, term80138.getClass(), "cursorY", 0);
        setIntField(term80138, term80138.getClass(), "componentUse", 0);
        setField(term80138, term80138.getClass(), "animation", null);
        setField(term80138, term80138.getClass(), "attackerFleet", null);
        setField(term80138, term80138.getClass(), "defenderFleet", null);
        setField(term80138, term80138.getClass(), "starbaseFleet", null);
        setField(term80138, term80138.getClass(), "winner", null);
        setField(term80138, term80138.getClass(), "attackerInfo", null);
        setField(term80138, term80138.getClass(), "defenderInfo", null);
        setField(term80138, term80138.getClass(), "planet", null);
        setIntField(term80138, term80138.getClass(), "totalRounds", 0);
        setIntField(term80138, term80138.getClass(), "roundsNoDamge", 0);
        setBooleanField(term80138, term80138.getClass(), "endCombatHandled", false);
        setField(term80138, term80138.getClass(), "wormHole", null);
        setIntField(term80138, term80138.getClass(), "timerForWormHole", 0);
        setBooleanField(term80138, term80138.getClass(), "defenderEscaped", false);
        setBooleanField(term80138, term80138.getClass(), "attackerEscaped", false);
        setField(term80138, term80138.getClass(), "escapePosition", null);
        setField(term80138, term80138.getClass(), "combatEvent", null);
        setIntField(term80138, term80138.getClass(), "defenderMilitaryValue", 0);
        setIntField(term80138, term80138.getClass(), "attackerMilitaryValue", 0);
        setField(term80138, term80138.getClass(), "leaderKilledNews", null);
        setField(term80138, term80138.getClass(), "orbitalDestroyedNews", null);
        setField(term80138, term80138.getClass(), "leaderInCombat", null);
        setBooleanField(term80138, term80138.getClass(), "attackerPrivateer", false);
        setBooleanField(term80138, term80138.getClass(), "defenderPrivateer", false);
        setBooleanField(term80138, term80138.getClass(), "orbitalInCombat", false);
        setIntField(term80138, term80138.getClass(), "starYear", 0);
        setBooleanField(term80138, term80138.getClass(), "worthOfWarHero", false);
        term80156 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.combat.CombatPositionList");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term80156;
        callMethod(klass, "addCombatShipList", argTypes, term80138, args);
    }

};


