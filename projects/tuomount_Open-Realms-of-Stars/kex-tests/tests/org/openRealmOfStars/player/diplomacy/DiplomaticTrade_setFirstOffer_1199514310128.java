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

public class DiplomaticTrade_setFirstOffer_1199514310128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116490;

    public DiplomaticTrade_setFirstOffer_1199514310128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116490 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term3116490, term3116490.getClass(), "starMap", null);
        setIntField(term3116490, term3116490.getClass(), "first", 0);
        setIntField(term3116490, term3116490.getClass(), "second", 0);
        setField(term3116490, term3116490.getClass(), "firstOffer", null);
        setField(term3116490, term3116490.getClass(), "secondOffer", null);
        setField(term3116490, term3116490.getClass(), "techListForFirst", null);
        setField(term3116490, term3116490.getClass(), "techListForSecond", null);
        setField(term3116490, term3116490.getClass(), "fleetListForFirst", null);
        setField(term3116490, term3116490.getClass(), "fleetListForSecond", null);
        setField(term3116490, term3116490.getClass(), "planetListForFirst", null);
        setField(term3116490, term3116490.getClass(), "planetListForSecond", null);
        setBooleanField(term3116490, term3116490.getClass(), "diplomacyWithPirates", false);
        setField(term3116490, term3116490.getClass(), "majorDeals", null);
        setBooleanField(term3116490, term3116490.getClass(), "planetTraded", false);
        setBooleanField(term3116490, term3116490.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstOffer", argTypes, term3116490, args);
    }

};


