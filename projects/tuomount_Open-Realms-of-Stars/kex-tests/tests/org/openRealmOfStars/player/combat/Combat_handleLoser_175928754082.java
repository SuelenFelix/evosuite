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

public class Combat_handleLoser_175928754082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683717;

    public Combat_handleLoser_175928754082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683717 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term683717, term683717.getClass(), "combatShipList", null);
        setIntField(term683717, term683717.getClass(), "shipIndex", 0);
        setIntField(term683717, term683717.getClass(), "cursorX", 0);
        setIntField(term683717, term683717.getClass(), "cursorY", 0);
        setIntField(term683717, term683717.getClass(), "componentUse", 0);
        setField(term683717, term683717.getClass(), "animation", null);
        setField(term683717, term683717.getClass(), "attackerFleet", null);
        setField(term683717, term683717.getClass(), "defenderFleet", null);
        setField(term683717, term683717.getClass(), "starbaseFleet", null);
        setField(term683717, term683717.getClass(), "winner", null);
        setField(term683717, term683717.getClass(), "attackerInfo", null);
        setField(term683717, term683717.getClass(), "defenderInfo", null);
        setField(term683717, term683717.getClass(), "planet", null);
        setIntField(term683717, term683717.getClass(), "totalRounds", 0);
        setIntField(term683717, term683717.getClass(), "roundsNoDamge", 0);
        setBooleanField(term683717, term683717.getClass(), "endCombatHandled", false);
        setField(term683717, term683717.getClass(), "wormHole", null);
        setIntField(term683717, term683717.getClass(), "timerForWormHole", 0);
        setBooleanField(term683717, term683717.getClass(), "defenderEscaped", false);
        setBooleanField(term683717, term683717.getClass(), "attackerEscaped", false);
        setField(term683717, term683717.getClass(), "escapePosition", null);
        setField(term683717, term683717.getClass(), "combatEvent", null);
        setIntField(term683717, term683717.getClass(), "defenderMilitaryValue", 0);
        setIntField(term683717, term683717.getClass(), "attackerMilitaryValue", 0);
        setField(term683717, term683717.getClass(), "leaderKilledNews", null);
        setField(term683717, term683717.getClass(), "orbitalDestroyedNews", null);
        setField(term683717, term683717.getClass(), "leaderInCombat", null);
        setBooleanField(term683717, term683717.getClass(), "attackerPrivateer", false);
        setBooleanField(term683717, term683717.getClass(), "defenderPrivateer", false);
        setBooleanField(term683717, term683717.getClass(), "orbitalInCombat", false);
        setIntField(term683717, term683717.getClass(), "starYear", 0);
        setBooleanField(term683717, term683717.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleLoser", argTypes, term683717, args);
    }

};


