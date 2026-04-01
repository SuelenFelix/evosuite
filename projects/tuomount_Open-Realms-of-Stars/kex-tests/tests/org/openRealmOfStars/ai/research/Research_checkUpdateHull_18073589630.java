package org.openRealmOfStars.ai.research;

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
import static org.openRealmOfStars.ai.research.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Research_checkUpdateHull_18073589630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151905;

    public Research_checkUpdateHull_18073589630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151905 = newInstance(Class.forName("org.openRealmOfStars.ai.research.Research"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.research.Research");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "checkUpdateHull", argTypes, term151905, args);
    }

};


