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

public class TunnelBook_TunnelRecord_getLocalIp_62593588613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1989;

    public TunnelBook_TunnelRecord_getLocalIp_62593588613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1989 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term1989, term1989.getClass(), "name", "PkWMRdJcBb");
        setIntField(term1989, term1989.getClass(), "port", -1145578966);
        setField(term1989, term1989.getClass(), "localIp", "jSpAteRute");
        setField(term1989, term1989.getClass(), "username", "swZVeJAxjt");
        setField(term1989, term1989.getClass(), "password", "xOcJIiQQDu");
        setIntField(term1989, term1989.getClass(), "systemPort", 679763016);
        setIntField(term1989, term1989.getClass(), "ttl", 1962444399);
        setField(term1989, term1989.getClass(), "fqdn", "GVizqqzXpy");
        setField(term1989, term1989.getClass(), "edgefqdn", "JqXGgAhZPl");
        setField(term1989, term1989.getClass(), "lfqdn", "jiKYgYHqIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocalIp", argTypes, term1989, args);
    }

};


