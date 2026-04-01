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

public class DiplomaticTrade_minFive_162958261194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431308;
     Object term431314;

    public DiplomaticTrade_minFive_162958261194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431308 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431308, term431308.getClass(), "starMap", null);
        setIntField(term431308, term431308.getClass(), "first", 0);
        setIntField(term431308, term431308.getClass(), "second", 0);
        setField(term431308, term431308.getClass(), "firstOffer", null);
        setField(term431308, term431308.getClass(), "secondOffer", null);
        setField(term431308, term431308.getClass(), "techListForFirst", null);
        setField(term431308, term431308.getClass(), "techListForSecond", null);
        setField(term431308, term431308.getClass(), "fleetListForFirst", null);
        setField(term431308, term431308.getClass(), "fleetListForSecond", null);
        setField(term431308, term431308.getClass(), "planetListForFirst", null);
        setField(term431308, term431308.getClass(), "planetListForSecond", null);
        setBooleanField(term431308, term431308.getClass(), "diplomacyWithPirates", false);
        setField(term431308, term431308.getClass(), "majorDeals", null);
        setBooleanField(term431308, term431308.getClass(), "planetTraded", false);
        setBooleanField(term431308, term431308.getClass(), "giftTrade", false);
        term431314 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term431314;
        callMethod(klass, "minFive", argTypes, term431308, args);
    }

};


