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

public class DiplomaticTrade_getWarChanceForDecline_1378567355116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431448;
     Object term431454;
     Object term431456;

    public DiplomaticTrade_getWarChanceForDecline_1378567355116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431448 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term431448, term431448.getClass(), "starMap", null);
        setIntField(term431448, term431448.getClass(), "first", 0);
        setIntField(term431448, term431448.getClass(), "second", 0);
        setField(term431448, term431448.getClass(), "firstOffer", null);
        setField(term431448, term431448.getClass(), "secondOffer", null);
        setField(term431448, term431448.getClass(), "techListForFirst", null);
        setField(term431448, term431448.getClass(), "techListForSecond", null);
        setField(term431448, term431448.getClass(), "fleetListForFirst", null);
        setField(term431448, term431448.getClass(), "fleetListForSecond", null);
        setField(term431448, term431448.getClass(), "planetListForFirst", null);
        setField(term431448, term431448.getClass(), "planetListForSecond", null);
        setBooleanField(term431448, term431448.getClass(), "diplomacyWithPirates", false);
        setField(term431448, term431448.getClass(), "majorDeals", null);
        setBooleanField(term431448, term431448.getClass(), "planetTraded", false);
        setBooleanField(term431448, term431448.getClass(), "giftTrade", false);
        term431454 = new Integer(0);
        term431456 = new Boolean(false);
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
        args[2] = term431454;
        args[3] = term431456;
        callMethod(klass, "getWarChanceForDecline", argTypes, term431448, args);
    }

};


