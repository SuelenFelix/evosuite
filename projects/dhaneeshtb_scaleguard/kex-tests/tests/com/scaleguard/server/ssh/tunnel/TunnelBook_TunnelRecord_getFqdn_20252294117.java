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

public class TunnelBook_TunnelRecord_getFqdn_20252294117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;

    public TunnelBook_TunnelRecord_getFqdn_20252294117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term995 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term995, term995.getClass(), "name", "BndsHwAFMv");
        setIntField(term995, term995.getClass(), "port", 1048535127);
        setField(term995, term995.getClass(), "localIp", "GzFkzHGYFt");
        setField(term995, term995.getClass(), "username", "tShwQLRGNe");
        setField(term995, term995.getClass(), "password", "LvtrsXUliU");
        setIntField(term995, term995.getClass(), "systemPort", -655067527);
        setIntField(term995, term995.getClass(), "ttl", -6029667);
        setField(term995, term995.getClass(), "fqdn", "xLbjWUgOIL");
        setField(term995, term995.getClass(), "edgefqdn", "jDtqGUpnZN");
        setField(term995, term995.getClass(), "lfqdn", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFqdn", argTypes, term995, args);
    }

};


