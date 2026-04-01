package org.openRealmOfStars.starMap.history.event;

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
import static org.openRealmOfStars.starMap.history.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LeaderEvent_getText_55071605415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29474;

    public LeaderEvent_getText_55071605415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29474 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent"));
        setField(term29474, term29474.getClass(), "coordinate", null);
        setField(term29474, term29474.getClass(), "planetName", null);
        setIntField(term29474, term29474.getClass(), "leaderIndex", 0);
        setField(term29474, term29474.getClass(), "text", null);
        setField(term29474, term29474.getClass(), "type", null);
        setByteField(term29474, term29474.getClass(), "playerIndex", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.LeaderEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term29474, args);
    }

};


