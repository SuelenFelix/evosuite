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
import java.lang.Boolean;

public class DiplomaticTrade_getWarChanceForDecline_1378567355117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116420;
     Object term3116426;
     Object term3116428;

    public DiplomaticTrade_getWarChanceForDecline_1378567355117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116420 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term3116420, term3116420.getClass(), "starMap", null);
        setIntField(term3116420, term3116420.getClass(), "first", 0);
        setIntField(term3116420, term3116420.getClass(), "second", 0);
        setField(term3116420, term3116420.getClass(), "firstOffer", null);
        setField(term3116420, term3116420.getClass(), "secondOffer", null);
        setField(term3116420, term3116420.getClass(), "techListForFirst", null);
        setField(term3116420, term3116420.getClass(), "techListForSecond", null);
        setField(term3116420, term3116420.getClass(), "fleetListForFirst", null);
        setField(term3116420, term3116420.getClass(), "fleetListForSecond", null);
        setField(term3116420, term3116420.getClass(), "planetListForFirst", null);
        setField(term3116420, term3116420.getClass(), "planetListForSecond", null);
        setBooleanField(term3116420, term3116420.getClass(), "diplomacyWithPirates", false);
        setField(term3116420, term3116420.getClass(), "majorDeals", null);
        setBooleanField(term3116420, term3116420.getClass(), "planetTraded", false);
        setBooleanField(term3116420, term3116420.getClass(), "giftTrade", false);
        term3116426 = new Integer(0);
        term3116428 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term3116426;
        args[3] = term3116428;
        callMethod(klass, "getWarChanceForDecline", argTypes, term3116420, args);
    }

};


