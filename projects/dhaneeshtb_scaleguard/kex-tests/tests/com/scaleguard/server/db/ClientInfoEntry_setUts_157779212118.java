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

public class ClientInfoEntry_setUts_157779212118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7400;
     Object term7476;

    public ClientInfoEntry_setUts_157779212118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7400 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term7400, term7400.getClass(), "id", "BbNeQJpYPr");
        setField(term7400, term7400.getClass(), "name", "riMtzCoxNj");
        setField(term7400, term7400.getClass(), "description", "YAXkVjQZcV");
        setField(term7400, term7400.getClass(), "appid", "pumvwBWvpy");
        setField(term7400, term7400.getClass(), "clientid", "HwLHeGLyhe");
        setLongField(term7400, term7400.getClass(), "expiry", 4513004407927379358L);
        setField(term7400, term7400.getClass(), "clientsecret", "RDnkgWkcbz");
        setLongField(term7400, term7400.getClass(), "mts", -7115418542247301000L);
        setLongField(term7400, term7400.getClass(), "uts", 8034714140377562739L);
        term7476 = new Long(-2924531382671518368L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7476;
        callMethod(klass, "setUts", argTypes, term7400, args);
    }

};


