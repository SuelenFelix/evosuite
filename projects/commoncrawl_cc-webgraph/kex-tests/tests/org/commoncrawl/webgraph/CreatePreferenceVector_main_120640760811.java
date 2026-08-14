package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreatePreferenceVector_main_120640760811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8457;

    public CreatePreferenceVector_main_120640760811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8457 = (Object[]) newArray("java.lang.String", 6);
        setElement(term8457, 0, "mLUZFTfjle");
        setElement(term8457, 1, "xIeFjkHkOe");
        setElement(term8457, 2, "SdCKLMIYnX");
        setElement(term8457, 3, "OJJtVNPyKZ");
        setElement(term8457, 4, "AKNapTAfmD");
        setElement(term8457, 5, "xJgPlLxpgC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.CreatePreferenceVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8457;
        callMethod(klass, "main", argTypes, null, args);
    }

};


