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

public class TunnelBook_TunnelRecord_setLocalIp_18554513814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2147;

    public TunnelBook_TunnelRecord_setLocalIp_18554513814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2147 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term2147, term2147.getClass(), "name", "DfISiziTgG");
        setIntField(term2147, term2147.getClass(), "port", 767834723);
        setField(term2147, term2147.getClass(), "localIp", "XqgfKFvPSD");
        setField(term2147, term2147.getClass(), "username", "JiVRgTZvKc");
        setField(term2147, term2147.getClass(), "password", "XPKmummaqg");
        setIntField(term2147, term2147.getClass(), "systemPort", -602026508);
        setIntField(term2147, term2147.getClass(), "ttl", -157887805);
        setField(term2147, term2147.getClass(), "fqdn", "BKLfkLiZTH");
        setField(term2147, term2147.getClass(), "edgefqdn", "SPpkrGcPRr");
        setField(term2147, term2147.getClass(), "lfqdn", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "setLocalIp", argTypes, term2147, args);
    }

};


