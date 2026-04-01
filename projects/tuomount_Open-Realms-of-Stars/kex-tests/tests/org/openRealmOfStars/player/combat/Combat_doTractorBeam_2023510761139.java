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

public class Combat_doTractorBeam_2023510761139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370048;

    public Combat_doTractorBeam_2023510761139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370048 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term370048, term370048.getClass(), "combatShipList", null);
        setIntField(term370048, term370048.getClass(), "shipIndex", 0);
        setIntField(term370048, term370048.getClass(), "cursorX", 0);
        setIntField(term370048, term370048.getClass(), "cursorY", 0);
        setIntField(term370048, term370048.getClass(), "componentUse", 0);
        setField(term370048, term370048.getClass(), "animation", null);
        setField(term370048, term370048.getClass(), "attackerFleet", null);
        setField(term370048, term370048.getClass(), "defenderFleet", null);
        setField(term370048, term370048.getClass(), "starbaseFleet", null);
        setField(term370048, term370048.getClass(), "winner", null);
        setField(term370048, term370048.getClass(), "attackerInfo", null);
        setField(term370048, term370048.getClass(), "defenderInfo", null);
        setField(term370048, term370048.getClass(), "planet", null);
        setIntField(term370048, term370048.getClass(), "totalRounds", 0);
        setIntField(term370048, term370048.getClass(), "roundsNoDamge", 0);
        setBooleanField(term370048, term370048.getClass(), "endCombatHandled", false);
        setField(term370048, term370048.getClass(), "wormHole", null);
        setIntField(term370048, term370048.getClass(), "timerForWormHole", 0);
        setBooleanField(term370048, term370048.getClass(), "defenderEscaped", false);
        setBooleanField(term370048, term370048.getClass(), "attackerEscaped", false);
        setField(term370048, term370048.getClass(), "escapePosition", null);
        setField(term370048, term370048.getClass(), "combatEvent", null);
        setIntField(term370048, term370048.getClass(), "defenderMilitaryValue", 0);
        setIntField(term370048, term370048.getClass(), "attackerMilitaryValue", 0);
        setField(term370048, term370048.getClass(), "leaderKilledNews", null);
        setField(term370048, term370048.getClass(), "orbitalDestroyedNews", null);
        setField(term370048, term370048.getClass(), "leaderInCombat", null);
        setBooleanField(term370048, term370048.getClass(), "attackerPrivateer", false);
        setBooleanField(term370048, term370048.getClass(), "defenderPrivateer", false);
        setBooleanField(term370048, term370048.getClass(), "orbitalInCombat", false);
        setIntField(term370048, term370048.getClass(), "starYear", 0);
        setBooleanField(term370048, term370048.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "doTractorBeam", argTypes, term370048, args);
    }

};


