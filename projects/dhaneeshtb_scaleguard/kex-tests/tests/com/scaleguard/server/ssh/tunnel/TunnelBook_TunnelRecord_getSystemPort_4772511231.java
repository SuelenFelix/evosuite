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

public class TunnelBook_TunnelRecord_getSystemPort_4772511231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TunnelBook_TunnelRecord_getSystemPort_4772511231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "port", 568599855);
        setField(term1, term1.getClass(), "localIp", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "username", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "password", "xxtlPwDYFs");
        setIntField(term1, term1.getClass(), "systemPort", 1162663216);
        setIntField(term1, term1.getClass(), "ttl", 1484323161);
        setField(term1, term1.getClass(), "fqdn", "jJCZpVmanW");
        setField(term1, term1.getClass(), "edgefqdn", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "lfqdn", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSystemPort", argTypes, term1, args);
    }

};


