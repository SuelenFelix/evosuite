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

public class Combat_isAbleToShoot_28702441729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507145;

    public Combat_isAbleToShoot_28702441729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507145 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term507145, term507145.getClass(), "combatShipList", null);
        setIntField(term507145, term507145.getClass(), "shipIndex", 0);
        setIntField(term507145, term507145.getClass(), "cursorX", 0);
        setIntField(term507145, term507145.getClass(), "cursorY", 0);
        setIntField(term507145, term507145.getClass(), "componentUse", 0);
        setField(term507145, term507145.getClass(), "animation", null);
        setField(term507145, term507145.getClass(), "attackerFleet", null);
        setField(term507145, term507145.getClass(), "defenderFleet", null);
        setField(term507145, term507145.getClass(), "starbaseFleet", null);
        setField(term507145, term507145.getClass(), "winner", null);
        setField(term507145, term507145.getClass(), "attackerInfo", null);
        setField(term507145, term507145.getClass(), "defenderInfo", null);
        setField(term507145, term507145.getClass(), "planet", null);
        setIntField(term507145, term507145.getClass(), "totalRounds", 0);
        setIntField(term507145, term507145.getClass(), "roundsNoDamge", 0);
        setBooleanField(term507145, term507145.getClass(), "endCombatHandled", false);
        setField(term507145, term507145.getClass(), "wormHole", null);
        setIntField(term507145, term507145.getClass(), "timerForWormHole", 0);
        setBooleanField(term507145, term507145.getClass(), "defenderEscaped", false);
        setBooleanField(term507145, term507145.getClass(), "attackerEscaped", false);
        setField(term507145, term507145.getClass(), "escapePosition", null);
        setField(term507145, term507145.getClass(), "combatEvent", null);
        setIntField(term507145, term507145.getClass(), "defenderMilitaryValue", 0);
        setIntField(term507145, term507145.getClass(), "attackerMilitaryValue", 0);
        setField(term507145, term507145.getClass(), "leaderKilledNews", null);
        setField(term507145, term507145.getClass(), "orbitalDestroyedNews", null);
        setField(term507145, term507145.getClass(), "leaderInCombat", null);
        setBooleanField(term507145, term507145.getClass(), "attackerPrivateer", false);
        setBooleanField(term507145, term507145.getClass(), "defenderPrivateer", false);
        setBooleanField(term507145, term507145.getClass(), "orbitalInCombat", false);
        setIntField(term507145, term507145.getClass(), "starYear", 0);
        setBooleanField(term507145, term507145.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "isAbleToShoot", argTypes, term507145, args);
    }

};


