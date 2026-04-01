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

public class Combat_areCloakedShips_159517491138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135717;

    public Combat_areCloakedShips_159517491138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135717 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term135717, term135717.getClass(), "combatShipList", null);
        setIntField(term135717, term135717.getClass(), "shipIndex", 0);
        setIntField(term135717, term135717.getClass(), "cursorX", 0);
        setIntField(term135717, term135717.getClass(), "cursorY", 0);
        setIntField(term135717, term135717.getClass(), "componentUse", 0);
        setField(term135717, term135717.getClass(), "animation", null);
        setField(term135717, term135717.getClass(), "attackerFleet", null);
        setField(term135717, term135717.getClass(), "defenderFleet", null);
        setField(term135717, term135717.getClass(), "starbaseFleet", null);
        setField(term135717, term135717.getClass(), "winner", null);
        setField(term135717, term135717.getClass(), "attackerInfo", null);
        setField(term135717, term135717.getClass(), "defenderInfo", null);
        setField(term135717, term135717.getClass(), "planet", null);
        setIntField(term135717, term135717.getClass(), "totalRounds", 0);
        setIntField(term135717, term135717.getClass(), "roundsNoDamge", 0);
        setBooleanField(term135717, term135717.getClass(), "endCombatHandled", false);
        setField(term135717, term135717.getClass(), "wormHole", null);
        setIntField(term135717, term135717.getClass(), "timerForWormHole", 0);
        setBooleanField(term135717, term135717.getClass(), "defenderEscaped", false);
        setBooleanField(term135717, term135717.getClass(), "attackerEscaped", false);
        setField(term135717, term135717.getClass(), "escapePosition", null);
        setField(term135717, term135717.getClass(), "combatEvent", null);
        setIntField(term135717, term135717.getClass(), "defenderMilitaryValue", 0);
        setIntField(term135717, term135717.getClass(), "attackerMilitaryValue", 0);
        setField(term135717, term135717.getClass(), "leaderKilledNews", null);
        setField(term135717, term135717.getClass(), "orbitalDestroyedNews", null);
        setField(term135717, term135717.getClass(), "leaderInCombat", null);
        setBooleanField(term135717, term135717.getClass(), "attackerPrivateer", false);
        setBooleanField(term135717, term135717.getClass(), "defenderPrivateer", false);
        setBooleanField(term135717, term135717.getClass(), "orbitalInCombat", false);
        setIntField(term135717, term135717.getClass(), "starYear", 0);
        setBooleanField(term135717, term135717.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "areCloakedShips", argTypes, term135717, args);
    }

};


