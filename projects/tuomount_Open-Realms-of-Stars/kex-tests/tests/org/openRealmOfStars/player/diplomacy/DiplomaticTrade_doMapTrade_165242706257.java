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

public class DiplomaticTrade_doMapTrade_165242706257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319068;
     Object term319074;

    public DiplomaticTrade_doMapTrade_165242706257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319068 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term319068, term319068.getClass(), "starMap", null);
        setIntField(term319068, term319068.getClass(), "first", 0);
        setIntField(term319068, term319068.getClass(), "second", 0);
        setField(term319068, term319068.getClass(), "firstOffer", null);
        setField(term319068, term319068.getClass(), "secondOffer", null);
        setField(term319068, term319068.getClass(), "techListForFirst", null);
        setField(term319068, term319068.getClass(), "techListForSecond", null);
        setField(term319068, term319068.getClass(), "fleetListForFirst", null);
        setField(term319068, term319068.getClass(), "fleetListForSecond", null);
        setField(term319068, term319068.getClass(), "planetListForFirst", null);
        setField(term319068, term319068.getClass(), "planetListForSecond", null);
        setBooleanField(term319068, term319068.getClass(), "diplomacyWithPirates", false);
        setField(term319068, term319068.getClass(), "majorDeals", null);
        setBooleanField(term319068, term319068.getClass(), "planetTraded", false);
        setBooleanField(term319068, term319068.getClass(), "giftTrade", false);
        term319074 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term319074;
        callMethod(klass, "doMapTrade", argTypes, term319068, args);
    }

};


