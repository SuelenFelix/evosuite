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

public class TunnelBook_TunnelRecord_setPassword_124918911518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2823;

    public TunnelBook_TunnelRecord_setPassword_124918911518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2823 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term2823, term2823.getClass(), "name", "lHfTrWKMPk");
        setIntField(term2823, term2823.getClass(), "port", 2055867847);
        setField(term2823, term2823.getClass(), "localIp", "JDaAnsVTGV");
        setField(term2823, term2823.getClass(), "username", "mLUZFTfjle");
        setField(term2823, term2823.getClass(), "password", "xIeFjkHkOe");
        setIntField(term2823, term2823.getClass(), "systemPort", -1048298087);
        setIntField(term2823, term2823.getClass(), "ttl", 292681826);
        setField(term2823, term2823.getClass(), "fqdn", "SdCKLMIYnX");
        setField(term2823, term2823.getClass(), "edgefqdn", "OJJtVNPyKZ");
        setField(term2823, term2823.getClass(), "lfqdn", "AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        callMethod(klass, "setPassword", argTypes, term2823, args);
    }

};


