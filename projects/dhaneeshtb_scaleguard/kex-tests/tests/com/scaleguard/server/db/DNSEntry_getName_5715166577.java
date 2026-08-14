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

public class DNSEntry_getName_5715166577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9188;

    public DNSEntry_getName_5715166577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9188 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term9188, term9188.getClass(), "id", "boSSpezHeU");
        setField(term9188, term9188.getClass(), "name", "OUeBWNTQDh");
        setField(term9188, term9188.getClass(), "groupname", "gltJarNuUk");
        setField(term9188, term9188.getClass(), "type", "ZwZIDwYcSW");
        setLongField(term9188, term9188.getClass(), "ttl", -8010214112439224349L);
        setField(term9188, term9188.getClass(), "value", "sOdkipUKRu");
        setLongField(term9188, term9188.getClass(), "mts", -6673920710396545553L);
        setLongField(term9188, term9188.getClass(), "uts", 3412644969878030772L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term9188, args);
    }

};


