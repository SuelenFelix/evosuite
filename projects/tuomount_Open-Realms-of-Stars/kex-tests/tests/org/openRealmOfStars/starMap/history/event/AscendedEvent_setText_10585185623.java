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
import java.lang.Object;
import java.lang.String;

public class AscendedEvent_setText_10585185623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43442;

    public AscendedEvent_setText_10585185623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43498 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term43497 = ((Class) term43498).getDeclaredField((String) "LEADER_EVENT");
        ((Field) term43497).setAccessible(true);
        Object enum111 = ((Field) term43497).get((Object) null);
        term43442 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.AscendedEvent"));
        Object term43443 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term43443, term43443.getClass(), "x", -1362856620);
        setIntField(term43443, term43443.getClass(), "y", -1835839814);
        setField(term43442, term43442.getClass(), "coordinate", term43443);
        setField(term43442, term43442.getClass(), "text", "IkfarsYNJO");
        setField(term43442, term43442.getClass(), "type", enum111);
        setByteField(term43442, term43442.getClass(), "playerIndex", (byte) 82);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.AscendedEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aZKOWhHMEh";
        callMethod(klass, "setText", argTypes, term43442, args);
    }

};


