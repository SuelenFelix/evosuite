package org.openRealmOfStars.player.fleet;

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
import static org.openRealmOfStars.player.fleet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fleet_aiUpgradeShips_206658570787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191654;

    public Fleet_aiUpgradeShips_206658570787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191654 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term191654, term191654.getClass(), "ships", null);
        setField(term191654, term191654.getClass(), "coordinate", null);
        setField(term191654, term191654.getClass(), "name", null);
        setIntField(term191654, term191654.getClass(), "movesLeft", 0);
        setField(term191654, term191654.getClass(), "route", null);
        setField(term191654, term191654.getClass(), "commander", null);
        setField(term191654, term191654.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "aiUpgradeShips", argTypes, term191654, args);
    }

};


