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

public class DiplomaticTrade_getTradeablePlanet_53221193533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243468;

    public DiplomaticTrade_getTradeablePlanet_53221193533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243468 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term243468, term243468.getClass(), "starMap", null);
        setIntField(term243468, term243468.getClass(), "first", 0);
        setIntField(term243468, term243468.getClass(), "second", 0);
        setField(term243468, term243468.getClass(), "firstOffer", null);
        setField(term243468, term243468.getClass(), "secondOffer", null);
        setField(term243468, term243468.getClass(), "techListForFirst", null);
        setField(term243468, term243468.getClass(), "techListForSecond", null);
        setField(term243468, term243468.getClass(), "fleetListForFirst", null);
        setField(term243468, term243468.getClass(), "fleetListForSecond", null);
        setField(term243468, term243468.getClass(), "planetListForFirst", null);
        setField(term243468, term243468.getClass(), "planetListForSecond", null);
        setBooleanField(term243468, term243468.getClass(), "diplomacyWithPirates", false);
        setField(term243468, term243468.getClass(), "majorDeals", null);
        setBooleanField(term243468, term243468.getClass(), "planetTraded", false);
        setBooleanField(term243468, term243468.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getTradeablePlanet", argTypes, term243468, args);
    }

};


