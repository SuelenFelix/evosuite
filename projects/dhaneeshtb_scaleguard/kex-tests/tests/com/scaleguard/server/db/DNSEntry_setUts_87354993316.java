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

public class DNSEntry_setUts_87354993316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10282;
     Object term10346;

    public DNSEntry_setUts_87354993316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10282 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term10282, term10282.getClass(), "id", "VkPSXewZfB");
        setField(term10282, term10282.getClass(), "name", "ubodzJoMGW");
        setField(term10282, term10282.getClass(), "groupname", "weddIktxOA");
        setField(term10282, term10282.getClass(), "type", "uSlMeISsDD");
        setLongField(term10282, term10282.getClass(), "ttl", -7698746988132548371L);
        setField(term10282, term10282.getClass(), "value", "WdCiTDUKqn");
        setLongField(term10282, term10282.getClass(), "mts", 2145420811068634601L);
        setLongField(term10282, term10282.getClass(), "uts", 2191130532479601175L);
        term10346 = new Long(860079646007397083L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10346;
        callMethod(klass, "setUts", argTypes, term10282, args);
    }

};


