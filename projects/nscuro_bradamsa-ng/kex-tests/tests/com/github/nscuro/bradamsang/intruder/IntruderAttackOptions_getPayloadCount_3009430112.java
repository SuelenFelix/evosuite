package com.github.nscuro.bradamsang.intruder;

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
import static com.github.nscuro.bradamsang.intruder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class IntruderAttackOptions_getPayloadCount_3009430112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;

    public IntruderAttackOptions_getPayloadCount_3009430112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term94 = new ArrayList();
        ((ArrayList) term94).add("SzjVpOQTyS");
        ((ArrayList) term94).add("MjGYSRKTNF");
        ((ArrayList) term94).add("hRNSzYYIrc");
        ((ArrayList) term94).add("RMFIsYGgne");
        ((ArrayList) term94).add("NRdvgJlhkX");
        ((ArrayList) term94).add("uuaPigETmJ");
        ((ArrayList) term94).add("MxlszYVzRf");
        ((ArrayList) term94).add("LQFpaHEwXR");
        ((ArrayList) term94).add("oVcInYnLWB");
        term92 = newInstance(Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions"));
        setIntField(term92, term92.getClass(), "payloadCount", 1162663216);
        setField(term92, term92.getClass(), "samplePaths", term94);
        setBooleanField(term92, term92.getClass(), "wslModeEnabled", false);
        setField(term92, term92.getClass(), "wslDistributionName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPayloadCount", argTypes, term92, args);
    }

};


