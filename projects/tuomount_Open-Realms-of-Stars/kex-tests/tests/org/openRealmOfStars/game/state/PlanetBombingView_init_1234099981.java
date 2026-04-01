package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PlanetBombingView_init_1234099981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100329;

    public PlanetBombingView_init_1234099981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100329 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term100329;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


