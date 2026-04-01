package org.openRealmOfStars.player;

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
import static org.openRealmOfStars.player.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerList_getPossibleStartingScenarios_83773687132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2775282;

    public PlayerList_getPossibleStartingScenarios_83773687132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2775282 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term2775282, term2775282.getClass(), "list", null);
        setIntField(term2775282, term2775282.getClass(), "currentPlayer", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPossibleStartingScenarios", argTypes, term2775282, args);
    }

};


