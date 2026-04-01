package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DiplomaticTrade_calculatePlanetValue_191749514931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233800;

    public DiplomaticTrade_calculatePlanetValue_191749514931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233800 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term233800, term233800.getClass(), "starMap", null);
        setIntField(term233800, term233800.getClass(), "first", 0);
        setIntField(term233800, term233800.getClass(), "second", 0);
        setField(term233800, term233800.getClass(), "firstOffer", null);
        setField(term233800, term233800.getClass(), "secondOffer", null);
        setField(term233800, term233800.getClass(), "techListForFirst", null);
        setField(term233800, term233800.getClass(), "techListForSecond", null);
        setField(term233800, term233800.getClass(), "fleetListForFirst", null);
        setField(term233800, term233800.getClass(), "fleetListForSecond", null);
        setField(term233800, term233800.getClass(), "planetListForFirst", null);
        setField(term233800, term233800.getClass(), "planetListForSecond", null);
        setBooleanField(term233800, term233800.getClass(), "diplomacyWithPirates", false);
        setField(term233800, term233800.getClass(), "majorDeals", null);
        setBooleanField(term233800, term233800.getClass(), "planetTraded", false);
        setBooleanField(term233800, term233800.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "calculatePlanetValue", argTypes, term233800, args);
    }

};


