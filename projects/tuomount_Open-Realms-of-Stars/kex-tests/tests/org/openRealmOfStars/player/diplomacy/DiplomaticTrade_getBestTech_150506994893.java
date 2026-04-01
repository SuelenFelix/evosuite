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

public class DiplomaticTrade_getBestTech_150506994893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431302;

    public DiplomaticTrade_getBestTech_150506994893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431302 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431302, term431302.getClass(), "starMap", null);
        setIntField(term431302, term431302.getClass(), "first", 0);
        setIntField(term431302, term431302.getClass(), "second", 0);
        setField(term431302, term431302.getClass(), "firstOffer", null);
        setField(term431302, term431302.getClass(), "secondOffer", null);
        setField(term431302, term431302.getClass(), "techListForFirst", null);
        setField(term431302, term431302.getClass(), "techListForSecond", null);
        setField(term431302, term431302.getClass(), "fleetListForFirst", null);
        setField(term431302, term431302.getClass(), "fleetListForSecond", null);
        setField(term431302, term431302.getClass(), "planetListForFirst", null);
        setField(term431302, term431302.getClass(), "planetListForSecond", null);
        setBooleanField(term431302, term431302.getClass(), "diplomacyWithPirates", false);
        setField(term431302, term431302.getClass(), "majorDeals", null);
        setBooleanField(term431302, term431302.getClass(), "planetTraded", false);
        setBooleanField(term431302, term431302.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getBestTech", argTypes, term431302, args);
    }

};


