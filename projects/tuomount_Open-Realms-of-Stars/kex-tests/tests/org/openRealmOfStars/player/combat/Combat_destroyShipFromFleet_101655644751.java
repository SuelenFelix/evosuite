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

public class Combat_destroyShipFromFleet_101655644751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191920;

    public Combat_destroyShipFromFleet_101655644751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191920 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term191920, term191920.getClass(), "combatShipList", null);
        setIntField(term191920, term191920.getClass(), "shipIndex", 0);
        setIntField(term191920, term191920.getClass(), "cursorX", 0);
        setIntField(term191920, term191920.getClass(), "cursorY", 0);
        setIntField(term191920, term191920.getClass(), "componentUse", 0);
        setField(term191920, term191920.getClass(), "animation", null);
        setField(term191920, term191920.getClass(), "attackerFleet", null);
        setField(term191920, term191920.getClass(), "defenderFleet", null);
        setField(term191920, term191920.getClass(), "starbaseFleet", null);
        setField(term191920, term191920.getClass(), "winner", null);
        setField(term191920, term191920.getClass(), "attackerInfo", null);
        setField(term191920, term191920.getClass(), "defenderInfo", null);
        setField(term191920, term191920.getClass(), "planet", null);
        setIntField(term191920, term191920.getClass(), "totalRounds", 0);
        setIntField(term191920, term191920.getClass(), "roundsNoDamge", 0);
        setBooleanField(term191920, term191920.getClass(), "endCombatHandled", false);
        setField(term191920, term191920.getClass(), "wormHole", null);
        setIntField(term191920, term191920.getClass(), "timerForWormHole", 0);
        setBooleanField(term191920, term191920.getClass(), "defenderEscaped", false);
        setBooleanField(term191920, term191920.getClass(), "attackerEscaped", false);
        setField(term191920, term191920.getClass(), "escapePosition", null);
        setField(term191920, term191920.getClass(), "combatEvent", null);
        setIntField(term191920, term191920.getClass(), "defenderMilitaryValue", 0);
        setIntField(term191920, term191920.getClass(), "attackerMilitaryValue", 0);
        setField(term191920, term191920.getClass(), "leaderKilledNews", null);
        setField(term191920, term191920.getClass(), "orbitalDestroyedNews", null);
        setField(term191920, term191920.getClass(), "leaderInCombat", null);
        setBooleanField(term191920, term191920.getClass(), "attackerPrivateer", false);
        setBooleanField(term191920, term191920.getClass(), "defenderPrivateer", false);
        setBooleanField(term191920, term191920.getClass(), "orbitalInCombat", false);
        setIntField(term191920, term191920.getClass(), "starYear", 0);
        setBooleanField(term191920, term191920.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "destroyShipFromFleet", argTypes, term191920, args);
    }

};


