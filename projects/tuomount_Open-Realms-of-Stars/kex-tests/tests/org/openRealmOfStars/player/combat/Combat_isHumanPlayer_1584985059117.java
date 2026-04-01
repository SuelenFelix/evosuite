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

public class Combat_isHumanPlayer_1584985059117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330557;

    public Combat_isHumanPlayer_1584985059117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330557 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term330557, term330557.getClass(), "combatShipList", null);
        setIntField(term330557, term330557.getClass(), "shipIndex", 0);
        setIntField(term330557, term330557.getClass(), "cursorX", 0);
        setIntField(term330557, term330557.getClass(), "cursorY", 0);
        setIntField(term330557, term330557.getClass(), "componentUse", 0);
        setField(term330557, term330557.getClass(), "animation", null);
        setField(term330557, term330557.getClass(), "attackerFleet", null);
        setField(term330557, term330557.getClass(), "defenderFleet", null);
        setField(term330557, term330557.getClass(), "starbaseFleet", null);
        setField(term330557, term330557.getClass(), "winner", null);
        setField(term330557, term330557.getClass(), "attackerInfo", null);
        setField(term330557, term330557.getClass(), "defenderInfo", null);
        setField(term330557, term330557.getClass(), "planet", null);
        setIntField(term330557, term330557.getClass(), "totalRounds", 0);
        setIntField(term330557, term330557.getClass(), "roundsNoDamge", 0);
        setBooleanField(term330557, term330557.getClass(), "endCombatHandled", false);
        setField(term330557, term330557.getClass(), "wormHole", null);
        setIntField(term330557, term330557.getClass(), "timerForWormHole", 0);
        setBooleanField(term330557, term330557.getClass(), "defenderEscaped", false);
        setBooleanField(term330557, term330557.getClass(), "attackerEscaped", false);
        setField(term330557, term330557.getClass(), "escapePosition", null);
        setField(term330557, term330557.getClass(), "combatEvent", null);
        setIntField(term330557, term330557.getClass(), "defenderMilitaryValue", 0);
        setIntField(term330557, term330557.getClass(), "attackerMilitaryValue", 0);
        setField(term330557, term330557.getClass(), "leaderKilledNews", null);
        setField(term330557, term330557.getClass(), "orbitalDestroyedNews", null);
        setField(term330557, term330557.getClass(), "leaderInCombat", null);
        setBooleanField(term330557, term330557.getClass(), "attackerPrivateer", false);
        setBooleanField(term330557, term330557.getClass(), "defenderPrivateer", false);
        setBooleanField(term330557, term330557.getClass(), "orbitalInCombat", false);
        setIntField(term330557, term330557.getClass(), "starYear", 0);
        setBooleanField(term330557, term330557.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHumanPlayer", argTypes, term330557, args);
    }

};


