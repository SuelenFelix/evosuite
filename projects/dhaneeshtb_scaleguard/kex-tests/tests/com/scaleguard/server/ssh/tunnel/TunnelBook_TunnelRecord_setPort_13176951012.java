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
import java.lang.Integer;

public class TunnelBook_TunnelRecord_setPort_13176951012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829;
     Object term1917;

    public TunnelBook_TunnelRecord_setPort_13176951012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1829 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term1829, term1829.getClass(), "name", "VgZnGoIFwQ");
        setIntField(term1829, term1829.getClass(), "port", 1193880199);
        setField(term1829, term1829.getClass(), "localIp", "jUbSRrkrYZ");
        setField(term1829, term1829.getClass(), "username", "bWWfajKbEX");
        setField(term1829, term1829.getClass(), "password", "cAPeiZHKGJ");
        setIntField(term1829, term1829.getClass(), "systemPort", -1087774327);
        setIntField(term1829, term1829.getClass(), "ttl", -1530420153);
        setField(term1829, term1829.getClass(), "fqdn", "LvJFtLBaxj");
        setField(term1829, term1829.getClass(), "edgefqdn", "PHvxnGHptP");
        setField(term1829, term1829.getClass(), "lfqdn", "TimdotUuNC");
        term1917 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1917;
        callMethod(klass, "setPort", argTypes, term1829, args);
    }

};


