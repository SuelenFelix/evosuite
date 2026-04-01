package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StarMapUtilities_doTradeWithShips_83461503019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3623636;
     Object term3623637;

    public StarMapUtilities_doTradeWithShips_83461503019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3623636 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapUtilities"));
        term3623637 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[4] = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term3623637;
        callMethod(klass, "doTradeWithShips", argTypes, term3623636, args);
    }

};


