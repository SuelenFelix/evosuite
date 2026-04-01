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

public class DiplomaticEvent_getText_4913663874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38176;

    public DiplomaticEvent_getText_4913663874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38245 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term38244 = ((Class) term38245).getDeclaredField((String) "PLANET_BUILDING");
        ((Field) term38244).setAccessible(true);
        Object enum97 = ((Field) term38244).get((Object) null);
        term38176 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent"));
        Object term38177 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term38177, term38177.getClass(), "x", 199287428);
        setIntField(term38177, term38177.getClass(), "y", -1195339592);
        setField(term38176, term38176.getClass(), "coordinate", term38177);
        setField(term38176, term38176.getClass(), "planetName", "mRBtFTxVdE");
        setField(term38176, term38176.getClass(), "text", "IVacFDAZcj");
        setField(term38176, term38176.getClass(), "type", enum97);
        setByteField(term38176, term38176.getClass(), "playerIndex", (byte) 15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.DiplomaticEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term38176, args);
    }

};


