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

public class DiplomaticTrade_generateGift_47484187816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2842400;

    public DiplomaticTrade_generateGift_47484187816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2842400 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term2842400, term2842400.getClass(), "starMap", null);
        setIntField(term2842400, term2842400.getClass(), "first", 0);
        setIntField(term2842400, term2842400.getClass(), "second", 0);
        setField(term2842400, term2842400.getClass(), "firstOffer", null);
        setField(term2842400, term2842400.getClass(), "secondOffer", null);
        setField(term2842400, term2842400.getClass(), "techListForFirst", null);
        setField(term2842400, term2842400.getClass(), "techListForSecond", null);
        setField(term2842400, term2842400.getClass(), "fleetListForFirst", null);
        setField(term2842400, term2842400.getClass(), "fleetListForSecond", null);
        setField(term2842400, term2842400.getClass(), "planetListForFirst", null);
        setField(term2842400, term2842400.getClass(), "planetListForSecond", null);
        setBooleanField(term2842400, term2842400.getClass(), "diplomacyWithPirates", false);
        setField(term2842400, term2842400.getClass(), "majorDeals", null);
        setBooleanField(term2842400, term2842400.getClass(), "planetTraded", false);
        setBooleanField(term2842400, term2842400.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "generateGift", argTypes, term2842400, args);
    }

};


