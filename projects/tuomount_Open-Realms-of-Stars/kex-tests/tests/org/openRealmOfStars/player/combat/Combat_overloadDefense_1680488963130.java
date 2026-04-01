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

public class Combat_overloadDefense_1680488963130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771230;

    public Combat_overloadDefense_1680488963130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term771230 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term771230, term771230.getClass(), "combatShipList", null);
        setIntField(term771230, term771230.getClass(), "shipIndex", 0);
        setIntField(term771230, term771230.getClass(), "cursorX", 0);
        setIntField(term771230, term771230.getClass(), "cursorY", 0);
        setIntField(term771230, term771230.getClass(), "componentUse", 0);
        setField(term771230, term771230.getClass(), "animation", null);
        setField(term771230, term771230.getClass(), "attackerFleet", null);
        setField(term771230, term771230.getClass(), "defenderFleet", null);
        setField(term771230, term771230.getClass(), "starbaseFleet", null);
        setField(term771230, term771230.getClass(), "winner", null);
        setField(term771230, term771230.getClass(), "attackerInfo", null);
        setField(term771230, term771230.getClass(), "defenderInfo", null);
        setField(term771230, term771230.getClass(), "planet", null);
        setIntField(term771230, term771230.getClass(), "totalRounds", 0);
        setIntField(term771230, term771230.getClass(), "roundsNoDamge", 0);
        setBooleanField(term771230, term771230.getClass(), "endCombatHandled", false);
        setField(term771230, term771230.getClass(), "wormHole", null);
        setIntField(term771230, term771230.getClass(), "timerForWormHole", 0);
        setBooleanField(term771230, term771230.getClass(), "defenderEscaped", false);
        setBooleanField(term771230, term771230.getClass(), "attackerEscaped", false);
        setField(term771230, term771230.getClass(), "escapePosition", null);
        setField(term771230, term771230.getClass(), "combatEvent", null);
        setIntField(term771230, term771230.getClass(), "defenderMilitaryValue", 0);
        setIntField(term771230, term771230.getClass(), "attackerMilitaryValue", 0);
        setField(term771230, term771230.getClass(), "leaderKilledNews", null);
        setField(term771230, term771230.getClass(), "orbitalDestroyedNews", null);
        setField(term771230, term771230.getClass(), "leaderInCombat", null);
        setBooleanField(term771230, term771230.getClass(), "attackerPrivateer", false);
        setBooleanField(term771230, term771230.getClass(), "defenderPrivateer", false);
        setBooleanField(term771230, term771230.getClass(), "orbitalInCombat", false);
        setIntField(term771230, term771230.getClass(), "starYear", 0);
        setBooleanField(term771230, term771230.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "overloadDefense", argTypes, term771230, args);
    }

};


