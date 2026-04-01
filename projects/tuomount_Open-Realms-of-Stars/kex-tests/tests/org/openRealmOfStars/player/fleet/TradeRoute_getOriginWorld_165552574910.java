package org.openRealmOfStars.player.fleet;

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
import static org.openRealmOfStars.player.fleet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TradeRoute_getOriginWorld_165552574910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46920;

    public TradeRoute_getOriginWorld_165552574910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46920 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.TradeRoute"));
        setField(term46920, term46920.getClass(), "originWorld", null);
        setField(term46920, term46920.getClass(), "tradeWorld", null);
        setField(term46920, term46920.getClass(), "trader", null);
        setIntField(term46920, term46920.getClass(), "tradeValue", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.TradeRoute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOriginWorld", argTypes, term46920, args);
    }

};


