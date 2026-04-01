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

public class Combat_areCloakedShips_159517491139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541899;

    public Combat_areCloakedShips_159517491139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541899 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term541899, term541899.getClass(), "combatShipList", null);
        setIntField(term541899, term541899.getClass(), "shipIndex", 0);
        setIntField(term541899, term541899.getClass(), "cursorX", 0);
        setIntField(term541899, term541899.getClass(), "cursorY", 0);
        setIntField(term541899, term541899.getClass(), "componentUse", 0);
        setField(term541899, term541899.getClass(), "animation", null);
        setField(term541899, term541899.getClass(), "attackerFleet", null);
        setField(term541899, term541899.getClass(), "defenderFleet", null);
        setField(term541899, term541899.getClass(), "starbaseFleet", null);
        setField(term541899, term541899.getClass(), "winner", null);
        setField(term541899, term541899.getClass(), "attackerInfo", null);
        setField(term541899, term541899.getClass(), "defenderInfo", null);
        setField(term541899, term541899.getClass(), "planet", null);
        setIntField(term541899, term541899.getClass(), "totalRounds", 0);
        setIntField(term541899, term541899.getClass(), "roundsNoDamge", 0);
        setBooleanField(term541899, term541899.getClass(), "endCombatHandled", false);
        setField(term541899, term541899.getClass(), "wormHole", null);
        setIntField(term541899, term541899.getClass(), "timerForWormHole", 0);
        setBooleanField(term541899, term541899.getClass(), "defenderEscaped", false);
        setBooleanField(term541899, term541899.getClass(), "attackerEscaped", false);
        setField(term541899, term541899.getClass(), "escapePosition", null);
        setField(term541899, term541899.getClass(), "combatEvent", null);
        setIntField(term541899, term541899.getClass(), "defenderMilitaryValue", 0);
        setIntField(term541899, term541899.getClass(), "attackerMilitaryValue", 0);
        setField(term541899, term541899.getClass(), "leaderKilledNews", null);
        setField(term541899, term541899.getClass(), "orbitalDestroyedNews", null);
        setField(term541899, term541899.getClass(), "leaderInCombat", null);
        setBooleanField(term541899, term541899.getClass(), "attackerPrivateer", false);
        setBooleanField(term541899, term541899.getClass(), "defenderPrivateer", false);
        setBooleanField(term541899, term541899.getClass(), "orbitalInCombat", false);
        setIntField(term541899, term541899.getClass(), "starYear", 0);
        setBooleanField(term541899, term541899.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "areCloakedShips", argTypes, term541899, args);
    }

};


