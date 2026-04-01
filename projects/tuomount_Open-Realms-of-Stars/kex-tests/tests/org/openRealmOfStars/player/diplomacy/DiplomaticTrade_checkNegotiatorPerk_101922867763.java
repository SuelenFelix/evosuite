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

public class DiplomaticTrade_checkNegotiatorPerk_101922867763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363100;

    public DiplomaticTrade_checkNegotiatorPerk_101922867763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363100 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term363100, term363100.getClass(), "starMap", null);
        setIntField(term363100, term363100.getClass(), "first", 0);
        setIntField(term363100, term363100.getClass(), "second", 0);
        setField(term363100, term363100.getClass(), "firstOffer", null);
        setField(term363100, term363100.getClass(), "secondOffer", null);
        setField(term363100, term363100.getClass(), "techListForFirst", null);
        setField(term363100, term363100.getClass(), "techListForSecond", null);
        setField(term363100, term363100.getClass(), "fleetListForFirst", null);
        setField(term363100, term363100.getClass(), "fleetListForSecond", null);
        setField(term363100, term363100.getClass(), "planetListForFirst", null);
        setField(term363100, term363100.getClass(), "planetListForSecond", null);
        setBooleanField(term363100, term363100.getClass(), "diplomacyWithPirates", false);
        setField(term363100, term363100.getClass(), "majorDeals", null);
        setBooleanField(term363100, term363100.getClass(), "planetTraded", false);
        setBooleanField(term363100, term363100.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkNegotiatorPerk", argTypes, term363100, args);
    }

};


