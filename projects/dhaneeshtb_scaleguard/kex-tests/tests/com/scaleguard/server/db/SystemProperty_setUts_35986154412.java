package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class SystemProperty_setUts_35986154412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4819;
     Object term4870;

    public SystemProperty_setUts_35986154412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4819 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4819, term4819.getClass(), "id", "FwPbDZcHmB");
        setField(term4819, term4819.getClass(), "name", "hOncybyCAH");
        setField(term4819, term4819.getClass(), "groupname", "QduALnDSVo");
        setField(term4819, term4819.getClass(), "value", "izPpKDErnQ");
        setLongField(term4819, term4819.getClass(), "mts", 5946780097489996391L);
        setLongField(term4819, term4819.getClass(), "uts", -8652538484981166496L);
        term4870 = new Long(2701184207686293431L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4870;
        callMethod(klass, "setUts", argTypes, term4819, args);
    }

};


