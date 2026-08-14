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

public class DNSEntry_getTtl_3169959353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8708;

    public DNSEntry_getTtl_3169959353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8708 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term8708, term8708.getClass(), "id", "HpZXWDPhlg");
        setField(term8708, term8708.getClass(), "name", "lBOokzEPfe");
        setField(term8708, term8708.getClass(), "groupname", "dtGZCsKXbW");
        setField(term8708, term8708.getClass(), "type", "bdyhHbDAmJ");
        setLongField(term8708, term8708.getClass(), "ttl", 4502292577098212311L);
        setField(term8708, term8708.getClass(), "value", "BBXiTNHqGE");
        setLongField(term8708, term8708.getClass(), "mts", -3730936709704460408L);
        setLongField(term8708, term8708.getClass(), "uts", -8614778293741404325L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTtl", argTypes, term8708, args);
    }

};


