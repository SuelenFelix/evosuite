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

public class DNSEntry_setTtl_8744801814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8822;
     Object term8886;

    public DNSEntry_setTtl_8744801814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8822 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term8822, term8822.getClass(), "id", "IEYhJmgCVd");
        setField(term8822, term8822.getClass(), "name", "KSJeYkkvpk");
        setField(term8822, term8822.getClass(), "groupname", "qUtkFGMNUV");
        setField(term8822, term8822.getClass(), "type", "mGRiYhnMcR");
        setLongField(term8822, term8822.getClass(), "ttl", -5447369594017685765L);
        setField(term8822, term8822.getClass(), "value", "NFlvfJCVPO");
        setLongField(term8822, term8822.getClass(), "mts", -5724112525188606013L);
        setLongField(term8822, term8822.getClass(), "uts", -6100012593724108983L);
        term8886 = new Long(5465527210299101732L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8886;
        callMethod(klass, "setTtl", argTypes, term8822, args);
    }

};


