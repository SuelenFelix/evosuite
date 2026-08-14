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

public class DNSEntry_getGroupname_8026618929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9438;

    public DNSEntry_getGroupname_8026618929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9438 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term9438, term9438.getClass(), "id", "vSeruUyNWX");
        setField(term9438, term9438.getClass(), "name", "UkKvaeJfEC");
        setField(term9438, term9438.getClass(), "groupname", "WPxXsahPRq");
        setField(term9438, term9438.getClass(), "type", "IENRuqmwUU");
        setLongField(term9438, term9438.getClass(), "ttl", -1505191021111100819L);
        setField(term9438, term9438.getClass(), "value", "GsWxOwXvSu");
        setLongField(term9438, term9438.getClass(), "mts", -1000830646340880796L);
        setLongField(term9438, term9438.getClass(), "uts", 5973526439563541711L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupname", argTypes, term9438, args);
    }

};


