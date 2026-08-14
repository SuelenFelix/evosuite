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

public class TunnelBook_TunnelRecord_getPassword_145943574117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2665;

    public TunnelBook_TunnelRecord_getPassword_145943574117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2665 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term2665, term2665.getClass(), "name", "pORebkoRdD");
        setIntField(term2665, term2665.getClass(), "port", 1632125673);
        setField(term2665, term2665.getClass(), "localIp", "mXGCWJDOqA");
        setField(term2665, term2665.getClass(), "username", "dpNsDgfPso");
        setField(term2665, term2665.getClass(), "password", "hCWPJQKpdc");
        setIntField(term2665, term2665.getClass(), "systemPort", 454281060);
        setIntField(term2665, term2665.getClass(), "ttl", -1786399638);
        setField(term2665, term2665.getClass(), "fqdn", "WzMEhMXkKx");
        setField(term2665, term2665.getClass(), "edgefqdn", "XOiDvlDhdc");
        setField(term2665, term2665.getClass(), "lfqdn", "AdxvLJhNLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term2665, args);
    }

};


