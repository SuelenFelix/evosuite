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

public class History_addTurn_19441665485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44027;
     Object term44032;

    public History_addTurn_19441665485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44028 = new ArrayList();
        term44027 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.History"));
        setField(term44027, term44027.getClass(), "listOfTurns", term44028);
        ArrayList term44034 = new ArrayList();
        ((ArrayList) term44034).add((Object)null);
        ((ArrayList) term44034).add((Object)null);
        ((ArrayList) term44034).add((Object)null);
        ((ArrayList) term44034).add((Object)null);
        ((ArrayList) term44034).add((Object)null);
        ((ArrayList) term44034).add((Object)null);
        ((ArrayList) term44034).add((Object)null);
        term44032 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.HistoryTurn"));
        setIntField(term44032, term44032.getClass(), "turnNumber", 1895143076);
        setField(term44032, term44032.getClass(), "listOfEvents", term44034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.History");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.history.HistoryTurn");
        Object[] args = new Object[1];
        args[0] = term44032;
        callMethod(klass, "addTurn", argTypes, term44027, args);
    }

};


