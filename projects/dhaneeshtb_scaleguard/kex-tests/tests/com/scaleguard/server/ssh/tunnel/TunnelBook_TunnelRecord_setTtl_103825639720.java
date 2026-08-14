package com.scaleguard.server.ssh.tunnel;

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
import static com.scaleguard.server.ssh.tunnel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TunnelBook_TunnelRecord_setTtl_103825639720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3161;
     Object term3249;

    public TunnelBook_TunnelRecord_setTtl_103825639720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3161 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term3161, term3161.getClass(), "name", "LWyEaeIyAo");
        setIntField(term3161, term3161.getClass(), "port", 1328271830);
        setField(term3161, term3161.getClass(), "localIp", "yVMkkQhvmN");
        setField(term3161, term3161.getClass(), "username", "mvrkADEgpp");
        setField(term3161, term3161.getClass(), "password", "pXOkjyeIRb");
        setIntField(term3161, term3161.getClass(), "systemPort", 1596070772);
        setIntField(term3161, term3161.getClass(), "ttl", 97029295);
        setField(term3161, term3161.getClass(), "fqdn", "GgZWSjxjyE");
        setField(term3161, term3161.getClass(), "edgefqdn", "EeBVbzjcCI");
        setField(term3161, term3161.getClass(), "lfqdn", "UfQtPRyWRC");
        term3249 = new Integer(-1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3249;
        callMethod(klass, "setTtl", argTypes, term3161, args);
    }

};


