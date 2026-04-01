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

public class DiplomaticTrade_updateMeetingNumbers_205014389789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429301;

    public DiplomaticTrade_updateMeetingNumbers_205014389789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429301 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term429301, term429301.getClass(), "starMap", null);
        setIntField(term429301, term429301.getClass(), "first", 0);
        setIntField(term429301, term429301.getClass(), "second", 0);
        setField(term429301, term429301.getClass(), "firstOffer", null);
        setField(term429301, term429301.getClass(), "secondOffer", null);
        setField(term429301, term429301.getClass(), "techListForFirst", null);
        setField(term429301, term429301.getClass(), "techListForSecond", null);
        setField(term429301, term429301.getClass(), "fleetListForFirst", null);
        setField(term429301, term429301.getClass(), "fleetListForSecond", null);
        setField(term429301, term429301.getClass(), "planetListForFirst", null);
        setField(term429301, term429301.getClass(), "planetListForSecond", null);
        setBooleanField(term429301, term429301.getClass(), "diplomacyWithPirates", false);
        setField(term429301, term429301.getClass(), "majorDeals", null);
        setBooleanField(term429301, term429301.getClass(), "planetTraded", false);
        setBooleanField(term429301, term429301.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateMeetingNumbers", argTypes, term429301, args);
    }

};


