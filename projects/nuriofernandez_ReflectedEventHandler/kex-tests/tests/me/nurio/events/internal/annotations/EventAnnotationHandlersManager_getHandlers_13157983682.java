package me.nurio.events.internal.annotations;

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
import static me.nurio.events.internal.annotations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class EventAnnotationHandlersManager_getHandlers_13157983682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4679;
     Object term4684;

    public EventAnnotationHandlersManager_getHandlers_13157983682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4680 = new ArrayList();
        term4679 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventAnnotationHandlersManager"));
        setField(term4679, term4679.getClass(), "annotationHandlers", term4680);
        Class<? extends Object> term4923 = Class.forName((String) "java.util.ArrayList$SubList$1");
        Object[] term5070 = (Object[]) newArray("java.lang.Class", 0);
        term4684 = ((Class) term4923).getDeclaredMethod((String) "nextIndex", (Class[]) term5070);
        ((Method) term4684).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.EventAnnotationHandlersManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[1];
        args[0] = term4684;
        callMethod(klass, "getHandlers", argTypes, term4679, args);
    }

};


