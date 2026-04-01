package org.openRealmOfStars.ai.planet;

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
import static org.openRealmOfStars.ai.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DefaultScoring_scoreTradeShip_2148756677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260477;
     Object term260478;

    public DefaultScoring_scoreTradeShip_2148756677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260477 = newInstance(Class.forName("org.openRealmOfStars.ai.planet.DefaultScoring"));
        term260478 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.planet.DefaultScoring");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[4] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[5] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        Object[] args = new Object[6];
        args[0] = term260478;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "scoreTradeShip", argTypes, term260477, args);
    }

};


