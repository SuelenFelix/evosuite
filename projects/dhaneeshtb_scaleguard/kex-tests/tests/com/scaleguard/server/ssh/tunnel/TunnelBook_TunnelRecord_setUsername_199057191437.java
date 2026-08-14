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

public class TunnelBook_TunnelRecord_setUsername_199057191437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3385;

    public TunnelBook_TunnelRecord_setUsername_199057191437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3385 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term3385, term3385.getClass(), "name", null);
        setIntField(term3385, term3385.getClass(), "port", 0);
        setField(term3385, term3385.getClass(), "localIp", null);
        setField(term3385, term3385.getClass(), "username", null);
        setField(term3385, term3385.getClass(), "password", null);
        setIntField(term3385, term3385.getClass(), "systemPort", 0);
        setIntField(term3385, term3385.getClass(), "ttl", 0);
        setField(term3385, term3385.getClass(), "fqdn", null);
        setField(term3385, term3385.getClass(), "edgefqdn", null);
        setField(term3385, term3385.getClass(), "lfqdn", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsername", argTypes, term3385, args);
    }

};


