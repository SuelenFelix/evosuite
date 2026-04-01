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

public class DiplomaticTrade_generateDiplomaticAttitudeOffer_412975694106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116354;

    public DiplomaticTrade_generateDiplomaticAttitudeOffer_412975694106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116354 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term3116354, term3116354.getClass(), "starMap", null);
        setIntField(term3116354, term3116354.getClass(), "first", 0);
        setIntField(term3116354, term3116354.getClass(), "second", 0);
        setField(term3116354, term3116354.getClass(), "firstOffer", null);
        setField(term3116354, term3116354.getClass(), "secondOffer", null);
        setField(term3116354, term3116354.getClass(), "techListForFirst", null);
        setField(term3116354, term3116354.getClass(), "techListForSecond", null);
        setField(term3116354, term3116354.getClass(), "fleetListForFirst", null);
        setField(term3116354, term3116354.getClass(), "fleetListForSecond", null);
        setField(term3116354, term3116354.getClass(), "planetListForFirst", null);
        setField(term3116354, term3116354.getClass(), "planetListForSecond", null);
        setBooleanField(term3116354, term3116354.getClass(), "diplomacyWithPirates", false);
        setField(term3116354, term3116354.getClass(), "majorDeals", null);
        setBooleanField(term3116354, term3116354.getClass(), "planetTraded", false);
        setBooleanField(term3116354, term3116354.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateDiplomaticAttitudeOffer", argTypes, term3116354, args);
    }

};


