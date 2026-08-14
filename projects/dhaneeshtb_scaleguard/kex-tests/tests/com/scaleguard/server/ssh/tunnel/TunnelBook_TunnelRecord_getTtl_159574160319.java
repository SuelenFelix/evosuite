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

public class TunnelBook_TunnelRecord_getTtl_159574160319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3003;

    public TunnelBook_TunnelRecord_getTtl_159574160319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3003 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term3003, term3003.getClass(), "name", "EYtfuJaxiM");
        setIntField(term3003, term3003.getClass(), "port", 458147407);
        setField(term3003, term3003.getClass(), "localIp", "gCWtLVKVVe");
        setField(term3003, term3003.getClass(), "username", "fWKJoSoCwE");
        setField(term3003, term3003.getClass(), "password", "wfaXBpWAUH");
        setIntField(term3003, term3003.getClass(), "systemPort", -184153539);
        setIntField(term3003, term3003.getClass(), "ttl", 493620644);
        setField(term3003, term3003.getClass(), "fqdn", "VMeAzAHwZj");
        setField(term3003, term3003.getClass(), "edgefqdn", "PznxWXsZME");
        setField(term3003, term3003.getClass(), "lfqdn", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTtl", argTypes, term3003, args);
    }

};


