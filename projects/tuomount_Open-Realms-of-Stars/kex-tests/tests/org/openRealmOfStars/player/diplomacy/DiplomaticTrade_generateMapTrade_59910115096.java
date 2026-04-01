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

public class DiplomaticTrade_generateMapTrade_59910115096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431324;
     Object term431330;
     Object term431332;

    public DiplomaticTrade_generateMapTrade_59910115096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431324 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431324, term431324.getClass(), "starMap", null);
        setIntField(term431324, term431324.getClass(), "first", 0);
        setIntField(term431324, term431324.getClass(), "second", 0);
        setField(term431324, term431324.getClass(), "firstOffer", null);
        setField(term431324, term431324.getClass(), "secondOffer", null);
        setField(term431324, term431324.getClass(), "techListForFirst", null);
        setField(term431324, term431324.getClass(), "techListForSecond", null);
        setField(term431324, term431324.getClass(), "fleetListForFirst", null);
        setField(term431324, term431324.getClass(), "fleetListForSecond", null);
        setField(term431324, term431324.getClass(), "planetListForFirst", null);
        setField(term431324, term431324.getClass(), "planetListForSecond", null);
        setBooleanField(term431324, term431324.getClass(), "diplomacyWithPirates", false);
        setField(term431324, term431324.getClass(), "majorDeals", null);
        setBooleanField(term431324, term431324.getClass(), "planetTraded", false);
        setBooleanField(term431324, term431324.getClass(), "giftTrade", false);
        term431330 = new Integer(0);
        term431332 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term431330;
        args[1] = term431332;
        callMethod(klass, "generateMapTrade", argTypes, term431324, args);
    }

};


