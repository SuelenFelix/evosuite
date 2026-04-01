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

public class Fleet_getFleetCloackingValue_123606133112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193998;

    public Fleet_getFleetCloackingValue_123606133112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193998 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term193998, term193998.getClass(), "ships", null);
        setField(term193998, term193998.getClass(), "coordinate", null);
        setField(term193998, term193998.getClass(), "name", null);
        setIntField(term193998, term193998.getClass(), "movesLeft", 0);
        setField(term193998, term193998.getClass(), "route", null);
        setField(term193998, term193998.getClass(), "commander", null);
        setField(term193998, term193998.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetCloackingValue", argTypes, term193998, args);
    }

};


