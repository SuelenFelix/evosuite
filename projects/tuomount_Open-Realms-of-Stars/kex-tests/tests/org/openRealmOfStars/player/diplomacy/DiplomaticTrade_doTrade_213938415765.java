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

public class DiplomaticTrade_doTrade_213938415765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376215;

    public DiplomaticTrade_doTrade_213938415765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376215 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term376215, term376215.getClass(), "starMap", null);
        setIntField(term376215, term376215.getClass(), "first", 0);
        setIntField(term376215, term376215.getClass(), "second", 0);
        setField(term376215, term376215.getClass(), "firstOffer", null);
        setField(term376215, term376215.getClass(), "secondOffer", null);
        setField(term376215, term376215.getClass(), "techListForFirst", null);
        setField(term376215, term376215.getClass(), "techListForSecond", null);
        setField(term376215, term376215.getClass(), "fleetListForFirst", null);
        setField(term376215, term376215.getClass(), "fleetListForSecond", null);
        setField(term376215, term376215.getClass(), "planetListForFirst", null);
        setField(term376215, term376215.getClass(), "planetListForSecond", null);
        setBooleanField(term376215, term376215.getClass(), "diplomacyWithPirates", false);
        setField(term376215, term376215.getClass(), "majorDeals", null);
        setBooleanField(term376215, term376215.getClass(), "planetTraded", false);
        setBooleanField(term376215, term376215.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "doTrade", argTypes, term376215, args);
    }

};


