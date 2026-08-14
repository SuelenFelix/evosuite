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

public class DNSEntry_getUts_31606568715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10168;

    public DNSEntry_getUts_31606568715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10168 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term10168, term10168.getClass(), "id", "SqjyKmayBx");
        setField(term10168, term10168.getClass(), "name", "XjDhvToxJy");
        setField(term10168, term10168.getClass(), "groupname", "nxSTJflLQy");
        setField(term10168, term10168.getClass(), "type", "FlHzxEfFzI");
        setLongField(term10168, term10168.getClass(), "ttl", -8338004844694486146L);
        setField(term10168, term10168.getClass(), "value", "aSATgQUpoe");
        setLongField(term10168, term10168.getClass(), "mts", 6426732259596412988L);
        setLongField(term10168, term10168.getClass(), "uts", 185793058502220865L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUts", argTypes, term10168, args);
    }

};


