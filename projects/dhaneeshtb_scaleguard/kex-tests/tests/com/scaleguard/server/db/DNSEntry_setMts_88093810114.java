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

public class DNSEntry_setMts_88093810114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10052;
     Object term10116;

    public DNSEntry_setMts_88093810114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10052 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term10052, term10052.getClass(), "id", "KtuuNAqGCQ");
        setField(term10052, term10052.getClass(), "name", "OGQsfjmReM");
        setField(term10052, term10052.getClass(), "groupname", "YsUtbngnRO");
        setField(term10052, term10052.getClass(), "type", "JisaWUxcNb");
        setLongField(term10052, term10052.getClass(), "ttl", 5330761990446327930L);
        setField(term10052, term10052.getClass(), "value", "NxgmYPzWCI");
        setLongField(term10052, term10052.getClass(), "mts", -3954795081650780841L);
        setLongField(term10052, term10052.getClass(), "uts", 3288791194263207397L);
        term10116 = new Long(3288941170644426558L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10116;
        callMethod(klass, "setMts", argTypes, term10052, args);
    }

};


