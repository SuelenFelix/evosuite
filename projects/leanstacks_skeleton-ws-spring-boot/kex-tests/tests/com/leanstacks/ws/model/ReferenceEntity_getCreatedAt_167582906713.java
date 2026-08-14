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

public class ReferenceEntity_getCreatedAt_167582906713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751;

    public ReferenceEntity_getCreatedAt_167582906713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term752 = new Long(2535595959091595249L);
        Integer term778 = new Integer(-883034806);
        term751 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term780 = newInstance(Class.forName("java.time.Instant"));
        Object term783 = newInstance(Class.forName("java.time.Instant"));
        Object term786 = newInstance(Class.forName("java.time.Instant"));
        setField(term751, term751.getClass(), "id", term752);
        setField(term751, term751.getClass(), "code", "flxyYxBRtu");
        setField(term751, term751.getClass(), "label", "OclPbYPkcH");
        setField(term751, term751.getClass(), "ordinal", term778);
        setLongField(term780, term780.getClass(), "seconds", 1595517583L);
        setIntField(term780, term780.getClass(), "nanos", 842000000);
        setField(term751, term751.getClass(), "effectiveAt", term780);
        setLongField(term783, term783.getClass(), "seconds", 1464421789L);
        setIntField(term783, term783.getClass(), "nanos", 888000000);
        setField(term751, term751.getClass(), "expiresAt", term783);
        setLongField(term786, term786.getClass(), "seconds", 1405279189L);
        setIntField(term786, term786.getClass(), "nanos", 488000000);
        setField(term751, term751.getClass(), "createdAt", term786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term751, args);
    }

};


