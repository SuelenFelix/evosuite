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

public class Event_setAttr2_2842878184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;

    public Event_setAttr2_2842878184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term560, term560.getClass(), "attr_1", "vrQLuWIDJX");
        setField(term560, term560.getClass(), "attr_2", "flxyYxBRtu");
        setField(term560, term560.getClass(), "attr_3", "OclPbYPkcH");
        setField(term560, term560.getClass(), "attr_4", "IoAlmYsBwc");
        setField(term560, term560.getClass(), "attr_5", "TEParAifyi");
        setField(term560, term560.getClass(), "attr_6", "OWDIEULEFu");
        setLongField(term560, term560.getClass(), "attr_7", 4872422362414183754L);
        setField(term560, term560.getClass(), "attr_8", "dWRymuLBtr");
        setField(term560, term560.getClass(), "session_id", "AijpHYOFuy");
        setLongField(term560, term560.getClass(), "timestamp", 6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "setAttr_2", argTypes, term560, args);
    }

};


