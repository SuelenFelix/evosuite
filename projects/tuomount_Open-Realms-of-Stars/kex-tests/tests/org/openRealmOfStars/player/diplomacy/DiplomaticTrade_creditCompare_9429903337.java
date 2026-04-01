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

public class DiplomaticTrade_creditCompare_9429903337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262977;

    public DiplomaticTrade_creditCompare_9429903337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262977 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term262977, term262977.getClass(), "starMap", null);
        setIntField(term262977, term262977.getClass(), "first", 0);
        setIntField(term262977, term262977.getClass(), "second", 0);
        setField(term262977, term262977.getClass(), "firstOffer", null);
        setField(term262977, term262977.getClass(), "secondOffer", null);
        setField(term262977, term262977.getClass(), "techListForFirst", null);
        setField(term262977, term262977.getClass(), "techListForSecond", null);
        setField(term262977, term262977.getClass(), "fleetListForFirst", null);
        setField(term262977, term262977.getClass(), "fleetListForSecond", null);
        setField(term262977, term262977.getClass(), "planetListForFirst", null);
        setField(term262977, term262977.getClass(), "planetListForSecond", null);
        setBooleanField(term262977, term262977.getClass(), "diplomacyWithPirates", false);
        setField(term262977, term262977.getClass(), "majorDeals", null);
        setBooleanField(term262977, term262977.getClass(), "planetTraded", false);
        setBooleanField(term262977, term262977.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "creditCompare", argTypes, term262977, args);
    }

};


