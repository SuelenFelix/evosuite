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

public class Combat_handlePrivateerShip_708569511157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405545;

    public Combat_handlePrivateerShip_708569511157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405545 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term405545, term405545.getClass(), "combatShipList", null);
        setIntField(term405545, term405545.getClass(), "shipIndex", 0);
        setIntField(term405545, term405545.getClass(), "cursorX", 0);
        setIntField(term405545, term405545.getClass(), "cursorY", 0);
        setIntField(term405545, term405545.getClass(), "componentUse", 0);
        setField(term405545, term405545.getClass(), "animation", null);
        setField(term405545, term405545.getClass(), "attackerFleet", null);
        setField(term405545, term405545.getClass(), "defenderFleet", null);
        setField(term405545, term405545.getClass(), "starbaseFleet", null);
        setField(term405545, term405545.getClass(), "winner", null);
        setField(term405545, term405545.getClass(), "attackerInfo", null);
        setField(term405545, term405545.getClass(), "defenderInfo", null);
        setField(term405545, term405545.getClass(), "planet", null);
        setIntField(term405545, term405545.getClass(), "totalRounds", 0);
        setIntField(term405545, term405545.getClass(), "roundsNoDamge", 0);
        setBooleanField(term405545, term405545.getClass(), "endCombatHandled", false);
        setField(term405545, term405545.getClass(), "wormHole", null);
        setIntField(term405545, term405545.getClass(), "timerForWormHole", 0);
        setBooleanField(term405545, term405545.getClass(), "defenderEscaped", false);
        setBooleanField(term405545, term405545.getClass(), "attackerEscaped", false);
        setField(term405545, term405545.getClass(), "escapePosition", null);
        setField(term405545, term405545.getClass(), "combatEvent", null);
        setIntField(term405545, term405545.getClass(), "defenderMilitaryValue", 0);
        setIntField(term405545, term405545.getClass(), "attackerMilitaryValue", 0);
        setField(term405545, term405545.getClass(), "leaderKilledNews", null);
        setField(term405545, term405545.getClass(), "orbitalDestroyedNews", null);
        setField(term405545, term405545.getClass(), "leaderInCombat", null);
        setBooleanField(term405545, term405545.getClass(), "attackerPrivateer", false);
        setBooleanField(term405545, term405545.getClass(), "defenderPrivateer", false);
        setBooleanField(term405545, term405545.getClass(), "orbitalInCombat", false);
        setIntField(term405545, term405545.getClass(), "starYear", 0);
        setBooleanField(term405545, term405545.getClass(), "worthOfWarHero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.Combat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.Logger");
        argTypes[1] = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "handlePrivateerShip", argTypes, term405545, args);
    }

};


