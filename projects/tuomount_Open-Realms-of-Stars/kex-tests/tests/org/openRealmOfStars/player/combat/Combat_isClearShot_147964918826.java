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

public class Combat_isClearShot_147964918826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95427;

    public Combat_isClearShot_147964918826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95427 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term95427, term95427.getClass(), "combatShipList", null);
        setIntField(term95427, term95427.getClass(), "shipIndex", 0);
        setIntField(term95427, term95427.getClass(), "cursorX", 0);
        setIntField(term95427, term95427.getClass(), "cursorY", 0);
        setIntField(term95427, term95427.getClass(), "componentUse", 0);
        setField(term95427, term95427.getClass(), "animation", null);
        setField(term95427, term95427.getClass(), "attackerFleet", null);
        setField(term95427, term95427.getClass(), "defenderFleet", null);
        setField(term95427, term95427.getClass(), "starbaseFleet", null);
        setField(term95427, term95427.getClass(), "winner", null);
        setField(term95427, term95427.getClass(), "attackerInfo", null);
        setField(term95427, term95427.getClass(), "defenderInfo", null);
        setField(term95427, term95427.getClass(), "planet", null);
        setIntField(term95427, term95427.getClass(), "totalRounds", 0);
        setIntField(term95427, term95427.getClass(), "roundsNoDamge", 0);
        setBooleanField(term95427, term95427.getClass(), "endCombatHandled", false);
        setField(term95427, term95427.getClass(), "wormHole", null);
        setIntField(term95427, term95427.getClass(), "timerForWormHole", 0);
        setBooleanField(term95427, term95427.getClass(), "defenderEscaped", false);
        setBooleanField(term95427, term95427.getClass(), "attackerEscaped", false);
        setField(term95427, term95427.getClass(), "escapePosition", null);
        setField(term95427, term95427.getClass(), "combatEvent", null);
        setIntField(term95427, term95427.getClass(), "defenderMilitaryValue", 0);
        setIntField(term95427, term95427.getClass(), "attackerMilitaryValue", 0);
        setField(term95427, term95427.getClass(), "leaderKilledNews", null);
        setField(term95427, term95427.getClass(), "orbitalDestroyedNews", null);
        setField(term95427, term95427.getClass(), "leaderInCombat", null);
        setBooleanField(term95427, term95427.getClass(), "attackerPrivateer", false);
        setBooleanField(term95427, term95427.getClass(), "defenderPrivateer", false);
        setBooleanField(term95427, term95427.getClass(), "orbitalInCombat", false);
        setIntField(term95427, term95427.getClass(), "starYear", 0);
        setBooleanField(term95427, term95427.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "isClearShot", argTypes, term95427, args);
    }

};


