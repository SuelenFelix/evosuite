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

public class PlayerStartEvent_createByteArray_10218138418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34434;

    public PlayerStartEvent_createByteArray_10218138418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34434 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.PlayerStartEvent"));
        setField(term34434, term34434.getClass(), "coordinate", null);
        setField(term34434, term34434.getClass(), "name", null);
        setField(term34434, term34434.getClass(), "type", null);
        setByteField(term34434, term34434.getClass(), "playerIndex", (byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.PlayerStartEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createByteArray", argTypes, term34434, args);
    }

};


