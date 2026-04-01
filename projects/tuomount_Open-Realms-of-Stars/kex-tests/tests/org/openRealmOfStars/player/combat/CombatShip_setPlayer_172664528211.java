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

public class CombatShip_setPlayer_172664528211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455413;

    public CombatShip_setPlayer_172664528211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455413 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term455413, term455413.getClass(), "ship", null);
        setField(term455413, term455413.getClass(), "componentUsed", null);
        setIntField(term455413, term455413.getClass(), "x", 0);
        setIntField(term455413, term455413.getClass(), "y", 0);
        setField(term455413, term455413.getClass(), "player", null);
        setBooleanField(term455413, term455413.getClass(), "flipY", false);
        setIntField(term455413, term455413.getClass(), "movesLeft", 0);
        setIntField(term455413, term455413.getClass(), "aiShotsLeft", 0);
        setIntField(term455413, term455413.getClass(), "bonusAccuracy", 0);
        setIntField(term455413, term455413.getClass(), "overloadedJammer", 0);
        setIntField(term455413, term455413.getClass(), "overloadedComputer", 0);
        setBooleanField(term455413, term455413.getClass(), "damaged", false);
        setIntField(term455413, term455413.getClass(), "privateeredCredits", 0);
        setField(term455413, term455413.getClass(), "commander", null);
        setIntField(term455413, term455413.getClass(), "overloadFailure", 0);
        setIntField(term455413, term455413.getClass(), "energyLevel", 0);
        setBooleanField(term455413, term455413.getClass(), "isOverloaded", false);
        setBooleanField(term455413, term455413.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayer", argTypes, term455413, args);
    }

};


