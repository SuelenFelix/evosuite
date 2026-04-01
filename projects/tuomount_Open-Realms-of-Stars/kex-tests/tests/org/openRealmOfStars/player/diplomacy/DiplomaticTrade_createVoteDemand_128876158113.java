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

public class DiplomaticTrade_createVoteDemand_128876158113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149625;

    public DiplomaticTrade_createVoteDemand_128876158113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149625 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term149625, term149625.getClass(), "starMap", null);
        setIntField(term149625, term149625.getClass(), "first", 0);
        setIntField(term149625, term149625.getClass(), "second", 0);
        setField(term149625, term149625.getClass(), "firstOffer", null);
        setField(term149625, term149625.getClass(), "secondOffer", null);
        setField(term149625, term149625.getClass(), "techListForFirst", null);
        setField(term149625, term149625.getClass(), "techListForSecond", null);
        setField(term149625, term149625.getClass(), "fleetListForFirst", null);
        setField(term149625, term149625.getClass(), "fleetListForSecond", null);
        setField(term149625, term149625.getClass(), "planetListForFirst", null);
        setField(term149625, term149625.getClass(), "planetListForSecond", null);
        setBooleanField(term149625, term149625.getClass(), "diplomacyWithPirates", false);
        setField(term149625, term149625.getClass(), "majorDeals", null);
        setBooleanField(term149625, term149625.getClass(), "planetTraded", false);
        setBooleanField(term149625, term149625.getClass(), "giftTrade", false);
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
        callMethod(klass, "createVoteDemand", argTypes, term149625, args);
    }

};


