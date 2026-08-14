package com.scaleguard.server.ssh;

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
import static com.scaleguard.server.ssh.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SshClientTunnel_PortForard_getRemoteHost_5112950157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;

    public SshClientTunnel_PortForard_getRemoteHost_5112950157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = newInstance(Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard"));
        setField(term464, term464.getClass(), "username", "hNxWaHcfhY");
        setField(term464, term464.getClass(), "password", "RkybSrpybU");
        setIntField(term464, term464.getClass(), "remotePort", -883034806);
        setField(term464, term464.getClass(), "remoteHost", "xOEqzGAmDU");
        setIntField(term464, term464.getClass(), "localPort", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.SshClientTunnel$PortForard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRemoteHost", argTypes, term464, args);
    }

};


