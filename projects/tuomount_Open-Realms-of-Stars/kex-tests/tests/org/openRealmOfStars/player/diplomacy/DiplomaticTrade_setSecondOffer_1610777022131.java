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

public class DiplomaticTrade_setSecondOffer_1610777022131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431542;

    public DiplomaticTrade_setSecondOffer_1610777022131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431542 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431542, term431542.getClass(), "starMap", null);
        setIntField(term431542, term431542.getClass(), "first", 0);
        setIntField(term431542, term431542.getClass(), "second", 0);
        setField(term431542, term431542.getClass(), "firstOffer", null);
        setField(term431542, term431542.getClass(), "secondOffer", null);
        setField(term431542, term431542.getClass(), "techListForFirst", null);
        setField(term431542, term431542.getClass(), "techListForSecond", null);
        setField(term431542, term431542.getClass(), "fleetListForFirst", null);
        setField(term431542, term431542.getClass(), "fleetListForSecond", null);
        setField(term431542, term431542.getClass(), "planetListForFirst", null);
        setField(term431542, term431542.getClass(), "planetListForSecond", null);
        setBooleanField(term431542, term431542.getClass(), "diplomacyWithPirates", false);
        setField(term431542, term431542.getClass(), "majorDeals", null);
        setBooleanField(term431542, term431542.getClass(), "planetTraded", false);
        setBooleanField(term431542, term431542.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSecondOffer", argTypes, term431542, args);
    }

};


