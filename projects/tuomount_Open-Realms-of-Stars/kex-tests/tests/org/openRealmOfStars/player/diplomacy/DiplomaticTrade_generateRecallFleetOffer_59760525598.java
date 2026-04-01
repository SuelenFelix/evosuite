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

public class DiplomaticTrade_generateRecallFleetOffer_59760525598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431340;

    public DiplomaticTrade_generateRecallFleetOffer_59760525598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431340 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431340, term431340.getClass(), "starMap", null);
        setIntField(term431340, term431340.getClass(), "first", 0);
        setIntField(term431340, term431340.getClass(), "second", 0);
        setField(term431340, term431340.getClass(), "firstOffer", null);
        setField(term431340, term431340.getClass(), "secondOffer", null);
        setField(term431340, term431340.getClass(), "techListForFirst", null);
        setField(term431340, term431340.getClass(), "techListForSecond", null);
        setField(term431340, term431340.getClass(), "fleetListForFirst", null);
        setField(term431340, term431340.getClass(), "fleetListForSecond", null);
        setField(term431340, term431340.getClass(), "planetListForFirst", null);
        setField(term431340, term431340.getClass(), "planetListForSecond", null);
        setBooleanField(term431340, term431340.getClass(), "diplomacyWithPirates", false);
        setField(term431340, term431340.getClass(), "majorDeals", null);
        setBooleanField(term431340, term431340.getClass(), "planetTraded", false);
        setBooleanField(term431340, term431340.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "generateRecallFleetOffer", argTypes, term431340, args);
    }

};


