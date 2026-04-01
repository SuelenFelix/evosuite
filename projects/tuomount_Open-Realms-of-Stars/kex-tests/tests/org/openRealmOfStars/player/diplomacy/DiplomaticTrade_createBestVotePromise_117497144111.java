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

public class DiplomaticTrade_createBestVotePromise_117497144111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134131;

    public DiplomaticTrade_createBestVotePromise_117497144111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134131 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term134131, term134131.getClass(), "starMap", null);
        setIntField(term134131, term134131.getClass(), "first", 0);
        setIntField(term134131, term134131.getClass(), "second", 0);
        setField(term134131, term134131.getClass(), "firstOffer", null);
        setField(term134131, term134131.getClass(), "secondOffer", null);
        setField(term134131, term134131.getClass(), "techListForFirst", null);
        setField(term134131, term134131.getClass(), "techListForSecond", null);
        setField(term134131, term134131.getClass(), "fleetListForFirst", null);
        setField(term134131, term134131.getClass(), "fleetListForSecond", null);
        setField(term134131, term134131.getClass(), "planetListForFirst", null);
        setField(term134131, term134131.getClass(), "planetListForSecond", null);
        setBooleanField(term134131, term134131.getClass(), "diplomacyWithPirates", false);
        setField(term134131, term134131.getClass(), "majorDeals", null);
        setBooleanField(term134131, term134131.getClass(), "planetTraded", false);
        setBooleanField(term134131, term134131.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createBestVotePromise", argTypes, term134131, args);
    }

};


