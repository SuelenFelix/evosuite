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

public class Combat_nextShip_164174635278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245716;

    public Combat_nextShip_164174635278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245716 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term245716, term245716.getClass(), "combatShipList", null);
        setIntField(term245716, term245716.getClass(), "shipIndex", 0);
        setIntField(term245716, term245716.getClass(), "cursorX", 0);
        setIntField(term245716, term245716.getClass(), "cursorY", 0);
        setIntField(term245716, term245716.getClass(), "componentUse", 0);
        setField(term245716, term245716.getClass(), "animation", null);
        setField(term245716, term245716.getClass(), "attackerFleet", null);
        setField(term245716, term245716.getClass(), "defenderFleet", null);
        setField(term245716, term245716.getClass(), "starbaseFleet", null);
        setField(term245716, term245716.getClass(), "winner", null);
        setField(term245716, term245716.getClass(), "attackerInfo", null);
        setField(term245716, term245716.getClass(), "defenderInfo", null);
        setField(term245716, term245716.getClass(), "planet", null);
        setIntField(term245716, term245716.getClass(), "totalRounds", 0);
        setIntField(term245716, term245716.getClass(), "roundsNoDamge", 0);
        setBooleanField(term245716, term245716.getClass(), "endCombatHandled", false);
        setField(term245716, term245716.getClass(), "wormHole", null);
        setIntField(term245716, term245716.getClass(), "timerForWormHole", 0);
        setBooleanField(term245716, term245716.getClass(), "defenderEscaped", false);
        setBooleanField(term245716, term245716.getClass(), "attackerEscaped", false);
        setField(term245716, term245716.getClass(), "escapePosition", null);
        setField(term245716, term245716.getClass(), "combatEvent", null);
        setIntField(term245716, term245716.getClass(), "defenderMilitaryValue", 0);
        setIntField(term245716, term245716.getClass(), "attackerMilitaryValue", 0);
        setField(term245716, term245716.getClass(), "leaderKilledNews", null);
        setField(term245716, term245716.getClass(), "orbitalDestroyedNews", null);
        setField(term245716, term245716.getClass(), "leaderInCombat", null);
        setBooleanField(term245716, term245716.getClass(), "attackerPrivateer", false);
        setBooleanField(term245716, term245716.getClass(), "defenderPrivateer", false);
        setBooleanField(term245716, term245716.getClass(), "orbitalInCombat", false);
        setIntField(term245716, term245716.getClass(), "starYear", 0);
        setBooleanField(term245716, term245716.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "nextShip", argTypes, term245716, args);
    }

};


