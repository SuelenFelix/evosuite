package org.mozilla.universalchardet.prober.statemachine;

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
import static org.mozilla.universalchardet.prober.statemachine.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CodingStateMachine_getCodingStateMachine_11162702139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public CodingStateMachine_getCodingStateMachine_11162702139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine"));
        setField(term33, term33.getClass(), "model", null);
        setIntField(term33, term33.getClass(), "currentState", 0);
        setIntField(term33, term33.getClass(), "currentCharLen", 0);
        setIntField(term33, term33.getClass(), "currentBytePos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.statemachine.CodingStateMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCodingStateMachine", argTypes, term33, args);
    }

};


