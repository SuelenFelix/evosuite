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

public class DNSEntry_setType_18095452882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8572;

    public DNSEntry_setType_18095452882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8572 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term8572, term8572.getClass(), "id", "JOqQxuzRuZ");
        setField(term8572, term8572.getClass(), "name", "RSaoipUlsg");
        setField(term8572, term8572.getClass(), "groupname", "cSHGbqKqlN");
        setField(term8572, term8572.getClass(), "type", "pFAfANnxup");
        setLongField(term8572, term8572.getClass(), "ttl", -8892586408602479513L);
        setField(term8572, term8572.getClass(), "value", "FbSIUZyBXZ");
        setLongField(term8572, term8572.getClass(), "mts", 4616440478358528406L);
        setLongField(term8572, term8572.getClass(), "uts", 3427570961451840069L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mhQDwIyrRi";
        callMethod(klass, "setType", argTypes, term8572, args);
    }

};


