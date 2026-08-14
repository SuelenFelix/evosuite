package com.amazonaws.datastreamvectorization.datasink.model;

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
import static com.amazonaws.datastreamvectorization.datasink.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class OpenSearchDataSinkConfiguration_getBulkFlushIntervalMillis_9476208059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3616;

    public OpenSearchDataSinkConfiguration_getBulkFlushIntervalMillis_9476208059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3705 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term3704 = ((Class) term3705).getDeclaredField((String) "SERVERLESS");
        ((Field) term3704).setAccessible(true);
        Object enum8 = ((Field) term3704).get((Object) null);
        term3616 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term3616, term3616.getClass(), "endpoint", "hNxWaHcfhY");
        setField(term3616, term3616.getClass(), "index", "RkybSrpybU");
        setField(term3616, term3616.getClass(), "region", "xOEqzGAmDU");
        setField(term3616, term3616.getClass(), "openSearchType", enum8);
        setLongField(term3616, term3616.getClass(), "bulkFlushIntervalMillis", 4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBulkFlushIntervalMillis", argTypes, term3616, args);
    }

};


