package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class ReferenceEntity_setLabel_14720510116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;

    public ReferenceEntity_setLabel_14720510116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term316 = new Long(4872422362414183754L);
        Integer term342 = new Integer(-616727354);
        term315 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term344 = newInstance(Class.forName("java.time.Instant"));
        Object term347 = newInstance(Class.forName("java.time.Instant"));
        Object term350 = newInstance(Class.forName("java.time.Instant"));
        setField(term315, term315.getClass(), "id", term316);
        setField(term315, term315.getClass(), "code", "uuaPigETmJ");
        setField(term315, term315.getClass(), "label", "MxlszYVzRf");
        setField(term315, term315.getClass(), "ordinal", term342);
        setLongField(term344, term344.getClass(), "seconds", 1863631094L);
        setIntField(term344, term344.getClass(), "nanos", 992000000);
        setField(term315, term315.getClass(), "effectiveAt", term344);
        setLongField(term347, term347.getClass(), "seconds", 1882638884L);
        setIntField(term347, term347.getClass(), "nanos", 364000000);
        setField(term315, term315.getClass(), "expiresAt", term347);
        setLongField(term350, term350.getClass(), "seconds", 1437757323L);
        setIntField(term350, term350.getClass(), "nanos", 580000000);
        setField(term315, term315.getClass(), "createdAt", term350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setLabel", argTypes, term315, args);
    }

};


