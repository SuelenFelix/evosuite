package com.pgssoft.httpclient.internal;

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
import static com.pgssoft.httpclient.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ParameterValue_getName_19865039841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5839;

    public ParameterValue_getName_19865039841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5852 = new ArrayList();
        ((ArrayList) term5852).add("eZFUvlxvGV");
        ((ArrayList) term5852).add("BYqFIqCKAV");
        ((ArrayList) term5852).add("vrQLuWIDJX");
        ((ArrayList) term5852).add("flxyYxBRtu");
        ((ArrayList) term5852).add("OclPbYPkcH");
        ((ArrayList) term5852).add("IoAlmYsBwc");
        ((ArrayList) term5852).add("TEParAifyi");
        term5839 = newInstance(Class.forName("com.pgssoft.httpclient.internal.ParameterValue"));
        setField(term5839, term5839.getClass(), "name", "xOEqzGAmDU");
        setField(term5839, term5839.getClass(), "values", term5852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.ParameterValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5839, args);
    }

};


