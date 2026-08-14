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

public class IntruderAttackOptions_getWslDistributionName_9527443635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;

    public IntruderAttackOptions_getWslDistributionName_9527443635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term467 = new ArrayList();
        ((ArrayList) term467).add("xOEqzGAmDU");
        ((ArrayList) term467).add("eZFUvlxvGV");
        ((ArrayList) term467).add("BYqFIqCKAV");
        ((ArrayList) term467).add("vrQLuWIDJX");
        ((ArrayList) term467).add("flxyYxBRtu");
        term465 = newInstance(Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions"));
        setIntField(term465, term465.getClass(), "payloadCount", -1922583790);
        setField(term465, term465.getClass(), "samplePaths", term467);
        setBooleanField(term465, term465.getClass(), "wslModeEnabled", true);
        setField(term465, term465.getClass(), "wslDistributionName", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.intruder.IntruderAttackOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWslDistributionName", argTypes, term465, args);
    }

};


