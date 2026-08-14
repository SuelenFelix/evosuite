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

public class EventAnnotationHandlersManager_addAnnotationHandler_9380464351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4674;

    public EventAnnotationHandlersManager_addAnnotationHandler_9380464351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4675 = new ArrayList();
        term4674 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventAnnotationHandlersManager"));
        setField(term4674, term4674.getClass(), "annotationHandlers", term4675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.EventAnnotationHandlersManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.internal.annotations.AnnotationEventHandler");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAnnotationHandler", argTypes, term4674, args);
    }

};


