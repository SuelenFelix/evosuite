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

public class Combat_isClearShot_147964918827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500860;

    public Combat_isClearShot_147964918827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500860 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term500860, term500860.getClass(), "combatShipList", null);
        setIntField(term500860, term500860.getClass(), "shipIndex", 0);
        setIntField(term500860, term500860.getClass(), "cursorX", 0);
        setIntField(term500860, term500860.getClass(), "cursorY", 0);
        setIntField(term500860, term500860.getClass(), "componentUse", 0);
        setField(term500860, term500860.getClass(), "animation", null);
        setField(term500860, term500860.getClass(), "attackerFleet", null);
        setField(term500860, term500860.getClass(), "defenderFleet", null);
        setField(term500860, term500860.getClass(), "starbaseFleet", null);
        setField(term500860, term500860.getClass(), "winner", null);
        setField(term500860, term500860.getClass(), "attackerInfo", null);
        setField(term500860, term500860.getClass(), "defenderInfo", null);
        setField(term500860, term500860.getClass(), "planet", null);
        setIntField(term500860, term500860.getClass(), "totalRounds", 0);
        setIntField(term500860, term500860.getClass(), "roundsNoDamge", 0);
        setBooleanField(term500860, term500860.getClass(), "endCombatHandled", false);
        setField(term500860, term500860.getClass(), "wormHole", null);
        setIntField(term500860, term500860.getClass(), "timerForWormHole", 0);
        setBooleanField(term500860, term500860.getClass(), "defenderEscaped", false);
        setBooleanField(term500860, term500860.getClass(), "attackerEscaped", false);
        setField(term500860, term500860.getClass(), "escapePosition", null);
        setField(term500860, term500860.getClass(), "combatEvent", null);
        setIntField(term500860, term500860.getClass(), "defenderMilitaryValue", 0);
        setIntField(term500860, term500860.getClass(), "attackerMilitaryValue", 0);
        setField(term500860, term500860.getClass(), "leaderKilledNews", null);
        setField(term500860, term500860.getClass(), "orbitalDestroyedNews", null);
        setField(term500860, term500860.getClass(), "leaderInCombat", null);
        setBooleanField(term500860, term500860.getClass(), "attackerPrivateer", false);
        setBooleanField(term500860, term500860.getClass(), "defenderPrivateer", false);
        setBooleanField(term500860, term500860.getClass(), "orbitalInCombat", false);
        setIntField(term500860, term500860.getClass(), "starYear", 0);
        setBooleanField(term500860, term500860.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "isClearShot", argTypes, term500860, args);
    }

};


