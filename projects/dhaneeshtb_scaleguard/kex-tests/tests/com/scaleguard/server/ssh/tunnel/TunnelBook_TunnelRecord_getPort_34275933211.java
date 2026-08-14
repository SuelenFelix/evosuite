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

public class TunnelBook_TunnelRecord_getPort_34275933211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1671;

    public TunnelBook_TunnelRecord_getPort_34275933211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1671 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term1671, term1671.getClass(), "name", "HqBOwkVqjD");
        setIntField(term1671, term1671.getClass(), "port", -1179120542);
        setField(term1671, term1671.getClass(), "localIp", "MAcUBcBckh");
        setField(term1671, term1671.getClass(), "username", "oVgzLbrsFr");
        setField(term1671, term1671.getClass(), "password", "vQVyKLdtaz");
        setIntField(term1671, term1671.getClass(), "systemPort", -73683645);
        setIntField(term1671, term1671.getClass(), "ttl", -226514366);
        setField(term1671, term1671.getClass(), "fqdn", "OWKQODBLzb");
        setField(term1671, term1671.getClass(), "edgefqdn", "wGmYcqUkgE");
        setField(term1671, term1671.getClass(), "lfqdn", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPort", argTypes, term1671, args);
    }

};


