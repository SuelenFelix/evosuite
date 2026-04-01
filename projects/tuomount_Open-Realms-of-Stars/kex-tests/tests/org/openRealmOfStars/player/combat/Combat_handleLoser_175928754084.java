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

public class Combat_handleLoser_175928754084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270278;

    public Combat_handleLoser_175928754084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270278 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term270278, term270278.getClass(), "combatShipList", null);
        setIntField(term270278, term270278.getClass(), "shipIndex", 0);
        setIntField(term270278, term270278.getClass(), "cursorX", 0);
        setIntField(term270278, term270278.getClass(), "cursorY", 0);
        setIntField(term270278, term270278.getClass(), "componentUse", 0);
        setField(term270278, term270278.getClass(), "animation", null);
        setField(term270278, term270278.getClass(), "attackerFleet", null);
        setField(term270278, term270278.getClass(), "defenderFleet", null);
        setField(term270278, term270278.getClass(), "starbaseFleet", null);
        setField(term270278, term270278.getClass(), "winner", null);
        setField(term270278, term270278.getClass(), "attackerInfo", null);
        setField(term270278, term270278.getClass(), "defenderInfo", null);
        setField(term270278, term270278.getClass(), "planet", null);
        setIntField(term270278, term270278.getClass(), "totalRounds", 0);
        setIntField(term270278, term270278.getClass(), "roundsNoDamge", 0);
        setBooleanField(term270278, term270278.getClass(), "endCombatHandled", false);
        setField(term270278, term270278.getClass(), "wormHole", null);
        setIntField(term270278, term270278.getClass(), "timerForWormHole", 0);
        setBooleanField(term270278, term270278.getClass(), "defenderEscaped", false);
        setBooleanField(term270278, term270278.getClass(), "attackerEscaped", false);
        setField(term270278, term270278.getClass(), "escapePosition", null);
        setField(term270278, term270278.getClass(), "combatEvent", null);
        setIntField(term270278, term270278.getClass(), "defenderMilitaryValue", 0);
        setIntField(term270278, term270278.getClass(), "attackerMilitaryValue", 0);
        setField(term270278, term270278.getClass(), "leaderKilledNews", null);
        setField(term270278, term270278.getClass(), "orbitalDestroyedNews", null);
        setField(term270278, term270278.getClass(), "leaderInCombat", null);
        setBooleanField(term270278, term270278.getClass(), "attackerPrivateer", false);
        setBooleanField(term270278, term270278.getClass(), "defenderPrivateer", false);
        setBooleanField(term270278, term270278.getClass(), "orbitalInCombat", false);
        setIntField(term270278, term270278.getClass(), "starYear", 0);
        setBooleanField(term270278, term270278.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleLoser", argTypes, term270278, args);
    }

};


