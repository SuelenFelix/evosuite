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

public class DiplomaticTrade_generateTechTrade_188630895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431316;
     Object term431322;

    public DiplomaticTrade_generateTechTrade_188630895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431316 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431316, term431316.getClass(), "starMap", null);
        setIntField(term431316, term431316.getClass(), "first", 0);
        setIntField(term431316, term431316.getClass(), "second", 0);
        setField(term431316, term431316.getClass(), "firstOffer", null);
        setField(term431316, term431316.getClass(), "secondOffer", null);
        setField(term431316, term431316.getClass(), "techListForFirst", null);
        setField(term431316, term431316.getClass(), "techListForSecond", null);
        setField(term431316, term431316.getClass(), "fleetListForFirst", null);
        setField(term431316, term431316.getClass(), "fleetListForSecond", null);
        setField(term431316, term431316.getClass(), "planetListForFirst", null);
        setField(term431316, term431316.getClass(), "planetListForSecond", null);
        setBooleanField(term431316, term431316.getClass(), "diplomacyWithPirates", false);
        setField(term431316, term431316.getClass(), "majorDeals", null);
        setBooleanField(term431316, term431316.getClass(), "planetTraded", false);
        setBooleanField(term431316, term431316.getClass(), "giftTrade", false);
        term431322 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term431322;
        callMethod(klass, "generateTechTrade", argTypes, term431316, args);
    }

};


