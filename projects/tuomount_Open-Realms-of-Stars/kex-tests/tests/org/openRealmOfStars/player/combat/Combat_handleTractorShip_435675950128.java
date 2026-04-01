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

public class Combat_handleTractorShip_435675950128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349096;

    public Combat_handleTractorShip_435675950128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349096 = newInstance(Class.forName("org.openRealmOfStars.player.combat.Combat"));
        setField(term349096, term349096.getClass(), "combatShipList", null);
        setIntField(term349096, term349096.getClass(), "shipIndex", 0);
        setIntField(term349096, term349096.getClass(), "cursorX", 0);
        setIntField(term349096, term349096.getClass(), "cursorY", 0);
        setIntField(term349096, term349096.getClass(), "componentUse", 0);
        setField(term349096, term349096.getClass(), "animation", null);
        setField(term349096, term349096.getClass(), "attackerFleet", null);
        setField(term349096, term349096.getClass(), "defenderFleet", null);
        setField(term349096, term349096.getClass(), "starbaseFleet", null);
        setField(term349096, term349096.getClass(), "winner", null);
        setField(term349096, term349096.getClass(), "attackerInfo", null);
        setField(term349096, term349096.getClass(), "defenderInfo", null);
        setField(term349096, term349096.getClass(), "planet", null);
        setIntField(term349096, term349096.getClass(), "totalRounds", 0);
        setIntField(term349096, term349096.getClass(), "roundsNoDamge", 0);
        setBooleanField(term349096, term349096.getClass(), "endCombatHandled", false);
        setField(term349096, term349096.getClass(), "wormHole", null);
        setIntField(term349096, term349096.getClass(), "timerForWormHole", 0);
        setBooleanField(term349096, term349096.getClass(), "defenderEscaped", false);
        setBooleanField(term349096, term349096.getClass(), "attackerEscaped", false);
        setField(term349096, term349096.getClass(), "escapePosition", null);
        setField(term349096, term349096.getClass(), "combatEvent", null);
        setIntField(term349096, term349096.getClass(), "defenderMilitaryValue", 0);
        setIntField(term349096, term349096.getClass(), "attackerMilitaryValue", 0);
        setField(term349096, term349096.getClass(), "leaderKilledNews", null);
        setField(term349096, term349096.getClass(), "orbitalDestroyedNews", null);
        setField(term349096, term349096.getClass(), "leaderInCombat", null);
        setBooleanField(term349096, term349096.getClass(), "attackerPrivateer", false);
        setBooleanField(term349096, term349096.getClass(), "defenderPrivateer", false);
        setBooleanField(term349096, term349096.getClass(), "orbitalInCombat", false);
        setIntField(term349096, term349096.getClass(), "starYear", 0);
        setBooleanField(term349096, term349096.getClass(), "worthOfWarHero", false);
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
        callMethod(klass, "handleTractorShip", argTypes, term349096, args);
    }

};


