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
import java.lang.Integer;

public class DiplomaticTrade_generateMapTrade_59910115020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2859356;
     Object term2859362;
     Object term2859364;

    public DiplomaticTrade_generateMapTrade_59910115020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2859356 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term2859356, term2859356.getClass(), "starMap", null);
        setIntField(term2859356, term2859356.getClass(), "first", 0);
        setIntField(term2859356, term2859356.getClass(), "second", 0);
        setField(term2859356, term2859356.getClass(), "firstOffer", null);
        setField(term2859356, term2859356.getClass(), "secondOffer", null);
        setField(term2859356, term2859356.getClass(), "techListForFirst", null);
        setField(term2859356, term2859356.getClass(), "techListForSecond", null);
        setField(term2859356, term2859356.getClass(), "fleetListForFirst", null);
        setField(term2859356, term2859356.getClass(), "fleetListForSecond", null);
        setField(term2859356, term2859356.getClass(), "planetListForFirst", null);
        setField(term2859356, term2859356.getClass(), "planetListForSecond", null);
        setBooleanField(term2859356, term2859356.getClass(), "diplomacyWithPirates", false);
        setField(term2859356, term2859356.getClass(), "majorDeals", null);
        setBooleanField(term2859356, term2859356.getClass(), "planetTraded", false);
        setBooleanField(term2859356, term2859356.getClass(), "giftTrade", false);
        term2859362 = new Integer(0);
        term2859364 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2859362;
        args[1] = term2859364;
        callMethod(klass, "generateMapTrade", argTypes, term2859356, args);
    }

};


