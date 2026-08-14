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

public class TunnelBook_TunnelRecord_setPassword_124918911539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3393;

    public TunnelBook_TunnelRecord_setPassword_124918911539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3393 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term3393, term3393.getClass(), "name", null);
        setIntField(term3393, term3393.getClass(), "port", 0);
        setField(term3393, term3393.getClass(), "localIp", null);
        setField(term3393, term3393.getClass(), "username", null);
        setField(term3393, term3393.getClass(), "password", null);
        setIntField(term3393, term3393.getClass(), "systemPort", 0);
        setIntField(term3393, term3393.getClass(), "ttl", 0);
        setField(term3393, term3393.getClass(), "fqdn", null);
        setField(term3393, term3393.getClass(), "edgefqdn", null);
        setField(term3393, term3393.getClass(), "lfqdn", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPassword", argTypes, term3393, args);
    }

};


