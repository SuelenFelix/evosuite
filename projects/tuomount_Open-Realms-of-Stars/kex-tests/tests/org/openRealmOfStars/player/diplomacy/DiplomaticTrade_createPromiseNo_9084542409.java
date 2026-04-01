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

public class DiplomaticTrade_createPromiseNo_9084542409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119004;

    public DiplomaticTrade_createPromiseNo_9084542409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119004 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term119004, term119004.getClass(), "starMap", null);
        setIntField(term119004, term119004.getClass(), "first", 0);
        setIntField(term119004, term119004.getClass(), "second", 0);
        setField(term119004, term119004.getClass(), "firstOffer", null);
        setField(term119004, term119004.getClass(), "secondOffer", null);
        setField(term119004, term119004.getClass(), "techListForFirst", null);
        setField(term119004, term119004.getClass(), "techListForSecond", null);
        setField(term119004, term119004.getClass(), "fleetListForFirst", null);
        setField(term119004, term119004.getClass(), "fleetListForSecond", null);
        setField(term119004, term119004.getClass(), "planetListForFirst", null);
        setField(term119004, term119004.getClass(), "planetListForSecond", null);
        setBooleanField(term119004, term119004.getClass(), "diplomacyWithPirates", false);
        setField(term119004, term119004.getClass(), "majorDeals", null);
        setBooleanField(term119004, term119004.getClass(), "planetTraded", false);
        setBooleanField(term119004, term119004.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createPromiseNo", argTypes, term119004, args);
    }

};


