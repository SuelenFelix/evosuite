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

public class ReferenceEntity_getLabel_10483825955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;

    public ReferenceEntity_getLabel_10483825955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term258 = new Long(7411271909051562686L);
        Integer term284 = new Integer(-1922583790);
        term257 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term286 = newInstance(Class.forName("java.time.Instant"));
        Object term289 = newInstance(Class.forName("java.time.Instant"));
        Object term292 = newInstance(Class.forName("java.time.Instant"));
        setField(term257, term257.getClass(), "id", term258);
        setField(term257, term257.getClass(), "code", "RMFIsYGgne");
        setField(term257, term257.getClass(), "label", "NRdvgJlhkX");
        setField(term257, term257.getClass(), "ordinal", term284);
        setLongField(term286, term286.getClass(), "seconds", 1745462962L);
        setIntField(term286, term286.getClass(), "nanos", 80000000);
        setField(term257, term257.getClass(), "effectiveAt", term286);
        setLongField(term289, term289.getClass(), "seconds", 1349069753L);
        setIntField(term289, term289.getClass(), "nanos", 960000000);
        setField(term257, term257.getClass(), "expiresAt", term289);
        setLongField(term292, term292.getClass(), "seconds", 1706078172L);
        setIntField(term292, term292.getClass(), "nanos", 457000000);
        setField(term257, term257.getClass(), "createdAt", term292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLabel", argTypes, term257, args);
    }

};


