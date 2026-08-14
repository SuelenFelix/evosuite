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

public class IntruderAttackOptions_isWslModeEnabled_13516217324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348;

    public IntruderAttackOptions_isWslModeEnabled_13516217324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term350 = new ArrayList();
        ((ArrayList) term350).add("tbcdzjIfER");
        ((ArrayList) term350).add("HyxfbSQYBe");
        ((ArrayList) term350).add("pCTimMblYc");
        ((ArrayList) term350).add("hNxWaHcfhY");
        term348 = newInstance(Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions"));
        setIntField(term348, term348.getClass(), "payloadCount", 391863371);
        setField(term348, term348.getClass(), "samplePaths", term350);
        setBooleanField(term348, term348.getClass(), "wslModeEnabled", false);
        setField(term348, term348.getClass(), "wslDistributionName", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWslModeEnabled", argTypes, term348, args);
    }

};


