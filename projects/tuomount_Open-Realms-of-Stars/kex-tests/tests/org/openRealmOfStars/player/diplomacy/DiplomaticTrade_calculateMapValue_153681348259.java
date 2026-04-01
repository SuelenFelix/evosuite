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

public class DiplomaticTrade_calculateMapValue_153681348259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335226;
     Object term335232;

    public DiplomaticTrade_calculateMapValue_153681348259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335226 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade"));
        setField(term335226, term335226.getClass(), "starMap", null);
        setIntField(term335226, term335226.getClass(), "first", 0);
        setIntField(term335226, term335226.getClass(), "second", 0);
        setField(term335226, term335226.getClass(), "firstOffer", null);
        setField(term335226, term335226.getClass(), "secondOffer", null);
        setField(term335226, term335226.getClass(), "techListForFirst", null);
        setField(term335226, term335226.getClass(), "techListForSecond", null);
        setField(term335226, term335226.getClass(), "fleetListForFirst", null);
        setField(term335226, term335226.getClass(), "fleetListForSecond", null);
        setField(term335226, term335226.getClass(), "planetListForFirst", null);
        setField(term335226, term335226.getClass(), "planetListForSecond", null);
        setBooleanField(term335226, term335226.getClass(), "diplomacyWithPirates", false);
        setField(term335226, term335226.getClass(), "majorDeals", null);
        setBooleanField(term335226, term335226.getClass(), "planetTraded", false);
        setBooleanField(term335226, term335226.getClass(), "giftTrade", false);
        term335232 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomaticTrade");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term335232;
        callMethod(klass, "calculateMapValue", argTypes, term335226, args);
    }

};


