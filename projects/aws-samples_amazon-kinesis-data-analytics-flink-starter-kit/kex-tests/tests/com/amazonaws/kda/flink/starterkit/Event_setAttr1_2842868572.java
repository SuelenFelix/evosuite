package com.amazonaws.kda.flink.starterkit;

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
import static com.amazonaws.kda.flink.starterkit.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Event_setAttr1_2842868572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;

    public Event_setAttr1_2842868572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term180, term180.getClass(), "attr_1", "hRNSzYYIrc");
        setField(term180, term180.getClass(), "attr_2", "RMFIsYGgne");
        setField(term180, term180.getClass(), "attr_3", "NRdvgJlhkX");
        setField(term180, term180.getClass(), "attr_4", "uuaPigETmJ");
        setField(term180, term180.getClass(), "attr_5", "MxlszYVzRf");
        setField(term180, term180.getClass(), "attr_6", "LQFpaHEwXR");
        setLongField(term180, term180.getClass(), "attr_7", -8257434502486459194L);
        setField(term180, term180.getClass(), "attr_8", "oVcInYnLWB");
        setField(term180, term180.getClass(), "session_id", "aJlieCFVtF");
        setLongField(term180, term180.getClass(), "timestamp", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "setAttr_1", argTypes, term180, args);
    }

};


