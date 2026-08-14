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

public class ReferenceEntity_setOrdinal_3261131958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453;
     Object term491;

    public ReferenceEntity_setOrdinal_3261131958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term454 = new Long(-7237588299778557629L);
        Integer term480 = new Integer(-2038273078);
        term453 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term482 = newInstance(Class.forName("java.time.Instant"));
        Object term485 = newInstance(Class.forName("java.time.Instant"));
        Object term488 = newInstance(Class.forName("java.time.Instant"));
        setField(term453, term453.getClass(), "id", term454);
        setField(term453, term453.getClass(), "code", "ZiaGIbnzTs");
        setField(term453, term453.getClass(), "label", "tbcdzjIfER");
        setField(term453, term453.getClass(), "ordinal", term480);
        setLongField(term482, term482.getClass(), "seconds", 1804998087L);
        setIntField(term482, term482.getClass(), "nanos", 131000000);
        setField(term453, term453.getClass(), "effectiveAt", term482);
        setLongField(term485, term485.getClass(), "seconds", 1538078916L);
        setIntField(term485, term485.getClass(), "nanos", 394000000);
        setField(term453, term453.getClass(), "expiresAt", term485);
        setLongField(term488, term488.getClass(), "seconds", 1744090065L);
        setIntField(term488, term488.getClass(), "nanos", 937000000);
        setField(term453, term453.getClass(), "createdAt", term488);
        term491 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term491;
        callMethod(klass, "setOrdinal", argTypes, term453, args);
    }

};


