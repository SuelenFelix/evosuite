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

public class HistoryTurn_addEvent_11245933346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;

    public HistoryTurn_addEvent_11245933346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39 = new ArrayList();
        ((ArrayList) term39).add((Object)null);
        ((ArrayList) term39).add((Object)null);
        ((ArrayList) term39).add((Object)null);
        ((ArrayList) term39).add((Object)null);
        ((ArrayList) term39).add((Object)null);
        ((ArrayList) term39).add((Object)null);
        term37 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.HistoryTurn"));
        setIntField(term37, term37.getClass(), "turnNumber", 1227103734);
        setField(term37, term37.getClass(), "listOfEvents", term39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.HistoryTurn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.history.event.Event");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEvent", argTypes, term37, args);
    }

};


