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

public class ReferenceEntity_setCreatedAt_66783305314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;
     Object term847;

    public ReferenceEntity_setCreatedAt_66783305314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term810 = new Long(-5476826692763582090L);
        Integer term836 = new Integer(1585847225);
        term809 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term838 = newInstance(Class.forName("java.time.Instant"));
        Object term841 = newInstance(Class.forName("java.time.Instant"));
        Object term844 = newInstance(Class.forName("java.time.Instant"));
        setField(term809, term809.getClass(), "id", term810);
        setField(term809, term809.getClass(), "code", "IoAlmYsBwc");
        setField(term809, term809.getClass(), "label", "TEParAifyi");
        setField(term809, term809.getClass(), "ordinal", term836);
        setLongField(term838, term838.getClass(), "seconds", 1822704644L);
        setIntField(term838, term838.getClass(), "nanos", 50000000);
        setField(term809, term809.getClass(), "effectiveAt", term838);
        setLongField(term841, term841.getClass(), "seconds", 1678177615L);
        setIntField(term841, term841.getClass(), "nanos", 298000000);
        setField(term809, term809.getClass(), "expiresAt", term841);
        setLongField(term844, term844.getClass(), "seconds", 1666076287L);
        setIntField(term844, term844.getClass(), "nanos", 186000000);
        setField(term809, term809.getClass(), "createdAt", term844);
        term847 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term847, term847.getClass(), "seconds", 1426018874L);
        setIntField(term847, term847.getClass(), "nanos", 434000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term847;
        callMethod(klass, "setCreatedAt", argTypes, term809, args);
    }

};


