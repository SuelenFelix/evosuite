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

public class DiplomaticTrade_createPromiseYes_15239860887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107787;

    public DiplomaticTrade_createPromiseYes_15239860887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107787 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term107787, term107787.getClass(), "starMap", null);
        setIntField(term107787, term107787.getClass(), "first", 0);
        setIntField(term107787, term107787.getClass(), "second", 0);
        setField(term107787, term107787.getClass(), "firstOffer", null);
        setField(term107787, term107787.getClass(), "secondOffer", null);
        setField(term107787, term107787.getClass(), "techListForFirst", null);
        setField(term107787, term107787.getClass(), "techListForSecond", null);
        setField(term107787, term107787.getClass(), "fleetListForFirst", null);
        setField(term107787, term107787.getClass(), "fleetListForSecond", null);
        setField(term107787, term107787.getClass(), "planetListForFirst", null);
        setField(term107787, term107787.getClass(), "planetListForSecond", null);
        setBooleanField(term107787, term107787.getClass(), "diplomacyWithPirates", false);
        setField(term107787, term107787.getClass(), "majorDeals", null);
        setBooleanField(term107787, term107787.getClass(), "planetTraded", false);
        setBooleanField(term107787, term107787.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createPromiseYes", argTypes, term107787, args);
    }

};


