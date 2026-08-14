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

public class DNSEntry_setGroupname_96541933210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9552;

    public DNSEntry_setGroupname_96541933210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9552 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term9552, term9552.getClass(), "id", "bKBSncrMEZ");
        setField(term9552, term9552.getClass(), "name", "yeSXGqQExb");
        setField(term9552, term9552.getClass(), "groupname", "uXYcXVYJZM");
        setField(term9552, term9552.getClass(), "type", "BJhjdJUhkz");
        setLongField(term9552, term9552.getClass(), "ttl", 5246058710498845622L);
        setField(term9552, term9552.getClass(), "value", "cdHYQDgUZR");
        setLongField(term9552, term9552.getClass(), "mts", 4394651392080968777L);
        setLongField(term9552, term9552.getClass(), "uts", -7310273014364148916L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KAORSSPSeV";
        callMethod(klass, "setGroupname", argTypes, term9552, args);
    }

};


