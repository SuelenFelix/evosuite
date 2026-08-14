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

public class TunnelBook_TunnelRecord_getPassword_145943574138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3389;

    public TunnelBook_TunnelRecord_getPassword_145943574138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3389 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term3389, term3389.getClass(), "name", null);
        setIntField(term3389, term3389.getClass(), "port", 0);
        setField(term3389, term3389.getClass(), "localIp", null);
        setField(term3389, term3389.getClass(), "username", null);
        setField(term3389, term3389.getClass(), "password", null);
        setIntField(term3389, term3389.getClass(), "systemPort", 0);
        setIntField(term3389, term3389.getClass(), "ttl", 0);
        setField(term3389, term3389.getClass(), "fqdn", null);
        setField(term3389, term3389.getClass(), "edgefqdn", null);
        setField(term3389, term3389.getClass(), "lfqdn", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3389, args);
    }

};


