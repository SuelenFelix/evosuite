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

public class ReferenceEntity_setExpiresAt_107908023312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690;
     Object term728;

    public ReferenceEntity_setExpiresAt_107908023312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term691 = new Long(-4325723315152823407L);
        Integer term717 = new Integer(1134449235);
        term690 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term719 = newInstance(Class.forName("java.time.Instant"));
        Object term722 = newInstance(Class.forName("java.time.Instant"));
        Object term725 = newInstance(Class.forName("java.time.Instant"));
        setField(term690, term690.getClass(), "id", term691);
        setField(term690, term690.getClass(), "code", "BYqFIqCKAV");
        setField(term690, term690.getClass(), "label", "vrQLuWIDJX");
        setField(term690, term690.getClass(), "ordinal", term717);
        setLongField(term719, term719.getClass(), "seconds", 1876872800L);
        setIntField(term719, term719.getClass(), "nanos", 559000000);
        setField(term690, term690.getClass(), "effectiveAt", term719);
        setLongField(term722, term722.getClass(), "seconds", 1304532099L);
        setIntField(term722, term722.getClass(), "nanos", 366000000);
        setField(term690, term690.getClass(), "expiresAt", term722);
        setLongField(term725, term725.getClass(), "seconds", 1488725902L);
        setIntField(term725, term725.getClass(), "nanos", 101000000);
        setField(term690, term690.getClass(), "createdAt", term725);
        term728 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term728, term728.getClass(), "seconds", 1311560117L);
        setIntField(term728, term728.getClass(), "nanos", 361000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term728;
        callMethod(klass, "setExpiresAt", argTypes, term690, args);
    }

};


