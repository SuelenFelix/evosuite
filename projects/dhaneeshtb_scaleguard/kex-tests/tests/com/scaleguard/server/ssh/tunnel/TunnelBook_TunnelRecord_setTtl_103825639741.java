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

public class TunnelBook_TunnelRecord_setTtl_103825639741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3401;
     Object term3405;

    public TunnelBook_TunnelRecord_setTtl_103825639741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3401 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term3401, term3401.getClass(), "name", null);
        setIntField(term3401, term3401.getClass(), "port", 0);
        setField(term3401, term3401.getClass(), "localIp", null);
        setField(term3401, term3401.getClass(), "username", null);
        setField(term3401, term3401.getClass(), "password", null);
        setIntField(term3401, term3401.getClass(), "systemPort", 0);
        setIntField(term3401, term3401.getClass(), "ttl", 0);
        setField(term3401, term3401.getClass(), "fqdn", null);
        setField(term3401, term3401.getClass(), "edgefqdn", null);
        setField(term3401, term3401.getClass(), "lfqdn", null);
        term3405 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3405;
        callMethod(klass, "setTtl", argTypes, term3401, args);
    }

};


