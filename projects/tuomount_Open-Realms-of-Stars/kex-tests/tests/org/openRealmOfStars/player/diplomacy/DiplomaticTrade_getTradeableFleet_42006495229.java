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

public class DiplomaticTrade_getTradeableFleet_42006495229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219654;

    public DiplomaticTrade_getTradeableFleet_42006495229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219654 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term219654, term219654.getClass(), "starMap", null);
        setIntField(term219654, term219654.getClass(), "first", 0);
        setIntField(term219654, term219654.getClass(), "second", 0);
        setField(term219654, term219654.getClass(), "firstOffer", null);
        setField(term219654, term219654.getClass(), "secondOffer", null);
        setField(term219654, term219654.getClass(), "techListForFirst", null);
        setField(term219654, term219654.getClass(), "techListForSecond", null);
        setField(term219654, term219654.getClass(), "fleetListForFirst", null);
        setField(term219654, term219654.getClass(), "fleetListForSecond", null);
        setField(term219654, term219654.getClass(), "planetListForFirst", null);
        setField(term219654, term219654.getClass(), "planetListForSecond", null);
        setBooleanField(term219654, term219654.getClass(), "diplomacyWithPirates", false);
        setField(term219654, term219654.getClass(), "majorDeals", null);
        setBooleanField(term219654, term219654.getClass(), "planetTraded", false);
        setBooleanField(term219654, term219654.getClass(), "giftTrade", false);
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
        callMethod(klass, "getTradeableFleet", argTypes, term219654, args);
    }

};


