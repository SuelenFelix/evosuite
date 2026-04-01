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

public class DiplomaticTrade_minFive_162958261196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116290;
     Object term3116296;

    public DiplomaticTrade_minFive_162958261196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116290 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term3116290, term3116290.getClass(), "starMap", null);
        setIntField(term3116290, term3116290.getClass(), "first", 0);
        setIntField(term3116290, term3116290.getClass(), "second", 0);
        setField(term3116290, term3116290.getClass(), "firstOffer", null);
        setField(term3116290, term3116290.getClass(), "secondOffer", null);
        setField(term3116290, term3116290.getClass(), "techListForFirst", null);
        setField(term3116290, term3116290.getClass(), "techListForSecond", null);
        setField(term3116290, term3116290.getClass(), "fleetListForFirst", null);
        setField(term3116290, term3116290.getClass(), "fleetListForSecond", null);
        setField(term3116290, term3116290.getClass(), "planetListForFirst", null);
        setField(term3116290, term3116290.getClass(), "planetListForSecond", null);
        setBooleanField(term3116290, term3116290.getClass(), "diplomacyWithPirates", false);
        setField(term3116290, term3116290.getClass(), "majorDeals", null);
        setBooleanField(term3116290, term3116290.getClass(), "planetTraded", false);
        setBooleanField(term3116290, term3116290.getClass(), "giftTrade", false);
        term3116296 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3116296;
        callMethod(klass, "minFive", argTypes, term3116290, args);
    }

};


