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

public class TunnelBook_TunnelRecord_getUsername_40422947415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2327;

    public TunnelBook_TunnelRecord_getUsername_40422947415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2327 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term2327, term2327.getClass(), "name", "vjxIhXHxGR");
        setIntField(term2327, term2327.getClass(), "port", 1876565163);
        setField(term2327, term2327.getClass(), "localIp", "QXzGXbEXMu");
        setField(term2327, term2327.getClass(), "username", "qxSDVejjiY");
        setField(term2327, term2327.getClass(), "password", "xBsXSDjXYK");
        setIntField(term2327, term2327.getClass(), "systemPort", -817164822);
        setIntField(term2327, term2327.getClass(), "ttl", -1016503459);
        setField(term2327, term2327.getClass(), "fqdn", "sEnIVFtZuQ");
        setField(term2327, term2327.getClass(), "edgefqdn", "ZVecLZMLHF");
        setField(term2327, term2327.getClass(), "lfqdn", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term2327, args);
    }

};


