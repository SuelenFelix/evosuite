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

public class Combat_getMaxCloakDetection_170135495040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145499;

    public Combat_getMaxCloakDetection_170135495040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145499 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term145499, term145499.getClass(), "combatShipList", null);
        setIntField(term145499, term145499.getClass(), "shipIndex", 0);
        setIntField(term145499, term145499.getClass(), "cursorX", 0);
        setIntField(term145499, term145499.getClass(), "cursorY", 0);
        setIntField(term145499, term145499.getClass(), "componentUse", 0);
        setField(term145499, term145499.getClass(), "animation", null);
        setField(term145499, term145499.getClass(), "attackerFleet", null);
        setField(term145499, term145499.getClass(), "defenderFleet", null);
        setField(term145499, term145499.getClass(), "starbaseFleet", null);
        setField(term145499, term145499.getClass(), "winner", null);
        setField(term145499, term145499.getClass(), "attackerInfo", null);
        setField(term145499, term145499.getClass(), "defenderInfo", null);
        setField(term145499, term145499.getClass(), "planet", null);
        setIntField(term145499, term145499.getClass(), "totalRounds", 0);
        setIntField(term145499, term145499.getClass(), "roundsNoDamge", 0);
        setBooleanField(term145499, term145499.getClass(), "endCombatHandled", false);
        setField(term145499, term145499.getClass(), "wormHole", null);
        setIntField(term145499, term145499.getClass(), "timerForWormHole", 0);
        setBooleanField(term145499, term145499.getClass(), "defenderEscaped", false);
        setBooleanField(term145499, term145499.getClass(), "attackerEscaped", false);
        setField(term145499, term145499.getClass(), "escapePosition", null);
        setField(term145499, term145499.getClass(), "combatEvent", null);
        setIntField(term145499, term145499.getClass(), "defenderMilitaryValue", 0);
        setIntField(term145499, term145499.getClass(), "attackerMilitaryValue", 0);
        setField(term145499, term145499.getClass(), "leaderKilledNews", null);
        setField(term145499, term145499.getClass(), "orbitalDestroyedNews", null);
        setField(term145499, term145499.getClass(), "leaderInCombat", null);
        setBooleanField(term145499, term145499.getClass(), "attackerPrivateer", false);
        setBooleanField(term145499, term145499.getClass(), "defenderPrivateer", false);
        setBooleanField(term145499, term145499.getClass(), "orbitalInCombat", false);
        setIntField(term145499, term145499.getClass(), "starYear", 0);
        setBooleanField(term145499, term145499.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getMaxCloakDetection", argTypes, term145499, args);
    }

};


