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

public class HistoryTurn_getNumberOfTextualEvents_5398146913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;

    public HistoryTurn_getNumberOfTextualEvents_5398146913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17 = new ArrayList();
        ((ArrayList) term17).add((Object)null);
        ((ArrayList) term17).add((Object)null);
        ((ArrayList) term17).add((Object)null);
        term15 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.HistoryTurn"));
        setIntField(term15, term15.getClass(), "turnNumber", 391863371);
        setField(term15, term15.getClass(), "listOfEvents", term17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.HistoryTurn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfTextualEvents", argTypes, term15, args);
    }

};


