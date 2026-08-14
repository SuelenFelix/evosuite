package com.pgssoft.httpclient.internal.action;

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
import static com.pgssoft.httpclient.internal.action.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SetHeaderAction_enrichResponse_16050591433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9014;

    public SetHeaderAction_enrichResponse_16050591433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9014 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.SetHeaderAction"));
        setField(term9014, term9014.getClass(), "key", null);
        setField(term9014, term9014.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.action.SetHeaderAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "enrichResponse", argTypes, term9014, args);
    }

};


