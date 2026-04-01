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

public class DiplomaticTrade_generateBackstabbingAttitudeOffer_504637995103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431370;

    public DiplomaticTrade_generateBackstabbingAttitudeOffer_504637995103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431370 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431370, term431370.getClass(), "starMap", null);
        setIntField(term431370, term431370.getClass(), "first", 0);
        setIntField(term431370, term431370.getClass(), "second", 0);
        setField(term431370, term431370.getClass(), "firstOffer", null);
        setField(term431370, term431370.getClass(), "secondOffer", null);
        setField(term431370, term431370.getClass(), "techListForFirst", null);
        setField(term431370, term431370.getClass(), "techListForSecond", null);
        setField(term431370, term431370.getClass(), "fleetListForFirst", null);
        setField(term431370, term431370.getClass(), "fleetListForSecond", null);
        setField(term431370, term431370.getClass(), "planetListForFirst", null);
        setField(term431370, term431370.getClass(), "planetListForSecond", null);
        setBooleanField(term431370, term431370.getClass(), "diplomacyWithPirates", false);
        setField(term431370, term431370.getClass(), "majorDeals", null);
        setBooleanField(term431370, term431370.getClass(), "planetTraded", false);
        setBooleanField(term431370, term431370.getClass(), "giftTrade", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateBackstabbingAttitudeOffer", argTypes, term431370, args);
    }

};


