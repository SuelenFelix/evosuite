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

public class DiplomaticTrade_generateTechDemand_187976671120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177696;

    public DiplomaticTrade_generateTechDemand_187976671120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177696 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term177696, term177696.getClass(), "starMap", null);
        setIntField(term177696, term177696.getClass(), "first", 0);
        setIntField(term177696, term177696.getClass(), "second", 0);
        setField(term177696, term177696.getClass(), "firstOffer", null);
        setField(term177696, term177696.getClass(), "secondOffer", null);
        setField(term177696, term177696.getClass(), "techListForFirst", null);
        setField(term177696, term177696.getClass(), "techListForSecond", null);
        setField(term177696, term177696.getClass(), "fleetListForFirst", null);
        setField(term177696, term177696.getClass(), "fleetListForSecond", null);
        setField(term177696, term177696.getClass(), "planetListForFirst", null);
        setField(term177696, term177696.getClass(), "planetListForSecond", null);
        setBooleanField(term177696, term177696.getClass(), "diplomacyWithPirates", false);
        setField(term177696, term177696.getClass(), "majorDeals", null);
        setBooleanField(term177696, term177696.getClass(), "planetTraded", false);
        setBooleanField(term177696, term177696.getClass(), "giftTrade", false);
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
        callMethod(klass, "generateTechDemand", argTypes, term177696, args);
    }

};


