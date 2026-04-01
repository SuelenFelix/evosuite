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

public class DiplomaticTrade_getValueForEmbargo_171275990551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297537;

    public DiplomaticTrade_getValueForEmbargo_171275990551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297537 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term297537, term297537.getClass(), "starMap", null);
        setIntField(term297537, term297537.getClass(), "first", 0);
        setIntField(term297537, term297537.getClass(), "second", 0);
        setField(term297537, term297537.getClass(), "firstOffer", null);
        setField(term297537, term297537.getClass(), "secondOffer", null);
        setField(term297537, term297537.getClass(), "techListForFirst", null);
        setField(term297537, term297537.getClass(), "techListForSecond", null);
        setField(term297537, term297537.getClass(), "fleetListForFirst", null);
        setField(term297537, term297537.getClass(), "fleetListForSecond", null);
        setField(term297537, term297537.getClass(), "planetListForFirst", null);
        setField(term297537, term297537.getClass(), "planetListForSecond", null);
        setBooleanField(term297537, term297537.getClass(), "diplomacyWithPirates", false);
        setField(term297537, term297537.getClass(), "majorDeals", null);
        setBooleanField(term297537, term297537.getClass(), "planetTraded", false);
        setBooleanField(term297537, term297537.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getValueForEmbargo", argTypes, term297537, args);
    }

};


