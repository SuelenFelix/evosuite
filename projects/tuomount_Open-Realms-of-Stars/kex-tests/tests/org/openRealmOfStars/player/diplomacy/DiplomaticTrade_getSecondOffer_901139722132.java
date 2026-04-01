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

public class DiplomaticTrade_getSecondOffer_901139722132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431548;

    public DiplomaticTrade_getSecondOffer_901139722132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431548 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431548, term431548.getClass(), "starMap", null);
        setIntField(term431548, term431548.getClass(), "first", 0);
        setIntField(term431548, term431548.getClass(), "second", 0);
        setField(term431548, term431548.getClass(), "firstOffer", null);
        setField(term431548, term431548.getClass(), "secondOffer", null);
        setField(term431548, term431548.getClass(), "techListForFirst", null);
        setField(term431548, term431548.getClass(), "techListForSecond", null);
        setField(term431548, term431548.getClass(), "fleetListForFirst", null);
        setField(term431548, term431548.getClass(), "fleetListForSecond", null);
        setField(term431548, term431548.getClass(), "planetListForFirst", null);
        setField(term431548, term431548.getClass(), "planetListForSecond", null);
        setBooleanField(term431548, term431548.getClass(), "diplomacyWithPirates", false);
        setField(term431548, term431548.getClass(), "majorDeals", null);
        setBooleanField(term431548, term431548.getClass(), "planetTraded", false);
        setBooleanField(term431548, term431548.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecondOffer", argTypes, term431548, args);
    }

};


