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

public class DiplomaticTrade_getPossibleTradeEmbargo_1689635837103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116336;

    public DiplomaticTrade_getPossibleTradeEmbargo_1689635837103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116336 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term3116336, term3116336.getClass(), "starMap", null);
        setIntField(term3116336, term3116336.getClass(), "first", 0);
        setIntField(term3116336, term3116336.getClass(), "second", 0);
        setField(term3116336, term3116336.getClass(), "firstOffer", null);
        setField(term3116336, term3116336.getClass(), "secondOffer", null);
        setField(term3116336, term3116336.getClass(), "techListForFirst", null);
        setField(term3116336, term3116336.getClass(), "techListForSecond", null);
        setField(term3116336, term3116336.getClass(), "fleetListForFirst", null);
        setField(term3116336, term3116336.getClass(), "fleetListForSecond", null);
        setField(term3116336, term3116336.getClass(), "planetListForFirst", null);
        setField(term3116336, term3116336.getClass(), "planetListForSecond", null);
        setBooleanField(term3116336, term3116336.getClass(), "diplomacyWithPirates", false);
        setField(term3116336, term3116336.getClass(), "majorDeals", null);
        setBooleanField(term3116336, term3116336.getClass(), "planetTraded", false);
        setBooleanField(term3116336, term3116336.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPossibleTradeEmbargo", argTypes, term3116336, args);
    }

};


