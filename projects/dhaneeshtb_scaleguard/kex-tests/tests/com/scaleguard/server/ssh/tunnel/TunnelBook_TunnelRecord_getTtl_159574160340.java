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

public class TunnelBook_TunnelRecord_getTtl_159574160340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3397;

    public TunnelBook_TunnelRecord_getTtl_159574160340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3397 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term3397, term3397.getClass(), "name", null);
        setIntField(term3397, term3397.getClass(), "port", 0);
        setField(term3397, term3397.getClass(), "localIp", null);
        setField(term3397, term3397.getClass(), "username", null);
        setField(term3397, term3397.getClass(), "password", null);
        setIntField(term3397, term3397.getClass(), "systemPort", 0);
        setIntField(term3397, term3397.getClass(), "ttl", 0);
        setField(term3397, term3397.getClass(), "fqdn", null);
        setField(term3397, term3397.getClass(), "edgefqdn", null);
        setField(term3397, term3397.getClass(), "lfqdn", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTtl", argTypes, term3397, args);
    }

};


