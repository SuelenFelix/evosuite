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

public class DiplomaticTrade_generateFleetList_62985685972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3083004;

    public DiplomaticTrade_generateFleetList_62985685972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3083004 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term3083004, term3083004.getClass(), "starMap", null);
        setIntField(term3083004, term3083004.getClass(), "first", 0);
        setIntField(term3083004, term3083004.getClass(), "second", 0);
        setField(term3083004, term3083004.getClass(), "firstOffer", null);
        setField(term3083004, term3083004.getClass(), "secondOffer", null);
        setField(term3083004, term3083004.getClass(), "techListForFirst", null);
        setField(term3083004, term3083004.getClass(), "techListForSecond", null);
        setField(term3083004, term3083004.getClass(), "fleetListForFirst", null);
        setField(term3083004, term3083004.getClass(), "fleetListForSecond", null);
        setField(term3083004, term3083004.getClass(), "planetListForFirst", null);
        setField(term3083004, term3083004.getClass(), "planetListForSecond", null);
        setBooleanField(term3083004, term3083004.getClass(), "diplomacyWithPirates", false);
        setField(term3083004, term3083004.getClass(), "majorDeals", null);
        setBooleanField(term3083004, term3083004.getClass(), "planetTraded", false);
        setBooleanField(term3083004, term3083004.getClass(), "giftTrade", false);
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
        callMethod(klass, "generateFleetList", argTypes, term3083004, args);
    }

};


