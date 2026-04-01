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

public class AscendedEvent_getCoordinate_12464759241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42742;

    public AscendedEvent_getCoordinate_12464759241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42787 = Class.forName((String) "org.openRealmOfStars.starMap.history.event.EventType");
        Field term42786 = ((Class) term42787).getDeclaredField((String) "GALACTIC_NEWS");
        ((Field) term42786).setAccessible(true);
        Object enum109 = ((Field) term42786).get((Object) null);
        term42742 = newInstance(Class.forName("org.openRealmOfStars.starMap.history.event.AscendedEvent"));
        Object term42743 = newInstance(Class.forName("org.openRealmOfStars.starMap.Coordinate"));
        setIntField(term42743, term42743.getClass(), "x", -49052672);
        setIntField(term42743, term42743.getClass(), "y", 339372704);
        setField(term42742, term42742.getClass(), "coordinate", term42743);
        setField(term42742, term42742.getClass(), "text", "CwNELDTAPP");
        setField(term42742, term42742.getClass(), "type", enum109);
        setByteField(term42742, term42742.getClass(), "playerIndex", (byte) -53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.history.event.AscendedEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoordinate", argTypes, term42742, args);
    }

};


