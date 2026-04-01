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

public class DiplomaticTrade_generateFleetSellOffer_108602440724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199534;

    public DiplomaticTrade_generateFleetSellOffer_108602440724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199534 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term199534, term199534.getClass(), "starMap", null);
        setIntField(term199534, term199534.getClass(), "first", 0);
        setIntField(term199534, term199534.getClass(), "second", 0);
        setField(term199534, term199534.getClass(), "firstOffer", null);
        setField(term199534, term199534.getClass(), "secondOffer", null);
        setField(term199534, term199534.getClass(), "techListForFirst", null);
        setField(term199534, term199534.getClass(), "techListForSecond", null);
        setField(term199534, term199534.getClass(), "fleetListForFirst", null);
        setField(term199534, term199534.getClass(), "fleetListForSecond", null);
        setField(term199534, term199534.getClass(), "planetListForFirst", null);
        setField(term199534, term199534.getClass(), "planetListForSecond", null);
        setBooleanField(term199534, term199534.getClass(), "diplomacyWithPirates", false);
        setField(term199534, term199534.getClass(), "majorDeals", null);
        setBooleanField(term199534, term199534.getClass(), "planetTraded", false);
        setBooleanField(term199534, term199534.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "generateFleetSellOffer", argTypes, term199534, args);
    }

};


