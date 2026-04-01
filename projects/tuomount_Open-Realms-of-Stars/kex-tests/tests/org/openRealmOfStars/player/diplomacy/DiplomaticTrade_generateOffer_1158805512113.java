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

public class DiplomaticTrade_generateOffer_1158805512113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116396;

    public DiplomaticTrade_generateOffer_1158805512113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116396 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term3116396, term3116396.getClass(), "starMap", null);
        setIntField(term3116396, term3116396.getClass(), "first", 0);
        setIntField(term3116396, term3116396.getClass(), "second", 0);
        setField(term3116396, term3116396.getClass(), "firstOffer", null);
        setField(term3116396, term3116396.getClass(), "secondOffer", null);
        setField(term3116396, term3116396.getClass(), "techListForFirst", null);
        setField(term3116396, term3116396.getClass(), "techListForSecond", null);
        setField(term3116396, term3116396.getClass(), "fleetListForFirst", null);
        setField(term3116396, term3116396.getClass(), "fleetListForSecond", null);
        setField(term3116396, term3116396.getClass(), "planetListForFirst", null);
        setField(term3116396, term3116396.getClass(), "planetListForSecond", null);
        setBooleanField(term3116396, term3116396.getClass(), "diplomacyWithPirates", false);
        setField(term3116396, term3116396.getClass(), "majorDeals", null);
        setBooleanField(term3116396, term3116396.getClass(), "planetTraded", false);
        setBooleanField(term3116396, term3116396.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateOffer", argTypes, term3116396, args);
    }

};


