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

public class Combat_getMostPowerfulShip_57947634036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124221;

    public Combat_getMostPowerfulShip_57947634036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124221 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term124221, term124221.getClass(), "combatShipList", null);
        setIntField(term124221, term124221.getClass(), "shipIndex", 0);
        setIntField(term124221, term124221.getClass(), "cursorX", 0);
        setIntField(term124221, term124221.getClass(), "cursorY", 0);
        setIntField(term124221, term124221.getClass(), "componentUse", 0);
        setField(term124221, term124221.getClass(), "animation", null);
        setField(term124221, term124221.getClass(), "attackerFleet", null);
        setField(term124221, term124221.getClass(), "defenderFleet", null);
        setField(term124221, term124221.getClass(), "starbaseFleet", null);
        setField(term124221, term124221.getClass(), "winner", null);
        setField(term124221, term124221.getClass(), "attackerInfo", null);
        setField(term124221, term124221.getClass(), "defenderInfo", null);
        setField(term124221, term124221.getClass(), "planet", null);
        setIntField(term124221, term124221.getClass(), "totalRounds", 0);
        setIntField(term124221, term124221.getClass(), "roundsNoDamge", 0);
        setBooleanField(term124221, term124221.getClass(), "endCombatHandled", false);
        setField(term124221, term124221.getClass(), "wormHole", null);
        setIntField(term124221, term124221.getClass(), "timerForWormHole", 0);
        setBooleanField(term124221, term124221.getClass(), "defenderEscaped", false);
        setBooleanField(term124221, term124221.getClass(), "attackerEscaped", false);
        setField(term124221, term124221.getClass(), "escapePosition", null);
        setField(term124221, term124221.getClass(), "combatEvent", null);
        setIntField(term124221, term124221.getClass(), "defenderMilitaryValue", 0);
        setIntField(term124221, term124221.getClass(), "attackerMilitaryValue", 0);
        setField(term124221, term124221.getClass(), "leaderKilledNews", null);
        setField(term124221, term124221.getClass(), "orbitalDestroyedNews", null);
        setField(term124221, term124221.getClass(), "leaderInCombat", null);
        setBooleanField(term124221, term124221.getClass(), "attackerPrivateer", false);
        setBooleanField(term124221, term124221.getClass(), "defenderPrivateer", false);
        setBooleanField(term124221, term124221.getClass(), "orbitalInCombat", false);
        setIntField(term124221, term124221.getClass(), "starYear", 0);
        setBooleanField(term124221, term124221.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getMostPowerfulShip", argTypes, term124221, args);
    }

};


