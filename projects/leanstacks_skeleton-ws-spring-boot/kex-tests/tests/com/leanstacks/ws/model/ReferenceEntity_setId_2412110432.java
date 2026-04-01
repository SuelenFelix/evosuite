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

public class ReferenceEntity_setId_2412110432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term97;

    public ReferenceEntity_setId_2412110432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60 = new Long(6375119433582206027L);
        Integer term86 = new Integer(1162663216);
        term59 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term88 = newInstance(Class.forName("java.time.Instant"));
        Object term91 = newInstance(Class.forName("java.time.Instant"));
        Object term94 = newInstance(Class.forName("java.time.Instant"));
        setField(term59, term59.getClass(), "id", term60);
        setField(term59, term59.getClass(), "code", "MuLcgQHgqz");
        setField(term59, term59.getClass(), "label", "xxtlPwDYFs");
        setField(term59, term59.getClass(), "ordinal", term86);
        setLongField(term88, term88.getClass(), "seconds", 1606045635L);
        setIntField(term88, term88.getClass(), "nanos", 837000000);
        setField(term59, term59.getClass(), "effectiveAt", term88);
        setLongField(term91, term91.getClass(), "seconds", 1442639565L);
        setIntField(term91, term91.getClass(), "nanos", 302000000);
        setField(term59, term59.getClass(), "expiresAt", term91);
        setLongField(term94, term94.getClass(), "seconds", 1515890130L);
        setIntField(term94, term94.getClass(), "nanos", 18000000);
        setField(term59, term59.getClass(), "createdAt", term94);
        term97 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term97;
        callMethod(klass, "setId", argTypes, term59, args);
    }

};


