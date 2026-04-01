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

public class DiplomaticTrade_calculateMapValue_173049848261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351714;
     Object term351720;

    public DiplomaticTrade_calculateMapValue_173049848261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351714 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term351714, term351714.getClass(), "starMap", null);
        setIntField(term351714, term351714.getClass(), "first", 0);
        setIntField(term351714, term351714.getClass(), "second", 0);
        setField(term351714, term351714.getClass(), "firstOffer", null);
        setField(term351714, term351714.getClass(), "secondOffer", null);
        setField(term351714, term351714.getClass(), "techListForFirst", null);
        setField(term351714, term351714.getClass(), "techListForSecond", null);
        setField(term351714, term351714.getClass(), "fleetListForFirst", null);
        setField(term351714, term351714.getClass(), "fleetListForSecond", null);
        setField(term351714, term351714.getClass(), "planetListForFirst", null);
        setField(term351714, term351714.getClass(), "planetListForSecond", null);
        setBooleanField(term351714, term351714.getClass(), "diplomacyWithPirates", false);
        setField(term351714, term351714.getClass(), "majorDeals", null);
        setBooleanField(term351714, term351714.getClass(), "planetTraded", false);
        setBooleanField(term351714, term351714.getClass(), "giftTrade", false);
        term351720 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term351720;
        callMethod(klass, "calculateMapValue", argTypes, term351714, args);
    }

};


