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

public class TunnelBook_TunnelRecord_setSystemPort_139163090123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3325;
     Object term3329;

    public TunnelBook_TunnelRecord_setSystemPort_139163090123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3325 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term3325, term3325.getClass(), "name", null);
        setIntField(term3325, term3325.getClass(), "port", 0);
        setField(term3325, term3325.getClass(), "localIp", null);
        setField(term3325, term3325.getClass(), "username", null);
        setField(term3325, term3325.getClass(), "password", null);
        setIntField(term3325, term3325.getClass(), "systemPort", 0);
        setIntField(term3325, term3325.getClass(), "ttl", 0);
        setField(term3325, term3325.getClass(), "fqdn", null);
        setField(term3325, term3325.getClass(), "edgefqdn", null);
        setField(term3325, term3325.getClass(), "lfqdn", null);
        term3329 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3329;
        callMethod(klass, "setSystemPort", argTypes, term3325, args);
    }

};


