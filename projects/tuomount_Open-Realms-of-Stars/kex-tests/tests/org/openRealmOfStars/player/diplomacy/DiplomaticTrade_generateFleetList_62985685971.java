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

public class DiplomaticTrade_generateFleetList_62985685971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398278;

    public DiplomaticTrade_generateFleetList_62985685971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398278 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term398278, term398278.getClass(), "starMap", null);
        setIntField(term398278, term398278.getClass(), "first", 0);
        setIntField(term398278, term398278.getClass(), "second", 0);
        setField(term398278, term398278.getClass(), "firstOffer", null);
        setField(term398278, term398278.getClass(), "secondOffer", null);
        setField(term398278, term398278.getClass(), "techListForFirst", null);
        setField(term398278, term398278.getClass(), "techListForSecond", null);
        setField(term398278, term398278.getClass(), "fleetListForFirst", null);
        setField(term398278, term398278.getClass(), "fleetListForSecond", null);
        setField(term398278, term398278.getClass(), "planetListForFirst", null);
        setField(term398278, term398278.getClass(), "planetListForSecond", null);
        setBooleanField(term398278, term398278.getClass(), "diplomacyWithPirates", false);
        setField(term398278, term398278.getClass(), "majorDeals", null);
        setBooleanField(term398278, term398278.getClass(), "planetTraded", false);
        setBooleanField(term398278, term398278.getClass(), "giftTrade", false);
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
        callMethod(klass, "generateFleetList", argTypes, term398278, args);
    }

};


