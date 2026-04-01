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

public class DiplomaticTrade_getTradeablePlanetListForSecond_198855056981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415325;

    public DiplomaticTrade_getTradeablePlanetListForSecond_198855056981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415325 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term415325, term415325.getClass(), "starMap", null);
        setIntField(term415325, term415325.getClass(), "first", 0);
        setIntField(term415325, term415325.getClass(), "second", 0);
        setField(term415325, term415325.getClass(), "firstOffer", null);
        setField(term415325, term415325.getClass(), "secondOffer", null);
        setField(term415325, term415325.getClass(), "techListForFirst", null);
        setField(term415325, term415325.getClass(), "techListForSecond", null);
        setField(term415325, term415325.getClass(), "fleetListForFirst", null);
        setField(term415325, term415325.getClass(), "fleetListForSecond", null);
        setField(term415325, term415325.getClass(), "planetListForFirst", null);
        setField(term415325, term415325.getClass(), "planetListForSecond", null);
        setBooleanField(term415325, term415325.getClass(), "diplomacyWithPirates", false);
        setField(term415325, term415325.getClass(), "majorDeals", null);
        setBooleanField(term415325, term415325.getClass(), "planetTraded", false);
        setBooleanField(term415325, term415325.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeablePlanetListForSecond", argTypes, term415325, args);
    }

};


