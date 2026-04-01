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

public class AscendedEvent_getText_6613580062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43092;

    public AscendedEvent_getText_6613580062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43137 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term43136 = ((Class) term43137).getDeclaredField((String) "GALACTIC_NEWS");
        ((Field) term43136).setAccessible(true);
        Object enum110 = ((Field) term43136).get((Object) null);
        term43092 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.AscendedEvent"));
        Object term43093 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term43093, term43093.getClass(), "x", 803925431);
        setIntField(term43093, term43093.getClass(), "y", 76929641);
        setField(term43092, term43092.getClass(), "coordinate", term43093);
        setField(term43092, term43092.getClass(), "text", "GSzQdbHLHw");
        setField(term43092, term43092.getClass(), "type", enum110);
        setByteField(term43092, term43092.getClass(), "playerIndex", (byte) -93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.AscendedEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term43092, args);
    }

};


