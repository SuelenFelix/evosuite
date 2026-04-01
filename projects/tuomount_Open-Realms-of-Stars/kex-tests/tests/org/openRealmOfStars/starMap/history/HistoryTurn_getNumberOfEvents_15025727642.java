package org.openRealmOfStars.starMap.history;

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
import static org.openRealmOfStars.starMap.history.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HistoryTurn_getNumberOfEvents_15025727642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public HistoryTurn_getNumberOfEvents_15025727642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11 = new ArrayList();
        ((ArrayList) term11).add((Object)null);
        ((ArrayList) term11).add((Object)null);
        ((ArrayList) term11).add((Object)null);
        ((ArrayList) term11).add((Object)null);
        term9 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.HistoryTurn"));
        setIntField(term9, term9.getClass(), "turnNumber", 1484323161);
        setField(term9, term9.getClass(), "listOfEvents", term11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.HistoryTurn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfEvents", argTypes, term9, args);
    }

};


