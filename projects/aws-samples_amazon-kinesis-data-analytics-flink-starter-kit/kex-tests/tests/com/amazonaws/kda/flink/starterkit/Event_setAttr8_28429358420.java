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

public class Event_setAttr8_28429358420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3560;

    public Event_setAttr8_28429358420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3560 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term3560, term3560.getClass(), "attr_1", "hMmaoREuCK");
        setField(term3560, term3560.getClass(), "attr_2", "VeDtgDzGAN");
        setField(term3560, term3560.getClass(), "attr_3", "aWYOWZFyaX");
        setField(term3560, term3560.getClass(), "attr_4", "BRIVNtfUWU");
        setField(term3560, term3560.getClass(), "attr_5", "DbiCVtPPCT");
        setField(term3560, term3560.getClass(), "attr_6", "WzFopsaDuG");
        setLongField(term3560, term3560.getClass(), "attr_7", 4178434741742309755L);
        setField(term3560, term3560.getClass(), "attr_8", "PapWxkhEWe");
        setField(term3560, term3560.getClass(), "session_id", "smnHEqRFRx");
        setLongField(term3560, term3560.getClass(), "timestamp", -2068172595987555756L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XYtryyobou";
        callMethod(klass, "setAttr_8", argTypes, term3560, args);
    }

};


