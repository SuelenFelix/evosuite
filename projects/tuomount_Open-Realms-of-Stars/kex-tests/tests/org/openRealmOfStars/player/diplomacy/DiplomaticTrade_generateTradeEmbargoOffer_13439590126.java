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

public class DiplomaticTrade_generateTradeEmbargoOffer_13439590126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207776;

    public DiplomaticTrade_generateTradeEmbargoOffer_13439590126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207776 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term207776, term207776.getClass(), "starMap", null);
        setIntField(term207776, term207776.getClass(), "first", 0);
        setIntField(term207776, term207776.getClass(), "second", 0);
        setField(term207776, term207776.getClass(), "firstOffer", null);
        setField(term207776, term207776.getClass(), "secondOffer", null);
        setField(term207776, term207776.getClass(), "techListForFirst", null);
        setField(term207776, term207776.getClass(), "techListForSecond", null);
        setField(term207776, term207776.getClass(), "fleetListForFirst", null);
        setField(term207776, term207776.getClass(), "fleetListForSecond", null);
        setField(term207776, term207776.getClass(), "planetListForFirst", null);
        setField(term207776, term207776.getClass(), "planetListForSecond", null);
        setBooleanField(term207776, term207776.getClass(), "diplomacyWithPirates", false);
        setField(term207776, term207776.getClass(), "majorDeals", null);
        setBooleanField(term207776, term207776.getClass(), "planetTraded", false);
        setBooleanField(term207776, term207776.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "generateTradeEmbargoOffer", argTypes, term207776, args);
    }

};


