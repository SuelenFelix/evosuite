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

public class TunnelBook_TunnelRecord_getEdgefqdn_1105235463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319;

    public TunnelBook_TunnelRecord_getEdgefqdn_1105235463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term319, term319.getClass(), "name", "oVcInYnLWB");
        setIntField(term319, term319.getClass(), "port", -2038273078);
        setField(term319, term319.getClass(), "localIp", "aJlieCFVtF");
        setField(term319, term319.getClass(), "username", "ZiaGIbnzTs");
        setField(term319, term319.getClass(), "password", "tbcdzjIfER");
        setIntField(term319, term319.getClass(), "systemPort", 1227103734);
        setIntField(term319, term319.getClass(), "ttl", -1339778481);
        setField(term319, term319.getClass(), "fqdn", "HyxfbSQYBe");
        setField(term319, term319.getClass(), "edgefqdn", "pCTimMblYc");
        setField(term319, term319.getClass(), "lfqdn", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdgefqdn", argTypes, term319, args);
    }

};


